package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class TripExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TripExample() {
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

        public Criteria andTripIdIsNull() {
            addCriterion("trip_id is null");
            return (Criteria) this;
        }

        public Criteria andTripIdIsNotNull() {
            addCriterion("trip_id is not null");
            return (Criteria) this;
        }

        public Criteria andTripIdEqualTo(Integer value) {
            addCriterion("trip_id =", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotEqualTo(Integer value) {
            addCriterion("trip_id <>", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdGreaterThan(Integer value) {
            addCriterion("trip_id >", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trip_id >=", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdLessThan(Integer value) {
            addCriterion("trip_id <", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdLessThanOrEqualTo(Integer value) {
            addCriterion("trip_id <=", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdIn(List<Integer> values) {
            addCriterion("trip_id in", values, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotIn(List<Integer> values) {
            addCriterion("trip_id not in", values, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdBetween(Integer value1, Integer value2) {
            addCriterion("trip_id between", value1, value2, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trip_id not between", value1, value2, "tripId");
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

        public Criteria andScenicSpotIdIsNull() {
            addCriterion("scenic_spot_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdIsNotNull() {
            addCriterion("scenic_spot_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdEqualTo(Integer value) {
            addCriterion("scenic_spot_id =", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdNotEqualTo(Integer value) {
            addCriterion("scenic_spot_id <>", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdGreaterThan(Integer value) {
            addCriterion("scenic_spot_id >", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_spot_id >=", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdLessThan(Integer value) {
            addCriterion("scenic_spot_id <", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_spot_id <=", value, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdIn(List<Integer> values) {
            addCriterion("scenic_spot_id in", values, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdNotIn(List<Integer> values) {
            addCriterion("scenic_spot_id not in", values, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_spot_id between", value1, value2, "scenicSpotId");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_spot_id not between", value1, value2, "scenicSpotId");
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

        public Criteria andTripInformationIsNull() {
            addCriterion("trip_information is null");
            return (Criteria) this;
        }

        public Criteria andTripInformationIsNotNull() {
            addCriterion("trip_information is not null");
            return (Criteria) this;
        }

        public Criteria andTripInformationEqualTo(String value) {
            addCriterion("trip_information =", value, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andTripInformationNotEqualTo(String value) {
            addCriterion("trip_information <>", value, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andTripInformationGreaterThan(String value) {
            addCriterion("trip_information >", value, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andTripInformationGreaterThanOrEqualTo(String value) {
            addCriterion("trip_information >=", value, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andTripInformationLessThan(String value) {
            addCriterion("trip_information <", value, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andTripInformationLessThanOrEqualTo(String value) {
            addCriterion("trip_information <=", value, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andTripInformationLike(String value) {
            addCriterion("trip_information like", value, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andTripInformationNotLike(String value) {
            addCriterion("trip_information not like", value, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andTripInformationIn(List<String> values) {
            addCriterion("trip_information in", values, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andTripInformationNotIn(List<String> values) {
            addCriterion("trip_information not in", values, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andTripInformationBetween(String value1, String value2) {
            addCriterion("trip_information between", value1, value2, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andTripInformationNotBetween(String value1, String value2) {
            addCriterion("trip_information not between", value1, value2, "tripInformation");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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