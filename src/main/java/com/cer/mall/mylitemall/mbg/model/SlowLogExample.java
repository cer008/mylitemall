package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SlowLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlowLogExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIsNull() {
            addCriterion("query_time is null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIsNotNull() {
            addCriterion("query_time is not null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeEqualTo(Date value) {
            addCriterionForJDBCTime("query_time =", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("query_time <>", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("query_time >", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("query_time >=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThan(Date value) {
            addCriterionForJDBCTime("query_time <", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("query_time <=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIn(List<Date> values) {
            addCriterionForJDBCTime("query_time in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("query_time not in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("query_time between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("query_time not between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNull() {
            addCriterion("lock_time is null");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNotNull() {
            addCriterion("lock_time is not null");
            return (Criteria) this;
        }

        public Criteria andLockTimeEqualTo(Date value) {
            addCriterionForJDBCTime("lock_time =", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("lock_time <>", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("lock_time >", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lock_time >=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThan(Date value) {
            addCriterionForJDBCTime("lock_time <", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lock_time <=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeIn(List<Date> values) {
            addCriterionForJDBCTime("lock_time in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("lock_time not in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lock_time between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lock_time not between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andRowsSentIsNull() {
            addCriterion("rows_sent is null");
            return (Criteria) this;
        }

        public Criteria andRowsSentIsNotNull() {
            addCriterion("rows_sent is not null");
            return (Criteria) this;
        }

        public Criteria andRowsSentEqualTo(Integer value) {
            addCriterion("rows_sent =", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotEqualTo(Integer value) {
            addCriterion("rows_sent <>", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThan(Integer value) {
            addCriterion("rows_sent >", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThanOrEqualTo(Integer value) {
            addCriterion("rows_sent >=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThan(Integer value) {
            addCriterion("rows_sent <", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThanOrEqualTo(Integer value) {
            addCriterion("rows_sent <=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentIn(List<Integer> values) {
            addCriterion("rows_sent in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotIn(List<Integer> values) {
            addCriterion("rows_sent not in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentBetween(Integer value1, Integer value2) {
            addCriterion("rows_sent between", value1, value2, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotBetween(Integer value1, Integer value2) {
            addCriterion("rows_sent not between", value1, value2, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIsNull() {
            addCriterion("rows_examined is null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIsNotNull() {
            addCriterion("rows_examined is not null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedEqualTo(Integer value) {
            addCriterion("rows_examined =", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotEqualTo(Integer value) {
            addCriterion("rows_examined <>", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedGreaterThan(Integer value) {
            addCriterion("rows_examined >", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedGreaterThanOrEqualTo(Integer value) {
            addCriterion("rows_examined >=", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedLessThan(Integer value) {
            addCriterion("rows_examined <", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedLessThanOrEqualTo(Integer value) {
            addCriterion("rows_examined <=", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIn(List<Integer> values) {
            addCriterion("rows_examined in", values, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotIn(List<Integer> values) {
            addCriterion("rows_examined not in", values, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedBetween(Integer value1, Integer value2) {
            addCriterion("rows_examined between", value1, value2, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotBetween(Integer value1, Integer value2) {
            addCriterion("rows_examined not between", value1, value2, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andDbIsNull() {
            addCriterion("db is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("db is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(String value) {
            addCriterion("db =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(String value) {
            addCriterion("db <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(String value) {
            addCriterion("db >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(String value) {
            addCriterion("db >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(String value) {
            addCriterion("db <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(String value) {
            addCriterion("db <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLike(String value) {
            addCriterion("db like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotLike(String value) {
            addCriterion("db not like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<String> values) {
            addCriterion("db in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<String> values) {
            addCriterion("db not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(String value1, String value2) {
            addCriterion("db between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(String value1, String value2) {
            addCriterion("db not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdIsNull() {
            addCriterion("last_insert_id is null");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdIsNotNull() {
            addCriterion("last_insert_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdEqualTo(Integer value) {
            addCriterion("last_insert_id =", value, "lastInsertId");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdNotEqualTo(Integer value) {
            addCriterion("last_insert_id <>", value, "lastInsertId");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdGreaterThan(Integer value) {
            addCriterion("last_insert_id >", value, "lastInsertId");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_insert_id >=", value, "lastInsertId");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdLessThan(Integer value) {
            addCriterion("last_insert_id <", value, "lastInsertId");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdLessThanOrEqualTo(Integer value) {
            addCriterion("last_insert_id <=", value, "lastInsertId");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdIn(List<Integer> values) {
            addCriterion("last_insert_id in", values, "lastInsertId");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdNotIn(List<Integer> values) {
            addCriterion("last_insert_id not in", values, "lastInsertId");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdBetween(Integer value1, Integer value2) {
            addCriterion("last_insert_id between", value1, value2, "lastInsertId");
            return (Criteria) this;
        }

        public Criteria andLastInsertIdNotBetween(Integer value1, Integer value2) {
            addCriterion("last_insert_id not between", value1, value2, "lastInsertId");
            return (Criteria) this;
        }

        public Criteria andInsertIdIsNull() {
            addCriterion("insert_id is null");
            return (Criteria) this;
        }

        public Criteria andInsertIdIsNotNull() {
            addCriterion("insert_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsertIdEqualTo(Integer value) {
            addCriterion("insert_id =", value, "insertId");
            return (Criteria) this;
        }

        public Criteria andInsertIdNotEqualTo(Integer value) {
            addCriterion("insert_id <>", value, "insertId");
            return (Criteria) this;
        }

        public Criteria andInsertIdGreaterThan(Integer value) {
            addCriterion("insert_id >", value, "insertId");
            return (Criteria) this;
        }

        public Criteria andInsertIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("insert_id >=", value, "insertId");
            return (Criteria) this;
        }

        public Criteria andInsertIdLessThan(Integer value) {
            addCriterion("insert_id <", value, "insertId");
            return (Criteria) this;
        }

        public Criteria andInsertIdLessThanOrEqualTo(Integer value) {
            addCriterion("insert_id <=", value, "insertId");
            return (Criteria) this;
        }

        public Criteria andInsertIdIn(List<Integer> values) {
            addCriterion("insert_id in", values, "insertId");
            return (Criteria) this;
        }

        public Criteria andInsertIdNotIn(List<Integer> values) {
            addCriterion("insert_id not in", values, "insertId");
            return (Criteria) this;
        }

        public Criteria andInsertIdBetween(Integer value1, Integer value2) {
            addCriterion("insert_id between", value1, value2, "insertId");
            return (Criteria) this;
        }

        public Criteria andInsertIdNotBetween(Integer value1, Integer value2) {
            addCriterion("insert_id not between", value1, value2, "insertId");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("server_id is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("server_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(Integer value) {
            addCriterion("server_id =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(Integer value) {
            addCriterion("server_id <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(Integer value) {
            addCriterion("server_id >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_id >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(Integer value) {
            addCriterion("server_id <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(Integer value) {
            addCriterion("server_id <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<Integer> values) {
            addCriterion("server_id in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<Integer> values) {
            addCriterion("server_id not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(Integer value1, Integer value2) {
            addCriterion("server_id between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("server_id not between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNull() {
            addCriterion("thread_id is null");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNotNull() {
            addCriterion("thread_id is not null");
            return (Criteria) this;
        }

        public Criteria andThreadIdEqualTo(Long value) {
            addCriterion("thread_id =", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotEqualTo(Long value) {
            addCriterion("thread_id <>", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThan(Long value) {
            addCriterion("thread_id >", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("thread_id >=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThan(Long value) {
            addCriterion("thread_id <", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("thread_id <=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIn(List<Long> values) {
            addCriterion("thread_id in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotIn(List<Long> values) {
            addCriterion("thread_id not in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdBetween(Long value1, Long value2) {
            addCriterion("thread_id between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("thread_id not between", value1, value2, "threadId");
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