package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.Plugin;
import com.cer.mall.mylitemall.mbg.model.PluginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginMapper {
    int countByExample(PluginExample example);

    int deleteByExample(PluginExample example);

    int deleteByPrimaryKey(String name);

    int insert(Plugin record);

    int insertSelective(Plugin record);

    List<Plugin> selectByExample(PluginExample example);

    Plugin selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Plugin record, @Param("example") PluginExample example);

    int updateByExample(@Param("record") Plugin record, @Param("example") PluginExample example);

    int updateByPrimaryKeySelective(Plugin record);

    int updateByPrimaryKey(Plugin record);
}