package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.Db;
import com.cer.mall.mylitemall.mbg.model.DbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbMapper {
    long countByExample(DbExample example);

    int deleteByExample(DbExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user);

    int insert(Db record);

    int insertSelective(Db record);

    List<Db> selectByExample(DbExample example);

    Db selectByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user);

    int updateByExampleSelective(@Param("record") Db record, @Param("example") DbExample example);

    int updateByExample(@Param("record") Db record, @Param("example") DbExample example);

    int updateByPrimaryKeySelective(Db record);

    int updateByPrimaryKey(Db record);
}