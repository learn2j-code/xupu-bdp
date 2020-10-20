package com.dlm.bdp.pojo;

import java.util.Date;

public class Dictionary {
    private Integer id;

    private String imgUrl;

    private String unicode;

    private String spell;

    private String pronounce;

    private String stroke;

    private String strokeOrder;

    private String radicalStroke;

    private String radical;

    private String construct;

    private String constructSpell;

    private String unnormalConstruct;

    private String explanation;

    private String fontType;

    private String mapping;

    private String mappingStroke;

    private String mappingRadicalStroke;

    private String mappingRadical;

    private Integer normal;

    private Integer nameSubject;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getUnicode() {
        return unicode;
    }

    public void setUnicode(String unicode) {
        this.unicode = unicode == null ? null : unicode.trim();
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }

    public String getPronounce() {
        return pronounce;
    }

    public void setPronounce(String pronounce) {
        this.pronounce = pronounce == null ? null : pronounce.trim();
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke == null ? null : stroke.trim();
    }

    public String getStrokeOrder() {
        return strokeOrder;
    }

    public void setStrokeOrder(String strokeOrder) {
        this.strokeOrder = strokeOrder == null ? null : strokeOrder.trim();
    }

    public String getRadicalStroke() {
        return radicalStroke;
    }

    public void setRadicalStroke(String radicalStroke) {
        this.radicalStroke = radicalStroke == null ? null : radicalStroke.trim();
    }

    public String getRadical() {
        return radical;
    }

    public void setRadical(String radical) {
        this.radical = radical == null ? null : radical.trim();
    }

    public String getConstruct() {
        return construct;
    }

    public void setConstruct(String construct) {
        this.construct = construct == null ? null : construct.trim();
    }

    public String getConstructSpell() {
        return constructSpell;
    }

    public void setConstructSpell(String constructSpell) {
        this.constructSpell = constructSpell == null ? null : constructSpell.trim();
    }

    public String getUnnormalConstruct() {
        return unnormalConstruct;
    }

    public void setUnnormalConstruct(String unnormalConstruct) {
        this.unnormalConstruct = unnormalConstruct == null ? null : unnormalConstruct.trim();
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation == null ? null : explanation.trim();
    }

    public String getFontType() {
        return fontType;
    }

    public void setFontType(String fontType) {
        this.fontType = fontType == null ? null : fontType.trim();
    }

    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping == null ? null : mapping.trim();
    }

    public String getMappingStroke() {
        return mappingStroke;
    }

    public void setMappingStroke(String mappingStroke) {
        this.mappingStroke = mappingStroke == null ? null : mappingStroke.trim();
    }

    public String getMappingRadicalStroke() {
        return mappingRadicalStroke;
    }

    public void setMappingRadicalStroke(String mappingRadicalStroke) {
        this.mappingRadicalStroke = mappingRadicalStroke == null ? null : mappingRadicalStroke.trim();
    }

    public String getMappingRadical() {
        return mappingRadical;
    }

    public void setMappingRadical(String mappingRadical) {
        this.mappingRadical = mappingRadical == null ? null : mappingRadical.trim();
    }

    public Integer getNormal() {
        return normal;
    }

    public void setNormal(Integer normal) {
        this.normal = normal;
    }

    public Integer getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(Integer nameSubject) {
        this.nameSubject = nameSubject;
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