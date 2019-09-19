package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicDetailsExample() {
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

        public Criteria andDetailsIntroduceIsNull() {
            addCriterion("details_introduce is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceIsNotNull() {
            addCriterion("details_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceEqualTo(String value) {
            addCriterion("details_introduce =", value, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceNotEqualTo(String value) {
            addCriterion("details_introduce <>", value, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceGreaterThan(String value) {
            addCriterion("details_introduce >", value, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("details_introduce >=", value, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceLessThan(String value) {
            addCriterion("details_introduce <", value, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceLessThanOrEqualTo(String value) {
            addCriterion("details_introduce <=", value, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceLike(String value) {
            addCriterion("details_introduce like", value, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceNotLike(String value) {
            addCriterion("details_introduce not like", value, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceIn(List<String> values) {
            addCriterion("details_introduce in", values, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceNotIn(List<String> values) {
            addCriterion("details_introduce not in", values, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceBetween(String value1, String value2) {
            addCriterion("details_introduce between", value1, value2, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andDetailsIntroduceNotBetween(String value1, String value2) {
            addCriterion("details_introduce not between", value1, value2, "detailsIntroduce");
            return (Criteria) this;
        }

        public Criteria andContainScenicIsNull() {
            addCriterion("contain_scenic is null");
            return (Criteria) this;
        }

        public Criteria andContainScenicIsNotNull() {
            addCriterion("contain_scenic is not null");
            return (Criteria) this;
        }

        public Criteria andContainScenicEqualTo(String value) {
            addCriterion("contain_scenic =", value, "containScenic");
            return (Criteria) this;
        }

        public Criteria andContainScenicNotEqualTo(String value) {
            addCriterion("contain_scenic <>", value, "containScenic");
            return (Criteria) this;
        }

        public Criteria andContainScenicGreaterThan(String value) {
            addCriterion("contain_scenic >", value, "containScenic");
            return (Criteria) this;
        }

        public Criteria andContainScenicGreaterThanOrEqualTo(String value) {
            addCriterion("contain_scenic >=", value, "containScenic");
            return (Criteria) this;
        }

        public Criteria andContainScenicLessThan(String value) {
            addCriterion("contain_scenic <", value, "containScenic");
            return (Criteria) this;
        }

        public Criteria andContainScenicLessThanOrEqualTo(String value) {
            addCriterion("contain_scenic <=", value, "containScenic");
            return (Criteria) this;
        }

        public Criteria andContainScenicLike(String value) {
            addCriterion("contain_scenic like", value, "containScenic");
            return (Criteria) this;
        }

        public Criteria andContainScenicNotLike(String value) {
            addCriterion("contain_scenic not like", value, "containScenic");
            return (Criteria) this;
        }

        public Criteria andContainScenicIn(List<String> values) {
            addCriterion("contain_scenic in", values, "containScenic");
            return (Criteria) this;
        }

        public Criteria andContainScenicNotIn(List<String> values) {
            addCriterion("contain_scenic not in", values, "containScenic");
            return (Criteria) this;
        }

        public Criteria andContainScenicBetween(String value1, String value2) {
            addCriterion("contain_scenic between", value1, value2, "containScenic");
            return (Criteria) this;
        }

        public Criteria andContainScenicNotBetween(String value1, String value2) {
            addCriterion("contain_scenic not between", value1, value2, "containScenic");
            return (Criteria) this;
        }

        public Criteria andScenicSelledIsNull() {
            addCriterion("scenic_selled is null");
            return (Criteria) this;
        }

        public Criteria andScenicSelledIsNotNull() {
            addCriterion("scenic_selled is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSelledEqualTo(Integer value) {
            addCriterion("scenic_selled =", value, "scenicSelled");
            return (Criteria) this;
        }

        public Criteria andScenicSelledNotEqualTo(Integer value) {
            addCriterion("scenic_selled <>", value, "scenicSelled");
            return (Criteria) this;
        }

        public Criteria andScenicSelledGreaterThan(Integer value) {
            addCriterion("scenic_selled >", value, "scenicSelled");
            return (Criteria) this;
        }

        public Criteria andScenicSelledGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_selled >=", value, "scenicSelled");
            return (Criteria) this;
        }

        public Criteria andScenicSelledLessThan(Integer value) {
            addCriterion("scenic_selled <", value, "scenicSelled");
            return (Criteria) this;
        }

        public Criteria andScenicSelledLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_selled <=", value, "scenicSelled");
            return (Criteria) this;
        }

        public Criteria andScenicSelledIn(List<Integer> values) {
            addCriterion("scenic_selled in", values, "scenicSelled");
            return (Criteria) this;
        }

        public Criteria andScenicSelledNotIn(List<Integer> values) {
            addCriterion("scenic_selled not in", values, "scenicSelled");
            return (Criteria) this;
        }

        public Criteria andScenicSelledBetween(Integer value1, Integer value2) {
            addCriterion("scenic_selled between", value1, value2, "scenicSelled");
            return (Criteria) this;
        }

        public Criteria andScenicSelledNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_selled not between", value1, value2, "scenicSelled");
            return (Criteria) this;
        }

        public Criteria andUserScoreIsNull() {
            addCriterion("user_score is null");
            return (Criteria) this;
        }

        public Criteria andUserScoreIsNotNull() {
            addCriterion("user_score is not null");
            return (Criteria) this;
        }

        public Criteria andUserScoreEqualTo(Double value) {
            addCriterion("user_score =", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotEqualTo(Double value) {
            addCriterion("user_score <>", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreGreaterThan(Double value) {
            addCriterion("user_score >", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("user_score >=", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreLessThan(Double value) {
            addCriterion("user_score <", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreLessThanOrEqualTo(Double value) {
            addCriterion("user_score <=", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreIn(List<Double> values) {
            addCriterion("user_score in", values, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotIn(List<Double> values) {
            addCriterion("user_score not in", values, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreBetween(Double value1, Double value2) {
            addCriterion("user_score between", value1, value2, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotBetween(Double value1, Double value2) {
            addCriterion("user_score not between", value1, value2, "userScore");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberIsNull() {
            addCriterion("comments_number is null");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberIsNotNull() {
            addCriterion("comments_number is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberEqualTo(Integer value) {
            addCriterion("comments_number =", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberNotEqualTo(Integer value) {
            addCriterion("comments_number <>", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberGreaterThan(Integer value) {
            addCriterion("comments_number >", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments_number >=", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberLessThan(Integer value) {
            addCriterion("comments_number <", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("comments_number <=", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberIn(List<Integer> values) {
            addCriterion("comments_number in", values, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberNotIn(List<Integer> values) {
            addCriterion("comments_number not in", values, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberBetween(Integer value1, Integer value2) {
            addCriterion("comments_number between", value1, value2, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("comments_number not between", value1, value2, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsIsNull() {
            addCriterion("recommend_reasons is null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsIsNotNull() {
            addCriterion("recommend_reasons is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsEqualTo(String value) {
            addCriterion("recommend_reasons =", value, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsNotEqualTo(String value) {
            addCriterion("recommend_reasons <>", value, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsGreaterThan(String value) {
            addCriterion("recommend_reasons >", value, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_reasons >=", value, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsLessThan(String value) {
            addCriterion("recommend_reasons <", value, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsLessThanOrEqualTo(String value) {
            addCriterion("recommend_reasons <=", value, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsLike(String value) {
            addCriterion("recommend_reasons like", value, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsNotLike(String value) {
            addCriterion("recommend_reasons not like", value, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsIn(List<String> values) {
            addCriterion("recommend_reasons in", values, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsNotIn(List<String> values) {
            addCriterion("recommend_reasons not in", values, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsBetween(String value1, String value2) {
            addCriterion("recommend_reasons between", value1, value2, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonsNotBetween(String value1, String value2) {
            addCriterion("recommend_reasons not between", value1, value2, "recommendReasons");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNull() {
            addCriterion("departure_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNotNull() {
            addCriterion("departure_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeEqualTo(Date value) {
            addCriterion("departure_time =", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotEqualTo(Date value) {
            addCriterion("departure_time <>", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThan(Date value) {
            addCriterion("departure_time >", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("departure_time >=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThan(Date value) {
            addCriterion("departure_time <", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThanOrEqualTo(Date value) {
            addCriterion("departure_time <=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIn(List<Date> values) {
            addCriterion("departure_time in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotIn(List<Date> values) {
            addCriterion("departure_time not in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeBetween(Date value1, Date value2) {
            addCriterion("departure_time between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotBetween(Date value1, Date value2) {
            addCriterion("departure_time not between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceIsNull() {
            addCriterion("departure_place is null");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceIsNotNull() {
            addCriterion("departure_place is not null");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceEqualTo(String value) {
            addCriterion("departure_place =", value, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceNotEqualTo(String value) {
            addCriterion("departure_place <>", value, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceGreaterThan(String value) {
            addCriterion("departure_place >", value, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("departure_place >=", value, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceLessThan(String value) {
            addCriterion("departure_place <", value, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceLessThanOrEqualTo(String value) {
            addCriterion("departure_place <=", value, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceLike(String value) {
            addCriterion("departure_place like", value, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceNotLike(String value) {
            addCriterion("departure_place not like", value, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceIn(List<String> values) {
            addCriterion("departure_place in", values, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceNotIn(List<String> values) {
            addCriterion("departure_place not in", values, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceBetween(String value1, String value2) {
            addCriterion("departure_place between", value1, value2, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andDeparturePlaceNotBetween(String value1, String value2) {
            addCriterion("departure_place not between", value1, value2, "departurePlace");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkIsNull() {
            addCriterion("place_remark is null");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkIsNotNull() {
            addCriterion("place_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkEqualTo(String value) {
            addCriterion("place_remark =", value, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkNotEqualTo(String value) {
            addCriterion("place_remark <>", value, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkGreaterThan(String value) {
            addCriterion("place_remark >", value, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("place_remark >=", value, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkLessThan(String value) {
            addCriterion("place_remark <", value, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkLessThanOrEqualTo(String value) {
            addCriterion("place_remark <=", value, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkLike(String value) {
            addCriterion("place_remark like", value, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkNotLike(String value) {
            addCriterion("place_remark not like", value, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkIn(List<String> values) {
            addCriterion("place_remark in", values, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkNotIn(List<String> values) {
            addCriterion("place_remark not in", values, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkBetween(String value1, String value2) {
            addCriterion("place_remark between", value1, value2, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andPlaceRemarkNotBetween(String value1, String value2) {
            addCriterion("place_remark not between", value1, value2, "placeRemark");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeIsNull() {
            addCriterion("details_describe is null");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeIsNotNull() {
            addCriterion("details_describe is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeEqualTo(String value) {
            addCriterion("details_describe =", value, "detailsDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeNotEqualTo(String value) {
            addCriterion("details_describe <>", value, "detailsDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeGreaterThan(String value) {
            addCriterion("details_describe >", value, "detailsDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("details_describe >=", value, "detailsDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeLessThan(String value) {
            addCriterion("details_describe <", value, "detailsDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeLessThanOrEqualTo(String value) {
            addCriterion("details_describe <=", value, "detailsDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeLike(String value) {
            addCriterion("details_describe like", value, "detailsDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeNotLike(String value) {
            addCriterion("details_describe not like", value, "detailsDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeIn(List<String> values) {
            addCriterion("details_describe in", values, "detailsDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeNotIn(List<String> values) {
            addCriterion("details_describe not in", values, "detailsDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeBetween(String value1, String value2) {
            addCriterion("details_describe between", value1, value2, "detailsDescribe");
            return (Criteria) this;
        }

        public Criteria andDetailsDescribeNotBetween(String value1, String value2) {
            addCriterion("details_describe not between", value1, value2, "detailsDescribe");
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