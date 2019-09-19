package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class ScenicRegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicRegionExample() {
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

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Integer value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Integer value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Integer value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Integer value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Integer> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Integer> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNull() {
            addCriterion("region_name is null");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNotNull() {
            addCriterion("region_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNameEqualTo(String value) {
            addCriterion("region_name =", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotEqualTo(String value) {
            addCriterion("region_name <>", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThan(String value) {
            addCriterion("region_name >", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThanOrEqualTo(String value) {
            addCriterion("region_name >=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThan(String value) {
            addCriterion("region_name <", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThanOrEqualTo(String value) {
            addCriterion("region_name <=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLike(String value) {
            addCriterion("region_name like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotLike(String value) {
            addCriterion("region_name not like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameIn(List<String> values) {
            addCriterion("region_name in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotIn(List<String> values) {
            addCriterion("region_name not in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameBetween(String value1, String value2) {
            addCriterion("region_name between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotBetween(String value1, String value2) {
            addCriterion("region_name not between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlIsNull() {
            addCriterion("region_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlIsNotNull() {
            addCriterion("region_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlEqualTo(String value) {
            addCriterion("region_pic_url =", value, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlNotEqualTo(String value) {
            addCriterion("region_pic_url <>", value, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlGreaterThan(String value) {
            addCriterion("region_pic_url >", value, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("region_pic_url >=", value, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlLessThan(String value) {
            addCriterion("region_pic_url <", value, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlLessThanOrEqualTo(String value) {
            addCriterion("region_pic_url <=", value, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlLike(String value) {
            addCriterion("region_pic_url like", value, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlNotLike(String value) {
            addCriterion("region_pic_url not like", value, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlIn(List<String> values) {
            addCriterion("region_pic_url in", values, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlNotIn(List<String> values) {
            addCriterion("region_pic_url not in", values, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlBetween(String value1, String value2) {
            addCriterion("region_pic_url between", value1, value2, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionPicUrlNotBetween(String value1, String value2) {
            addCriterion("region_pic_url not between", value1, value2, "regionPicUrl");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeIsNull() {
            addCriterion("region_describe is null");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeIsNotNull() {
            addCriterion("region_describe is not null");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeEqualTo(String value) {
            addCriterion("region_describe =", value, "regionDescribe");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeNotEqualTo(String value) {
            addCriterion("region_describe <>", value, "regionDescribe");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeGreaterThan(String value) {
            addCriterion("region_describe >", value, "regionDescribe");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("region_describe >=", value, "regionDescribe");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeLessThan(String value) {
            addCriterion("region_describe <", value, "regionDescribe");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeLessThanOrEqualTo(String value) {
            addCriterion("region_describe <=", value, "regionDescribe");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeLike(String value) {
            addCriterion("region_describe like", value, "regionDescribe");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeNotLike(String value) {
            addCriterion("region_describe not like", value, "regionDescribe");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeIn(List<String> values) {
            addCriterion("region_describe in", values, "regionDescribe");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeNotIn(List<String> values) {
            addCriterion("region_describe not in", values, "regionDescribe");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeBetween(String value1, String value2) {
            addCriterion("region_describe between", value1, value2, "regionDescribe");
            return (Criteria) this;
        }

        public Criteria andRegionDescribeNotBetween(String value1, String value2) {
            addCriterion("region_describe not between", value1, value2, "regionDescribe");
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