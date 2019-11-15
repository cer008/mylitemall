package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class TimeZoneLeapSecondExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeZoneLeapSecondExample() {
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

        public Criteria andTransitionTimeIsNull() {
            addCriterion("Transition_time is null");
            return (Criteria) this;
        }

        public Criteria andTransitionTimeIsNotNull() {
            addCriterion("Transition_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransitionTimeEqualTo(Long value) {
            addCriterion("Transition_time =", value, "transitionTime");
            return (Criteria) this;
        }

        public Criteria andTransitionTimeNotEqualTo(Long value) {
            addCriterion("Transition_time <>", value, "transitionTime");
            return (Criteria) this;
        }

        public Criteria andTransitionTimeGreaterThan(Long value) {
            addCriterion("Transition_time >", value, "transitionTime");
            return (Criteria) this;
        }

        public Criteria andTransitionTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("Transition_time >=", value, "transitionTime");
            return (Criteria) this;
        }

        public Criteria andTransitionTimeLessThan(Long value) {
            addCriterion("Transition_time <", value, "transitionTime");
            return (Criteria) this;
        }

        public Criteria andTransitionTimeLessThanOrEqualTo(Long value) {
            addCriterion("Transition_time <=", value, "transitionTime");
            return (Criteria) this;
        }

        public Criteria andTransitionTimeIn(List<Long> values) {
            addCriterion("Transition_time in", values, "transitionTime");
            return (Criteria) this;
        }

        public Criteria andTransitionTimeNotIn(List<Long> values) {
            addCriterion("Transition_time not in", values, "transitionTime");
            return (Criteria) this;
        }

        public Criteria andTransitionTimeBetween(Long value1, Long value2) {
            addCriterion("Transition_time between", value1, value2, "transitionTime");
            return (Criteria) this;
        }

        public Criteria andTransitionTimeNotBetween(Long value1, Long value2) {
            addCriterion("Transition_time not between", value1, value2, "transitionTime");
            return (Criteria) this;
        }

        public Criteria andCorrectionIsNull() {
            addCriterion("Correction is null");
            return (Criteria) this;
        }

        public Criteria andCorrectionIsNotNull() {
            addCriterion("Correction is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectionEqualTo(Integer value) {
            addCriterion("Correction =", value, "correction");
            return (Criteria) this;
        }

        public Criteria andCorrectionNotEqualTo(Integer value) {
            addCriterion("Correction <>", value, "correction");
            return (Criteria) this;
        }

        public Criteria andCorrectionGreaterThan(Integer value) {
            addCriterion("Correction >", value, "correction");
            return (Criteria) this;
        }

        public Criteria andCorrectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Correction >=", value, "correction");
            return (Criteria) this;
        }

        public Criteria andCorrectionLessThan(Integer value) {
            addCriterion("Correction <", value, "correction");
            return (Criteria) this;
        }

        public Criteria andCorrectionLessThanOrEqualTo(Integer value) {
            addCriterion("Correction <=", value, "correction");
            return (Criteria) this;
        }

        public Criteria andCorrectionIn(List<Integer> values) {
            addCriterion("Correction in", values, "correction");
            return (Criteria) this;
        }

        public Criteria andCorrectionNotIn(List<Integer> values) {
            addCriterion("Correction not in", values, "correction");
            return (Criteria) this;
        }

        public Criteria andCorrectionBetween(Integer value1, Integer value2) {
            addCriterion("Correction between", value1, value2, "correction");
            return (Criteria) this;
        }

        public Criteria andCorrectionNotBetween(Integer value1, Integer value2) {
            addCriterion("Correction not between", value1, value2, "correction");
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