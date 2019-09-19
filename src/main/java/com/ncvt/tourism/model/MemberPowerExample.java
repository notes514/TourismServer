package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class MemberPowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberPowerExample() {
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

        public Criteria andPowerIdIsNull() {
            addCriterion("power_id is null");
            return (Criteria) this;
        }

        public Criteria andPowerIdIsNotNull() {
            addCriterion("power_id is not null");
            return (Criteria) this;
        }

        public Criteria andPowerIdEqualTo(Integer value) {
            addCriterion("power_id =", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotEqualTo(Integer value) {
            addCriterion("power_id <>", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThan(Integer value) {
            addCriterion("power_id >", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("power_id >=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThan(Integer value) {
            addCriterion("power_id <", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThanOrEqualTo(Integer value) {
            addCriterion("power_id <=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdIn(List<Integer> values) {
            addCriterion("power_id in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotIn(List<Integer> values) {
            addCriterion("power_id not in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdBetween(Integer value1, Integer value2) {
            addCriterion("power_id between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("power_id not between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andPowerEquityIsNull() {
            addCriterion("power_equity is null");
            return (Criteria) this;
        }

        public Criteria andPowerEquityIsNotNull() {
            addCriterion("power_equity is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEquityEqualTo(String value) {
            addCriterion("power_equity =", value, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerEquityNotEqualTo(String value) {
            addCriterion("power_equity <>", value, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerEquityGreaterThan(String value) {
            addCriterion("power_equity >", value, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerEquityGreaterThanOrEqualTo(String value) {
            addCriterion("power_equity >=", value, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerEquityLessThan(String value) {
            addCriterion("power_equity <", value, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerEquityLessThanOrEqualTo(String value) {
            addCriterion("power_equity <=", value, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerEquityLike(String value) {
            addCriterion("power_equity like", value, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerEquityNotLike(String value) {
            addCriterion("power_equity not like", value, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerEquityIn(List<String> values) {
            addCriterion("power_equity in", values, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerEquityNotIn(List<String> values) {
            addCriterion("power_equity not in", values, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerEquityBetween(String value1, String value2) {
            addCriterion("power_equity between", value1, value2, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerEquityNotBetween(String value1, String value2) {
            addCriterion("power_equity not between", value1, value2, "powerEquity");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeIsNull() {
            addCriterion("power_describe is null");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeIsNotNull() {
            addCriterion("power_describe is not null");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeEqualTo(String value) {
            addCriterion("power_describe =", value, "powerDescribe");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeNotEqualTo(String value) {
            addCriterion("power_describe <>", value, "powerDescribe");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeGreaterThan(String value) {
            addCriterion("power_describe >", value, "powerDescribe");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("power_describe >=", value, "powerDescribe");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeLessThan(String value) {
            addCriterion("power_describe <", value, "powerDescribe");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeLessThanOrEqualTo(String value) {
            addCriterion("power_describe <=", value, "powerDescribe");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeLike(String value) {
            addCriterion("power_describe like", value, "powerDescribe");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeNotLike(String value) {
            addCriterion("power_describe not like", value, "powerDescribe");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeIn(List<String> values) {
            addCriterion("power_describe in", values, "powerDescribe");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeNotIn(List<String> values) {
            addCriterion("power_describe not in", values, "powerDescribe");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeBetween(String value1, String value2) {
            addCriterion("power_describe between", value1, value2, "powerDescribe");
            return (Criteria) this;
        }

        public Criteria andPowerDescribeNotBetween(String value1, String value2) {
            addCriterion("power_describe not between", value1, value2, "powerDescribe");
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