package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.SlaveMasterInfo;
import com.cer.mall.mylitemall.mbg.model.SlaveMasterInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlaveMasterInfoMapper {
    int countByExample(SlaveMasterInfoExample example);

    int deleteByExample(SlaveMasterInfoExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("port") Integer port);

    int insert(SlaveMasterInfo record);

    int insertSelective(SlaveMasterInfo record);

    List<SlaveMasterInfo> selectByExampleWithBLOBs(SlaveMasterInfoExample example);

    List<SlaveMasterInfo> selectByExample(SlaveMasterInfoExample example);

    SlaveMasterInfo selectByPrimaryKey(@Param("host") String host, @Param("port") Integer port);

    int updateByExampleSelective(@Param("record") SlaveMasterInfo record, @Param("example") SlaveMasterInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SlaveMasterInfo record, @Param("example") SlaveMasterInfoExample example);

    int updateByExample(@Param("record") SlaveMasterInfo record, @Param("example") SlaveMasterInfoExample example);

    int updateByPrimaryKeySelective(SlaveMasterInfo record);

    int updateByPrimaryKeyWithBLOBs(SlaveMasterInfo record);

    int updateByPrimaryKey(SlaveMasterInfo record);
}