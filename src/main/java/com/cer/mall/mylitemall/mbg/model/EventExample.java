package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDefinerIsNull() {
            addCriterion("definer is null");
            return (Criteria) this;
        }

        public Criteria andDefinerIsNotNull() {
            addCriterion("definer is not null");
            return (Criteria) this;
        }

        public Criteria andDefinerEqualTo(String value) {
            addCriterion("definer =", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerNotEqualTo(String value) {
            addCriterion("definer <>", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerGreaterThan(String value) {
            addCriterion("definer >", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerGreaterThanOrEqualTo(String value) {
            addCriterion("definer >=", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerLessThan(String value) {
            addCriterion("definer <", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerLessThanOrEqualTo(String value) {
            addCriterion("definer <=", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerLike(String value) {
            addCriterion("definer like", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerNotLike(String value) {
            addCriterion("definer not like", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerIn(List<String> values) {
            addCriterion("definer in", values, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerNotIn(List<String> values) {
            addCriterion("definer not in", values, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerBetween(String value1, String value2) {
            addCriterion("definer between", value1, value2, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerNotBetween(String value1, String value2) {
            addCriterion("definer not between", value1, value2, "definer");
            return (Criteria) this;
        }

        public Criteria andExecuteAtIsNull() {
            addCriterion("execute_at is null");
            return (Criteria) this;
        }

        public Criteria andExecuteAtIsNotNull() {
            addCriterion("execute_at is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteAtEqualTo(Date value) {
            addCriterion("execute_at =", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtNotEqualTo(Date value) {
            addCriterion("execute_at <>", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtGreaterThan(Date value) {
            addCriterion("execute_at >", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtGreaterThanOrEqualTo(Date value) {
            addCriterion("execute_at >=", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtLessThan(Date value) {
            addCriterion("execute_at <", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtLessThanOrEqualTo(Date value) {
            addCriterion("execute_at <=", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtIn(List<Date> values) {
            addCriterion("execute_at in", values, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtNotIn(List<Date> values) {
            addCriterion("execute_at not in", values, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtBetween(Date value1, Date value2) {
            addCriterion("execute_at between", value1, value2, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtNotBetween(Date value1, Date value2) {
            addCriterion("execute_at not between", value1, value2, "executeAt");
            return (Criteria) this;
        }

        public Criteria andIntervalValueIsNull() {
            addCriterion("interval_value is null");
            return (Criteria) this;
        }

        public Criteria andIntervalValueIsNotNull() {
            addCriterion("interval_value is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalValueEqualTo(Integer value) {
            addCriterion("interval_value =", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueNotEqualTo(Integer value) {
            addCriterion("interval_value <>", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueGreaterThan(Integer value) {
            addCriterion("interval_value >", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("interval_value >=", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueLessThan(Integer value) {
            addCriterion("interval_value <", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueLessThanOrEqualTo(Integer value) {
            addCriterion("interval_value <=", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueIn(List<Integer> values) {
            addCriterion("interval_value in", values, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueNotIn(List<Integer> values) {
            addCriterion("interval_value not in", values, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueBetween(Integer value1, Integer value2) {
            addCriterion("interval_value between", value1, value2, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueNotBetween(Integer value1, Integer value2) {
            addCriterion("interval_value not between", value1, value2, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldIsNull() {
            addCriterion("interval_field is null");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldIsNotNull() {
            addCriterion("interval_field is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldEqualTo(String value) {
            addCriterion("interval_field =", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldNotEqualTo(String value) {
            addCriterion("interval_field <>", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldGreaterThan(String value) {
            addCriterion("interval_field >", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldGreaterThanOrEqualTo(String value) {
            addCriterion("interval_field >=", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldLessThan(String value) {
            addCriterion("interval_field <", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldLessThanOrEqualTo(String value) {
            addCriterion("interval_field <=", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldLike(String value) {
            addCriterion("interval_field like", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldNotLike(String value) {
            addCriterion("interval_field not like", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldIn(List<String> values) {
            addCriterion("interval_field in", values, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldNotIn(List<String> values) {
            addCriterion("interval_field not in", values, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldBetween(String value1, String value2) {
            addCriterion("interval_field between", value1, value2, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldNotBetween(String value1, String value2) {
            addCriterion("interval_field not between", value1, value2, "intervalField");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Date value) {
            addCriterion("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Date value) {
            addCriterion("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Date value) {
            addCriterion("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Date value) {
            addCriterion("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Date value) {
            addCriterion("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Date> values) {
            addCriterion("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Date> values) {
            addCriterion("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Date value1, Date value2) {
            addCriterion("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Date value1, Date value2) {
            addCriterion("modified not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andLastExecutedIsNull() {
            addCriterion("last_executed is null");
            return (Criteria) this;
        }

        public Criteria andLastExecutedIsNotNull() {
            addCriterion("last_executed is not null");
            return (Criteria) this;
        }

        public Criteria andLastExecutedEqualTo(Date value) {
            addCriterion("last_executed =", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedNotEqualTo(Date value) {
            addCriterion("last_executed <>", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedGreaterThan(Date value) {
            addCriterion("last_executed >", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedGreaterThanOrEqualTo(Date value) {
            addCriterion("last_executed >=", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedLessThan(Date value) {
            addCriterion("last_executed <", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedLessThanOrEqualTo(Date value) {
            addCriterion("last_executed <=", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedIn(List<Date> values) {
            addCriterion("last_executed in", values, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedNotIn(List<Date> values) {
            addCriterion("last_executed not in", values, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedBetween(Date value1, Date value2) {
            addCriterion("last_executed between", value1, value2, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedNotBetween(Date value1, Date value2) {
            addCriterion("last_executed not between", value1, value2, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andStartsIsNull() {
            addCriterion("starts is null");
            return (Criteria) this;
        }

        public Criteria andStartsIsNotNull() {
            addCriterion("starts is not null");
            return (Criteria) this;
        }

        public Criteria andStartsEqualTo(Date value) {
            addCriterion("starts =", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsNotEqualTo(Date value) {
            addCriterion("starts <>", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsGreaterThan(Date value) {
            addCriterion("starts >", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsGreaterThanOrEqualTo(Date value) {
            addCriterion("starts >=", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsLessThan(Date value) {
            addCriterion("starts <", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsLessThanOrEqualTo(Date value) {
            addCriterion("starts <=", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsIn(List<Date> values) {
            addCriterion("starts in", values, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsNotIn(List<Date> values) {
            addCriterion("starts not in", values, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsBetween(Date value1, Date value2) {
            addCriterion("starts between", value1, value2, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsNotBetween(Date value1, Date value2) {
            addCriterion("starts not between", value1, value2, "starts");
            return (Criteria) this;
        }

        public Criteria andEndsIsNull() {
            addCriterion("ends is null");
            return (Criteria) this;
        }

        public Criteria andEndsIsNotNull() {
            addCriterion("ends is not null");
            return (Criteria) this;
        }

        public Criteria andEndsEqualTo(Date value) {
            addCriterion("ends =", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsNotEqualTo(Date value) {
            addCriterion("ends <>", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsGreaterThan(Date value) {
            addCriterion("ends >", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsGreaterThanOrEqualTo(Date value) {
            addCriterion("ends >=", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsLessThan(Date value) {
            addCriterion("ends <", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsLessThanOrEqualTo(Date value) {
            addCriterion("ends <=", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsIn(List<Date> values) {
            addCriterion("ends in", values, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsNotIn(List<Date> values) {
            addCriterion("ends not in", values, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsBetween(Date value1, Date value2) {
            addCriterion("ends between", value1, value2, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsNotBetween(Date value1, Date value2) {
            addCriterion("ends not between", value1, value2, "ends");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOnCompletionIsNull() {
            addCriterion("on_completion is null");
            return (Criteria) this;
        }

        public Criteria andOnCompletionIsNotNull() {
            addCriterion("on_completion is not null");
            return (Criteria) this;
        }

        public Criteria andOnCompletionEqualTo(String value) {
            addCriterion("on_completion =", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionNotEqualTo(String value) {
            addCriterion("on_completion <>", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionGreaterThan(String value) {
            addCriterion("on_completion >", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionGreaterThanOrEqualTo(String value) {
            addCriterion("on_completion >=", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionLessThan(String value) {
            addCriterion("on_completion <", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionLessThanOrEqualTo(String value) {
            addCriterion("on_completion <=", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionLike(String value) {
            addCriterion("on_completion like", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionNotLike(String value) {
            addCriterion("on_completion not like", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionIn(List<String> values) {
            addCriterion("on_completion in", values, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionNotIn(List<String> values) {
            addCriterion("on_completion not in", values, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionBetween(String value1, String value2) {
            addCriterion("on_completion between", value1, value2, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionNotBetween(String value1, String value2) {
            addCriterion("on_completion not between", value1, value2, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andSqlModeIsNull() {
            addCriterion("sql_mode is null");
            return (Criteria) this;
        }

        public Criteria andSqlModeIsNotNull() {
            addCriterion("sql_mode is not null");
            return (Criteria) this;
        }

        public Criteria andSqlModeEqualTo(String value) {
            addCriterion("sql_mode =", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeNotEqualTo(String value) {
            addCriterion("sql_mode <>", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeGreaterThan(String value) {
            addCriterion("sql_mode >", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeGreaterThanOrEqualTo(String value) {
            addCriterion("sql_mode >=", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeLessThan(String value) {
            addCriterion("sql_mode <", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeLessThanOrEqualTo(String value) {
            addCriterion("sql_mode <=", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeLike(String value) {
            addCriterion("sql_mode like", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeNotLike(String value) {
            addCriterion("sql_mode not like", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeIn(List<String> values) {
            addCriterion("sql_mode in", values, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeNotIn(List<String> values) {
            addCriterion("sql_mode not in", values, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeBetween(String value1, String value2) {
            addCriterion("sql_mode between", value1, value2, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeNotBetween(String value1, String value2) {
            addCriterion("sql_mode not between", value1, value2, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andOriginatorIsNull() {
            addCriterion("originator is null");
            return (Criteria) this;
        }

        public Criteria andOriginatorIsNotNull() {
            addCriterion("originator is not null");
            return (Criteria) this;
        }

        public Criteria andOriginatorEqualTo(Integer value) {
            addCriterion("originator =", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorNotEqualTo(Integer value) {
            addCriterion("originator <>", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorGreaterThan(Integer value) {
            addCriterion("originator >", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("originator >=", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorLessThan(Integer value) {
            addCriterion("originator <", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorLessThanOrEqualTo(Integer value) {
            addCriterion("originator <=", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorIn(List<Integer> values) {
            addCriterion("originator in", values, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorNotIn(List<Integer> values) {
            addCriterion("originator not in", values, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorBetween(Integer value1, Integer value2) {
            addCriterion("originator between", value1, value2, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorNotBetween(Integer value1, Integer value2) {
            addCriterion("originator not between", value1, value2, "originator");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIsNull() {
            addCriterion("time_zone is null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIsNotNull() {
            addCriterion("time_zone is not null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEqualTo(String value) {
            addCriterion("time_zone =", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotEqualTo(String value) {
            addCriterion("time_zone <>", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThan(String value) {
            addCriterion("time_zone >", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThanOrEqualTo(String value) {
            addCriterion("time_zone >=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThan(String value) {
            addCriterion("time_zone <", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThanOrEqualTo(String value) {
            addCriterion("time_zone <=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLike(String value) {
            addCriterion("time_zone like", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotLike(String value) {
            addCriterion("time_zone not like", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIn(List<String> values) {
            addCriterion("time_zone in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotIn(List<String> values) {
            addCriterion("time_zone not in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneBetween(String value1, String value2) {
            addCriterion("time_zone between", value1, value2, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotBetween(String value1, String value2) {
            addCriterion("time_zone not between", value1, value2, "timeZone");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientIsNull() {
            addCriterion("character_set_client is null");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientIsNotNull() {
            addCriterion("character_set_client is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientEqualTo(String value) {
            addCriterion("character_set_client =", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientNotEqualTo(String value) {
            addCriterion("character_set_client <>", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientGreaterThan(String value) {
            addCriterion("character_set_client >", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientGreaterThanOrEqualTo(String value) {
            addCriterion("character_set_client >=", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientLessThan(String value) {
            addCriterion("character_set_client <", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientLessThanOrEqualTo(String value) {
            addCriterion("character_set_client <=", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientLike(String value) {
            addCriterion("character_set_client like", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientNotLike(String value) {
            addCriterion("character_set_client not like", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientIn(List<String> values) {
            addCriterion("character_set_client in", values, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientNotIn(List<String> values) {
            addCriterion("character_set_client not in", values, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientBetween(String value1, String value2) {
            addCriterion("character_set_client between", value1, value2, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientNotBetween(String value1, String value2) {
            addCriterion("character_set_client not between", value1, value2, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionIsNull() {
            addCriterion("collation_connection is null");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionIsNotNull() {
            addCriterion("collation_connection is not null");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionEqualTo(String value) {
            addCriterion("collation_connection =", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionNotEqualTo(String value) {
            addCriterion("collation_connection <>", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionGreaterThan(String value) {
            addCriterion("collation_connection >", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionGreaterThanOrEqualTo(String value) {
            addCriterion("collation_connection >=", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionLessThan(String value) {
            addCriterion("collation_connection <", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionLessThanOrEqualTo(String value) {
            addCriterion("collation_connection <=", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionLike(String value) {
            addCriterion("collation_connection like", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionNotLike(String value) {
            addCriterion("collation_connection not like", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionIn(List<String> values) {
            addCriterion("collation_connection in", values, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionNotIn(List<String> values) {
            addCriterion("collation_connection not in", values, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionBetween(String value1, String value2) {
            addCriterion("collation_connection between", value1, value2, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionNotBetween(String value1, String value2) {
            addCriterion("collation_connection not between", value1, value2, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andDbCollationIsNull() {
            addCriterion("db_collation is null");
            return (Criteria) this;
        }

        public Criteria andDbCollationIsNotNull() {
            addCriterion("db_collation is not null");
            return (Criteria) this;
        }

        public Criteria andDbCollationEqualTo(String value) {
            addCriterion("db_collation =", value, "dbCollation");
            return (Criteria) this;
        }

        public Criteria andDbCollationNotEqualTo(String value) {
            addCriterion("db_collation <>", value, "dbCollation");
            return (Criteria) this;
        }

        public Criteria andDbCollationGreaterThan(String value) {
            addCriterion("db_collation >", value, "dbCollation");
            return (Criteria) this;
        }

        public Criteria andDbCollationGreaterThanOrEqualTo(String value) {
            addCriterion("db_collation >=", value, "dbCollation");
            return (Criteria) this;
        }

        public Criteria andDbCollationLessThan(String value) {
            addCriterion("db_collation <", value, "dbCollation");
            return (Criteria) this;
        }

        public Criteria andDbCollationLessThanOrEqualTo(String value) {
            addCriterion("db_collation <=", value, "dbCollation");
            return (Criteria) this;
        }

        public Criteria andDbCollationLike(String value) {
            addCriterion("db_collation like", value, "dbCollation");
            return (Criteria) this;
        }

        public Criteria andDbCollationNotLike(String value) {
            addCriterion("db_collation not like", value, "dbCollation");
            return (Criteria) this;
        }

        public Criteria andDbCollationIn(List<String> values) {
            addCriterion("db_collation in", values, "dbCollation");
            return (Criteria) this;
        }

        public Criteria andDbCollationNotIn(List<String> values) {
            addCriterion("db_collation not in", values, "dbCollation");
            return (Criteria) this;
        }

        public Criteria andDbCollationBetween(String value1, String value2) {
            addCriterion("db_collation between", value1, value2, "dbCollation");
            return (Criteria) this;
        }

        public Criteria andDbCollationNotBetween(String value1, String value2) {
            addCriterion("db_collation not between", value1, value2, "dbCollation");
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