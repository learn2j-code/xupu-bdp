package com.dlm.bdp.pojo;

import java.util.Date;

public class RelationshipCall {
    private Integer id;

    private String code;

    private String postCodes;

    private String relationCode;

    private String relationCodecn;

    private Integer generationLevelCode;

    private String generationLevel;

    private Integer relationType;

    private Integer genderType;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPostCodes() {
        return postCodes;
    }

    public void setPostCodes(String postCodes) {
        this.postCodes = postCodes == null ? null : postCodes.trim();
    }

    public String getRelationCode() {
        return relationCode;
    }

    public void setRelationCode(String relationCode) {
        this.relationCode = relationCode == null ? null : relationCode.trim();
    }

    public String getRelationCodecn() {
        return relationCodecn;
    }

    public void setRelationCodecn(String relationCodecn) {
        this.relationCodecn = relationCodecn == null ? null : relationCodecn.trim();
    }

    public Integer getGenerationLevelCode() {
        return generationLevelCode;
    }

    public void setGenerationLevelCode(Integer generationLevelCode) {
        this.generationLevelCode = generationLevelCode;
    }

    public String getGenerationLevel() {
        return generationLevel;
    }

    public void setGenerationLevel(String generationLevel) {
        this.generationLevel = generationLevel == null ? null : generationLevel.trim();
    }

    public Integer getRelationType() {
        return relationType;
    }

    public void setRelationType(Integer relationType) {
        this.relationType = relationType;
    }

    public Integer getGenderType() {
        return genderType;
    }

    public void setGenderType(Integer genderType) {
        this.genderType = genderType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}