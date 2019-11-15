package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.HelpCategory;
import com.cer.mall.mylitemall.mbg.model.HelpCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpCategoryMapper {
    int countByExample(HelpCategoryExample example);

    int deleteByExample(HelpCategoryExample example);

    int deleteByPrimaryKey(Short helpCategoryId);

    int insert(HelpCategory record);

    int insertSelective(HelpCategory record);

    List<HelpCategory> selectByExampleWithBLOBs(HelpCategoryExample example);

    List<HelpCategory> selectByExample(HelpCategoryExample example);

    HelpCategory selectByPrimaryKey(Short helpCategoryId);

    int updateByExampleSelective(@Param("record") HelpCategory record, @Param("example") HelpCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") HelpCategory record, @Param("example") HelpCategoryExample example);

    int updateByExample(@Param("record") HelpCategory record, @Param("example") HelpCategoryExample example);

    int updateByPrimaryKeySelective(HelpCategory record);

    int updateByPrimaryKeyWithBLOBs(HelpCategory record);

    int updateByPrimaryKey(HelpCategory record);
}