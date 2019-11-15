package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class TimeZoneTransitionTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeZoneTransitionTypeExample() {
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

        public Criteria andTransitionTypeIdIsNull() {
            addCriterion("Transition_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTransitionTypeIdIsNotNull() {
            addCriterion("Transition_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransitionTypeIdEqualTo(Integer value) {
            addCriterion("Transition_type_id =", value, "transitionTypeId");
            return (Criteria) this;
        }

        public Criteria andTransitionTypeIdNotEqualTo(Integer value) {
            addCriterion("Transition_type_id <>", value, "transitionTypeId");
            return (Criteria) this;
        }

        public Criteria andTransitionTypeIdGreaterThan(Integer value) {
            addCriterion("Transition_type_id >", value, "transitionTypeId");
            return (Criteria) this;
        }

        public Criteria andTransitionTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Transition_type_id >=", value, "transitionTypeId");
            return (Criteria) this;
        }

        public Criteria andTransitionTypeIdLessThan(Integer value) {
            addCriterion("Transition_type_id <", value, "transitionTypeId");
            return (Criteria) this;
        }

        public Criteria andTransitionTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Transition_type_id <=", value, "transitionTypeId");
            return (Criteria) this;
        }

        public Criteria andTransitionTypeIdIn(List<Integer> values) {
            addCriterion("Transition_type_id in", values, "transitionTypeId");
            return (Criteria) this;
        }

        public Criteria andTransitionTypeIdNotIn(List<Integer> values) {
            addCriterion("Transition_type_id not in", values, "transitionTypeId");
            return (Criteria) this;
        }

        public Criteria andTransitionTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Transition_type_id between", value1, value2, "transitionTypeId");
            return (Criteria) this;
        }

        public Criteria andTransitionTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Transition_type_id not between", value1, value2, "transitionTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsetIsNull() {
            addCriterion("Offset is null");
            return (Criteria) this;
        }

        public Criteria andOffsetIsNotNull() {
            addCriterion("Offset is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetEqualTo(Integer value) {
            addCriterion("Offset =", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotEqualTo(Integer value) {
            addCriterion("Offset <>", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetGreaterThan(Integer value) {
            addCriterion("Offset >", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("Offset >=", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetLessThan(Integer value) {
            addCriterion("Offset <", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetLessThanOrEqualTo(Integer value) {
            addCriterion("Offset <=", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetIn(List<Integer> values) {
            addCriterion("Offset in", values, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotIn(List<Integer> values) {
            addCriterion("Offset not in", values, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetBetween(Integer value1, Integer value2) {
            addCriterion("Offset between", value1, value2, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotBetween(Integer value1, Integer value2) {
            addCriterion("Offset not between", value1, value2, "offset");
            return (Criteria) this;
        }

        public Criteria andIsDstIsNull() {
            addCriterion("Is_DST is null");
            return (Criteria) this;
        }

        public Criteria andIsDstIsNotNull() {
            addCriterion("Is_DST is not null");
            return (Criteria) this;
        }

        public Criteria andIsDstEqualTo(Byte value) {
            addCriterion("Is_DST =", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstNotEqualTo(Byte value) {
            addCriterion("Is_DST <>", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstGreaterThan(Byte value) {
            addCriterion("Is_DST >", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstGreaterThanOrEqualTo(Byte value) {
            addCriterion("Is_DST >=", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstLessThan(Byte value) {
            addCriterion("Is_DST <", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstLessThanOrEqualTo(Byte value) {
            addCriterion("Is_DST <=", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstIn(List<Byte> values) {
            addCriterion("Is_DST in", values, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstNotIn(List<Byte> values) {
            addCriterion("Is_DST not in", values, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstBetween(Byte value1, Byte value2) {
            addCriterion("Is_DST between", value1, value2, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstNotBetween(Byte value1, Byte value2) {
            addCriterion("Is_DST not between", value1, value2, "isDst");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNull() {
            addCriterion("Abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNotNull() {
            addCriterion("Abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationEqualTo(String value) {
            addCriterion("Abbreviation =", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotEqualTo(String value) {
            addCriterion("Abbreviation <>", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThan(String value) {
            addCriterion("Abbreviation >", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("Abbreviation >=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThan(String value) {
            addCriterion("Abbreviation <", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("Abbreviation <=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLike(String value) {
            addCriterion("Abbreviation like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotLike(String value) {
            addCriterion("Abbreviation not like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIn(List<String> values) {
            addCriterion("Abbreviation in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotIn(List<String> values) {
            addCriterion("Abbreviation not in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationBetween(String value1, String value2) {
            addCriterion("Abbreviation between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotBetween(String value1, String value2) {
            addCriterion("Abbreviation not between", value1, value2, "abbreviation");
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