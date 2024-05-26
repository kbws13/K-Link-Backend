package xyz.kbws.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import xyz.kbws.common.DeleteRequest;
import xyz.kbws.model.dto.urlRelate.UrlRelateAddRequest;
import xyz.kbws.model.dto.urlRelate.UrlRelateQueryRequest;
import xyz.kbws.model.dto.urlRelate.UrlRelateUpdateRequest;
import xyz.kbws.model.entity.UrlRelate;
import com.baomidou.mybatisplus.extension.service.IService;
import xyz.kbws.model.vo.shortLink.UrlRelateVo;

import java.util.List;

/**
* @author hsy
* @description 针对表【url_relate(链接关系表)】的数据库操作Service
* @createDate 2024-05-25 21:36:50
*/
public interface UrlRelateService extends IService<UrlRelate> {

    /**
     * 添加 URL 关联
     *
     * @param urlRelateAddRequest URL 关联添加请求
     * @return Long
     */
    Long addUrlRelate(UrlRelateAddRequest urlRelateAddRequest);

    /**
     * 删除 URL 关联
     *
     * @param deleteRequest 删除请求
     * @return boolean
     */
    boolean deleteUrlRelate(DeleteRequest deleteRequest);

    /**
     * 更新 URL 关联
     *
     * @param urlRelateUpdateRequest URL 关联更新请求
     * @return boolean
     */
    boolean updateUrlRelate(UrlRelateUpdateRequest urlRelateUpdateRequest);

    QueryWrapper<UrlRelate> getQueryWrapper(UrlRelateQueryRequest urlRelateQueryRequest);

    /**
     * 有效 URL 关联
     *
     * @param urlRelate URL 关联
     * @param add         b
     */
    void validUrlRelate(UrlRelate urlRelate, boolean add);

    /**
     * 获取长链接
     *
     * @param shortLink 短链接
     * @return UrlRelate
     */
    UrlRelate getLongLink(String shortLink);

    /**
     * 通过短链接获取
     *
     * @param shortLink 短链接
     * @return {@link UrlRelateVo}
     */
    UrlRelateVo getByShortLink(String shortLink);

    /**
     * 获取 URL 相关 VO
     *
     * @param records 记录
     * @return {@link List}<{@link UrlRelateVo}>
     */
    List<UrlRelateVo> getUrlRelateVo(List<UrlRelate> records);

}
