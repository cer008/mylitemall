package com.cer.mall.mylitemall.config;

import com.alibaba.fastjson.JSON;
import com.cer.mall.mylitemall.common.CommonResult;
import com.cer.mall.mylitemall.common.ResultCode;
import com.cer.mall.mylitemall.mbg.model.User;
import com.cer.mall.mylitemall.service.RedisService;
import com.cer.mall.mylitemall.utils.JwtTokenUtil;
import com.cer.mall.mylitemall.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

/**
 * @author: jamesluozhiwei
 * @description: 确保在一次请求只通过一次filter，而不需要重复执行
 */
@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtAuthenticationTokenFilter.class);
    @Value("${token.expirationMilliSeconds}")
    private long expirationMilliSeconds;
    @Autowired
    private RedisService redisService;
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;



    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //获取header中的token信息
        String authHeader = request.getHeader(tokenHeader);
        response.setCharacterEncoding("utf-8");
        if (null == authHeader || !authHeader.startsWith("Bearer")){
            filterChain.doFilter(request,response);//token格式不正确
            return;
        }
        String authToken = authHeader.substring("Bearer".length());
        //jwt方式解析
//        String username = jwtTokenUtil.getUserNameFromToken(authToken);
//        LOGGER.info("checking username:{}", username);
        //String subject = JwtTokenUtil.parseToken(authToken);//获取在token中自定义的subject，用作用户标识，用来获取用户权限

        //获取redis中的token信息
        if (null == redisUtil.hget(authToken)){
            //token 不存在 返回错误信息
            response.getWriter().write(JSON.toJSONString(CommonResult.success(ResultCode.UNAUTHORIZED)));
            return;
        }

        //获取缓存中的信息
        HashMap<String,Object> hashMap = (HashMap<String, Object>) redisUtil.hget(authToken);
        //从tokenInfo中取出用户信息
        User user = new User();
        user.setUsername(hashMap.get("userName").toString()).setAuthorities((Set<? extends GrantedAuthority>) hashMap.get("authorities"));

        //更新token过期时间
        //redisUtil.setKeyExpire(authToken,expirationMilliSeconds);

        //将信息交给security
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user,null,user.getAuthorities());
        authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        filterChain.doFilter(request,response);
    }


//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain chain) throws ServletException, IOException {
//        String authHeader = request.getHeader(this.tokenHeader);
//        if (authHeader != null && authHeader.startsWith(this.tokenHead)) {
//            String authToken = authHeader.substring(this.tokenHead.length());// The part after "Bearer "
//            String username = jwtTokenUtil.getUserNameFromToken(authToken);
//            LOGGER.info("checking username:{}", username);
//            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//                UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
//                if (jwtTokenUtil.validateToken(authToken, userDetails)) {
//                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                    LOGGER.info("authenticated user:{}", username);
//                    SecurityContextHolder.getContext().setAuthentication(authentication);
//                }
//            }
//        }
//        chain.doFilter(request, response);
//    }

}
