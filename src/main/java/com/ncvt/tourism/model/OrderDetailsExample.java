package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailsExample() {
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

        public Criteria andOrderDetailsIdIsNull() {
            addCriterion("order_details_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdIsNotNull() {
            addCriterion("order_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdEqualTo(Integer value) {
            addCriterion("order_details_id =", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdNotEqualTo(Integer value) {
            addCriterion("order_details_id <>", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdGreaterThan(Integer value) {
            addCriterion("order_details_id >", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_details_id >=", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdLessThan(Integer value) {
            addCriterion("order_details_id <", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_details_id <=", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdIn(List<Integer> values) {
            addCriterion("order_details_id in", values, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdNotIn(List<Integer> values) {
            addCriterion("order_details_id not in", values, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("order_details_id between", value1, value2, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_details_id not between", value1, value2, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentIsNull() {
            addCriterion("order_details_content is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentIsNotNull() {
            addCriterion("order_details_content is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentEqualTo(String value) {
            addCriterion("order_details_content =", value, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentNotEqualTo(String value) {
            addCriterion("order_details_content <>", value, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentGreaterThan(String value) {
            addCriterion("order_details_content >", value, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentGreaterThanOrEqualTo(String value) {
            addCriterion("order_details_content >=", value, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentLessThan(String value) {
            addCriterion("order_details_content <", value, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentLessThanOrEqualTo(String value) {
            addCriterion("order_details_content <=", value, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentLike(String value) {
            addCriterion("order_details_content like", value, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentNotLike(String value) {
            addCriterion("order_details_content not like", value, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentIn(List<String> values) {
            addCriterion("order_details_content in", values, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentNotIn(List<String> values) {
            addCriterion("order_details_content not in", values, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentBetween(String value1, String value2) {
            addCriterion("order_details_content between", value1, value2, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsContentNotBetween(String value1, String value2) {
            addCriterion("order_details_content not between", value1, value2, "orderDetailsContent");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Integer value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Integer value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Integer value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Integer value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Integer> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Integer> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeIsNull() {
            addCriterion("order_details_describe is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeIsNotNull() {
            addCriterion("order_details_describe is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeEqualTo(String value) {
            addCriterion("order_details_describe =", value, "orderDetailsDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeNotEqualTo(String value) {
            addCriterion("order_details_describe <>", value, "orderDetailsDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeGreaterThan(String value) {
            addCriterion("order_details_describe >", value, "orderDetailsDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("order_details_describe >=", value, "orderDetailsDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeLessThan(String value) {
            addCriterion("order_details_describe <", value, "orderDetailsDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeLessThanOrEqualTo(String value) {
            addCriterion("order_details_describe <=", value, "orderDetailsDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeLike(String value) {
            addCriterion("order_details_describe like", value, "orderDetailsDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeNotLike(String value) {
            addCriterion("order_details_describe not like", value, "orderDetailsDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeIn(List<String> values) {
            addCriterion("order_details_describe in", values, "orderDetailsDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeNotIn(List<String> values) {
            addCriterion("order_details_describe not in", values, "orderDetailsDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeBetween(String value1, String value2) {
            addCriterion("order_details_describe between", value1, value2, "orderDetailsDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDescribeNotBetween(String value1, String value2) {
            addCriterion("order_details_describe not between", value1, value2, "orderDetailsDescribe");
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