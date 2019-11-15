package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class TimeZoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeZoneExample() {
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

        public Criteria andTimeZoneIdIsNull() {
            addCriterion("Time_zone_id is null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIdIsNotNull() {
            addCriterion("Time_zone_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIdEqualTo(Integer value) {
            addCriterion("Time_zone_id =", value, "timeZoneId");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIdNotEqualTo(Integer value) {
            addCriterion("Time_zone_id <>", value, "timeZoneId");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIdGreaterThan(Integer value) {
            addCriterion("Time_zone_id >", value, "timeZoneId");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Time_zone_id >=", value, "timeZoneId");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIdLessThan(Integer value) {
            addCriterion("Time_zone_id <", value, "timeZoneId");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIdLessThanOrEqualTo(Integer value) {
            addCriterion("Time_zone_id <=", value, "timeZoneId");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIdIn(List<Integer> values) {
            addCriterion("Time_zone_id in", values, "timeZoneId");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIdNotIn(List<Integer> values) {
            addCriterion("Time_zone_id not in", values, "timeZoneId");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIdBetween(Integer value1, Integer value2) {
            addCriterion("Time_zone_id between", value1, value2, "timeZoneId");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Time_zone_id not between", value1, value2, "timeZoneId");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsIsNull() {
            addCriterion("Use_leap_seconds is null");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsIsNotNull() {
            addCriterion("Use_leap_seconds is not null");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsEqualTo(String value) {
            addCriterion("Use_leap_seconds =", value, "useLeapSeconds");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsNotEqualTo(String value) {
            addCriterion("Use_leap_seconds <>", value, "useLeapSeconds");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsGreaterThan(String value) {
            addCriterion("Use_leap_seconds >", value, "useLeapSeconds");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsGreaterThanOrEqualTo(String value) {
            addCriterion("Use_leap_seconds >=", value, "useLeapSeconds");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsLessThan(String value) {
            addCriterion("Use_leap_seconds <", value, "useLeapSeconds");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsLessThanOrEqualTo(String value) {
            addCriterion("Use_leap_seconds <=", value, "useLeapSeconds");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsLike(String value) {
            addCriterion("Use_leap_seconds like", value, "useLeapSeconds");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsNotLike(String value) {
            addCriterion("Use_leap_seconds not like", value, "useLeapSeconds");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsIn(List<String> values) {
            addCriterion("Use_leap_seconds in", values, "useLeapSeconds");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsNotIn(List<String> values) {
            addCriterion("Use_leap_seconds not in", values, "useLeapSeconds");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsBetween(String value1, String value2) {
            addCriterion("Use_leap_seconds between", value1, value2, "useLeapSeconds");
            return (Criteria) this;
        }

        public Criteria andUseLeapSecondsNotBetween(String value1, String value2) {
            addCriterion("Use_leap_seconds not between", value1, value2, "useLeapSeconds");
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