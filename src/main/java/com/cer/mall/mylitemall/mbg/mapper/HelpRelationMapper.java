package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.HelpRelation;
import com.cer.mall.mylitemall.mbg.model.HelpRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpRelationMapper {
    long countByExample(HelpRelationExample example);

    int deleteByExample(HelpRelationExample example);

    int deleteByPrimaryKey(@Param("helpKeywordId") Integer helpKeywordId, @Param("helpTopicId") Integer helpTopicId);

    int insert(HelpRelation record);

    int insertSelective(HelpRelation record);

    List<HelpRelation> selectByExample(HelpRelationExample example);

    int updateByExampleSelective(@Param("record") HelpRelation record, @Param("example") HelpRelationExample example);

    int updateByExample(@Param("record") HelpRelation record, @Param("example") HelpRelationExample example);
}