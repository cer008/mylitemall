package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.HelpTopic;
import com.cer.mall.mylitemall.mbg.model.HelpTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpTopicMapper {
    long countByExample(HelpTopicExample example);

    int deleteByExample(HelpTopicExample example);

    int deleteByPrimaryKey(Integer helpTopicId);

    int insert(HelpTopic record);

    int insertSelective(HelpTopic record);

    List<HelpTopic> selectByExampleWithBLOBs(HelpTopicExample example);

    List<HelpTopic> selectByExample(HelpTopicExample example);

    HelpTopic selectByPrimaryKey(Integer helpTopicId);

    int updateByExampleSelective(@Param("record") HelpTopic record, @Param("example") HelpTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") HelpTopic record, @Param("example") HelpTopicExample example);

    int updateByExample(@Param("record") HelpTopic record, @Param("example") HelpTopicExample example);

    int updateByPrimaryKeySelective(HelpTopic record);

    int updateByPrimaryKeyWithBLOBs(HelpTopic record);

    int updateByPrimaryKey(HelpTopic record);
}