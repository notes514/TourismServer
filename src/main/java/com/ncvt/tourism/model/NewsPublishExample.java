package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsPublishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsPublishExample() {
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

        public Criteria andPublishIdIsNull() {
            addCriterion("publish_id is null");
            return (Criteria) this;
        }

        public Criteria andPublishIdIsNotNull() {
            addCriterion("publish_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublishIdEqualTo(Integer value) {
            addCriterion("publish_id =", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotEqualTo(Integer value) {
            addCriterion("publish_id <>", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdGreaterThan(Integer value) {
            addCriterion("publish_id >", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_id >=", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdLessThan(Integer value) {
            addCriterion("publish_id <", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdLessThanOrEqualTo(Integer value) {
            addCriterion("publish_id <=", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdIn(List<Integer> values) {
            addCriterion("publish_id in", values, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotIn(List<Integer> values) {
            addCriterion("publish_id not in", values, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdBetween(Integer value1, Integer value2) {
            addCriterion("publish_id between", value1, value2, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_id not between", value1, value2, "publishId");
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

        public Criteria andPublishContentIsNull() {
            addCriterion("publish_content is null");
            return (Criteria) this;
        }

        public Criteria andPublishContentIsNotNull() {
            addCriterion("publish_content is not null");
            return (Criteria) this;
        }

        public Criteria andPublishContentEqualTo(String value) {
            addCriterion("publish_content =", value, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishContentNotEqualTo(String value) {
            addCriterion("publish_content <>", value, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishContentGreaterThan(String value) {
            addCriterion("publish_content >", value, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishContentGreaterThanOrEqualTo(String value) {
            addCriterion("publish_content >=", value, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishContentLessThan(String value) {
            addCriterion("publish_content <", value, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishContentLessThanOrEqualTo(String value) {
            addCriterion("publish_content <=", value, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishContentLike(String value) {
            addCriterion("publish_content like", value, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishContentNotLike(String value) {
            addCriterion("publish_content not like", value, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishContentIn(List<String> values) {
            addCriterion("publish_content in", values, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishContentNotIn(List<String> values) {
            addCriterion("publish_content not in", values, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishContentBetween(String value1, String value2) {
            addCriterion("publish_content between", value1, value2, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishContentNotBetween(String value1, String value2) {
            addCriterion("publish_content not between", value1, value2, "publishContent");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlIsNull() {
            addCriterion("publish_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlIsNotNull() {
            addCriterion("publish_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlEqualTo(String value) {
            addCriterion("publish_pic_url =", value, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlNotEqualTo(String value) {
            addCriterion("publish_pic_url <>", value, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlGreaterThan(String value) {
            addCriterion("publish_pic_url >", value, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("publish_pic_url >=", value, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlLessThan(String value) {
            addCriterion("publish_pic_url <", value, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlLessThanOrEqualTo(String value) {
            addCriterion("publish_pic_url <=", value, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlLike(String value) {
            addCriterion("publish_pic_url like", value, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlNotLike(String value) {
            addCriterion("publish_pic_url not like", value, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlIn(List<String> values) {
            addCriterion("publish_pic_url in", values, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlNotIn(List<String> values) {
            addCriterion("publish_pic_url not in", values, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlBetween(String value1, String value2) {
            addCriterion("publish_pic_url between", value1, value2, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishPicUrlNotBetween(String value1, String value2) {
            addCriterion("publish_pic_url not between", value1, value2, "publishPicUrl");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
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