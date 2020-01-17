package com.cer.mall.mylitemall.controller;

import com.cer.mall.mylitemall.common.CommonResult;
import com.cer.mall.mylitemall.common.ResultCode;
import com.cer.mall.mylitemall.service.WeChatService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @ClassName: TestController
 * @Description: TODO
 * @Author: xujin
 * @Date: 2019/12/13 16:23
 * @Version: 1.0
 */
@RestController
public class TestController {

    @Autowired
    private WeChatService weChatService;

    /**
     * code登录获取用户openid
     * @param map
     * @return
     * @throws Exception
     */
    @GetMapping("/login")
    public CommonResult login(@RequestParam Map<String, String> map)throws Exception{
        System.out.println(map);
        return weChatService.wxLogin(map.get("code"));
    }
    /**
     * 权限测试
     */

    @ApiOperation("测试")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    //@PreAuthorize("hasAuthority('dddd:list')")
    public CommonResult test(@RequestParam Map<String, String> map){
        return CommonResult.success(map);
    }

    @GetMapping("/test/a")
    public CommonResult testA(){
        return CommonResult.success(ResultCode.SUCCESS,"testA");
    }

    @GetMapping("/hello")
    public CommonResult hello(){
        return CommonResult.success(ResultCode.SUCCESS,"hello");
    }

    @GetMapping("/ddd")
    @PreAuthorize("hasAuthority('ddd:list')")//基于表达式的权限验证，调用此方法需有 "ddd:list" 的权限
    public CommonResult ddd(){
        return CommonResult.success(ResultCode.SUCCESS,"ddd:list");
    }
}
