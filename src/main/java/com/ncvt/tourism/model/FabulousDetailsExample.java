package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class FabulousDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FabulousDetailsExample() {
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

        public Criteria andFabulousDetailsIdIsNull() {
            addCriterion("fabulous_details_id is null");
            return (Criteria) this;
        }

        public Criteria andFabulousDetailsIdIsNotNull() {
            addCriterion("fabulous_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousDetailsIdEqualTo(Integer value) {
            addCriterion("fabulous_details_id =", value, "fabulousDetailsId");
            return (Criteria) this;
        }

        public Criteria andFabulousDetailsIdNotEqualTo(Integer value) {
            addCriterion("fabulous_details_id <>", value, "fabulousDetailsId");
            return (Criteria) this;
        }

        public Criteria andFabulousDetailsIdGreaterThan(Integer value) {
            addCriterion("fabulous_details_id >", value, "fabulousDetailsId");
            return (Criteria) this;
        }

        public Criteria andFabulousDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fabulous_details_id >=", value, "fabulousDetailsId");
            return (Criteria) this;
        }

        public Criteria andFabulousDetailsIdLessThan(Integer value) {
            addCriterion("fabulous_details_id <", value, "fabulousDetailsId");
            return (Criteria) this;
        }

        public Criteria andFabulousDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("fabulous_details_id <=", value, "fabulousDetailsId");
            return (Criteria) this;
        }

        public Criteria andFabulousDetailsIdIn(List<Integer> values) {
            addCriterion("fabulous_details_id in", values, "fabulousDetailsId");
            return (Criteria) this;
        }

        public Criteria andFabulousDetailsIdNotIn(List<Integer> values) {
            addCriterion("fabulous_details_id not in", values, "fabulousDetailsId");
            return (Criteria) this;
        }

        public Criteria andFabulousDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_details_id between", value1, value2, "fabulousDetailsId");
            return (Criteria) this;
        }

        public Criteria andFabulousDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_details_id not between", value1, value2, "fabulousDetailsId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdIsNull() {
            addCriterion("exhibits_id is null");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdIsNotNull() {
            addCriterion("exhibits_id is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdEqualTo(Integer value) {
            addCriterion("exhibits_id =", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdNotEqualTo(Integer value) {
            addCriterion("exhibits_id <>", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdGreaterThan(Integer value) {
            addCriterion("exhibits_id >", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exhibits_id >=", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdLessThan(Integer value) {
            addCriterion("exhibits_id <", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdLessThanOrEqualTo(Integer value) {
            addCriterion("exhibits_id <=", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdIn(List<Integer> values) {
            addCriterion("exhibits_id in", values, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdNotIn(List<Integer> values) {
            addCriterion("exhibits_id not in", values, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdBetween(Integer value1, Integer value2) {
            addCriterion("exhibits_id between", value1, value2, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exhibits_id not between", value1, value2, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberIsNull() {
            addCriterion("fabulous_number is null");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberIsNotNull() {
            addCriterion("fabulous_number is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberEqualTo(Integer value) {
            addCriterion("fabulous_number =", value, "fabulousNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberNotEqualTo(Integer value) {
            addCriterion("fabulous_number <>", value, "fabulousNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberGreaterThan(Integer value) {
            addCriterion("fabulous_number >", value, "fabulousNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("fabulous_number >=", value, "fabulousNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberLessThan(Integer value) {
            addCriterion("fabulous_number <", value, "fabulousNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberLessThanOrEqualTo(Integer value) {
            addCriterion("fabulous_number <=", value, "fabulousNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberIn(List<Integer> values) {
            addCriterion("fabulous_number in", values, "fabulousNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberNotIn(List<Integer> values) {
            addCriterion("fabulous_number not in", values, "fabulousNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_number between", value1, value2, "fabulousNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_number not between", value1, value2, "fabulousNumber");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
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