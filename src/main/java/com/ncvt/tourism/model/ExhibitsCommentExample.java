package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class ExhibitsCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExhibitsCommentExample() {
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

        public Criteria andExhibitsCommentIdIsNull() {
            addCriterion("exhibits_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentIdIsNotNull() {
            addCriterion("exhibits_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentIdEqualTo(Integer value) {
            addCriterion("exhibits_comment_id =", value, "exhibitsCommentId");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentIdNotEqualTo(Integer value) {
            addCriterion("exhibits_comment_id <>", value, "exhibitsCommentId");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentIdGreaterThan(Integer value) {
            addCriterion("exhibits_comment_id >", value, "exhibitsCommentId");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exhibits_comment_id >=", value, "exhibitsCommentId");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentIdLessThan(Integer value) {
            addCriterion("exhibits_comment_id <", value, "exhibitsCommentId");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("exhibits_comment_id <=", value, "exhibitsCommentId");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentIdIn(List<Integer> values) {
            addCriterion("exhibits_comment_id in", values, "exhibitsCommentId");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentIdNotIn(List<Integer> values) {
            addCriterion("exhibits_comment_id not in", values, "exhibitsCommentId");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("exhibits_comment_id between", value1, value2, "exhibitsCommentId");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exhibits_comment_id not between", value1, value2, "exhibitsCommentId");
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

        public Criteria andExhibitsCommentContentIsNull() {
            addCriterion("exhibits_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentIsNotNull() {
            addCriterion("exhibits_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentEqualTo(String value) {
            addCriterion("exhibits_comment_content =", value, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentNotEqualTo(String value) {
            addCriterion("exhibits_comment_content <>", value, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentGreaterThan(String value) {
            addCriterion("exhibits_comment_content >", value, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("exhibits_comment_content >=", value, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentLessThan(String value) {
            addCriterion("exhibits_comment_content <", value, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentLessThanOrEqualTo(String value) {
            addCriterion("exhibits_comment_content <=", value, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentLike(String value) {
            addCriterion("exhibits_comment_content like", value, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentNotLike(String value) {
            addCriterion("exhibits_comment_content not like", value, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentIn(List<String> values) {
            addCriterion("exhibits_comment_content in", values, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentNotIn(List<String> values) {
            addCriterion("exhibits_comment_content not in", values, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentBetween(String value1, String value2) {
            addCriterion("exhibits_comment_content between", value1, value2, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andExhibitsCommentContentNotBetween(String value1, String value2) {
            addCriterion("exhibits_comment_content not between", value1, value2, "exhibitsCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsIsNull() {
            addCriterion("comment_praise_points is null");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsIsNotNull() {
            addCriterion("comment_praise_points is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsEqualTo(Integer value) {
            addCriterion("comment_praise_points =", value, "commentPraisePoints");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsNotEqualTo(Integer value) {
            addCriterion("comment_praise_points <>", value, "commentPraisePoints");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsGreaterThan(Integer value) {
            addCriterion("comment_praise_points >", value, "commentPraisePoints");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_praise_points >=", value, "commentPraisePoints");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsLessThan(Integer value) {
            addCriterion("comment_praise_points <", value, "commentPraisePoints");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsLessThanOrEqualTo(Integer value) {
            addCriterion("comment_praise_points <=", value, "commentPraisePoints");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsIn(List<Integer> values) {
            addCriterion("comment_praise_points in", values, "commentPraisePoints");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsNotIn(List<Integer> values) {
            addCriterion("comment_praise_points not in", values, "commentPraisePoints");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsBetween(Integer value1, Integer value2) {
            addCriterion("comment_praise_points between", value1, value2, "commentPraisePoints");
            return (Criteria) this;
        }

        public Criteria andCommentPraisePointsNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_praise_points not between", value1, value2, "commentPraisePoints");
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