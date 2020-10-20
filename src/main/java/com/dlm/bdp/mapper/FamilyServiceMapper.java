package com.dlm.bdp.mapper;

import com.dlm.bdp.pojo.FamilyService;
import com.dlm.bdp.pojo.FamilyServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilyServiceMapper {
    int countByExample(FamilyServiceExample example);

    int deleteByExample(FamilyServiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FamilyService record);

    int insertSelective(FamilyService record);

    List<FamilyService> selectByExample(FamilyServiceExample example);

    FamilyService selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FamilyService record, @Param("example") FamilyServiceExample example);

    int updateByExample(@Param("record") FamilyService record, @Param("example") FamilyServiceExample example);

    int updateByPrimaryKeySelective(FamilyService record);

    int updateByPrimaryKey(FamilyService record);
}