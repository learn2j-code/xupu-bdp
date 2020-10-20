package com.dlm.bdp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryExample() {
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

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andUnicodeIsNull() {
            addCriterion("unicode is null");
            return (Criteria) this;
        }

        public Criteria andUnicodeIsNotNull() {
            addCriterion("unicode is not null");
            return (Criteria) this;
        }

        public Criteria andUnicodeEqualTo(String value) {
            addCriterion("unicode =", value, "unicode");
            return (Criteria) this;
        }

        public Criteria andUnicodeNotEqualTo(String value) {
            addCriterion("unicode <>", value, "unicode");
            return (Criteria) this;
        }

        public Criteria andUnicodeGreaterThan(String value) {
            addCriterion("unicode >", value, "unicode");
            return (Criteria) this;
        }

        public Criteria andUnicodeGreaterThanOrEqualTo(String value) {
            addCriterion("unicode >=", value, "unicode");
            return (Criteria) this;
        }

        public Criteria andUnicodeLessThan(String value) {
            addCriterion("unicode <", value, "unicode");
            return (Criteria) this;
        }

        public Criteria andUnicodeLessThanOrEqualTo(String value) {
            addCriterion("unicode <=", value, "unicode");
            return (Criteria) this;
        }

        public Criteria andUnicodeLike(String value) {
            addCriterion("unicode like", value, "unicode");
            return (Criteria) this;
        }

        public Criteria andUnicodeNotLike(String value) {
            addCriterion("unicode not like", value, "unicode");
            return (Criteria) this;
        }

        public Criteria andUnicodeIn(List<String> values) {
            addCriterion("unicode in", values, "unicode");
            return (Criteria) this;
        }

        public Criteria andUnicodeNotIn(List<String> values) {
            addCriterion("unicode not in", values, "unicode");
            return (Criteria) this;
        }

        public Criteria andUnicodeBetween(String value1, String value2) {
            addCriterion("unicode between", value1, value2, "unicode");
            return (Criteria) this;
        }

        public Criteria andUnicodeNotBetween(String value1, String value2) {
            addCriterion("unicode not between", value1, value2, "unicode");
            return (Criteria) this;
        }

        public Criteria andSpellIsNull() {
            addCriterion("spell is null");
            return (Criteria) this;
        }

        public Criteria andSpellIsNotNull() {
            addCriterion("spell is not null");
            return (Criteria) this;
        }

        public Criteria andSpellEqualTo(String value) {
            addCriterion("spell =", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotEqualTo(String value) {
            addCriterion("spell <>", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThan(String value) {
            addCriterion("spell >", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThanOrEqualTo(String value) {
            addCriterion("spell >=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThan(String value) {
            addCriterion("spell <", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThanOrEqualTo(String value) {
            addCriterion("spell <=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLike(String value) {
            addCriterion("spell like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotLike(String value) {
            addCriterion("spell not like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellIn(List<String> values) {
            addCriterion("spell in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotIn(List<String> values) {
            addCriterion("spell not in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellBetween(String value1, String value2) {
            addCriterion("spell between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotBetween(String value1, String value2) {
            addCriterion("spell not between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andPronounceIsNull() {
            addCriterion("pronounce is null");
            return (Criteria) this;
        }

        public Criteria andPronounceIsNotNull() {
            addCriterion("pronounce is not null");
            return (Criteria) this;
        }

        public Criteria andPronounceEqualTo(String value) {
            addCriterion("pronounce =", value, "pronounce");
            return (Criteria) this;
        }

        public Criteria andPronounceNotEqualTo(String value) {
            addCriterion("pronounce <>", value, "pronounce");
            return (Criteria) this;
        }

        public Criteria andPronounceGreaterThan(String value) {
            addCriterion("pronounce >", value, "pronounce");
            return (Criteria) this;
        }

        public Criteria andPronounceGreaterThanOrEqualTo(String value) {
            addCriterion("pronounce >=", value, "pronounce");
            return (Criteria) this;
        }

        public Criteria andPronounceLessThan(String value) {
            addCriterion("pronounce <", value, "pronounce");
            return (Criteria) this;
        }

        public Criteria andPronounceLessThanOrEqualTo(String value) {
            addCriterion("pronounce <=", value, "pronounce");
            return (Criteria) this;
        }

        public Criteria andPronounceLike(String value) {
            addCriterion("pronounce like", value, "pronounce");
            return (Criteria) this;
        }

        public Criteria andPronounceNotLike(String value) {
            addCriterion("pronounce not like", value, "pronounce");
            return (Criteria) this;
        }

        public Criteria andPronounceIn(List<String> values) {
            addCriterion("pronounce in", values, "pronounce");
            return (Criteria) this;
        }

        public Criteria andPronounceNotIn(List<String> values) {
            addCriterion("pronounce not in", values, "pronounce");
            return (Criteria) this;
        }

        public Criteria andPronounceBetween(String value1, String value2) {
            addCriterion("pronounce between", value1, value2, "pronounce");
            return (Criteria) this;
        }

        public Criteria andPronounceNotBetween(String value1, String value2) {
            addCriterion("pronounce not between", value1, value2, "pronounce");
            return (Criteria) this;
        }

        public Criteria andStrokeIsNull() {
            addCriterion("stroke is null");
            return (Criteria) this;
        }

        public Criteria andStrokeIsNotNull() {
            addCriterion("stroke is not null");
            return (Criteria) this;
        }

        public Criteria andStrokeEqualTo(String value) {
            addCriterion("stroke =", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeNotEqualTo(String value) {
            addCriterion("stroke <>", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeGreaterThan(String value) {
            addCriterion("stroke >", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeGreaterThanOrEqualTo(String value) {
            addCriterion("stroke >=", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeLessThan(String value) {
            addCriterion("stroke <", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeLessThanOrEqualTo(String value) {
            addCriterion("stroke <=", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeLike(String value) {
            addCriterion("stroke like", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeNotLike(String value) {
            addCriterion("stroke not like", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeIn(List<String> values) {
            addCriterion("stroke in", values, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeNotIn(List<String> values) {
            addCriterion("stroke not in", values, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeBetween(String value1, String value2) {
            addCriterion("stroke between", value1, value2, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeNotBetween(String value1, String value2) {
            addCriterion("stroke not between", value1, value2, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderIsNull() {
            addCriterion("stroke_order is null");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderIsNotNull() {
            addCriterion("stroke_order is not null");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderEqualTo(String value) {
            addCriterion("stroke_order =", value, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderNotEqualTo(String value) {
            addCriterion("stroke_order <>", value, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderGreaterThan(String value) {
            addCriterion("stroke_order >", value, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderGreaterThanOrEqualTo(String value) {
            addCriterion("stroke_order >=", value, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderLessThan(String value) {
            addCriterion("stroke_order <", value, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderLessThanOrEqualTo(String value) {
            addCriterion("stroke_order <=", value, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderLike(String value) {
            addCriterion("stroke_order like", value, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderNotLike(String value) {
            addCriterion("stroke_order not like", value, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderIn(List<String> values) {
            addCriterion("stroke_order in", values, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderNotIn(List<String> values) {
            addCriterion("stroke_order not in", values, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderBetween(String value1, String value2) {
            addCriterion("stroke_order between", value1, value2, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andStrokeOrderNotBetween(String value1, String value2) {
            addCriterion("stroke_order not between", value1, value2, "strokeOrder");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeIsNull() {
            addCriterion("radical_stroke is null");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeIsNotNull() {
            addCriterion("radical_stroke is not null");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeEqualTo(String value) {
            addCriterion("radical_stroke =", value, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeNotEqualTo(String value) {
            addCriterion("radical_stroke <>", value, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeGreaterThan(String value) {
            addCriterion("radical_stroke >", value, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeGreaterThanOrEqualTo(String value) {
            addCriterion("radical_stroke >=", value, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeLessThan(String value) {
            addCriterion("radical_stroke <", value, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeLessThanOrEqualTo(String value) {
            addCriterion("radical_stroke <=", value, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeLike(String value) {
            addCriterion("radical_stroke like", value, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeNotLike(String value) {
            addCriterion("radical_stroke not like", value, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeIn(List<String> values) {
            addCriterion("radical_stroke in", values, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeNotIn(List<String> values) {
            addCriterion("radical_stroke not in", values, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeBetween(String value1, String value2) {
            addCriterion("radical_stroke between", value1, value2, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalStrokeNotBetween(String value1, String value2) {
            addCriterion("radical_stroke not between", value1, value2, "radicalStroke");
            return (Criteria) this;
        }

        public Criteria andRadicalIsNull() {
            addCriterion("radical is null");
            return (Criteria) this;
        }

        public Criteria andRadicalIsNotNull() {
            addCriterion("radical is not null");
            return (Criteria) this;
        }

        public Criteria andRadicalEqualTo(String value) {
            addCriterion("radical =", value, "radical");
            return (Criteria) this;
        }

        public Criteria andRadicalNotEqualTo(String value) {
            addCriterion("radical <>", value, "radical");
            return (Criteria) this;
        }

        public Criteria andRadicalGreaterThan(String value) {
            addCriterion("radical >", value, "radical");
            return (Criteria) this;
        }

        public Criteria andRadicalGreaterThanOrEqualTo(String value) {
            addCriterion("radical >=", value, "radical");
            return (Criteria) this;
        }

        public Criteria andRadicalLessThan(String value) {
            addCriterion("radical <", value, "radical");
            return (Criteria) this;
        }

        public Criteria andRadicalLessThanOrEqualTo(String value) {
            addCriterion("radical <=", value, "radical");
            return (Criteria) this;
        }

        public Criteria andRadicalLike(String value) {
            addCriterion("radical like", value, "radical");
            return (Criteria) this;
        }

        public Criteria andRadicalNotLike(String value) {
            addCriterion("radical not like", value, "radical");
            return (Criteria) this;
        }

        public Criteria andRadicalIn(List<String> values) {
            addCriterion("radical in", values, "radical");
            return (Criteria) this;
        }

        public Criteria andRadicalNotIn(List<String> values) {
            addCriterion("radical not in", values, "radical");
            return (Criteria) this;
        }

        public Criteria andRadicalBetween(String value1, String value2) {
            addCriterion("radical between", value1, value2, "radical");
            return (Criteria) this;
        }

        public Criteria andRadicalNotBetween(String value1, String value2) {
            addCriterion("radical not between", value1, value2, "radical");
            return (Criteria) this;
        }

        public Criteria andConstructIsNull() {
            addCriterion("construct is null");
            return (Criteria) this;
        }

        public Criteria andConstructIsNotNull() {
            addCriterion("construct is not null");
            return (Criteria) this;
        }

        public Criteria andConstructEqualTo(String value) {
            addCriterion("construct =", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructNotEqualTo(String value) {
            addCriterion("construct <>", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructGreaterThan(String value) {
            addCriterion("construct >", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructGreaterThanOrEqualTo(String value) {
            addCriterion("construct >=", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructLessThan(String value) {
            addCriterion("construct <", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructLessThanOrEqualTo(String value) {
            addCriterion("construct <=", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructLike(String value) {
            addCriterion("construct like", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructNotLike(String value) {
            addCriterion("construct not like", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructIn(List<String> values) {
            addCriterion("construct in", values, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructNotIn(List<String> values) {
            addCriterion("construct not in", values, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructBetween(String value1, String value2) {
            addCriterion("construct between", value1, value2, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructNotBetween(String value1, String value2) {
            addCriterion("construct not between", value1, value2, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructSpellIsNull() {
            addCriterion("construct_spell is null");
            return (Criteria) this;
        }

        public Criteria andConstructSpellIsNotNull() {
            addCriterion("construct_spell is not null");
            return (Criteria) this;
        }

        public Criteria andConstructSpellEqualTo(String value) {
            addCriterion("construct_spell =", value, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andConstructSpellNotEqualTo(String value) {
            addCriterion("construct_spell <>", value, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andConstructSpellGreaterThan(String value) {
            addCriterion("construct_spell >", value, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andConstructSpellGreaterThanOrEqualTo(String value) {
            addCriterion("construct_spell >=", value, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andConstructSpellLessThan(String value) {
            addCriterion("construct_spell <", value, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andConstructSpellLessThanOrEqualTo(String value) {
            addCriterion("construct_spell <=", value, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andConstructSpellLike(String value) {
            addCriterion("construct_spell like", value, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andConstructSpellNotLike(String value) {
            addCriterion("construct_spell not like", value, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andConstructSpellIn(List<String> values) {
            addCriterion("construct_spell in", values, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andConstructSpellNotIn(List<String> values) {
            addCriterion("construct_spell not in", values, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andConstructSpellBetween(String value1, String value2) {
            addCriterion("construct_spell between", value1, value2, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andConstructSpellNotBetween(String value1, String value2) {
            addCriterion("construct_spell not between", value1, value2, "constructSpell");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructIsNull() {
            addCriterion("unnormal_construct is null");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructIsNotNull() {
            addCriterion("unnormal_construct is not null");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructEqualTo(String value) {
            addCriterion("unnormal_construct =", value, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructNotEqualTo(String value) {
            addCriterion("unnormal_construct <>", value, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructGreaterThan(String value) {
            addCriterion("unnormal_construct >", value, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructGreaterThanOrEqualTo(String value) {
            addCriterion("unnormal_construct >=", value, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructLessThan(String value) {
            addCriterion("unnormal_construct <", value, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructLessThanOrEqualTo(String value) {
            addCriterion("unnormal_construct <=", value, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructLike(String value) {
            addCriterion("unnormal_construct like", value, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructNotLike(String value) {
            addCriterion("unnormal_construct not like", value, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructIn(List<String> values) {
            addCriterion("unnormal_construct in", values, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructNotIn(List<String> values) {
            addCriterion("unnormal_construct not in", values, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructBetween(String value1, String value2) {
            addCriterion("unnormal_construct between", value1, value2, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andUnnormalConstructNotBetween(String value1, String value2) {
            addCriterion("unnormal_construct not between", value1, value2, "unnormalConstruct");
            return (Criteria) this;
        }

        public Criteria andExplanationIsNull() {
            addCriterion("explanation is null");
            return (Criteria) this;
        }

        public Criteria andExplanationIsNotNull() {
            addCriterion("explanation is not null");
            return (Criteria) this;
        }

        public Criteria andExplanationEqualTo(String value) {
            addCriterion("explanation =", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotEqualTo(String value) {
            addCriterion("explanation <>", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationGreaterThan(String value) {
            addCriterion("explanation >", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationGreaterThanOrEqualTo(String value) {
            addCriterion("explanation >=", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLessThan(String value) {
            addCriterion("explanation <", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLessThanOrEqualTo(String value) {
            addCriterion("explanation <=", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLike(String value) {
            addCriterion("explanation like", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotLike(String value) {
            addCriterion("explanation not like", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationIn(List<String> values) {
            addCriterion("explanation in", values, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotIn(List<String> values) {
            addCriterion("explanation not in", values, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationBetween(String value1, String value2) {
            addCriterion("explanation between", value1, value2, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotBetween(String value1, String value2) {
            addCriterion("explanation not between", value1, value2, "explanation");
            return (Criteria) this;
        }

        public Criteria andFontTypeIsNull() {
            addCriterion("font_type is null");
            return (Criteria) this;
        }

        public Criteria andFontTypeIsNotNull() {
            addCriterion("font_type is not null");
            return (Criteria) this;
        }

        public Criteria andFontTypeEqualTo(String value) {
            addCriterion("font_type =", value, "fontType");
            return (Criteria) this;
        }

        public Criteria andFontTypeNotEqualTo(String value) {
            addCriterion("font_type <>", value, "fontType");
            return (Criteria) this;
        }

        public Criteria andFontTypeGreaterThan(String value) {
            addCriterion("font_type >", value, "fontType");
            return (Criteria) this;
        }

        public Criteria andFontTypeGreaterThanOrEqualTo(String value) {
            addCriterion("font_type >=", value, "fontType");
            return (Criteria) this;
        }

        public Criteria andFontTypeLessThan(String value) {
            addCriterion("font_type <", value, "fontType");
            return (Criteria) this;
        }

        public Criteria andFontTypeLessThanOrEqualTo(String value) {
            addCriterion("font_type <=", value, "fontType");
            return (Criteria) this;
        }

        public Criteria andFontTypeLike(String value) {
            addCriterion("font_type like", value, "fontType");
            return (Criteria) this;
        }

        public Criteria andFontTypeNotLike(String value) {
            addCriterion("font_type not like", value, "fontType");
            return (Criteria) this;
        }

        public Criteria andFontTypeIn(List<String> values) {
            addCriterion("font_type in", values, "fontType");
            return (Criteria) this;
        }

        public Criteria andFontTypeNotIn(List<String> values) {
            addCriterion("font_type not in", values, "fontType");
            return (Criteria) this;
        }

        public Criteria andFontTypeBetween(String value1, String value2) {
            addCriterion("font_type between", value1, value2, "fontType");
            return (Criteria) this;
        }

        public Criteria andFontTypeNotBetween(String value1, String value2) {
            addCriterion("font_type not between", value1, value2, "fontType");
            return (Criteria) this;
        }

        public Criteria andMappingIsNull() {
            addCriterion("mapping is null");
            return (Criteria) this;
        }

        public Criteria andMappingIsNotNull() {
            addCriterion("mapping is not null");
            return (Criteria) this;
        }

        public Criteria andMappingEqualTo(String value) {
            addCriterion("mapping =", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingNotEqualTo(String value) {
            addCriterion("mapping <>", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingGreaterThan(String value) {
            addCriterion("mapping >", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingGreaterThanOrEqualTo(String value) {
            addCriterion("mapping >=", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingLessThan(String value) {
            addCriterion("mapping <", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingLessThanOrEqualTo(String value) {
            addCriterion("mapping <=", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingLike(String value) {
            addCriterion("mapping like", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingNotLike(String value) {
            addCriterion("mapping not like", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingIn(List<String> values) {
            addCriterion("mapping in", values, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingNotIn(List<String> values) {
            addCriterion("mapping not in", values, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingBetween(String value1, String value2) {
            addCriterion("mapping between", value1, value2, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingNotBetween(String value1, String value2) {
            addCriterion("mapping not between", value1, value2, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeIsNull() {
            addCriterion("mapping_stroke is null");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeIsNotNull() {
            addCriterion("mapping_stroke is not null");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeEqualTo(String value) {
            addCriterion("mapping_stroke =", value, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeNotEqualTo(String value) {
            addCriterion("mapping_stroke <>", value, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeGreaterThan(String value) {
            addCriterion("mapping_stroke >", value, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeGreaterThanOrEqualTo(String value) {
            addCriterion("mapping_stroke >=", value, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeLessThan(String value) {
            addCriterion("mapping_stroke <", value, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeLessThanOrEqualTo(String value) {
            addCriterion("mapping_stroke <=", value, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeLike(String value) {
            addCriterion("mapping_stroke like", value, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeNotLike(String value) {
            addCriterion("mapping_stroke not like", value, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeIn(List<String> values) {
            addCriterion("mapping_stroke in", values, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeNotIn(List<String> values) {
            addCriterion("mapping_stroke not in", values, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeBetween(String value1, String value2) {
            addCriterion("mapping_stroke between", value1, value2, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingStrokeNotBetween(String value1, String value2) {
            addCriterion("mapping_stroke not between", value1, value2, "mappingStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeIsNull() {
            addCriterion("mapping_radical_stroke is null");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeIsNotNull() {
            addCriterion("mapping_radical_stroke is not null");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeEqualTo(String value) {
            addCriterion("mapping_radical_stroke =", value, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeNotEqualTo(String value) {
            addCriterion("mapping_radical_stroke <>", value, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeGreaterThan(String value) {
            addCriterion("mapping_radical_stroke >", value, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeGreaterThanOrEqualTo(String value) {
            addCriterion("mapping_radical_stroke >=", value, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeLessThan(String value) {
            addCriterion("mapping_radical_stroke <", value, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeLessThanOrEqualTo(String value) {
            addCriterion("mapping_radical_stroke <=", value, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeLike(String value) {
            addCriterion("mapping_radical_stroke like", value, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeNotLike(String value) {
            addCriterion("mapping_radical_stroke not like", value, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeIn(List<String> values) {
            addCriterion("mapping_radical_stroke in", values, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeNotIn(List<String> values) {
            addCriterion("mapping_radical_stroke not in", values, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeBetween(String value1, String value2) {
            addCriterion("mapping_radical_stroke between", value1, value2, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalStrokeNotBetween(String value1, String value2) {
            addCriterion("mapping_radical_stroke not between", value1, value2, "mappingRadicalStroke");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalIsNull() {
            addCriterion("mapping_radical is null");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalIsNotNull() {
            addCriterion("mapping_radical is not null");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalEqualTo(String value) {
            addCriterion("mapping_radical =", value, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalNotEqualTo(String value) {
            addCriterion("mapping_radical <>", value, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalGreaterThan(String value) {
            addCriterion("mapping_radical >", value, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalGreaterThanOrEqualTo(String value) {
            addCriterion("mapping_radical >=", value, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalLessThan(String value) {
            addCriterion("mapping_radical <", value, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalLessThanOrEqualTo(String value) {
            addCriterion("mapping_radical <=", value, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalLike(String value) {
            addCriterion("mapping_radical like", value, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalNotLike(String value) {
            addCriterion("mapping_radical not like", value, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalIn(List<String> values) {
            addCriterion("mapping_radical in", values, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalNotIn(List<String> values) {
            addCriterion("mapping_radical not in", values, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalBetween(String value1, String value2) {
            addCriterion("mapping_radical between", value1, value2, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andMappingRadicalNotBetween(String value1, String value2) {
            addCriterion("mapping_radical not between", value1, value2, "mappingRadical");
            return (Criteria) this;
        }

        public Criteria andNormalIsNull() {
            addCriterion("normal is null");
            return (Criteria) this;
        }

        public Criteria andNormalIsNotNull() {
            addCriterion("normal is not null");
            return (Criteria) this;
        }

        public Criteria andNormalEqualTo(Integer value) {
            addCriterion("normal =", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalNotEqualTo(Integer value) {
            addCriterion("normal <>", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalGreaterThan(Integer value) {
            addCriterion("normal >", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalGreaterThanOrEqualTo(Integer value) {
            addCriterion("normal >=", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalLessThan(Integer value) {
            addCriterion("normal <", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalLessThanOrEqualTo(Integer value) {
            addCriterion("normal <=", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalIn(List<Integer> values) {
            addCriterion("normal in", values, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalNotIn(List<Integer> values) {
            addCriterion("normal not in", values, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalBetween(Integer value1, Integer value2) {
            addCriterion("normal between", value1, value2, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalNotBetween(Integer value1, Integer value2) {
            addCriterion("normal not between", value1, value2, "normal");
            return (Criteria) this;
        }

        public Criteria andNameSubjectIsNull() {
            addCriterion("name_subject is null");
            return (Criteria) this;
        }

        public Criteria andNameSubjectIsNotNull() {
            addCriterion("name_subject is not null");
            return (Criteria) this;
        }

        public Criteria andNameSubjectEqualTo(Integer value) {
            addCriterion("name_subject =", value, "nameSubject");
            return (Criteria) this;
        }

        public Criteria andNameSubjectNotEqualTo(Integer value) {
            addCriterion("name_subject <>", value, "nameSubject");
            return (Criteria) this;
        }

        public Criteria andNameSubjectGreaterThan(Integer value) {
            addCriterion("name_subject >", value, "nameSubject");
            return (Criteria) this;
        }

        public Criteria andNameSubjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("name_subject >=", value, "nameSubject");
            return (Criteria) this;
        }

        public Criteria andNameSubjectLessThan(Integer value) {
            addCriterion("name_subject <", value, "nameSubject");
            return (Criteria) this;
        }

        public Criteria andNameSubjectLessThanOrEqualTo(Integer value) {
            addCriterion("name_subject <=", value, "nameSubject");
            return (Criteria) this;
        }

        public Criteria andNameSubjectIn(List<Integer> values) {
            addCriterion("name_subject in", values, "nameSubject");
            return (Criteria) this;
        }

        public Criteria andNameSubjectNotIn(List<Integer> values) {
            addCriterion("name_subject not in", values, "nameSubject");
            return (Criteria) this;
        }

        public Criteria andNameSubjectBetween(Integer value1, Integer value2) {
            addCriterion("name_subject between", value1, value2, "nameSubject");
            return (Criteria) this;
        }

        public Criteria andNameSubjectNotBetween(Integer value1, Integer value2) {
            addCriterion("name_subject not between", value1, value2, "nameSubject");
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