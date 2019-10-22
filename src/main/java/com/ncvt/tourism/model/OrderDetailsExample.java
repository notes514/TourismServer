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

        public Criteria andContactsIdIsNull() {
            addCriterion("contacts_id is null");
            return (Criteria) this;
        }

        public Criteria andContactsIdIsNotNull() {
            addCriterion("contacts_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactsIdEqualTo(Integer value) {
            addCriterion("contacts_id =", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdNotEqualTo(Integer value) {
            addCriterion("contacts_id <>", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdGreaterThan(Integer value) {
            addCriterion("contacts_id >", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contacts_id >=", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdLessThan(Integer value) {
            addCriterion("contacts_id <", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdLessThanOrEqualTo(Integer value) {
            addCriterion("contacts_id <=", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdIn(List<Integer> values) {
            addCriterion("contacts_id in", values, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdNotIn(List<Integer> values) {
            addCriterion("contacts_id not in", values, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdBetween(Integer value1, Integer value2) {
            addCriterion("contacts_id between", value1, value2, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contacts_id not between", value1, value2, "contactsId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdIsNull() {
            addCriterion("passenger_id is null");
            return (Criteria) this;
        }

        public Criteria andPassengerIdIsNotNull() {
            addCriterion("passenger_id is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerIdEqualTo(Integer value) {
            addCriterion("passenger_id =", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNotEqualTo(Integer value) {
            addCriterion("passenger_id <>", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdGreaterThan(Integer value) {
            addCriterion("passenger_id >", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("passenger_id >=", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdLessThan(Integer value) {
            addCriterion("passenger_id <", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdLessThanOrEqualTo(Integer value) {
            addCriterion("passenger_id <=", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdIn(List<Integer> values) {
            addCriterion("passenger_id in", values, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNotIn(List<Integer> values) {
            addCriterion("passenger_id not in", values, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdBetween(Integer value1, Integer value2) {
            addCriterion("passenger_id between", value1, value2, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("passenger_id not between", value1, value2, "passengerId");
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