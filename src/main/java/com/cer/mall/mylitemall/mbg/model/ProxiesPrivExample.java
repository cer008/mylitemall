package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProxiesPrivExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProxiesPrivExample() {
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

        public Criteria andProxiedHostIsNull() {
            addCriterion("Proxied_host is null");
            return (Criteria) this;
        }

        public Criteria andProxiedHostIsNotNull() {
            addCriterion("Proxied_host is not null");
            return (Criteria) this;
        }

        public Criteria andProxiedHostEqualTo(String value) {
            addCriterion("Proxied_host =", value, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedHostNotEqualTo(String value) {
            addCriterion("Proxied_host <>", value, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedHostGreaterThan(String value) {
            addCriterion("Proxied_host >", value, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedHostGreaterThanOrEqualTo(String value) {
            addCriterion("Proxied_host >=", value, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedHostLessThan(String value) {
            addCriterion("Proxied_host <", value, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedHostLessThanOrEqualTo(String value) {
            addCriterion("Proxied_host <=", value, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedHostLike(String value) {
            addCriterion("Proxied_host like", value, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedHostNotLike(String value) {
            addCriterion("Proxied_host not like", value, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedHostIn(List<String> values) {
            addCriterion("Proxied_host in", values, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedHostNotIn(List<String> values) {
            addCriterion("Proxied_host not in", values, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedHostBetween(String value1, String value2) {
            addCriterion("Proxied_host between", value1, value2, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedHostNotBetween(String value1, String value2) {
            addCriterion("Proxied_host not between", value1, value2, "proxiedHost");
            return (Criteria) this;
        }

        public Criteria andProxiedUserIsNull() {
            addCriterion("Proxied_user is null");
            return (Criteria) this;
        }

        public Criteria andProxiedUserIsNotNull() {
            addCriterion("Proxied_user is not null");
            return (Criteria) this;
        }

        public Criteria andProxiedUserEqualTo(String value) {
            addCriterion("Proxied_user =", value, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andProxiedUserNotEqualTo(String value) {
            addCriterion("Proxied_user <>", value, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andProxiedUserGreaterThan(String value) {
            addCriterion("Proxied_user >", value, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andProxiedUserGreaterThanOrEqualTo(String value) {
            addCriterion("Proxied_user >=", value, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andProxiedUserLessThan(String value) {
            addCriterion("Proxied_user <", value, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andProxiedUserLessThanOrEqualTo(String value) {
            addCriterion("Proxied_user <=", value, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andProxiedUserLike(String value) {
            addCriterion("Proxied_user like", value, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andProxiedUserNotLike(String value) {
            addCriterion("Proxied_user not like", value, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andProxiedUserIn(List<String> values) {
            addCriterion("Proxied_user in", values, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andProxiedUserNotIn(List<String> values) {
            addCriterion("Proxied_user not in", values, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andProxiedUserBetween(String value1, String value2) {
            addCriterion("Proxied_user between", value1, value2, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andProxiedUserNotBetween(String value1, String value2) {
            addCriterion("Proxied_user not between", value1, value2, "proxiedUser");
            return (Criteria) this;
        }

        public Criteria andWithGrantIsNull() {
            addCriterion("With_grant is null");
            return (Criteria) this;
        }

        public Criteria andWithGrantIsNotNull() {
            addCriterion("With_grant is not null");
            return (Criteria) this;
        }

        public Criteria andWithGrantEqualTo(Boolean value) {
            addCriterion("With_grant =", value, "withGrant");
            return (Criteria) this;
        }

        public Criteria andWithGrantNotEqualTo(Boolean value) {
            addCriterion("With_grant <>", value, "withGrant");
            return (Criteria) this;
        }

        public Criteria andWithGrantGreaterThan(Boolean value) {
            addCriterion("With_grant >", value, "withGrant");
            return (Criteria) this;
        }

        public Criteria andWithGrantGreaterThanOrEqualTo(Boolean value) {
            addCriterion("With_grant >=", value, "withGrant");
            return (Criteria) this;
        }

        public Criteria andWithGrantLessThan(Boolean value) {
            addCriterion("With_grant <", value, "withGrant");
            return (Criteria) this;
        }

        public Criteria andWithGrantLessThanOrEqualTo(Boolean value) {
            addCriterion("With_grant <=", value, "withGrant");
            return (Criteria) this;
        }

        public Criteria andWithGrantIn(List<Boolean> values) {
            addCriterion("With_grant in", values, "withGrant");
            return (Criteria) this;
        }

        public Criteria andWithGrantNotIn(List<Boolean> values) {
            addCriterion("With_grant not in", values, "withGrant");
            return (Criteria) this;
        }

        public Criteria andWithGrantBetween(Boolean value1, Boolean value2) {
            addCriterion("With_grant between", value1, value2, "withGrant");
            return (Criteria) this;
        }

        public Criteria andWithGrantNotBetween(Boolean value1, Boolean value2) {
            addCriterion("With_grant not between", value1, value2, "withGrant");
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