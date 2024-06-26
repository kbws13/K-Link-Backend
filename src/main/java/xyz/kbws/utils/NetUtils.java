package xyz.kbws.utils;

import xyz.kbws.common.ErrorCode;
import xyz.kbws.exception.BusinessException;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网络工具类
 */
public class NetUtils {

    private NetUtils() {
        throw new IllegalStateException("Utility class");
    }
    private static final List<String> VALID_DOMAINS = new ArrayList<>();

    // 初始化合法域名列表
    static {
        VALID_DOMAINS.add("www.baidu.com");
        // 添加其他合法域名
    }

    public static void validateLink(String longUrl) {
        try {
            URI uri = new URI(longUrl);
            String host = uri.getHost();

            // 校验主域名合法性
            if (!isValidDomain(host)||!validateUrl(longUrl)) {
                // 链接不合法（主域名不合法）
                throw new BusinessException(ErrorCode.LINK_ERROR);
            }
            // 校验查询参数中的域名合法性
            String query = uri.getQuery();
            if (query == null) {
                return;
            }
            String[] queryParams = query.split("&");
            for (String param : queryParams) {
                String[] keyValue = param.split("=");
                if (keyValue.length == 2) {
                    String paramName = keyValue[0];
                    String paramValue = keyValue[1];
                    if ("domain".equals(paramName) && !isValidDomain(paramValue)) {
                        // 查询参数中的域名不合法
                        throw new BusinessException(ErrorCode.LINK_ERROR);
                    }
                }
            }

        } catch (URISyntaxException e) {
            // 链接不合法（URI解析失败）
            throw new BusinessException(ErrorCode.LINK_ERROR);
        }
        // 链接合法
    }

    private static boolean isValidDomain(String domain) {
//        return VALID_DOMAINS.contains(domain);
        return true;
    }

    public static boolean validateUrl(String url) {
        String regex  = "^(http|https)://[a-zA-Z0-9-.]+.[a-zA-Z]{2,3}(/[^/]+)*/?$";

        Pattern pattern = Pattern.compile(regex );
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

}
