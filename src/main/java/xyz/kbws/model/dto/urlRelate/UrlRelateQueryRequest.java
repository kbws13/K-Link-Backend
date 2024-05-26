package xyz.kbws.model.dto.urlRelate;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.kbws.common.PageRequest;

import java.io.Serializable;

/**
 * @author kbws
 * @date 2024/5/25
 * @description: 查询请求
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UrlRelateQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 长链
     */
    private String longUrl;

    /**
     * 创建用户 id
     */
    private Long userId;

    private static final long serialVersionUID = -7300238405274528447L;
}
