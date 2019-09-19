package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andMemberTypeIsNull() {
            addCriterion("member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(Integer value) {
            addCriterion("member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(Integer value) {
            addCriterion("member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(Integer value) {
            addCriterion("member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(Integer value) {
            addCriterion("member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(Integer value) {
            addCriterion("member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<Integer> values) {
            addCriterion("member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<Integer> values) {
            addCriterion("member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(Integer value1, Integer value2) {
            addCriterion("member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralIsNull() {
            addCriterion("member_integral is null");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralIsNotNull() {
            addCriterion("member_integral is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralEqualTo(Integer value) {
            addCriterion("member_integral =", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralNotEqualTo(Integer value) {
            addCriterion("member_integral <>", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralGreaterThan(Integer value) {
            addCriterion("member_integral >", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_integral >=", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralLessThan(Integer value) {
            addCriterion("member_integral <", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("member_integral <=", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralIn(List<Integer> values) {
            addCriterion("member_integral in", values, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralNotIn(List<Integer> values) {
            addCriterion("member_integral not in", values, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralBetween(Integer value1, Integer value2) {
            addCriterion("member_integral between", value1, value2, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("member_integral not between", value1, value2, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIsNull() {
            addCriterion("member_discount is null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIsNotNull() {
            addCriterion("member_discount is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountEqualTo(Double value) {
            addCriterion("member_discount =", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotEqualTo(Double value) {
            addCriterion("member_discount <>", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountGreaterThan(Double value) {
            addCriterion("member_discount >", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("member_discount >=", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountLessThan(Double value) {
            addCriterion("member_discount <", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountLessThanOrEqualTo(Double value) {
            addCriterion("member_discount <=", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIn(List<Double> values) {
            addCriterion("member_discount in", values, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotIn(List<Double> values) {
            addCriterion("member_discount not in", values, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountBetween(Double value1, Double value2) {
            addCriterion("member_discount between", value1, value2, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotBetween(Double value1, Double value2) {
            addCriterion("member_discount not between", value1, value2, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeIsNull() {
            addCriterion("member_describe is null");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeIsNotNull() {
            addCriterion("member_describe is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeEqualTo(String value) {
            addCriterion("member_describe =", value, "memberDescribe");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeNotEqualTo(String value) {
            addCriterion("member_describe <>", value, "memberDescribe");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeGreaterThan(String value) {
            addCriterion("member_describe >", value, "memberDescribe");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("member_describe >=", value, "memberDescribe");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeLessThan(String value) {
            addCriterion("member_describe <", value, "memberDescribe");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeLessThanOrEqualTo(String value) {
            addCriterion("member_describe <=", value, "memberDescribe");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeLike(String value) {
            addCriterion("member_describe like", value, "memberDescribe");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeNotLike(String value) {
            addCriterion("member_describe not like", value, "memberDescribe");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeIn(List<String> values) {
            addCriterion("member_describe in", values, "memberDescribe");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeNotIn(List<String> values) {
            addCriterion("member_describe not in", values, "memberDescribe");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeBetween(String value1, String value2) {
            addCriterion("member_describe between", value1, value2, "memberDescribe");
            return (Criteria) this;
        }

        public Criteria andMemberDescribeNotBetween(String value1, String value2) {
            addCriterion("member_describe not between", value1, value2, "memberDescribe");
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