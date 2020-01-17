package com.cer.mall.mylitemall.config;


import com.alibaba.fastjson.JSON;
import com.cer.mall.mylitemall.common.CommonResult;
import com.cer.mall.mylitemall.common.ResultCode;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: AjaxAuthenticationFailureHandler
 * @Description: TODO 用户登录失败时返回给前端的数据
 * @Author: xujin
 * @Date: 2019/12/13 11:05
 * @Version: 1.0
 */
@Component
public class AjaxAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(JSON.toJSONString(CommonResult.failed(ResultCode.LOGIN_FAILED)));
    }

}
