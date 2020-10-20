package com.dlm.bdp.mapper;

import com.dlm.bdp.pojo.NodeContent;
import com.dlm.bdp.pojo.NodeContentExample;
import com.dlm.bdp.pojo.NodeContentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeContentMapper {
    int countByExample(NodeContentExample example);

    int deleteByExample(NodeContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeContentWithBLOBs record);

    int insertSelective(NodeContentWithBLOBs record);

    List<NodeContentWithBLOBs> selectByExampleWithBLOBs(NodeContentExample example);

    List<NodeContent> selectByExample(NodeContentExample example);

    NodeContentWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NodeContentWithBLOBs record, @Param("example") NodeContentExample example);

    int updateByExampleWithBLOBs(@Param("record") NodeContentWithBLOBs record, @Param("example") NodeContentExample example);

    int updateByExample(@Param("record") NodeContent record, @Param("example") NodeContentExample example);

    int updateByPrimaryKeySelective(NodeContentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NodeContentWithBLOBs record);

    int updateByPrimaryKey(NodeContent record);
}