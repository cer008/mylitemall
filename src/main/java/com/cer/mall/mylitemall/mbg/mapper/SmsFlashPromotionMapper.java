package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.SmsFlashPromotion;
import com.cer.mall.mylitemall.mbg.model.SmsFlashPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionMapper {
    int countByExample(SmsFlashPromotionExample example);

    int deleteByExample(SmsFlashPromotionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotion record);

    int insertSelective(SmsFlashPromotion record);

    List<SmsFlashPromotion> selectByExample(SmsFlashPromotionExample example);

    SmsFlashPromotion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsFlashPromotion record, @Param("example") SmsFlashPromotionExample example);

    int updateByExample(@Param("record") SmsFlashPromotion record, @Param("example") SmsFlashPromotionExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotion record);

    int updateByPrimaryKey(SmsFlashPromotion record);
}