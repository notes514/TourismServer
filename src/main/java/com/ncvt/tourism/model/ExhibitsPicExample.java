package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class ExhibitsPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExhibitsPicExample() {
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

        public Criteria andExhibitsPicIdIsNull() {
            addCriterion("exhibits_pic_id is null");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicIdIsNotNull() {
            addCriterion("exhibits_pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicIdEqualTo(Integer value) {
            addCriterion("exhibits_pic_id =", value, "exhibitsPicId");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicIdNotEqualTo(Integer value) {
            addCriterion("exhibits_pic_id <>", value, "exhibitsPicId");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicIdGreaterThan(Integer value) {
            addCriterion("exhibits_pic_id >", value, "exhibitsPicId");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exhibits_pic_id >=", value, "exhibitsPicId");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicIdLessThan(Integer value) {
            addCriterion("exhibits_pic_id <", value, "exhibitsPicId");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicIdLessThanOrEqualTo(Integer value) {
            addCriterion("exhibits_pic_id <=", value, "exhibitsPicId");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicIdIn(List<Integer> values) {
            addCriterion("exhibits_pic_id in", values, "exhibitsPicId");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicIdNotIn(List<Integer> values) {
            addCriterion("exhibits_pic_id not in", values, "exhibitsPicId");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicIdBetween(Integer value1, Integer value2) {
            addCriterion("exhibits_pic_id between", value1, value2, "exhibitsPicId");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exhibits_pic_id not between", value1, value2, "exhibitsPicId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdIsNull() {
            addCriterion("exhibits_id is null");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdIsNotNull() {
            addCriterion("exhibits_id is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdEqualTo(Integer value) {
            addCriterion("exhibits_id =", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdNotEqualTo(Integer value) {
            addCriterion("exhibits_id <>", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdGreaterThan(Integer value) {
            addCriterion("exhibits_id >", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exhibits_id >=", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdLessThan(Integer value) {
            addCriterion("exhibits_id <", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdLessThanOrEqualTo(Integer value) {
            addCriterion("exhibits_id <=", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdIn(List<Integer> values) {
            addCriterion("exhibits_id in", values, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdNotIn(List<Integer> values) {
            addCriterion("exhibits_id not in", values, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdBetween(Integer value1, Integer value2) {
            addCriterion("exhibits_id between", value1, value2, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exhibits_id not between", value1, value2, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlIsNull() {
            addCriterion("exhibits_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlIsNotNull() {
            addCriterion("exhibits_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlEqualTo(String value) {
            addCriterion("exhibits_pic_url =", value, "exhibitsPicUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlNotEqualTo(String value) {
            addCriterion("exhibits_pic_url <>", value, "exhibitsPicUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlGreaterThan(String value) {
            addCriterion("exhibits_pic_url >", value, "exhibitsPicUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("exhibits_pic_url >=", value, "exhibitsPicUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlLessThan(String value) {
            addCriterion("exhibits_pic_url <", value, "exhibitsPicUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlLessThanOrEqualTo(String value) {
            addCriterion("exhibits_pic_url <=", value, "exhibitsPicUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlLike(String value) {
            addCriterion("exhibits_pic_url like", value, "exhibitsPicUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlNotLike(String value) {
            addCriterion("exhibits_pic_url not like", value, "exhibitsPicUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlIn(List<String> values) {
            addCriterion("exhibits_pic_url in", values, "exhibitsPicUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlNotIn(List<String> values) {
            addCriterion("exhibits_pic_url not in", values, "exhibitsPicUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlBetween(String value1, String value2) {
            addCriterion("exhibits_pic_url between", value1, value2, "exhibitsPicUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsPicUrlNotBetween(String value1, String value2) {
            addCriterion("exhibits_pic_url not between", value1, value2, "exhibitsPicUrl");
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