package com.dlm.bdp.mapper;

import com.dlm.bdp.pojo.RelationshipCall;
import com.dlm.bdp.pojo.RelationshipCallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationshipCallMapper {
    int countByExample(RelationshipCallExample example);

    int deleteByExample(RelationshipCallExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RelationshipCall record);

    int insertSelective(RelationshipCall record);

    List<RelationshipCall> selectByExample(RelationshipCallExample example);

    RelationshipCall selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RelationshipCall record, @Param("example") RelationshipCallExample example);

    int updateByExample(@Param("record") RelationshipCall record, @Param("example") RelationshipCallExample example);

    int updateByPrimaryKeySelective(RelationshipCall record);

    int updateByPrimaryKey(RelationshipCall record);
}