package xyz.kbws.model.dto.urlRelate;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kbws
 * @date 2024/5/25
 * @description: 编辑请求
 */
@Data
public class UrlRelateEditRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 长链
     */
    private String longUrl;
    /**
     * 链接标题
     */
    private String title;

    /**
     * 链接图标
     */
    private String urlImg;

    /**
     * 允许访问次数
     */
    private Integer allowNum;

    /**
     * 标签列表（json 数组）
     */
    private String tags;

    /**
     * 是否私密
     */
    private Integer privateTarget;

    /**
     * 密码
     */
    private String password;

    /**
     * 过期时间
     */
    private Date expireTime;

    private static final long serialVersionUID = -9158500693717947360L;
}
