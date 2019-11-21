package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderContentIsNull() {
            addCriterion("order_content is null");
            return (Criteria) this;
        }

        public Criteria andOrderContentIsNotNull() {
            addCriterion("order_content is not null");
            return (Criteria) this;
        }

        public Criteria andOrderContentEqualTo(String value) {
            addCriterion("order_content =", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotEqualTo(String value) {
            addCriterion("order_content <>", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentGreaterThan(String value) {
            addCriterion("order_content >", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentGreaterThanOrEqualTo(String value) {
            addCriterion("order_content >=", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLessThan(String value) {
            addCriterion("order_content <", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLessThanOrEqualTo(String value) {
            addCriterion("order_content <=", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLike(String value) {
            addCriterion("order_content like", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotLike(String value) {
            addCriterion("order_content not like", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentIn(List<String> values) {
            addCriterion("order_content in", values, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotIn(List<String> values) {
            addCriterion("order_content not in", values, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentBetween(String value1, String value2) {
            addCriterion("order_content between", value1, value2, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotBetween(String value1, String value2) {
            addCriterion("order_content not between", value1, value2, "orderContent");
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

        public Criteria andPassengerNumberIsNull() {
            addCriterion("passenger_number is null");
            return (Criteria) this;
        }

        public Criteria andPassengerNumberIsNotNull() {
            addCriterion("passenger_number is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerNumberEqualTo(Integer value) {
            addCriterion("passenger_number =", value, "passengerNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerNumberNotEqualTo(Integer value) {
            addCriterion("passenger_number <>", value, "passengerNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerNumberGreaterThan(Integer value) {
            addCriterion("passenger_number >", value, "passengerNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("passenger_number >=", value, "passengerNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerNumberLessThan(Integer value) {
            addCriterion("passenger_number <", value, "passengerNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerNumberLessThanOrEqualTo(Integer value) {
            addCriterion("passenger_number <=", value, "passengerNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerNumberIn(List<Integer> values) {
            addCriterion("passenger_number in", values, "passengerNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerNumberNotIn(List<Integer> values) {
            addCriterion("passenger_number not in", values, "passengerNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerNumberBetween(Integer value1, Integer value2) {
            addCriterion("passenger_number between", value1, value2, "passengerNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("passenger_number not between", value1, value2, "passengerNumber");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andTripModeIsNull() {
            addCriterion("trip_mode is null");
            return (Criteria) this;
        }

        public Criteria andTripModeIsNotNull() {
            addCriterion("trip_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTripModeEqualTo(String value) {
            addCriterion("trip_mode =", value, "tripMode");
            return (Criteria) this;
        }

        public Criteria andTripModeNotEqualTo(String value) {
            addCriterion("trip_mode <>", value, "tripMode");
            return (Criteria) this;
        }

        public Criteria andTripModeGreaterThan(String value) {
            addCriterion("trip_mode >", value, "tripMode");
            return (Criteria) this;
        }

        public Criteria andTripModeGreaterThanOrEqualTo(String value) {
            addCriterion("trip_mode >=", value, "tripMode");
            return (Criteria) this;
        }

        public Criteria andTripModeLessThan(String value) {
            addCriterion("trip_mode <", value, "tripMode");
            return (Criteria) this;
        }

        public Criteria andTripModeLessThanOrEqualTo(String value) {
            addCriterion("trip_mode <=", value, "tripMode");
            return (Criteria) this;
        }

        public Criteria andTripModeLike(String value) {
            addCriterion("trip_mode like", value, "tripMode");
            return (Criteria) this;
        }

        public Criteria andTripModeNotLike(String value) {
            addCriterion("trip_mode not like", value, "tripMode");
            return (Criteria) this;
        }

        public Criteria andTripModeIn(List<String> values) {
            addCriterion("trip_mode in", values, "tripMode");
            return (Criteria) this;
        }

        public Criteria andTripModeNotIn(List<String> values) {
            addCriterion("trip_mode not in", values, "tripMode");
            return (Criteria) this;
        }

        public Criteria andTripModeBetween(String value1, String value2) {
            addCriterion("trip_mode between", value1, value2, "tripMode");
            return (Criteria) this;
        }

        public Criteria andTripModeNotBetween(String value1, String value2) {
            addCriterion("trip_mode not between", value1, value2, "tripMode");
            return (Criteria) this;
        }

        public Criteria andDepartDateIsNull() {
            addCriterion("depart_date is null");
            return (Criteria) this;
        }

        public Criteria andDepartDateIsNotNull() {
            addCriterion("depart_date is not null");
            return (Criteria) this;
        }

        public Criteria andDepartDateEqualTo(String value) {
            addCriterion("depart_date =", value, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDateNotEqualTo(String value) {
            addCriterion("depart_date <>", value, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDateGreaterThan(String value) {
            addCriterion("depart_date >", value, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDateGreaterThanOrEqualTo(String value) {
            addCriterion("depart_date >=", value, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDateLessThan(String value) {
            addCriterion("depart_date <", value, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDateLessThanOrEqualTo(String value) {
            addCriterion("depart_date <=", value, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDateLike(String value) {
            addCriterion("depart_date like", value, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDateNotLike(String value) {
            addCriterion("depart_date not like", value, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDateIn(List<String> values) {
            addCriterion("depart_date in", values, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDateNotIn(List<String> values) {
            addCriterion("depart_date not in", values, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDateBetween(String value1, String value2) {
            addCriterion("depart_date between", value1, value2, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDateNotBetween(String value1, String value2) {
            addCriterion("depart_date not between", value1, value2, "departDate");
            return (Criteria) this;
        }

        public Criteria andDepartDaysIsNull() {
            addCriterion("depart_days is null");
            return (Criteria) this;
        }

        public Criteria andDepartDaysIsNotNull() {
            addCriterion("depart_days is not null");
            return (Criteria) this;
        }

        public Criteria andDepartDaysEqualTo(String value) {
            addCriterion("depart_days =", value, "departDays");
            return (Criteria) this;
        }

        public Criteria andDepartDaysNotEqualTo(String value) {
            addCriterion("depart_days <>", value, "departDays");
            return (Criteria) this;
        }

        public Criteria andDepartDaysGreaterThan(String value) {
            addCriterion("depart_days >", value, "departDays");
            return (Criteria) this;
        }

        public Criteria andDepartDaysGreaterThanOrEqualTo(String value) {
            addCriterion("depart_days >=", value, "departDays");
            return (Criteria) this;
        }

        public Criteria andDepartDaysLessThan(String value) {
            addCriterion("depart_days <", value, "departDays");
            return (Criteria) this;
        }

        public Criteria andDepartDaysLessThanOrEqualTo(String value) {
            addCriterion("depart_days <=", value, "departDays");
            return (Criteria) this;
        }

        public Criteria andDepartDaysLike(String value) {
            addCriterion("depart_days like", value, "departDays");
            return (Criteria) this;
        }

        public Criteria andDepartDaysNotLike(String value) {
            addCriterion("depart_days not like", value, "departDays");
            return (Criteria) this;
        }

        public Criteria andDepartDaysIn(List<String> values) {
            addCriterion("depart_days in", values, "departDays");
            return (Criteria) this;
        }

        public Criteria andDepartDaysNotIn(List<String> values) {
            addCriterion("depart_days not in", values, "departDays");
            return (Criteria) this;
        }

        public Criteria andDepartDaysBetween(String value1, String value2) {
            addCriterion("depart_days between", value1, value2, "departDays");
            return (Criteria) this;
        }

        public Criteria andDepartDaysNotBetween(String value1, String value2) {
            addCriterion("depart_days not between", value1, value2, "departDays");
            return (Criteria) this;
        }

        public Criteria andTirpInformationIsNull() {
            addCriterion("tirp_information is null");
            return (Criteria) this;
        }

        public Criteria andTirpInformationIsNotNull() {
            addCriterion("tirp_information is not null");
            return (Criteria) this;
        }

        public Criteria andTirpInformationEqualTo(String value) {
            addCriterion("tirp_information =", value, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andTirpInformationNotEqualTo(String value) {
            addCriterion("tirp_information <>", value, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andTirpInformationGreaterThan(String value) {
            addCriterion("tirp_information >", value, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andTirpInformationGreaterThanOrEqualTo(String value) {
            addCriterion("tirp_information >=", value, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andTirpInformationLessThan(String value) {
            addCriterion("tirp_information <", value, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andTirpInformationLessThanOrEqualTo(String value) {
            addCriterion("tirp_information <=", value, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andTirpInformationLike(String value) {
            addCriterion("tirp_information like", value, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andTirpInformationNotLike(String value) {
            addCriterion("tirp_information not like", value, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andTirpInformationIn(List<String> values) {
            addCriterion("tirp_information in", values, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andTirpInformationNotIn(List<String> values) {
            addCriterion("tirp_information not in", values, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andTirpInformationBetween(String value1, String value2) {
            addCriterion("tirp_information between", value1, value2, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andTirpInformationNotBetween(String value1, String value2) {
            addCriterion("tirp_information not between", value1, value2, "tirpInformation");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Double value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Double value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Double value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Double value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Double value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Double> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Double> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Double value1, Double value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Double value1, Double value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceIsNull() {
            addCriterion("room_difference is null");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceIsNotNull() {
            addCriterion("room_difference is not null");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceEqualTo(Integer value) {
            addCriterion("room_difference =", value, "roomDifference");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceNotEqualTo(Integer value) {
            addCriterion("room_difference <>", value, "roomDifference");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceGreaterThan(Integer value) {
            addCriterion("room_difference >", value, "roomDifference");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_difference >=", value, "roomDifference");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceLessThan(Integer value) {
            addCriterion("room_difference <", value, "roomDifference");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceLessThanOrEqualTo(Integer value) {
            addCriterion("room_difference <=", value, "roomDifference");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceIn(List<Integer> values) {
            addCriterion("room_difference in", values, "roomDifference");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceNotIn(List<Integer> values) {
            addCriterion("room_difference not in", values, "roomDifference");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceBetween(Integer value1, Integer value2) {
            addCriterion("room_difference between", value1, value2, "roomDifference");
            return (Criteria) this;
        }

        public Criteria andRoomDifferenceNotBetween(Integer value1, Integer value2) {
            addCriterion("room_difference not between", value1, value2, "roomDifference");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
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