package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSpecificNameIsNull() {
            addCriterion("specific_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecificNameIsNotNull() {
            addCriterion("specific_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificNameEqualTo(String value) {
            addCriterion("specific_name =", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameNotEqualTo(String value) {
            addCriterion("specific_name <>", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameGreaterThan(String value) {
            addCriterion("specific_name >", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameGreaterThanOrEqualTo(String value) {
            addCriterion("specific_name >=", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameLessThan(String value) {
            addCriterion("specific_name <", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameLessThanOrEqualTo(String value) {
            addCriterion("specific_name <=", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameLike(String value) {
            addCriterion("specific_name like", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameNotLike(String value) {
            addCriterion("specific_name not like", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameIn(List<String> values) {
            addCriterion("specific_name in", values, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameNotIn(List<String> values) {
            addCriterion("specific_name not in", values, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameBetween(String value1, String value2) {
            addCriterion("specific_name between", value1, value2, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameNotBetween(String value1, String value2) {
            addCriterion("specific_name not between", value1, value2, "specificName");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessIsNull() {
            addCriterion("sql_data_access is null");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessIsNotNull() {
            addCriterion("sql_data_access is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessEqualTo(String value) {
            addCriterion("sql_data_access =", value, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessNotEqualTo(String value) {
            addCriterion("sql_data_access <>", value, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessGreaterThan(String value) {
            addCriterion("sql_data_access >", value, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessGreaterThanOrEqualTo(String value) {
            addCriterion("sql_data_access >=", value, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessLessThan(String value) {
            addCriterion("sql_data_access <", value, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessLessThanOrEqualTo(String value) {
            addCriterion("sql_data_access <=", value, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessLike(String value) {
            addCriterion("sql_data_access like", value, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessNotLike(String value) {
            addCriterion("sql_data_access not like", value, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessIn(List<String> values) {
            addCriterion("sql_data_access in", values, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessNotIn(List<String> values) {
            addCriterion("sql_data_access not in", values, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessBetween(String value1, String value2) {
            addCriterion("sql_data_access between", value1, value2, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andSqlDataAccessNotBetween(String value1, String value2) {
            addCriterion("sql_data_access not between", value1, value2, "sqlDataAccess");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicIsNull() {
            addCriterion("is_deterministic is null");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicIsNotNull() {
            addCriterion("is_deterministic is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicEqualTo(String value) {
            addCriterion("is_deterministic =", value, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicNotEqualTo(String value) {
            addCriterion("is_deterministic <>", value, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicGreaterThan(String value) {
            addCriterion("is_deterministic >", value, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicGreaterThanOrEqualTo(String value) {
            addCriterion("is_deterministic >=", value, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicLessThan(String value) {
            addCriterion("is_deterministic <", value, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicLessThanOrEqualTo(String value) {
            addCriterion("is_deterministic <=", value, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicLike(String value) {
            addCriterion("is_deterministic like", value, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicNotLike(String value) {
            addCriterion("is_deterministic not like", value, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicIn(List<String> values) {
            addCriterion("is_deterministic in", values, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicNotIn(List<String> values) {
            addCriterion("is_deterministic not in", values, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicBetween(String value1, String value2) {
            addCriterion("is_deterministic between", value1, value2, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andIsDeterministicNotBetween(String value1, String value2) {
            addCriterion("is_deterministic not between", value1, value2, "isDeterministic");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeIsNull() {
            addCriterion("security_type is null");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeIsNotNull() {
            addCriterion("security_type is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeEqualTo(String value) {
            addCriterion("security_type =", value, "securityType");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeNotEqualTo(String value) {
            addCriterion("security_type <>", value, "securityType");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeGreaterThan(String value) {
            addCriterion("security_type >", value, "securityType");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("security_type >=", value, "securityType");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeLessThan(String value) {
            addCriterion("security_type <", value, "securityType");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeLessThanOrEqualTo(String value) {
            addCriterion("security_type <=", value, "securityType");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeLike(String value) {
            addCriterion("security_type like", value, "securityType");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeNotLike(String value) {
            addCriterion("security_type not like", value, "securityType");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeIn(List<String> values) {
            addCriterion("security_type in", values, "securityType");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeNotIn(List<String> values) {
            addCriterion("security_type not in", values, "securityType");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeBetween(String value1, String value2) {
            addCriterion("security_type between", value1, value2, "securityType");
            return (Criteria) this;
        }

        public Criteria andSecurityTypeNotBetween(String value1, String value2) {
            addCriterion("security_type not between", value1, value2, "securityType");
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