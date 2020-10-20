package com.dlm.bdp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RelationshipCallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationshipCallExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andPostCodesIsNull() {
            addCriterion("post_codes is null");
            return (Criteria) this;
        }

        public Criteria andPostCodesIsNotNull() {
            addCriterion("post_codes is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodesEqualTo(String value) {
            addCriterion("post_codes =", value, "postCodes");
            return (Criteria) this;
        }

        public Criteria andPostCodesNotEqualTo(String value) {
            addCriterion("post_codes <>", value, "postCodes");
            return (Criteria) this;
        }

        public Criteria andPostCodesGreaterThan(String value) {
            addCriterion("post_codes >", value, "postCodes");
            return (Criteria) this;
        }

        public Criteria andPostCodesGreaterThanOrEqualTo(String value) {
            addCriterion("post_codes >=", value, "postCodes");
            return (Criteria) this;
        }

        public Criteria andPostCodesLessThan(String value) {
            addCriterion("post_codes <", value, "postCodes");
            return (Criteria) this;
        }

        public Criteria andPostCodesLessThanOrEqualTo(String value) {
            addCriterion("post_codes <=", value, "postCodes");
            return (Criteria) this;
        }

        public Criteria andPostCodesLike(String value) {
            addCriterion("post_codes like", value, "postCodes");
            return (Criteria) this;
        }

        public Criteria andPostCodesNotLike(String value) {
            addCriterion("post_codes not like", value, "postCodes");
            return (Criteria) this;
        }

        public Criteria andPostCodesIn(List<String> values) {
            addCriterion("post_codes in", values, "postCodes");
            return (Criteria) this;
        }

        public Criteria andPostCodesNotIn(List<String> values) {
            addCriterion("post_codes not in", values, "postCodes");
            return (Criteria) this;
        }

        public Criteria andPostCodesBetween(String value1, String value2) {
            addCriterion("post_codes between", value1, value2, "postCodes");
            return (Criteria) this;
        }

        public Criteria andPostCodesNotBetween(String value1, String value2) {
            addCriterion("post_codes not between", value1, value2, "postCodes");
            return (Criteria) this;
        }

        public Criteria andRelationCodeIsNull() {
            addCriterion("relation_code is null");
            return (Criteria) this;
        }

        public Criteria andRelationCodeIsNotNull() {
            addCriterion("relation_code is not null");
            return (Criteria) this;
        }

        public Criteria andRelationCodeEqualTo(String value) {
            addCriterion("relation_code =", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeNotEqualTo(String value) {
            addCriterion("relation_code <>", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeGreaterThan(String value) {
            addCriterion("relation_code >", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("relation_code >=", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeLessThan(String value) {
            addCriterion("relation_code <", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeLessThanOrEqualTo(String value) {
            addCriterion("relation_code <=", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeLike(String value) {
            addCriterion("relation_code like", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeNotLike(String value) {
            addCriterion("relation_code not like", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeIn(List<String> values) {
            addCriterion("relation_code in", values, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeNotIn(List<String> values) {
            addCriterion("relation_code not in", values, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeBetween(String value1, String value2) {
            addCriterion("relation_code between", value1, value2, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeNotBetween(String value1, String value2) {
            addCriterion("relation_code not between", value1, value2, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnIsNull() {
            addCriterion("relation_codeCN is null");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnIsNotNull() {
            addCriterion("relation_codeCN is not null");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnEqualTo(String value) {
            addCriterion("relation_codeCN =", value, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnNotEqualTo(String value) {
            addCriterion("relation_codeCN <>", value, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnGreaterThan(String value) {
            addCriterion("relation_codeCN >", value, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnGreaterThanOrEqualTo(String value) {
            addCriterion("relation_codeCN >=", value, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnLessThan(String value) {
            addCriterion("relation_codeCN <", value, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnLessThanOrEqualTo(String value) {
            addCriterion("relation_codeCN <=", value, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnLike(String value) {
            addCriterion("relation_codeCN like", value, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnNotLike(String value) {
            addCriterion("relation_codeCN not like", value, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnIn(List<String> values) {
            addCriterion("relation_codeCN in", values, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnNotIn(List<String> values) {
            addCriterion("relation_codeCN not in", values, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnBetween(String value1, String value2) {
            addCriterion("relation_codeCN between", value1, value2, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andRelationCodecnNotBetween(String value1, String value2) {
            addCriterion("relation_codeCN not between", value1, value2, "relationCodecn");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeIsNull() {
            addCriterion("generation_level_code is null");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeIsNotNull() {
            addCriterion("generation_level_code is not null");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeEqualTo(Integer value) {
            addCriterion("generation_level_code =", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeNotEqualTo(Integer value) {
            addCriterion("generation_level_code <>", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeGreaterThan(Integer value) {
            addCriterion("generation_level_code >", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("generation_level_code >=", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeLessThan(Integer value) {
            addCriterion("generation_level_code <", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeLessThanOrEqualTo(Integer value) {
            addCriterion("generation_level_code <=", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeIn(List<Integer> values) {
            addCriterion("generation_level_code in", values, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeNotIn(List<Integer> values) {
            addCriterion("generation_level_code not in", values, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeBetween(Integer value1, Integer value2) {
            addCriterion("generation_level_code between", value1, value2, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("generation_level_code not between", value1, value2, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelIsNull() {
            addCriterion("generation_level is null");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelIsNotNull() {
            addCriterion("generation_level is not null");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelEqualTo(String value) {
            addCriterion("generation_level =", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelNotEqualTo(String value) {
            addCriterion("generation_level <>", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelGreaterThan(String value) {
            addCriterion("generation_level >", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelGreaterThanOrEqualTo(String value) {
            addCriterion("generation_level >=", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelLessThan(String value) {
            addCriterion("generation_level <", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelLessThanOrEqualTo(String value) {
            addCriterion("generation_level <=", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelLike(String value) {
            addCriterion("generation_level like", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelNotLike(String value) {
            addCriterion("generation_level not like", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelIn(List<String> values) {
            addCriterion("generation_level in", values, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelNotIn(List<String> values) {
            addCriterion("generation_level not in", values, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelBetween(String value1, String value2) {
            addCriterion("generation_level between", value1, value2, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelNotBetween(String value1, String value2) {
            addCriterion("generation_level not between", value1, value2, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNull() {
            addCriterion("relation_type is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNotNull() {
            addCriterion("relation_type is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeEqualTo(Integer value) {
            addCriterion("relation_type =", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotEqualTo(Integer value) {
            addCriterion("relation_type <>", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThan(Integer value) {
            addCriterion("relation_type >", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_type >=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThan(Integer value) {
            addCriterion("relation_type <", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("relation_type <=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIn(List<Integer> values) {
            addCriterion("relation_type in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotIn(List<Integer> values) {
            addCriterion("relation_type not in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeBetween(Integer value1, Integer value2) {
            addCriterion("relation_type between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_type not between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andGenderTypeIsNull() {
            addCriterion("gender_type is null");
            return (Criteria) this;
        }

        public Criteria andGenderTypeIsNotNull() {
            addCriterion("gender_type is not null");
            return (Criteria) this;
        }

        public Criteria andGenderTypeEqualTo(Integer value) {
            addCriterion("gender_type =", value, "genderType");
            return (Criteria) this;
        }

        public Criteria andGenderTypeNotEqualTo(Integer value) {
            addCriterion("gender_type <>", value, "genderType");
            return (Criteria) this;
        }

        public Criteria andGenderTypeGreaterThan(Integer value) {
            addCriterion("gender_type >", value, "genderType");
            return (Criteria) this;
        }

        public Criteria andGenderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender_type >=", value, "genderType");
            return (Criteria) this;
        }

        public Criteria andGenderTypeLessThan(Integer value) {
            addCriterion("gender_type <", value, "genderType");
            return (Criteria) this;
        }

        public Criteria andGenderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("gender_type <=", value, "genderType");
            return (Criteria) this;
        }

        public Criteria andGenderTypeIn(List<Integer> values) {
            addCriterion("gender_type in", values, "genderType");
            return (Criteria) this;
        }

        public Criteria andGenderTypeNotIn(List<Integer> values) {
            addCriterion("gender_type not in", values, "genderType");
            return (Criteria) this;
        }

        public Criteria andGenderTypeBetween(Integer value1, Integer value2) {
            addCriterion("gender_type between", value1, value2, "genderType");
            return (Criteria) this;
        }

        public Criteria andGenderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("gender_type not between", value1, value2, "genderType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}