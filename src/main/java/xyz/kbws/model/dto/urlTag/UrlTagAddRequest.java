package xyz.kbws.model.dto.urlTag;

import lombok.Data;

/**
 * @author kbws
 * @date 2024/5/25
 * @description: URL 标记添加请求
 */
@Data
public class UrlTagAddRequest {

    /**
     *父级id
     */
    private Long parentId;
    /**
     *名称
     */
    private String name;

}
