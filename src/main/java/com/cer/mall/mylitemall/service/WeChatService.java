package com.cer.mall.mylitemall.service;

import com.cer.mall.mylitemall.common.CommonResult;

public interface WeChatService {
    CommonResult wxLogin(String code)throws Exception;
}
