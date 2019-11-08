package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class ExhibitionAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExhibitionAreaExample() {
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

        public Criteria andExhibitionAreaIdIsNull() {
            addCriterion("exhibition_area_id is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdIsNotNull() {
            addCriterion("exhibition_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdEqualTo(Integer value) {
            addCriterion("exhibition_area_id =", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdNotEqualTo(Integer value) {
            addCriterion("exhibition_area_id <>", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdGreaterThan(Integer value) {
            addCriterion("exhibition_area_id >", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exhibition_area_id >=", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdLessThan(Integer value) {
            addCriterion("exhibition_area_id <", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("exhibition_area_id <=", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdIn(List<Integer> values) {
            addCriterion("exhibition_area_id in", values, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdNotIn(List<Integer> values) {
            addCriterion("exhibition_area_id not in", values, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("exhibition_area_id between", value1, value2, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exhibition_area_id not between", value1, value2, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameIsNull() {
            addCriterion("exhibition_area_name is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameIsNotNull() {
            addCriterion("exhibition_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameEqualTo(String value) {
            addCriterion("exhibition_area_name =", value, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameNotEqualTo(String value) {
            addCriterion("exhibition_area_name <>", value, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameGreaterThan(String value) {
            addCriterion("exhibition_area_name >", value, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("exhibition_area_name >=", value, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameLessThan(String value) {
            addCriterion("exhibition_area_name <", value, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameLessThanOrEqualTo(String value) {
            addCriterion("exhibition_area_name <=", value, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameLike(String value) {
            addCriterion("exhibition_area_name like", value, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameNotLike(String value) {
            addCriterion("exhibition_area_name not like", value, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameIn(List<String> values) {
            addCriterion("exhibition_area_name in", values, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameNotIn(List<String> values) {
            addCriterion("exhibition_area_name not in", values, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameBetween(String value1, String value2) {
            addCriterion("exhibition_area_name between", value1, value2, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaNameNotBetween(String value1, String value2) {
            addCriterion("exhibition_area_name not between", value1, value2, "exhibitionAreaName");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressIsNull() {
            addCriterion("exhibition_area_address is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressIsNotNull() {
            addCriterion("exhibition_area_address is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressEqualTo(String value) {
            addCriterion("exhibition_area_address =", value, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressNotEqualTo(String value) {
            addCriterion("exhibition_area_address <>", value, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressGreaterThan(String value) {
            addCriterion("exhibition_area_address >", value, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("exhibition_area_address >=", value, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressLessThan(String value) {
            addCriterion("exhibition_area_address <", value, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressLessThanOrEqualTo(String value) {
            addCriterion("exhibition_area_address <=", value, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressLike(String value) {
            addCriterion("exhibition_area_address like", value, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressNotLike(String value) {
            addCriterion("exhibition_area_address not like", value, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressIn(List<String> values) {
            addCriterion("exhibition_area_address in", values, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressNotIn(List<String> values) {
            addCriterion("exhibition_area_address not in", values, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressBetween(String value1, String value2) {
            addCriterion("exhibition_area_address between", value1, value2, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaAddressNotBetween(String value1, String value2) {
            addCriterion("exhibition_area_address not between", value1, value2, "exhibitionAreaAddress");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicIsNull() {
            addCriterion("exhibition_area_pic is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicIsNotNull() {
            addCriterion("exhibition_area_pic is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicEqualTo(String value) {
            addCriterion("exhibition_area_pic =", value, "exhibitionAreaPic");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicNotEqualTo(String value) {
            addCriterion("exhibition_area_pic <>", value, "exhibitionAreaPic");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicGreaterThan(String value) {
            addCriterion("exhibition_area_pic >", value, "exhibitionAreaPic");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicGreaterThanOrEqualTo(String value) {
            addCriterion("exhibition_area_pic >=", value, "exhibitionAreaPic");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicLessThan(String value) {
            addCriterion("exhibition_area_pic <", value, "exhibitionAreaPic");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicLessThanOrEqualTo(String value) {
            addCriterion("exhibition_area_pic <=", value, "exhibitionAreaPic");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicLike(String value) {
            addCriterion("exhibition_area_pic like", value, "exhibitionAreaPic");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicNotLike(String value) {
            addCriterion("exhibition_area_pic not like", value, "exhibitionAreaPic");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicIn(List<String> values) {
            addCriterion("exhibition_area_pic in", values, "exhibitionAreaPic");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicNotIn(List<String> values) {
            addCriterion("exhibition_area_pic not in", values, "exhibitionAreaPic");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicBetween(String value1, String value2) {
            addCriterion("exhibition_area_pic between", value1, value2, "exhibitionAreaPic");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaPicNotBetween(String value1, String value2) {
            addCriterion("exhibition_area_pic not between", value1, value2, "exhibitionAreaPic");
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