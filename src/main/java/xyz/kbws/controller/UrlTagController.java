package xyz.kbws.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import xyz.kbws.common.BaseResponse;
import xyz.kbws.common.ResultUtils;
import xyz.kbws.model.dto.urlTag.UrlTagAddRequest;
import xyz.kbws.model.vo.urlTag.UrlTagCategoryVo;
import xyz.kbws.model.vo.urlTag.UrlTagVo;
import xyz.kbws.service.UrlTagService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kbws
 * @date 2024/5/25
 * @description: URL 标记控制器
 */
@RestController
@RequestMapping("/tags")
public class UrlTagController {

    @Resource
    private UrlTagService urlTagService;

    /**
     * 获取所有标签
     *
     * @return
     */
    @GetMapping
    @ApiOperation(value = "获取所有短链标签")
    public BaseResponse<List<UrlTagCategoryVo>> getAllTags(){
        List<UrlTagCategoryVo> allTags = urlTagService.getAllTags();
        return ResultUtils.success(allTags);
    }

    /**
     * 添加一个标签
     *
     * @param userTagAddRequest 用户标签添加请求
     * @return {@link BaseResponse}<{@link UrlTagVo}>
     */
    @PostMapping
    @ApiOperation(value = "添加短链标签")
    public BaseResponse<UrlTagVo> addTag(@RequestBody UrlTagAddRequest userTagAddRequest){
        UrlTagVo userTagVo = urlTagService.addTag(userTagAddRequest);
        return ResultUtils.success(userTagVo);
    }

}
