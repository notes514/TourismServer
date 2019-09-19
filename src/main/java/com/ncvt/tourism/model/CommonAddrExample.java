package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class CommonAddrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonAddrExample() {
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

        public Criteria andCommonAddrIdIsNull() {
            addCriterion("common_addr_id is null");
            return (Criteria) this;
        }

        public Criteria andCommonAddrIdIsNotNull() {
            addCriterion("common_addr_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommonAddrIdEqualTo(Integer value) {
            addCriterion("common_addr_id =", value, "commonAddrId");
            return (Criteria) this;
        }

        public Criteria andCommonAddrIdNotEqualTo(Integer value) {
            addCriterion("common_addr_id <>", value, "commonAddrId");
            return (Criteria) this;
        }

        public Criteria andCommonAddrIdGreaterThan(Integer value) {
            addCriterion("common_addr_id >", value, "commonAddrId");
            return (Criteria) this;
        }

        public Criteria andCommonAddrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("common_addr_id >=", value, "commonAddrId");
            return (Criteria) this;
        }

        public Criteria andCommonAddrIdLessThan(Integer value) {
            addCriterion("common_addr_id <", value, "commonAddrId");
            return (Criteria) this;
        }

        public Criteria andCommonAddrIdLessThanOrEqualTo(Integer value) {
            addCriterion("common_addr_id <=", value, "commonAddrId");
            return (Criteria) this;
        }

        public Criteria andCommonAddrIdIn(List<Integer> values) {
            addCriterion("common_addr_id in", values, "commonAddrId");
            return (Criteria) this;
        }

        public Criteria andCommonAddrIdNotIn(List<Integer> values) {
            addCriterion("common_addr_id not in", values, "commonAddrId");
            return (Criteria) this;
        }

        public Criteria andCommonAddrIdBetween(Integer value1, Integer value2) {
            addCriterion("common_addr_id between", value1, value2, "commonAddrId");
            return (Criteria) this;
        }

        public Criteria andCommonAddrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("common_addr_id not between", value1, value2, "commonAddrId");
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

        public Criteria andPassengerNameIsNull() {
            addCriterion("passenger_name is null");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIsNotNull() {
            addCriterion("passenger_name is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerNameEqualTo(String value) {
            addCriterion("passenger_name =", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotEqualTo(String value) {
            addCriterion("passenger_name <>", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameGreaterThan(String value) {
            addCriterion("passenger_name >", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_name >=", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLessThan(String value) {
            addCriterion("passenger_name <", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLessThanOrEqualTo(String value) {
            addCriterion("passenger_name <=", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLike(String value) {
            addCriterion("passenger_name like", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotLike(String value) {
            addCriterion("passenger_name not like", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIn(List<String> values) {
            addCriterion("passenger_name in", values, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotIn(List<String> values) {
            addCriterion("passenger_name not in", values, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameBetween(String value1, String value2) {
            addCriterion("passenger_name between", value1, value2, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotBetween(String value1, String value2) {
            addCriterion("passenger_name not between", value1, value2, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoctionIsNull() {
            addCriterion("loction is null");
            return (Criteria) this;
        }

        public Criteria andLoctionIsNotNull() {
            addCriterion("loction is not null");
            return (Criteria) this;
        }

        public Criteria andLoctionEqualTo(String value) {
            addCriterion("loction =", value, "loction");
            return (Criteria) this;
        }

        public Criteria andLoctionNotEqualTo(String value) {
            addCriterion("loction <>", value, "loction");
            return (Criteria) this;
        }

        public Criteria andLoctionGreaterThan(String value) {
            addCriterion("loction >", value, "loction");
            return (Criteria) this;
        }

        public Criteria andLoctionGreaterThanOrEqualTo(String value) {
            addCriterion("loction >=", value, "loction");
            return (Criteria) this;
        }

        public Criteria andLoctionLessThan(String value) {
            addCriterion("loction <", value, "loction");
            return (Criteria) this;
        }

        public Criteria andLoctionLessThanOrEqualTo(String value) {
            addCriterion("loction <=", value, "loction");
            return (Criteria) this;
        }

        public Criteria andLoctionLike(String value) {
            addCriterion("loction like", value, "loction");
            return (Criteria) this;
        }

        public Criteria andLoctionNotLike(String value) {
            addCriterion("loction not like", value, "loction");
            return (Criteria) this;
        }

        public Criteria andLoctionIn(List<String> values) {
            addCriterion("loction in", values, "loction");
            return (Criteria) this;
        }

        public Criteria andLoctionNotIn(List<String> values) {
            addCriterion("loction not in", values, "loction");
            return (Criteria) this;
        }

        public Criteria andLoctionBetween(String value1, String value2) {
            addCriterion("loction between", value1, value2, "loction");
            return (Criteria) this;
        }

        public Criteria andLoctionNotBetween(String value1, String value2) {
            addCriterion("loction not between", value1, value2, "loction");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrIsNull() {
            addCriterion("detailed_addr is null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrIsNotNull() {
            addCriterion("detailed_addr is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrEqualTo(String value) {
            addCriterion("detailed_addr =", value, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrNotEqualTo(String value) {
            addCriterion("detailed_addr <>", value, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrGreaterThan(String value) {
            addCriterion("detailed_addr >", value, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrGreaterThanOrEqualTo(String value) {
            addCriterion("detailed_addr >=", value, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrLessThan(String value) {
            addCriterion("detailed_addr <", value, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrLessThanOrEqualTo(String value) {
            addCriterion("detailed_addr <=", value, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrLike(String value) {
            addCriterion("detailed_addr like", value, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrNotLike(String value) {
            addCriterion("detailed_addr not like", value, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrIn(List<String> values) {
            addCriterion("detailed_addr in", values, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrNotIn(List<String> values) {
            addCriterion("detailed_addr not in", values, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrBetween(String value1, String value2) {
            addCriterion("detailed_addr between", value1, value2, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andDetailedAddrNotBetween(String value1, String value2) {
            addCriterion("detailed_addr not between", value1, value2, "detailedAddr");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNull() {
            addCriterion("postal_code is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("postal_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(Integer value) {
            addCriterion("postal_code =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(Integer value) {
            addCriterion("postal_code <>", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(Integer value) {
            addCriterion("postal_code >", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("postal_code >=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(Integer value) {
            addCriterion("postal_code <", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(Integer value) {
            addCriterion("postal_code <=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<Integer> values) {
            addCriterion("postal_code in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<Integer> values) {
            addCriterion("postal_code not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(Integer value1, Integer value2) {
            addCriterion("postal_code between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("postal_code not between", value1, value2, "postalCode");
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