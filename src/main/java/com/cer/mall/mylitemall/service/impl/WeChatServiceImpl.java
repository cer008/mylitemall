package com.cer.mall.mylitemall.service.impl;

import cn.hutool.core.lang.Assert;
import com.alibaba.fastjson.JSONObject;
import com.cer.mall.mylitemall.common.CommonResult;
import com.cer.mall.mylitemall.common.ResultCode;
import com.cer.mall.mylitemall.mbg.model.User;
import com.cer.mall.mylitemall.service.WeChatService;
import com.cer.mall.mylitemall.utils.Jcode2SessionUtil;
import com.cer.mall.mylitemall.utils.JwtTokenUtil;
import com.cer.mall.mylitemall.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: WeChatServiceImpl
 * @Description: TODO
 * @Author: xujin
 * @Date: 2019/12/13 16:29
 * @Version: 1.0
 */
@Service
public class WeChatServiceImpl implements WeChatService {

    @Value("${weChat.appid}")
    private String appid;

    @Value("${weChat.secret}")
    private String secret;

    @Autowired
    private RedisUtil redisUtil;

    private static final Logger LOGGER = LoggerFactory.getLogger(WeChatServiceImpl.class);

    @Override
    public CommonResult wxLogin(String code) throws Exception{
        JSONObject sessionInfo = JSONObject.parseObject(jcode2Session(code));

        Assert.notNull(sessionInfo,"code 无效");

        Assert.isTrue(0 == sessionInfo.getInteger("errcode"),sessionInfo.getString("errmsg"));

        // 获取用户唯一标识符 openid成功
        // 模拟从数据库获取用户信息
        User user = new User();
        user.setId(1L);
        Set authoritiesSet = new HashSet();
        // 模拟从数据库中获取用户权限
        authoritiesSet.add(new SimpleGrantedAuthority("test:add"));
        authoritiesSet.add(new SimpleGrantedAuthority("test:list"));
        authoritiesSet.add(new SimpleGrantedAuthority("ddd:list"));
        user.setAuthorities(authoritiesSet);
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("id",user.getId().toString());
        hashMap.put("authorities",authoritiesSet);
        String token = JwtTokenUtil.generateToken(user);
        redisUtil.hset(token,hashMap);

        return CommonResult.success(ResultCode.SUCCESS,token);
    }

    /**
     * 登录凭证校验
     * @param code
     * @return
     * @throws Exception
     */
    private String jcode2Session(String code)throws Exception{
        String sessionInfo = Jcode2SessionUtil.jscode2session(appid,secret,code,"authorization_code");//登录grantType固定
        LOGGER.info(sessionInfo);
        return sessionInfo;
    }
}
