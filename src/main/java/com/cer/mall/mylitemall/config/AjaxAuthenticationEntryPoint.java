package com.cer.mall.mylitemall.config;

import com.alibaba.fastjson.JSON;
import com.cer.mall.mylitemall.common.CommonResult;
import com.cer.mall.mylitemall.common.ResultCode;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: AjaxAuthenticationEntryPoint
 * @Description: TODO 用户未登录时返回给前端的数据
 * @Author: xujin
 * @Date: 2019/12/13 11:04
 * @Version: 1.0
 */
@Component
public class AjaxAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.getWriter().write(JSON.toJSONString(CommonResult.failed(ResultCode.UNAUTHORIZED)));
    }
}