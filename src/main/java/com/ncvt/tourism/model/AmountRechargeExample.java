package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmountRechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmountRechargeExample() {
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

        public Criteria andRechargeIdIsNull() {
            addCriterion("recharge_id is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIsNotNull() {
            addCriterion("recharge_id is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdEqualTo(Integer value) {
            addCriterion("recharge_id =", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotEqualTo(Integer value) {
            addCriterion("recharge_id <>", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThan(Integer value) {
            addCriterion("recharge_id >", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_id >=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThan(Integer value) {
            addCriterion("recharge_id <", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_id <=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIn(List<Integer> values) {
            addCriterion("recharge_id in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotIn(List<Integer> values) {
            addCriterion("recharge_id not in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdBetween(Integer value1, Integer value2) {
            addCriterion("recharge_id between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_id not between", value1, value2, "rechargeId");
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

        public Criteria andPaymentModeIsNull() {
            addCriterion("payment_mode is null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIsNotNull() {
            addCriterion("payment_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeEqualTo(Integer value) {
            addCriterion("payment_mode =", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotEqualTo(Integer value) {
            addCriterion("payment_mode <>", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeGreaterThan(Integer value) {
            addCriterion("payment_mode >", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_mode >=", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLessThan(Integer value) {
            addCriterion("payment_mode <", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_mode <=", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIn(List<Integer> values) {
            addCriterion("payment_mode in", values, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotIn(List<Integer> values) {
            addCriterion("payment_mode not in", values, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBetween(Integer value1, Integer value2) {
            addCriterion("payment_mode between", value1, value2, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_mode not between", value1, value2, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionIsNull() {
            addCriterion("commodity_description is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionIsNotNull() {
            addCriterion("commodity_description is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionEqualTo(String value) {
            addCriterion("commodity_description =", value, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionNotEqualTo(String value) {
            addCriterion("commodity_description <>", value, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionGreaterThan(String value) {
            addCriterion("commodity_description >", value, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_description >=", value, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionLessThan(String value) {
            addCriterion("commodity_description <", value, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionLessThanOrEqualTo(String value) {
            addCriterion("commodity_description <=", value, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionLike(String value) {
            addCriterion("commodity_description like", value, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionNotLike(String value) {
            addCriterion("commodity_description not like", value, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionIn(List<String> values) {
            addCriterion("commodity_description in", values, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionNotIn(List<String> values) {
            addCriterion("commodity_description not in", values, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionBetween(String value1, String value2) {
            addCriterion("commodity_description between", value1, value2, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andCommodityDescriptionNotBetween(String value1, String value2) {
            addCriterion("commodity_description not between", value1, value2, "commodityDescription");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectIsNull() {
            addCriterion("recharge_object is null");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectIsNotNull() {
            addCriterion("recharge_object is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectEqualTo(String value) {
            addCriterion("recharge_object =", value, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectNotEqualTo(String value) {
            addCriterion("recharge_object <>", value, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectGreaterThan(String value) {
            addCriterion("recharge_object >", value, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_object >=", value, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectLessThan(String value) {
            addCriterion("recharge_object <", value, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectLessThanOrEqualTo(String value) {
            addCriterion("recharge_object <=", value, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectLike(String value) {
            addCriterion("recharge_object like", value, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectNotLike(String value) {
            addCriterion("recharge_object not like", value, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectIn(List<String> values) {
            addCriterion("recharge_object in", values, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectNotIn(List<String> values) {
            addCriterion("recharge_object not in", values, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectBetween(String value1, String value2) {
            addCriterion("recharge_object between", value1, value2, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andRechargeObjectNotBetween(String value1, String value2) {
            addCriterion("recharge_object not between", value1, value2, "rechargeObject");
            return (Criteria) this;
        }

        public Criteria andFaceValueIsNull() {
            addCriterion("face_value is null");
            return (Criteria) this;
        }

        public Criteria andFaceValueIsNotNull() {
            addCriterion("face_value is not null");
            return (Criteria) this;
        }

        public Criteria andFaceValueEqualTo(Double value) {
            addCriterion("face_value =", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueNotEqualTo(Double value) {
            addCriterion("face_value <>", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueGreaterThan(Double value) {
            addCriterion("face_value >", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueGreaterThanOrEqualTo(Double value) {
            addCriterion("face_value >=", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueLessThan(Double value) {
            addCriterion("face_value <", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueLessThanOrEqualTo(Double value) {
            addCriterion("face_value <=", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueIn(List<Double> values) {
            addCriterion("face_value in", values, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueNotIn(List<Double> values) {
            addCriterion("face_value not in", values, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueBetween(Double value1, Double value2) {
            addCriterion("face_value between", value1, value2, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueNotBetween(Double value1, Double value2) {
            addCriterion("face_value not between", value1, value2, "faceValue");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectIsNull() {
            addCriterion("transaction_object is null");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectIsNotNull() {
            addCriterion("transaction_object is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectEqualTo(String value) {
            addCriterion("transaction_object =", value, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectNotEqualTo(String value) {
            addCriterion("transaction_object <>", value, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectGreaterThan(String value) {
            addCriterion("transaction_object >", value, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_object >=", value, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectLessThan(String value) {
            addCriterion("transaction_object <", value, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectLessThanOrEqualTo(String value) {
            addCriterion("transaction_object <=", value, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectLike(String value) {
            addCriterion("transaction_object like", value, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectNotLike(String value) {
            addCriterion("transaction_object not like", value, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectIn(List<String> values) {
            addCriterion("transaction_object in", values, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectNotIn(List<String> values) {
            addCriterion("transaction_object not in", values, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectBetween(String value1, String value2) {
            addCriterion("transaction_object between", value1, value2, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andTransactionObjectNotBetween(String value1, String value2) {
            addCriterion("transaction_object not between", value1, value2, "transactionObject");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNull() {
            addCriterion("recharge_time is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNotNull() {
            addCriterion("recharge_time is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeEqualTo(Date value) {
            addCriterion("recharge_time =", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotEqualTo(Date value) {
            addCriterion("recharge_time <>", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThan(Date value) {
            addCriterion("recharge_time >", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recharge_time >=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThan(Date value) {
            addCriterion("recharge_time <", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("recharge_time <=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIn(List<Date> values) {
            addCriterion("recharge_time in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotIn(List<Date> values) {
            addCriterion("recharge_time not in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeBetween(Date value1, Date value2) {
            addCriterion("recharge_time between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("recharge_time not between", value1, value2, "rechargeTime");
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

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andBillClassificationIsNull() {
            addCriterion("bill_classification is null");
            return (Criteria) this;
        }

        public Criteria andBillClassificationIsNotNull() {
            addCriterion("bill_classification is not null");
            return (Criteria) this;
        }

        public Criteria andBillClassificationEqualTo(String value) {
            addCriterion("bill_classification =", value, "billClassification");
            return (Criteria) this;
        }

        public Criteria andBillClassificationNotEqualTo(String value) {
            addCriterion("bill_classification <>", value, "billClassification");
            return (Criteria) this;
        }

        public Criteria andBillClassificationGreaterThan(String value) {
            addCriterion("bill_classification >", value, "billClassification");
            return (Criteria) this;
        }

        public Criteria andBillClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("bill_classification >=", value, "billClassification");
            return (Criteria) this;
        }

        public Criteria andBillClassificationLessThan(String value) {
            addCriterion("bill_classification <", value, "billClassification");
            return (Criteria) this;
        }

        public Criteria andBillClassificationLessThanOrEqualTo(String value) {
            addCriterion("bill_classification <=", value, "billClassification");
            return (Criteria) this;
        }

        public Criteria andBillClassificationLike(String value) {
            addCriterion("bill_classification like", value, "billClassification");
            return (Criteria) this;
        }

        public Criteria andBillClassificationNotLike(String value) {
            addCriterion("bill_classification not like", value, "billClassification");
            return (Criteria) this;
        }

        public Criteria andBillClassificationIn(List<String> values) {
            addCriterion("bill_classification in", values, "billClassification");
            return (Criteria) this;
        }

        public Criteria andBillClassificationNotIn(List<String> values) {
            addCriterion("bill_classification not in", values, "billClassification");
            return (Criteria) this;
        }

        public Criteria andBillClassificationBetween(String value1, String value2) {
            addCriterion("bill_classification between", value1, value2, "billClassification");
            return (Criteria) this;
        }

        public Criteria andBillClassificationNotBetween(String value1, String value2) {
            addCriterion("bill_classification not between", value1, value2, "billClassification");
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