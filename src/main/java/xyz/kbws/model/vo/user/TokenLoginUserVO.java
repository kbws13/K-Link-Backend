package xyz.kbws.model.vo.user;

import cn.dev33.satoken.stp.SaTokenInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author kbws
 * @date 2024/5/25
 * @description: Token 登录用户封装类
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TokenLoginUserVO extends LoginUserVO implements Serializable {

    /**
     * token 的信息
     */
    private transient SaTokenInfo saTokenInfo;

    private static final long serialVersionUID = 2194490520558433887L;
}
