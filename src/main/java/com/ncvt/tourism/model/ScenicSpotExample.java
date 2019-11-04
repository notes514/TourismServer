package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class ScenicSpotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicSpotExample() {
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

        public Criteria andScenicSpotPicUrlIsNull() {
            addCriterion("scenic_spot_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlIsNotNull() {
            addCriterion("scenic_spot_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlEqualTo(String value) {
            addCriterion("scenic_spot_pic_url =", value, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlNotEqualTo(String value) {
            addCriterion("scenic_spot_pic_url <>", value, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlGreaterThan(String value) {
            addCriterion("scenic_spot_pic_url >", value, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_spot_pic_url >=", value, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlLessThan(String value) {
            addCriterion("scenic_spot_pic_url <", value, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlLessThanOrEqualTo(String value) {
            addCriterion("scenic_spot_pic_url <=", value, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlLike(String value) {
            addCriterion("scenic_spot_pic_url like", value, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlNotLike(String value) {
            addCriterion("scenic_spot_pic_url not like", value, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlIn(List<String> values) {
            addCriterion("scenic_spot_pic_url in", values, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlNotIn(List<String> values) {
            addCriterion("scenic_spot_pic_url not in", values, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlBetween(String value1, String value2) {
            addCriterion("scenic_spot_pic_url between", value1, value2, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPicUrlNotBetween(String value1, String value2) {
            addCriterion("scenic_spot_pic_url not between", value1, value2, "scenicSpotPicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeIsNull() {
            addCriterion("scenic_spot_theme is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeIsNotNull() {
            addCriterion("scenic_spot_theme is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeEqualTo(String value) {
            addCriterion("scenic_spot_theme =", value, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeNotEqualTo(String value) {
            addCriterion("scenic_spot_theme <>", value, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeGreaterThan(String value) {
            addCriterion("scenic_spot_theme >", value, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_spot_theme >=", value, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeLessThan(String value) {
            addCriterion("scenic_spot_theme <", value, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeLessThanOrEqualTo(String value) {
            addCriterion("scenic_spot_theme <=", value, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeLike(String value) {
            addCriterion("scenic_spot_theme like", value, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeNotLike(String value) {
            addCriterion("scenic_spot_theme not like", value, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeIn(List<String> values) {
            addCriterion("scenic_spot_theme in", values, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeNotIn(List<String> values) {
            addCriterion("scenic_spot_theme not in", values, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeBetween(String value1, String value2) {
            addCriterion("scenic_spot_theme between", value1, value2, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andScenicSpotThemeNotBetween(String value1, String value2) {
            addCriterion("scenic_spot_theme not between", value1, value2, "scenicSpotTheme");
            return (Criteria) this;
        }

        public Criteria andTravelModeIsNull() {
            addCriterion("travel_mode is null");
            return (Criteria) this;
        }

        public Criteria andTravelModeIsNotNull() {
            addCriterion("travel_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTravelModeEqualTo(Integer value) {
            addCriterion("travel_mode =", value, "travelMode");
            return (Criteria) this;
        }

        public Criteria andTravelModeNotEqualTo(Integer value) {
            addCriterion("travel_mode <>", value, "travelMode");
            return (Criteria) this;
        }

        public Criteria andTravelModeGreaterThan(Integer value) {
            addCriterion("travel_mode >", value, "travelMode");
            return (Criteria) this;
        }

        public Criteria andTravelModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_mode >=", value, "travelMode");
            return (Criteria) this;
        }

        public Criteria andTravelModeLessThan(Integer value) {
            addCriterion("travel_mode <", value, "travelMode");
            return (Criteria) this;
        }

        public Criteria andTravelModeLessThanOrEqualTo(Integer value) {
            addCriterion("travel_mode <=", value, "travelMode");
            return (Criteria) this;
        }

        public Criteria andTravelModeIn(List<Integer> values) {
            addCriterion("travel_mode in", values, "travelMode");
            return (Criteria) this;
        }

        public Criteria andTravelModeNotIn(List<Integer> values) {
            addCriterion("travel_mode not in", values, "travelMode");
            return (Criteria) this;
        }

        public Criteria andTravelModeBetween(Integer value1, Integer value2) {
            addCriterion("travel_mode between", value1, value2, "travelMode");
            return (Criteria) this;
        }

        public Criteria andTravelModeNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_mode not between", value1, value2, "travelMode");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceIsNull() {
            addCriterion("scenic_spot_price is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceIsNotNull() {
            addCriterion("scenic_spot_price is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceEqualTo(Double value) {
            addCriterion("scenic_spot_price =", value, "scenicSpotPrice");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceNotEqualTo(Double value) {
            addCriterion("scenic_spot_price <>", value, "scenicSpotPrice");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceGreaterThan(Double value) {
            addCriterion("scenic_spot_price >", value, "scenicSpotPrice");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("scenic_spot_price >=", value, "scenicSpotPrice");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceLessThan(Double value) {
            addCriterion("scenic_spot_price <", value, "scenicSpotPrice");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceLessThanOrEqualTo(Double value) {
            addCriterion("scenic_spot_price <=", value, "scenicSpotPrice");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceIn(List<Double> values) {
            addCriterion("scenic_spot_price in", values, "scenicSpotPrice");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceNotIn(List<Double> values) {
            addCriterion("scenic_spot_price not in", values, "scenicSpotPrice");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceBetween(Double value1, Double value2) {
            addCriterion("scenic_spot_price between", value1, value2, "scenicSpotPrice");
            return (Criteria) this;
        }

        public Criteria andScenicSpotPriceNotBetween(Double value1, Double value2) {
            addCriterion("scenic_spot_price not between", value1, value2, "scenicSpotPrice");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreIsNull() {
            addCriterion("scenic_spot_score is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreIsNotNull() {
            addCriterion("scenic_spot_score is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreEqualTo(Double value) {
            addCriterion("scenic_spot_score =", value, "scenicSpotScore");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreNotEqualTo(Double value) {
            addCriterion("scenic_spot_score <>", value, "scenicSpotScore");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreGreaterThan(Double value) {
            addCriterion("scenic_spot_score >", value, "scenicSpotScore");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("scenic_spot_score >=", value, "scenicSpotScore");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreLessThan(Double value) {
            addCriterion("scenic_spot_score <", value, "scenicSpotScore");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreLessThanOrEqualTo(Double value) {
            addCriterion("scenic_spot_score <=", value, "scenicSpotScore");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreIn(List<Double> values) {
            addCriterion("scenic_spot_score in", values, "scenicSpotScore");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreNotIn(List<Double> values) {
            addCriterion("scenic_spot_score not in", values, "scenicSpotScore");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreBetween(Double value1, Double value2) {
            addCriterion("scenic_spot_score between", value1, value2, "scenicSpotScore");
            return (Criteria) this;
        }

        public Criteria andScenicSpotScoreNotBetween(Double value1, Double value2) {
            addCriterion("scenic_spot_score not between", value1, value2, "scenicSpotScore");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsIsNull() {
            addCriterion("number_of_tourists is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsIsNotNull() {
            addCriterion("number_of_tourists is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsEqualTo(Integer value) {
            addCriterion("number_of_tourists =", value, "numberOfTourists");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsNotEqualTo(Integer value) {
            addCriterion("number_of_tourists <>", value, "numberOfTourists");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsGreaterThan(Integer value) {
            addCriterion("number_of_tourists >", value, "numberOfTourists");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_of_tourists >=", value, "numberOfTourists");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsLessThan(Integer value) {
            addCriterion("number_of_tourists <", value, "numberOfTourists");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsLessThanOrEqualTo(Integer value) {
            addCriterion("number_of_tourists <=", value, "numberOfTourists");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsIn(List<Integer> values) {
            addCriterion("number_of_tourists in", values, "numberOfTourists");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsNotIn(List<Integer> values) {
            addCriterion("number_of_tourists not in", values, "numberOfTourists");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsBetween(Integer value1, Integer value2) {
            addCriterion("number_of_tourists between", value1, value2, "numberOfTourists");
            return (Criteria) this;
        }

        public Criteria andNumberOfTouristsNotBetween(Integer value1, Integer value2) {
            addCriterion("number_of_tourists not between", value1, value2, "numberOfTourists");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldIsNull() {
            addCriterion("scenic_spot_sold is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldIsNotNull() {
            addCriterion("scenic_spot_sold is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldEqualTo(Integer value) {
            addCriterion("scenic_spot_sold =", value, "scenicSpotSold");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldNotEqualTo(Integer value) {
            addCriterion("scenic_spot_sold <>", value, "scenicSpotSold");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldGreaterThan(Integer value) {
            addCriterion("scenic_spot_sold >", value, "scenicSpotSold");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_spot_sold >=", value, "scenicSpotSold");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldLessThan(Integer value) {
            addCriterion("scenic_spot_sold <", value, "scenicSpotSold");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_spot_sold <=", value, "scenicSpotSold");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldIn(List<Integer> values) {
            addCriterion("scenic_spot_sold in", values, "scenicSpotSold");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldNotIn(List<Integer> values) {
            addCriterion("scenic_spot_sold not in", values, "scenicSpotSold");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldBetween(Integer value1, Integer value2) {
            addCriterion("scenic_spot_sold between", value1, value2, "scenicSpotSold");
            return (Criteria) this;
        }

        public Criteria andScenicSpotSoldNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_spot_sold not between", value1, value2, "scenicSpotSold");
            return (Criteria) this;
        }

        public Criteria andStartLandIsNull() {
            addCriterion("start_land is null");
            return (Criteria) this;
        }

        public Criteria andStartLandIsNotNull() {
            addCriterion("start_land is not null");
            return (Criteria) this;
        }

        public Criteria andStartLandEqualTo(String value) {
            addCriterion("start_land =", value, "startLand");
            return (Criteria) this;
        }

        public Criteria andStartLandNotEqualTo(String value) {
            addCriterion("start_land <>", value, "startLand");
            return (Criteria) this;
        }

        public Criteria andStartLandGreaterThan(String value) {
            addCriterion("start_land >", value, "startLand");
            return (Criteria) this;
        }

        public Criteria andStartLandGreaterThanOrEqualTo(String value) {
            addCriterion("start_land >=", value, "startLand");
            return (Criteria) this;
        }

        public Criteria andStartLandLessThan(String value) {
            addCriterion("start_land <", value, "startLand");
            return (Criteria) this;
        }

        public Criteria andStartLandLessThanOrEqualTo(String value) {
            addCriterion("start_land <=", value, "startLand");
            return (Criteria) this;
        }

        public Criteria andStartLandLike(String value) {
            addCriterion("start_land like", value, "startLand");
            return (Criteria) this;
        }

        public Criteria andStartLandNotLike(String value) {
            addCriterion("start_land not like", value, "startLand");
            return (Criteria) this;
        }

        public Criteria andStartLandIn(List<String> values) {
            addCriterion("start_land in", values, "startLand");
            return (Criteria) this;
        }

        public Criteria andStartLandNotIn(List<String> values) {
            addCriterion("start_land not in", values, "startLand");
            return (Criteria) this;
        }

        public Criteria andStartLandBetween(String value1, String value2) {
            addCriterion("start_land between", value1, value2, "startLand");
            return (Criteria) this;
        }

        public Criteria andStartLandNotBetween(String value1, String value2) {
            addCriterion("start_land not between", value1, value2, "startLand");
            return (Criteria) this;
        }

        public Criteria andEndLandIsNull() {
            addCriterion("end_land is null");
            return (Criteria) this;
        }

        public Criteria andEndLandIsNotNull() {
            addCriterion("end_land is not null");
            return (Criteria) this;
        }

        public Criteria andEndLandEqualTo(String value) {
            addCriterion("end_land =", value, "endLand");
            return (Criteria) this;
        }

        public Criteria andEndLandNotEqualTo(String value) {
            addCriterion("end_land <>", value, "endLand");
            return (Criteria) this;
        }

        public Criteria andEndLandGreaterThan(String value) {
            addCriterion("end_land >", value, "endLand");
            return (Criteria) this;
        }

        public Criteria andEndLandGreaterThanOrEqualTo(String value) {
            addCriterion("end_land >=", value, "endLand");
            return (Criteria) this;
        }

        public Criteria andEndLandLessThan(String value) {
            addCriterion("end_land <", value, "endLand");
            return (Criteria) this;
        }

        public Criteria andEndLandLessThanOrEqualTo(String value) {
            addCriterion("end_land <=", value, "endLand");
            return (Criteria) this;
        }

        public Criteria andEndLandLike(String value) {
            addCriterion("end_land like", value, "endLand");
            return (Criteria) this;
        }

        public Criteria andEndLandNotLike(String value) {
            addCriterion("end_land not like", value, "endLand");
            return (Criteria) this;
        }

        public Criteria andEndLandIn(List<String> values) {
            addCriterion("end_land in", values, "endLand");
            return (Criteria) this;
        }

        public Criteria andEndLandNotIn(List<String> values) {
            addCriterion("end_land not in", values, "endLand");
            return (Criteria) this;
        }

        public Criteria andEndLandBetween(String value1, String value2) {
            addCriterion("end_land between", value1, value2, "endLand");
            return (Criteria) this;
        }

        public Criteria andEndLandNotBetween(String value1, String value2) {
            addCriterion("end_land not between", value1, value2, "endLand");
            return (Criteria) this;
        }

        public Criteria andTourCityIsNull() {
            addCriterion("tour_city is null");
            return (Criteria) this;
        }

        public Criteria andTourCityIsNotNull() {
            addCriterion("tour_city is not null");
            return (Criteria) this;
        }

        public Criteria andTourCityEqualTo(String value) {
            addCriterion("tour_city =", value, "tourCity");
            return (Criteria) this;
        }

        public Criteria andTourCityNotEqualTo(String value) {
            addCriterion("tour_city <>", value, "tourCity");
            return (Criteria) this;
        }

        public Criteria andTourCityGreaterThan(String value) {
            addCriterion("tour_city >", value, "tourCity");
            return (Criteria) this;
        }

        public Criteria andTourCityGreaterThanOrEqualTo(String value) {
            addCriterion("tour_city >=", value, "tourCity");
            return (Criteria) this;
        }

        public Criteria andTourCityLessThan(String value) {
            addCriterion("tour_city <", value, "tourCity");
            return (Criteria) this;
        }

        public Criteria andTourCityLessThanOrEqualTo(String value) {
            addCriterion("tour_city <=", value, "tourCity");
            return (Criteria) this;
        }

        public Criteria andTourCityLike(String value) {
            addCriterion("tour_city like", value, "tourCity");
            return (Criteria) this;
        }

        public Criteria andTourCityNotLike(String value) {
            addCriterion("tour_city not like", value, "tourCity");
            return (Criteria) this;
        }

        public Criteria andTourCityIn(List<String> values) {
            addCriterion("tour_city in", values, "tourCity");
            return (Criteria) this;
        }

        public Criteria andTourCityNotIn(List<String> values) {
            addCriterion("tour_city not in", values, "tourCity");
            return (Criteria) this;
        }

        public Criteria andTourCityBetween(String value1, String value2) {
            addCriterion("tour_city between", value1, value2, "tourCity");
            return (Criteria) this;
        }

        public Criteria andTourCityNotBetween(String value1, String value2) {
            addCriterion("tour_city not between", value1, value2, "tourCity");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopIsNull() {
            addCriterion("scenic_spot_shop is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopIsNotNull() {
            addCriterion("scenic_spot_shop is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopEqualTo(String value) {
            addCriterion("scenic_spot_shop =", value, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopNotEqualTo(String value) {
            addCriterion("scenic_spot_shop <>", value, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopGreaterThan(String value) {
            addCriterion("scenic_spot_shop >", value, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_spot_shop >=", value, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopLessThan(String value) {
            addCriterion("scenic_spot_shop <", value, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopLessThanOrEqualTo(String value) {
            addCriterion("scenic_spot_shop <=", value, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopLike(String value) {
            addCriterion("scenic_spot_shop like", value, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopNotLike(String value) {
            addCriterion("scenic_spot_shop not like", value, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopIn(List<String> values) {
            addCriterion("scenic_spot_shop in", values, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopNotIn(List<String> values) {
            addCriterion("scenic_spot_shop not in", values, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopBetween(String value1, String value2) {
            addCriterion("scenic_spot_shop between", value1, value2, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotShopNotBetween(String value1, String value2) {
            addCriterion("scenic_spot_shop not between", value1, value2, "scenicSpotShop");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateIsNull() {
            addCriterion("scenic_spot_state is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateIsNotNull() {
            addCriterion("scenic_spot_state is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateEqualTo(Integer value) {
            addCriterion("scenic_spot_state =", value, "scenicSpotState");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateNotEqualTo(Integer value) {
            addCriterion("scenic_spot_state <>", value, "scenicSpotState");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateGreaterThan(Integer value) {
            addCriterion("scenic_spot_state >", value, "scenicSpotState");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_spot_state >=", value, "scenicSpotState");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateLessThan(Integer value) {
            addCriterion("scenic_spot_state <", value, "scenicSpotState");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_spot_state <=", value, "scenicSpotState");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateIn(List<Integer> values) {
            addCriterion("scenic_spot_state in", values, "scenicSpotState");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateNotIn(List<Integer> values) {
            addCriterion("scenic_spot_state not in", values, "scenicSpotState");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateBetween(Integer value1, Integer value2) {
            addCriterion("scenic_spot_state between", value1, value2, "scenicSpotState");
            return (Criteria) this;
        }

        public Criteria andScenicSpotStateNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_spot_state not between", value1, value2, "scenicSpotState");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainIsNull() {
            addCriterion("scenic_spot_explain is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainIsNotNull() {
            addCriterion("scenic_spot_explain is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainEqualTo(String value) {
            addCriterion("scenic_spot_explain =", value, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainNotEqualTo(String value) {
            addCriterion("scenic_spot_explain <>", value, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainGreaterThan(String value) {
            addCriterion("scenic_spot_explain >", value, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_spot_explain >=", value, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainLessThan(String value) {
            addCriterion("scenic_spot_explain <", value, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainLessThanOrEqualTo(String value) {
            addCriterion("scenic_spot_explain <=", value, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainLike(String value) {
            addCriterion("scenic_spot_explain like", value, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainNotLike(String value) {
            addCriterion("scenic_spot_explain not like", value, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainIn(List<String> values) {
            addCriterion("scenic_spot_explain in", values, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainNotIn(List<String> values) {
            addCriterion("scenic_spot_explain not in", values, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainBetween(String value1, String value2) {
            addCriterion("scenic_spot_explain between", value1, value2, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotExplainNotBetween(String value1, String value2) {
            addCriterion("scenic_spot_explain not between", value1, value2, "scenicSpotExplain");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeIsNull() {
            addCriterion("scenic_spot_describe is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeIsNotNull() {
            addCriterion("scenic_spot_describe is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeEqualTo(String value) {
            addCriterion("scenic_spot_describe =", value, "scenicSpotDescribe");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeNotEqualTo(String value) {
            addCriterion("scenic_spot_describe <>", value, "scenicSpotDescribe");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeGreaterThan(String value) {
            addCriterion("scenic_spot_describe >", value, "scenicSpotDescribe");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_spot_describe >=", value, "scenicSpotDescribe");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeLessThan(String value) {
            addCriterion("scenic_spot_describe <", value, "scenicSpotDescribe");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeLessThanOrEqualTo(String value) {
            addCriterion("scenic_spot_describe <=", value, "scenicSpotDescribe");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeLike(String value) {
            addCriterion("scenic_spot_describe like", value, "scenicSpotDescribe");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeNotLike(String value) {
            addCriterion("scenic_spot_describe not like", value, "scenicSpotDescribe");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeIn(List<String> values) {
            addCriterion("scenic_spot_describe in", values, "scenicSpotDescribe");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeNotIn(List<String> values) {
            addCriterion("scenic_spot_describe not in", values, "scenicSpotDescribe");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeBetween(String value1, String value2) {
            addCriterion("scenic_spot_describe between", value1, value2, "scenicSpotDescribe");
            return (Criteria) this;
        }

        public Criteria andScenicSpotDescribeNotBetween(String value1, String value2) {
            addCriterion("scenic_spot_describe not between", value1, value2, "scenicSpotDescribe");
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