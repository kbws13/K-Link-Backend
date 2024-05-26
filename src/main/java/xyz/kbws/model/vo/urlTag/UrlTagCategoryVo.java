package xyz.kbws.model.vo.urlTag;

import lombok.Data;

import java.util.List;

/**
 * @author kbws
 * @date 2024/5/25
 * @description: URL 标签类别 VO
 */
@Data
public class UrlTagCategoryVo {
    private Long id;

    private String name;

    private List<UrlTagVo> tags;
}
