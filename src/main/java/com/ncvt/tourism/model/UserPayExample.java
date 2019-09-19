package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPayExample() {
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

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Integer value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Integer value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Integer value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Integer value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Integer> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Integer> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
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

        public Criteria andPaySituationIsNull() {
            addCriterion("pay_situation is null");
            return (Criteria) this;
        }

        public Criteria andPaySituationIsNotNull() {
            addCriterion("pay_situation is not null");
            return (Criteria) this;
        }

        public Criteria andPaySituationEqualTo(String value) {
            addCriterion("pay_situation =", value, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPaySituationNotEqualTo(String value) {
            addCriterion("pay_situation <>", value, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPaySituationGreaterThan(String value) {
            addCriterion("pay_situation >", value, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPaySituationGreaterThanOrEqualTo(String value) {
            addCriterion("pay_situation >=", value, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPaySituationLessThan(String value) {
            addCriterion("pay_situation <", value, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPaySituationLessThanOrEqualTo(String value) {
            addCriterion("pay_situation <=", value, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPaySituationLike(String value) {
            addCriterion("pay_situation like", value, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPaySituationNotLike(String value) {
            addCriterion("pay_situation not like", value, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPaySituationIn(List<String> values) {
            addCriterion("pay_situation in", values, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPaySituationNotIn(List<String> values) {
            addCriterion("pay_situation not in", values, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPaySituationBetween(String value1, String value2) {
            addCriterion("pay_situation between", value1, value2, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPaySituationNotBetween(String value1, String value2) {
            addCriterion("pay_situation not between", value1, value2, "paySituation");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNull() {
            addCriterion("pay_mode is null");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNotNull() {
            addCriterion("pay_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPayModeEqualTo(Integer value) {
            addCriterion("pay_mode =", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotEqualTo(Integer value) {
            addCriterion("pay_mode <>", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThan(Integer value) {
            addCriterion("pay_mode >", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_mode >=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThan(Integer value) {
            addCriterion("pay_mode <", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_mode <=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeIn(List<Integer> values) {
            addCriterion("pay_mode in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotIn(List<Integer> values) {
            addCriterion("pay_mode not in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeBetween(Integer value1, Integer value2) {
            addCriterion("pay_mode between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_mode not between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIsNull() {
            addCriterion("discount_money is null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIsNotNull() {
            addCriterion("discount_money is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyEqualTo(Double value) {
            addCriterion("discount_money =", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotEqualTo(Double value) {
            addCriterion("discount_money <>", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThan(Double value) {
            addCriterion("discount_money >", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_money >=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThan(Double value) {
            addCriterion("discount_money <", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThanOrEqualTo(Double value) {
            addCriterion("discount_money <=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIn(List<Double> values) {
            addCriterion("discount_money in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotIn(List<Double> values) {
            addCriterion("discount_money not in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyBetween(Double value1, Double value2) {
            addCriterion("discount_money between", value1, value2, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotBetween(Double value1, Double value2) {
            addCriterion("discount_money not between", value1, value2, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyIsNull() {
            addCriterion("should_money is null");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyIsNotNull() {
            addCriterion("should_money is not null");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyEqualTo(Double value) {
            addCriterion("should_money =", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyNotEqualTo(Double value) {
            addCriterion("should_money <>", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyGreaterThan(Double value) {
            addCriterion("should_money >", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("should_money >=", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyLessThan(Double value) {
            addCriterion("should_money <", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyLessThanOrEqualTo(Double value) {
            addCriterion("should_money <=", value, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyIn(List<Double> values) {
            addCriterion("should_money in", values, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyNotIn(List<Double> values) {
            addCriterion("should_money not in", values, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyBetween(Double value1, Double value2) {
            addCriterion("should_money between", value1, value2, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andShouldMoneyNotBetween(Double value1, Double value2) {
            addCriterion("should_money not between", value1, value2, "shouldMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIsNull() {
            addCriterion("real_money is null");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIsNotNull() {
            addCriterion("real_money is not null");
            return (Criteria) this;
        }

        public Criteria andRealMoneyEqualTo(Double value) {
            addCriterion("real_money =", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotEqualTo(Double value) {
            addCriterion("real_money <>", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyGreaterThan(Double value) {
            addCriterion("real_money >", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("real_money >=", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyLessThan(Double value) {
            addCriterion("real_money <", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyLessThanOrEqualTo(Double value) {
            addCriterion("real_money <=", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIn(List<Double> values) {
            addCriterion("real_money in", values, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotIn(List<Double> values) {
            addCriterion("real_money not in", values, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyBetween(Double value1, Double value2) {
            addCriterion("real_money between", value1, value2, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotBetween(Double value1, Double value2) {
            addCriterion("real_money not between", value1, value2, "realMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyIsNull() {
            addCriterion("debt_money is null");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyIsNotNull() {
            addCriterion("debt_money is not null");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyEqualTo(Double value) {
            addCriterion("debt_money =", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyNotEqualTo(Double value) {
            addCriterion("debt_money <>", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyGreaterThan(Double value) {
            addCriterion("debt_money >", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("debt_money >=", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyLessThan(Double value) {
            addCriterion("debt_money <", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyLessThanOrEqualTo(Double value) {
            addCriterion("debt_money <=", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyIn(List<Double> values) {
            addCriterion("debt_money in", values, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyNotIn(List<Double> values) {
            addCriterion("debt_money not in", values, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyBetween(Double value1, Double value2) {
            addCriterion("debt_money between", value1, value2, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyNotBetween(Double value1, Double value2) {
            addCriterion("debt_money not between", value1, value2, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeIsNull() {
            addCriterion("payment_describe is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeIsNotNull() {
            addCriterion("payment_describe is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeEqualTo(String value) {
            addCriterion("payment_describe =", value, "paymentDescribe");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeNotEqualTo(String value) {
            addCriterion("payment_describe <>", value, "paymentDescribe");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeGreaterThan(String value) {
            addCriterion("payment_describe >", value, "paymentDescribe");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_describe >=", value, "paymentDescribe");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeLessThan(String value) {
            addCriterion("payment_describe <", value, "paymentDescribe");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeLessThanOrEqualTo(String value) {
            addCriterion("payment_describe <=", value, "paymentDescribe");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeLike(String value) {
            addCriterion("payment_describe like", value, "paymentDescribe");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeNotLike(String value) {
            addCriterion("payment_describe not like", value, "paymentDescribe");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeIn(List<String> values) {
            addCriterion("payment_describe in", values, "paymentDescribe");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeNotIn(List<String> values) {
            addCriterion("payment_describe not in", values, "paymentDescribe");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeBetween(String value1, String value2) {
            addCriterion("payment_describe between", value1, value2, "paymentDescribe");
            return (Criteria) this;
        }

        public Criteria andPaymentDescribeNotBetween(String value1, String value2) {
            addCriterion("payment_describe not between", value1, value2, "paymentDescribe");
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