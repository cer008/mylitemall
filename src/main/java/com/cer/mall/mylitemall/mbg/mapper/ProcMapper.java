package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.Proc;
import com.cer.mall.mylitemall.mbg.model.ProcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcMapper {
    long countByExample(ProcExample example);

    int deleteByExample(ProcExample example);

    int deleteByPrimaryKey(@Param("db") String db, @Param("name") String name, @Param("type") String type);

    int insert(Proc record);

    int insertSelective(Proc record);

    List<Proc> selectByExampleWithBLOBs(ProcExample example);

    List<Proc> selectByExample(ProcExample example);

    Proc selectByPrimaryKey(@Param("db") String db, @Param("name") String name, @Param("type") String type);

    int updateByExampleSelective(@Param("record") Proc record, @Param("example") ProcExample example);

    int updateByExampleWithBLOBs(@Param("record") Proc record, @Param("example") ProcExample example);

    int updateByExample(@Param("record") Proc record, @Param("example") ProcExample example);

    int updateByPrimaryKeySelective(Proc record);

    int updateByPrimaryKeyWithBLOBs(Proc record);

    int updateByPrimaryKey(Proc record);
}