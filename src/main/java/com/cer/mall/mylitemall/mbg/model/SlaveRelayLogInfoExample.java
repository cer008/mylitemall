package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SlaveRelayLogInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlaveRelayLogInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesIsNull() {
            addCriterion("Number_of_lines is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesIsNotNull() {
            addCriterion("Number_of_lines is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesEqualTo(Integer value) {
            addCriterion("Number_of_lines =", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesNotEqualTo(Integer value) {
            addCriterion("Number_of_lines <>", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesGreaterThan(Integer value) {
            addCriterion("Number_of_lines >", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Number_of_lines >=", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesLessThan(Integer value) {
            addCriterion("Number_of_lines <", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesLessThanOrEqualTo(Integer value) {
            addCriterion("Number_of_lines <=", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesIn(List<Integer> values) {
            addCriterion("Number_of_lines in", values, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesNotIn(List<Integer> values) {
            addCriterion("Number_of_lines not in", values, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_lines between", value1, value2, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesNotBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_lines not between", value1, value2, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosIsNull() {
            addCriterion("Relay_log_pos is null");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosIsNotNull() {
            addCriterion("Relay_log_pos is not null");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosEqualTo(Long value) {
            addCriterion("Relay_log_pos =", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosNotEqualTo(Long value) {
            addCriterion("Relay_log_pos <>", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosGreaterThan(Long value) {
            addCriterion("Relay_log_pos >", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosGreaterThanOrEqualTo(Long value) {
            addCriterion("Relay_log_pos >=", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosLessThan(Long value) {
            addCriterion("Relay_log_pos <", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosLessThanOrEqualTo(Long value) {
            addCriterion("Relay_log_pos <=", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosIn(List<Long> values) {
            addCriterion("Relay_log_pos in", values, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosNotIn(List<Long> values) {
            addCriterion("Relay_log_pos not in", values, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosBetween(Long value1, Long value2) {
            addCriterion("Relay_log_pos between", value1, value2, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosNotBetween(Long value1, Long value2) {
            addCriterion("Relay_log_pos not between", value1, value2, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosIsNull() {
            addCriterion("Master_log_pos is null");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosIsNotNull() {
            addCriterion("Master_log_pos is not null");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosEqualTo(Long value) {
            addCriterion("Master_log_pos =", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosNotEqualTo(Long value) {
            addCriterion("Master_log_pos <>", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosGreaterThan(Long value) {
            addCriterion("Master_log_pos >", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosGreaterThanOrEqualTo(Long value) {
            addCriterion("Master_log_pos >=", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosLessThan(Long value) {
            addCriterion("Master_log_pos <", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosLessThanOrEqualTo(Long value) {
            addCriterion("Master_log_pos <=", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosIn(List<Long> values) {
            addCriterion("Master_log_pos in", values, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosNotIn(List<Long> values) {
            addCriterion("Master_log_pos not in", values, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosBetween(Long value1, Long value2) {
            addCriterion("Master_log_pos between", value1, value2, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosNotBetween(Long value1, Long value2) {
            addCriterion("Master_log_pos not between", value1, value2, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andSqlDelayIsNull() {
            addCriterion("Sql_delay is null");
            return (Criteria) this;
        }

        public Criteria andSqlDelayIsNotNull() {
            addCriterion("Sql_delay is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDelayEqualTo(Integer value) {
            addCriterion("Sql_delay =", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayNotEqualTo(Integer value) {
            addCriterion("Sql_delay <>", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayGreaterThan(Integer value) {
            addCriterion("Sql_delay >", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sql_delay >=", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayLessThan(Integer value) {
            addCriterion("Sql_delay <", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayLessThanOrEqualTo(Integer value) {
            addCriterion("Sql_delay <=", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayIn(List<Integer> values) {
            addCriterion("Sql_delay in", values, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayNotIn(List<Integer> values) {
            addCriterion("Sql_delay not in", values, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayBetween(Integer value1, Integer value2) {
            addCriterion("Sql_delay between", value1, value2, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayNotBetween(Integer value1, Integer value2) {
            addCriterion("Sql_delay not between", value1, value2, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersIsNull() {
            addCriterion("Number_of_workers is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersIsNotNull() {
            addCriterion("Number_of_workers is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersEqualTo(Integer value) {
            addCriterion("Number_of_workers =", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersNotEqualTo(Integer value) {
            addCriterion("Number_of_workers <>", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersGreaterThan(Integer value) {
            addCriterion("Number_of_workers >", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersGreaterThanOrEqualTo(Integer value) {
            addCriterion("Number_of_workers >=", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersLessThan(Integer value) {
            addCriterion("Number_of_workers <", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersLessThanOrEqualTo(Integer value) {
            addCriterion("Number_of_workers <=", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersIn(List<Integer> values) {
            addCriterion("Number_of_workers in", values, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersNotIn(List<Integer> values) {
            addCriterion("Number_of_workers not in", values, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_workers between", value1, value2, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersNotBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_workers not between", value1, value2, "numberOfWorkers");
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