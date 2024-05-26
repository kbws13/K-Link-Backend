package xyz.kbws.model.vo.urlTag;

import lombok.Data;

/**
 * @author kbws
 * @date 2024/5/25
 * @description: URL 标签 vo
 */
@Data
public class UrlTagVo {
    /**
     * 编号
     */
    private Long id;
    /**
     * 父 ID
     */
    private Long parentId;
    /**
     *名称
     */
    private String name;
    /**
     *颜色
     */
    private String color;
}
