package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class ScenicPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicPicExample() {
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

        public Criteria andScenicPicIdIsNull() {
            addCriterion("scenic_pic_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicPicIdIsNotNull() {
            addCriterion("scenic_pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicPicIdEqualTo(Integer value) {
            addCriterion("scenic_pic_id =", value, "scenicPicId");
            return (Criteria) this;
        }

        public Criteria andScenicPicIdNotEqualTo(Integer value) {
            addCriterion("scenic_pic_id <>", value, "scenicPicId");
            return (Criteria) this;
        }

        public Criteria andScenicPicIdGreaterThan(Integer value) {
            addCriterion("scenic_pic_id >", value, "scenicPicId");
            return (Criteria) this;
        }

        public Criteria andScenicPicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_pic_id >=", value, "scenicPicId");
            return (Criteria) this;
        }

        public Criteria andScenicPicIdLessThan(Integer value) {
            addCriterion("scenic_pic_id <", value, "scenicPicId");
            return (Criteria) this;
        }

        public Criteria andScenicPicIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_pic_id <=", value, "scenicPicId");
            return (Criteria) this;
        }

        public Criteria andScenicPicIdIn(List<Integer> values) {
            addCriterion("scenic_pic_id in", values, "scenicPicId");
            return (Criteria) this;
        }

        public Criteria andScenicPicIdNotIn(List<Integer> values) {
            addCriterion("scenic_pic_id not in", values, "scenicPicId");
            return (Criteria) this;
        }

        public Criteria andScenicPicIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_pic_id between", value1, value2, "scenicPicId");
            return (Criteria) this;
        }

        public Criteria andScenicPicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_pic_id not between", value1, value2, "scenicPicId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdIsNull() {
            addCriterion("scenic_details_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdIsNotNull() {
            addCriterion("scenic_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdEqualTo(Integer value) {
            addCriterion("scenic_details_id =", value, "scenicDetailsId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdNotEqualTo(Integer value) {
            addCriterion("scenic_details_id <>", value, "scenicDetailsId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdGreaterThan(Integer value) {
            addCriterion("scenic_details_id >", value, "scenicDetailsId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_details_id >=", value, "scenicDetailsId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdLessThan(Integer value) {
            addCriterion("scenic_details_id <", value, "scenicDetailsId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_details_id <=", value, "scenicDetailsId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdIn(List<Integer> values) {
            addCriterion("scenic_details_id in", values, "scenicDetailsId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdNotIn(List<Integer> values) {
            addCriterion("scenic_details_id not in", values, "scenicDetailsId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_details_id between", value1, value2, "scenicDetailsId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_details_id not between", value1, value2, "scenicDetailsId");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlIsNull() {
            addCriterion("scenic_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlIsNotNull() {
            addCriterion("scenic_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlEqualTo(String value) {
            addCriterion("scenic_pic_url =", value, "scenicPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlNotEqualTo(String value) {
            addCriterion("scenic_pic_url <>", value, "scenicPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlGreaterThan(String value) {
            addCriterion("scenic_pic_url >", value, "scenicPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_pic_url >=", value, "scenicPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlLessThan(String value) {
            addCriterion("scenic_pic_url <", value, "scenicPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlLessThanOrEqualTo(String value) {
            addCriterion("scenic_pic_url <=", value, "scenicPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlLike(String value) {
            addCriterion("scenic_pic_url like", value, "scenicPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlNotLike(String value) {
            addCriterion("scenic_pic_url not like", value, "scenicPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlIn(List<String> values) {
            addCriterion("scenic_pic_url in", values, "scenicPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlNotIn(List<String> values) {
            addCriterion("scenic_pic_url not in", values, "scenicPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlBetween(String value1, String value2) {
            addCriterion("scenic_pic_url between", value1, value2, "scenicPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicPicUrlNotBetween(String value1, String value2) {
            addCriterion("scenic_pic_url not between", value1, value2, "scenicPicUrl");
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