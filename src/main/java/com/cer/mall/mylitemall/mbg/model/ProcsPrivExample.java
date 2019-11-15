package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcsPrivExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcsPrivExample() {
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

        public Criteria andHostIsNull() {
            addCriterion("Host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("Host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("Host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("Host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("Host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("Host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("Host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("Host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("Host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("Host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("Host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("Host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("Host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("Host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andDbIsNull() {
            addCriterion("Db is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("Db is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(String value) {
            addCriterion("Db =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(String value) {
            addCriterion("Db <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(String value) {
            addCriterion("Db >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(String value) {
            addCriterion("Db >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(String value) {
            addCriterion("Db <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(String value) {
            addCriterion("Db <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLike(String value) {
            addCriterion("Db like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotLike(String value) {
            addCriterion("Db not like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<String> values) {
            addCriterion("Db in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<String> values) {
            addCriterion("Db not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(String value1, String value2) {
            addCriterion("Db between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(String value1, String value2) {
            addCriterion("Db not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("User is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("User is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("User =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("User <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("User >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("User >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("User <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("User <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("User like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("User not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("User in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("User not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("User between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("User not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andRoutineNameIsNull() {
            addCriterion("Routine_name is null");
            return (Criteria) this;
        }

        public Criteria andRoutineNameIsNotNull() {
            addCriterion("Routine_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoutineNameEqualTo(String value) {
            addCriterion("Routine_name =", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameNotEqualTo(String value) {
            addCriterion("Routine_name <>", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameGreaterThan(String value) {
            addCriterion("Routine_name >", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameGreaterThanOrEqualTo(String value) {
            addCriterion("Routine_name >=", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameLessThan(String value) {
            addCriterion("Routine_name <", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameLessThanOrEqualTo(String value) {
            addCriterion("Routine_name <=", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameLike(String value) {
            addCriterion("Routine_name like", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameNotLike(String value) {
            addCriterion("Routine_name not like", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameIn(List<String> values) {
            addCriterion("Routine_name in", values, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameNotIn(List<String> values) {
            addCriterion("Routine_name not in", values, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameBetween(String value1, String value2) {
            addCriterion("Routine_name between", value1, value2, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameNotBetween(String value1, String value2) {
            addCriterion("Routine_name not between", value1, value2, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeIsNull() {
            addCriterion("Routine_type is null");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeIsNotNull() {
            addCriterion("Routine_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeEqualTo(String value) {
            addCriterion("Routine_type =", value, "routineType");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeNotEqualTo(String value) {
            addCriterion("Routine_type <>", value, "routineType");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeGreaterThan(String value) {
            addCriterion("Routine_type >", value, "routineType");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Routine_type >=", value, "routineType");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeLessThan(String value) {
            addCriterion("Routine_type <", value, "routineType");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeLessThanOrEqualTo(String value) {
            addCriterion("Routine_type <=", value, "routineType");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeLike(String value) {
            addCriterion("Routine_type like", value, "routineType");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeNotLike(String value) {
            addCriterion("Routine_type not like", value, "routineType");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeIn(List<String> values) {
            addCriterion("Routine_type in", values, "routineType");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeNotIn(List<String> values) {
            addCriterion("Routine_type not in", values, "routineType");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeBetween(String value1, String value2) {
            addCriterion("Routine_type between", value1, value2, "routineType");
            return (Criteria) this;
        }

        public Criteria andRoutineTypeNotBetween(String value1, String value2) {
            addCriterion("Routine_type not between", value1, value2, "routineType");
            return (Criteria) this;
        }

        public Criteria andGrantorIsNull() {
            addCriterion("Grantor is null");
            return (Criteria) this;
        }

        public Criteria andGrantorIsNotNull() {
            addCriterion("Grantor is not null");
            return (Criteria) this;
        }

        public Criteria andGrantorEqualTo(String value) {
            addCriterion("Grantor =", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotEqualTo(String value) {
            addCriterion("Grantor <>", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorGreaterThan(String value) {
            addCriterion("Grantor >", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorGreaterThanOrEqualTo(String value) {
            addCriterion("Grantor >=", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorLessThan(String value) {
            addCriterion("Grantor <", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorLessThanOrEqualTo(String value) {
            addCriterion("Grantor <=", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorLike(String value) {
            addCriterion("Grantor like", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotLike(String value) {
            addCriterion("Grantor not like", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorIn(List<String> values) {
            addCriterion("Grantor in", values, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotIn(List<String> values) {
            addCriterion("Grantor not in", values, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorBetween(String value1, String value2) {
            addCriterion("Grantor between", value1, value2, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotBetween(String value1, String value2) {
            addCriterion("Grantor not between", value1, value2, "grantor");
            return (Criteria) this;
        }

        public Criteria andProcPrivIsNull() {
            addCriterion("Proc_priv is null");
            return (Criteria) this;
        }

        public Criteria andProcPrivIsNotNull() {
            addCriterion("Proc_priv is not null");
            return (Criteria) this;
        }

        public Criteria andProcPrivEqualTo(String value) {
            addCriterion("Proc_priv =", value, "procPriv");
            return (Criteria) this;
        }

        public Criteria andProcPrivNotEqualTo(String value) {
            addCriterion("Proc_priv <>", value, "procPriv");
            return (Criteria) this;
        }

        public Criteria andProcPrivGreaterThan(String value) {
            addCriterion("Proc_priv >", value, "procPriv");
            return (Criteria) this;
        }

        public Criteria andProcPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Proc_priv >=", value, "procPriv");
            return (Criteria) this;
        }

        public Criteria andProcPrivLessThan(String value) {
            addCriterion("Proc_priv <", value, "procPriv");
            return (Criteria) this;
        }

        public Criteria andProcPrivLessThanOrEqualTo(String value) {
            addCriterion("Proc_priv <=", value, "procPriv");
            return (Criteria) this;
        }

        public Criteria andProcPrivLike(String value) {
            addCriterion("Proc_priv like", value, "procPriv");
            return (Criteria) this;
        }

        public Criteria andProcPrivNotLike(String value) {
            addCriterion("Proc_priv not like", value, "procPriv");
            return (Criteria) this;
        }

        public Criteria andProcPrivIn(List<String> values) {
            addCriterion("Proc_priv in", values, "procPriv");
            return (Criteria) this;
        }

        public Criteria andProcPrivNotIn(List<String> values) {
            addCriterion("Proc_priv not in", values, "procPriv");
            return (Criteria) this;
        }

        public Criteria andProcPrivBetween(String value1, String value2) {
            addCriterion("Proc_priv between", value1, value2, "procPriv");
            return (Criteria) this;
        }

        public Criteria andProcPrivNotBetween(String value1, String value2) {
            addCriterion("Proc_priv not between", value1, value2, "procPriv");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("Timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("Timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("Timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("Timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("Timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("Timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("Timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("Timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("Timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("Timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("Timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("Timestamp not between", value1, value2, "timestamp");
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