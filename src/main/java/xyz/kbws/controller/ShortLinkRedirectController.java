package xyz.kbws.controller;

import cn.hutool.core.text.CharSequenceUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import xyz.kbws.common.ErrorCode;
import xyz.kbws.exception.BusinessException;
import xyz.kbws.model.entity.UrlRelate;
import xyz.kbws.service.UrlRelateService;

import javax.annotation.Resource;

/**
 * @author kbws
 * @date 2024/5/25
 * @description: 短链路重定向接口
 */
@Controller
@RequestMapping("/kbws")
public class ShortLinkRedirectController {

    @Resource
    private UrlRelateService urlRelateService;

    @GetMapping("/{shortLink}")
    @ApiOperation(value = "重定向到长链接")
    public ModelAndView redirectToLongLink(@PathVariable String shortLink) {
        // 此处需要实现逻辑将长链接映射到短链接
        // 可以根据需求将长链接与短链接关联起来
        UrlRelate urlRelate = urlRelateService.getLongLink(shortLink);
        //if (CharSequenceUtil.isNotBlank(urlRelate.getPassword()) && !urlRelate.getPassword().equals(password)) {
        //    throw new BusinessException(ErrorCode.PARAMS_ERROR, "密码错误");
        //}
        return new ModelAndView(new RedirectView(urlRelate.getLongUrl(), false));
    }
}
