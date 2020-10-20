package com.dlm.bdp.mapper;

import com.dlm.bdp.pojo.FamilyInfo;
import com.dlm.bdp.pojo.FamilyInfoExample;
import com.dlm.bdp.pojo.FamilyInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilyInfoMapper {
    int countByExample(FamilyInfoExample example);

    int deleteByExample(FamilyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FamilyInfoWithBLOBs record);

    int insertSelective(FamilyInfoWithBLOBs record);

    List<FamilyInfoWithBLOBs> selectByExampleWithBLOBs(FamilyInfoExample example);

    List<FamilyInfo> selectByExample(FamilyInfoExample example);

    FamilyInfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FamilyInfoWithBLOBs record, @Param("example") FamilyInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") FamilyInfoWithBLOBs record, @Param("example") FamilyInfoExample example);

    int updateByExample(@Param("record") FamilyInfo record, @Param("example") FamilyInfoExample example);

    int updateByPrimaryKeySelective(FamilyInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FamilyInfoWithBLOBs record);

    int updateByPrimaryKey(FamilyInfo record);
}