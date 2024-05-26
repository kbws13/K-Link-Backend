package xyz.kbws.service;

import xyz.kbws.model.dto.urlTag.UrlTagAddRequest;
import xyz.kbws.model.entity.UrlTag;
import com.baomidou.mybatisplus.extension.service.IService;
import xyz.kbws.model.vo.urlTag.UrlTagCategoryVo;
import xyz.kbws.model.vo.urlTag.UrlTagVo;

import java.util.List;

/**
* @author hsy
* @description 针对表【url_tag(短链标签表)】的数据库操作Service
* @createDate 2024-05-25 21:37:01
*/
public interface UrlTagService extends IService<UrlTag> {

    /**
     * 获取所有标签
     *
     * @return {@link List}<{@link UrlTagCategoryVo}>
     */
    List<UrlTagCategoryVo> getAllTags();

    /**
     * 添加标签
     *
     * @param userTagAddRequest 用户标签添加请求
     * @return {@link UrlTagVo}
     */
    UrlTagVo addTag(UrlTagAddRequest userTagAddRequest);

}
