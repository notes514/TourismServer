package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluatetionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluatetionExample() {
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

        public Criteria andEvaluatetionIdIsNull() {
            addCriterion("evaluatetion_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIdIsNotNull() {
            addCriterion("evaluatetion_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIdEqualTo(Integer value) {
            addCriterion("evaluatetion_id =", value, "evaluatetionId");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIdNotEqualTo(Integer value) {
            addCriterion("evaluatetion_id <>", value, "evaluatetionId");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIdGreaterThan(Integer value) {
            addCriterion("evaluatetion_id >", value, "evaluatetionId");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluatetion_id >=", value, "evaluatetionId");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIdLessThan(Integer value) {
            addCriterion("evaluatetion_id <", value, "evaluatetionId");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIdLessThanOrEqualTo(Integer value) {
            addCriterion("evaluatetion_id <=", value, "evaluatetionId");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIdIn(List<Integer> values) {
            addCriterion("evaluatetion_id in", values, "evaluatetionId");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIdNotIn(List<Integer> values) {
            addCriterion("evaluatetion_id not in", values, "evaluatetionId");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIdBetween(Integer value1, Integer value2) {
            addCriterion("evaluatetion_id between", value1, value2, "evaluatetionId");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluatetion_id not between", value1, value2, "evaluatetionId");
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

        public Criteria andEvaluatetionThemeIsNull() {
            addCriterion("evaluatetion_theme is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeIsNotNull() {
            addCriterion("evaluatetion_theme is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeEqualTo(String value) {
            addCriterion("evaluatetion_theme =", value, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeNotEqualTo(String value) {
            addCriterion("evaluatetion_theme <>", value, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeGreaterThan(String value) {
            addCriterion("evaluatetion_theme >", value, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeGreaterThanOrEqualTo(String value) {
            addCriterion("evaluatetion_theme >=", value, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeLessThan(String value) {
            addCriterion("evaluatetion_theme <", value, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeLessThanOrEqualTo(String value) {
            addCriterion("evaluatetion_theme <=", value, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeLike(String value) {
            addCriterion("evaluatetion_theme like", value, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeNotLike(String value) {
            addCriterion("evaluatetion_theme not like", value, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeIn(List<String> values) {
            addCriterion("evaluatetion_theme in", values, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeNotIn(List<String> values) {
            addCriterion("evaluatetion_theme not in", values, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeBetween(String value1, String value2) {
            addCriterion("evaluatetion_theme between", value1, value2, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionThemeNotBetween(String value1, String value2) {
            addCriterion("evaluatetion_theme not between", value1, value2, "evaluatetionTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentIsNull() {
            addCriterion("evaluatetion_content is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentIsNotNull() {
            addCriterion("evaluatetion_content is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentEqualTo(String value) {
            addCriterion("evaluatetion_content =", value, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentNotEqualTo(String value) {
            addCriterion("evaluatetion_content <>", value, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentGreaterThan(String value) {
            addCriterion("evaluatetion_content >", value, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluatetion_content >=", value, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentLessThan(String value) {
            addCriterion("evaluatetion_content <", value, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentLessThanOrEqualTo(String value) {
            addCriterion("evaluatetion_content <=", value, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentLike(String value) {
            addCriterion("evaluatetion_content like", value, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentNotLike(String value) {
            addCriterion("evaluatetion_content not like", value, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentIn(List<String> values) {
            addCriterion("evaluatetion_content in", values, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentNotIn(List<String> values) {
            addCriterion("evaluatetion_content not in", values, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentBetween(String value1, String value2) {
            addCriterion("evaluatetion_content between", value1, value2, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionContentNotBetween(String value1, String value2) {
            addCriterion("evaluatetion_content not between", value1, value2, "evaluatetionContent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralIsNull() {
            addCriterion("evaluatetion_integral is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralIsNotNull() {
            addCriterion("evaluatetion_integral is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralEqualTo(Double value) {
            addCriterion("evaluatetion_integral =", value, "evaluatetionIntegral");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralNotEqualTo(Double value) {
            addCriterion("evaluatetion_integral <>", value, "evaluatetionIntegral");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralGreaterThan(Double value) {
            addCriterion("evaluatetion_integral >", value, "evaluatetionIntegral");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralGreaterThanOrEqualTo(Double value) {
            addCriterion("evaluatetion_integral >=", value, "evaluatetionIntegral");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralLessThan(Double value) {
            addCriterion("evaluatetion_integral <", value, "evaluatetionIntegral");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralLessThanOrEqualTo(Double value) {
            addCriterion("evaluatetion_integral <=", value, "evaluatetionIntegral");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralIn(List<Double> values) {
            addCriterion("evaluatetion_integral in", values, "evaluatetionIntegral");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralNotIn(List<Double> values) {
            addCriterion("evaluatetion_integral not in", values, "evaluatetionIntegral");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralBetween(Double value1, Double value2) {
            addCriterion("evaluatetion_integral between", value1, value2, "evaluatetionIntegral");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionIntegralNotBetween(Double value1, Double value2) {
            addCriterion("evaluatetion_integral not between", value1, value2, "evaluatetionIntegral");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeIsNull() {
            addCriterion("evaluatetion_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeIsNotNull() {
            addCriterion("evaluatetion_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeEqualTo(Date value) {
            addCriterion("evaluatetion_time =", value, "evaluatetionTime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeNotEqualTo(Date value) {
            addCriterion("evaluatetion_time <>", value, "evaluatetionTime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeGreaterThan(Date value) {
            addCriterion("evaluatetion_time >", value, "evaluatetionTime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluatetion_time >=", value, "evaluatetionTime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeLessThan(Date value) {
            addCriterion("evaluatetion_time <", value, "evaluatetionTime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluatetion_time <=", value, "evaluatetionTime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeIn(List<Date> values) {
            addCriterion("evaluatetion_time in", values, "evaluatetionTime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeNotIn(List<Date> values) {
            addCriterion("evaluatetion_time not in", values, "evaluatetionTime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeBetween(Date value1, Date value2) {
            addCriterion("evaluatetion_time between", value1, value2, "evaluatetionTime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetionTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluatetion_time not between", value1, value2, "evaluatetionTime");
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