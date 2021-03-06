package com.cer.mall.mylitemall.config;

import com.alibaba.fastjson.JSON;
import com.cer.mall.mylitemall.common.CommonResult;
import com.cer.mall.mylitemall.common.ResultCode;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: jamesluozhiwei
 * @description: 登出成功
 */
@Component
public class AjaxLogoutSuccessHandler implements LogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        //没有logout不走这里、若使用security的formLogin则自己添加业务实现（移除token等等）
        response.getWriter().write(JSON.toJSONString(CommonResult.success(ResultCode.SUCCESS)));
    }

}
