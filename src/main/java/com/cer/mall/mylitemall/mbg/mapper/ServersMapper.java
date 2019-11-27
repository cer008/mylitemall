package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.Servers;
import com.cer.mall.mylitemall.mbg.model.ServersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServersMapper {
    long countByExample(ServersExample example);

    int deleteByExample(ServersExample example);

    int deleteByPrimaryKey(String serverName);

    int insert(Servers record);

    int insertSelective(Servers record);

    List<Servers> selectByExample(ServersExample example);

    Servers selectByPrimaryKey(String serverName);

    int updateByExampleSelective(@Param("record") Servers record, @Param("example") ServersExample example);

    int updateByExample(@Param("record") Servers record, @Param("example") ServersExample example);

    int updateByPrimaryKeySelective(Servers record);

    int updateByPrimaryKey(Servers record);
}