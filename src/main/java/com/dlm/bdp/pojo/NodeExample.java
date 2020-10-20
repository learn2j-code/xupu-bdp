package com.dlm.bdp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodeExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNull() {
            addCriterion("sub_title is null");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNotNull() {
            addCriterion("sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andSubTitleEqualTo(String value) {
            addCriterion("sub_title =", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotEqualTo(String value) {
            addCriterion("sub_title <>", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThan(String value) {
            addCriterion("sub_title >", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sub_title >=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThan(String value) {
            addCriterion("sub_title <", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThanOrEqualTo(String value) {
            addCriterion("sub_title <=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLike(String value) {
            addCriterion("sub_title like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotLike(String value) {
            addCriterion("sub_title not like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleIn(List<String> values) {
            addCriterion("sub_title in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotIn(List<String> values) {
            addCriterion("sub_title not in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleBetween(String value1, String value2) {
            addCriterion("sub_title between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotBetween(String value1, String value2) {
            addCriterion("sub_title not between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdIsNull() {
            addCriterion("node_type_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdIsNotNull() {
            addCriterion("node_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdEqualTo(Integer value) {
            addCriterion("node_type_id =", value, "nodeTypeId");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdNotEqualTo(Integer value) {
            addCriterion("node_type_id <>", value, "nodeTypeId");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdGreaterThan(Integer value) {
            addCriterion("node_type_id >", value, "nodeTypeId");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_type_id >=", value, "nodeTypeId");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdLessThan(Integer value) {
            addCriterion("node_type_id <", value, "nodeTypeId");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("node_type_id <=", value, "nodeTypeId");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdIn(List<Integer> values) {
            addCriterion("node_type_id in", values, "nodeTypeId");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdNotIn(List<Integer> values) {
            addCriterion("node_type_id not in", values, "nodeTypeId");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("node_type_id between", value1, value2, "nodeTypeId");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("node_type_id not between", value1, value2, "nodeTypeId");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNull() {
            addCriterion("section_id is null");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNotNull() {
            addCriterion("section_id is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIdEqualTo(Integer value) {
            addCriterion("section_id =", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualTo(Integer value) {
            addCriterion("section_id <>", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThan(Integer value) {
            addCriterion("section_id >", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_id >=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThan(Integer value) {
            addCriterion("section_id <", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("section_id <=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIn(List<Integer> values) {
            addCriterion("section_id in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotIn(List<Integer> values) {
            addCriterion("section_id not in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("section_id between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("section_id not between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdIsNull() {
            addCriterion("catalogue_id is null");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdIsNotNull() {
            addCriterion("catalogue_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdEqualTo(Integer value) {
            addCriterion("catalogue_id =", value, "catalogueId");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdNotEqualTo(Integer value) {
            addCriterion("catalogue_id <>", value, "catalogueId");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdGreaterThan(Integer value) {
            addCriterion("catalogue_id >", value, "catalogueId");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("catalogue_id >=", value, "catalogueId");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdLessThan(Integer value) {
            addCriterion("catalogue_id <", value, "catalogueId");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdLessThanOrEqualTo(Integer value) {
            addCriterion("catalogue_id <=", value, "catalogueId");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdIn(List<Integer> values) {
            addCriterion("catalogue_id in", values, "catalogueId");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdNotIn(List<Integer> values) {
            addCriterion("catalogue_id not in", values, "catalogueId");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdBetween(Integer value1, Integer value2) {
            addCriterion("catalogue_id between", value1, value2, "catalogueId");
            return (Criteria) this;
        }

        public Criteria andCatalogueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("catalogue_id not between", value1, value2, "catalogueId");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNull() {
            addCriterion("online_time is null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNotNull() {
            addCriterion("online_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeEqualTo(String value) {
            addCriterion("online_time =", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotEqualTo(String value) {
            addCriterion("online_time <>", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThan(String value) {
            addCriterion("online_time >", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThanOrEqualTo(String value) {
            addCriterion("online_time >=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThan(String value) {
            addCriterion("online_time <", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThanOrEqualTo(String value) {
            addCriterion("online_time <=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLike(String value) {
            addCriterion("online_time like", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotLike(String value) {
            addCriterion("online_time not like", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIn(List<String> values) {
            addCriterion("online_time in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotIn(List<String> values) {
            addCriterion("online_time not in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeBetween(String value1, String value2) {
            addCriterion("online_time between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotBetween(String value1, String value2) {
            addCriterion("online_time not between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNull() {
            addCriterion("view_count is null");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNotNull() {
            addCriterion("view_count is not null");
            return (Criteria) this;
        }

        public Criteria andViewCountEqualTo(Integer value) {
            addCriterion("view_count =", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotEqualTo(Integer value) {
            addCriterion("view_count <>", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThan(Integer value) {
            addCriterion("view_count >", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_count >=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThan(Integer value) {
            addCriterion("view_count <", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("view_count <=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIn(List<Integer> values) {
            addCriterion("view_count in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotIn(List<Integer> values) {
            addCriterion("view_count not in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountBetween(Integer value1, Integer value2) {
            addCriterion("view_count between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("view_count not between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNull() {
            addCriterion("creater_id is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNotNull() {
            addCriterion("creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdEqualTo(Integer value) {
            addCriterion("creater_id =", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotEqualTo(Integer value) {
            addCriterion("creater_id <>", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThan(Integer value) {
            addCriterion("creater_id >", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creater_id >=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThan(Integer value) {
            addCriterion("creater_id <", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("creater_id <=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIn(List<Integer> values) {
            addCriterion("creater_id in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotIn(List<Integer> values) {
            addCriterion("creater_id not in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdBetween(Integer value1, Integer value2) {
            addCriterion("creater_id between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creater_id not between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNull() {
            addCriterion("audit_result is null");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNotNull() {
            addCriterion("audit_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuditResultEqualTo(Integer value) {
            addCriterion("audit_result =", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotEqualTo(Integer value) {
            addCriterion("audit_result <>", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThan(Integer value) {
            addCriterion("audit_result >", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_result >=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThan(Integer value) {
            addCriterion("audit_result <", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThanOrEqualTo(Integer value) {
            addCriterion("audit_result <=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultIn(List<Integer> values) {
            addCriterion("audit_result in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotIn(List<Integer> values) {
            addCriterion("audit_result not in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultBetween(Integer value1, Integer value2) {
            addCriterion("audit_result between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_result not between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andStyleNameIsNull() {
            addCriterion("style_name is null");
            return (Criteria) this;
        }

        public Criteria andStyleNameIsNotNull() {
            addCriterion("style_name is not null");
            return (Criteria) this;
        }

        public Criteria andStyleNameEqualTo(String value) {
            addCriterion("style_name =", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotEqualTo(String value) {
            addCriterion("style_name <>", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameGreaterThan(String value) {
            addCriterion("style_name >", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameGreaterThanOrEqualTo(String value) {
            addCriterion("style_name >=", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLessThan(String value) {
            addCriterion("style_name <", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLessThanOrEqualTo(String value) {
            addCriterion("style_name <=", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLike(String value) {
            addCriterion("style_name like", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotLike(String value) {
            addCriterion("style_name not like", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameIn(List<String> values) {
            addCriterion("style_name in", values, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotIn(List<String> values) {
            addCriterion("style_name not in", values, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameBetween(String value1, String value2) {
            addCriterion("style_name between", value1, value2, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotBetween(String value1, String value2) {
            addCriterion("style_name not between", value1, value2, "styleName");
            return (Criteria) this;
        }

        public Criteria andTplNameIsNull() {
            addCriterion("tpl_name is null");
            return (Criteria) this;
        }

        public Criteria andTplNameIsNotNull() {
            addCriterion("tpl_name is not null");
            return (Criteria) this;
        }

        public Criteria andTplNameEqualTo(String value) {
            addCriterion("tpl_name =", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotEqualTo(String value) {
            addCriterion("tpl_name <>", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameGreaterThan(String value) {
            addCriterion("tpl_name >", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameGreaterThanOrEqualTo(String value) {
            addCriterion("tpl_name >=", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLessThan(String value) {
            addCriterion("tpl_name <", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLessThanOrEqualTo(String value) {
            addCriterion("tpl_name <=", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLike(String value) {
            addCriterion("tpl_name like", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotLike(String value) {
            addCriterion("tpl_name not like", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameIn(List<String> values) {
            addCriterion("tpl_name in", values, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotIn(List<String> values) {
            addCriterion("tpl_name not in", values, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameBetween(String value1, String value2) {
            addCriterion("tpl_name between", value1, value2, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotBetween(String value1, String value2) {
            addCriterion("tpl_name not between", value1, value2, "tplName");
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

        public Criteria andImgTitleIsNull() {
            addCriterion("img_title is null");
            return (Criteria) this;
        }

        public Criteria andImgTitleIsNotNull() {
            addCriterion("img_title is not null");
            return (Criteria) this;
        }

        public Criteria andImgTitleEqualTo(String value) {
            addCriterion("img_title =", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleNotEqualTo(String value) {
            addCriterion("img_title <>", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleGreaterThan(String value) {
            addCriterion("img_title >", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("img_title >=", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleLessThan(String value) {
            addCriterion("img_title <", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleLessThanOrEqualTo(String value) {
            addCriterion("img_title <=", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleLike(String value) {
            addCriterion("img_title like", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleNotLike(String value) {
            addCriterion("img_title not like", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleIn(List<String> values) {
            addCriterion("img_title in", values, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleNotIn(List<String> values) {
            addCriterion("img_title not in", values, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleBetween(String value1, String value2) {
            addCriterion("img_title between", value1, value2, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleNotBetween(String value1, String value2) {
            addCriterion("img_title not between", value1, value2, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIsNull() {
            addCriterion("title_type is null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIsNotNull() {
            addCriterion("title_type is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeEqualTo(Integer value) {
            addCriterion("title_type =", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotEqualTo(Integer value) {
            addCriterion("title_type <>", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeGreaterThan(Integer value) {
            addCriterion("title_type >", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_type >=", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeLessThan(Integer value) {
            addCriterion("title_type <", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("title_type <=", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIn(List<Integer> values) {
            addCriterion("title_type in", values, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotIn(List<Integer> values) {
            addCriterion("title_type not in", values, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeBetween(Integer value1, Integer value2) {
            addCriterion("title_type between", value1, value2, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("title_type not between", value1, value2, "titleType");
            return (Criteria) this;
        }

        public Criteria andInscribeIsNull() {
            addCriterion("inscribe is null");
            return (Criteria) this;
        }

        public Criteria andInscribeIsNotNull() {
            addCriterion("inscribe is not null");
            return (Criteria) this;
        }

        public Criteria andInscribeEqualTo(String value) {
            addCriterion("inscribe =", value, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeNotEqualTo(String value) {
            addCriterion("inscribe <>", value, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeGreaterThan(String value) {
            addCriterion("inscribe >", value, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeGreaterThanOrEqualTo(String value) {
            addCriterion("inscribe >=", value, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeLessThan(String value) {
            addCriterion("inscribe <", value, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeLessThanOrEqualTo(String value) {
            addCriterion("inscribe <=", value, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeLike(String value) {
            addCriterion("inscribe like", value, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeNotLike(String value) {
            addCriterion("inscribe not like", value, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeIn(List<String> values) {
            addCriterion("inscribe in", values, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeNotIn(List<String> values) {
            addCriterion("inscribe not in", values, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeBetween(String value1, String value2) {
            addCriterion("inscribe between", value1, value2, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeNotBetween(String value1, String value2) {
            addCriterion("inscribe not between", value1, value2, "inscribe");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeIsNull() {
            addCriterion("inscribe_time is null");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeIsNotNull() {
            addCriterion("inscribe_time is not null");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeEqualTo(String value) {
            addCriterion("inscribe_time =", value, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeNotEqualTo(String value) {
            addCriterion("inscribe_time <>", value, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeGreaterThan(String value) {
            addCriterion("inscribe_time >", value, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("inscribe_time >=", value, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeLessThan(String value) {
            addCriterion("inscribe_time <", value, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeLessThanOrEqualTo(String value) {
            addCriterion("inscribe_time <=", value, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeLike(String value) {
            addCriterion("inscribe_time like", value, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeNotLike(String value) {
            addCriterion("inscribe_time not like", value, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeIn(List<String> values) {
            addCriterion("inscribe_time in", values, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeNotIn(List<String> values) {
            addCriterion("inscribe_time not in", values, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeBetween(String value1, String value2) {
            addCriterion("inscribe_time between", value1, value2, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeTimeNotBetween(String value1, String value2) {
            addCriterion("inscribe_time not between", value1, value2, "inscribeTime");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleIsNull() {
            addCriterion("inscribe_style is null");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleIsNotNull() {
            addCriterion("inscribe_style is not null");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleEqualTo(String value) {
            addCriterion("inscribe_style =", value, "inscribeStyle");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleNotEqualTo(String value) {
            addCriterion("inscribe_style <>", value, "inscribeStyle");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleGreaterThan(String value) {
            addCriterion("inscribe_style >", value, "inscribeStyle");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleGreaterThanOrEqualTo(String value) {
            addCriterion("inscribe_style >=", value, "inscribeStyle");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleLessThan(String value) {
            addCriterion("inscribe_style <", value, "inscribeStyle");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleLessThanOrEqualTo(String value) {
            addCriterion("inscribe_style <=", value, "inscribeStyle");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleLike(String value) {
            addCriterion("inscribe_style like", value, "inscribeStyle");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleNotLike(String value) {
            addCriterion("inscribe_style not like", value, "inscribeStyle");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleIn(List<String> values) {
            addCriterion("inscribe_style in", values, "inscribeStyle");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleNotIn(List<String> values) {
            addCriterion("inscribe_style not in", values, "inscribeStyle");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleBetween(String value1, String value2) {
            addCriterion("inscribe_style between", value1, value2, "inscribeStyle");
            return (Criteria) this;
        }

        public Criteria andInscribeStyleNotBetween(String value1, String value2) {
            addCriterion("inscribe_style not between", value1, value2, "inscribeStyle");
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