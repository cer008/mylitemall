package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InnodbIndexStatsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InnodbIndexStatsExample() {
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

        public Criteria andDatabaseNameIsNull() {
            addCriterion("database_name is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIsNotNull() {
            addCriterion("database_name is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameEqualTo(String value) {
            addCriterion("database_name =", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotEqualTo(String value) {
            addCriterion("database_name <>", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameGreaterThan(String value) {
            addCriterion("database_name >", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("database_name >=", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLessThan(String value) {
            addCriterion("database_name <", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLessThanOrEqualTo(String value) {
            addCriterion("database_name <=", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLike(String value) {
            addCriterion("database_name like", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotLike(String value) {
            addCriterion("database_name not like", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIn(List<String> values) {
            addCriterion("database_name in", values, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotIn(List<String> values) {
            addCriterion("database_name not in", values, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameBetween(String value1, String value2) {
            addCriterion("database_name between", value1, value2, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotBetween(String value1, String value2) {
            addCriterion("database_name not between", value1, value2, "databaseName");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNull() {
            addCriterion("index_name is null");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNotNull() {
            addCriterion("index_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndexNameEqualTo(String value) {
            addCriterion("index_name =", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotEqualTo(String value) {
            addCriterion("index_name <>", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThan(String value) {
            addCriterion("index_name >", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThanOrEqualTo(String value) {
            addCriterion("index_name >=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThan(String value) {
            addCriterion("index_name <", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThanOrEqualTo(String value) {
            addCriterion("index_name <=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLike(String value) {
            addCriterion("index_name like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotLike(String value) {
            addCriterion("index_name not like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameIn(List<String> values) {
            addCriterion("index_name in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotIn(List<String> values) {
            addCriterion("index_name not in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameBetween(String value1, String value2) {
            addCriterion("index_name between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotBetween(String value1, String value2) {
            addCriterion("index_name not between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andStatNameIsNull() {
            addCriterion("stat_name is null");
            return (Criteria) this;
        }

        public Criteria andStatNameIsNotNull() {
            addCriterion("stat_name is not null");
            return (Criteria) this;
        }

        public Criteria andStatNameEqualTo(String value) {
            addCriterion("stat_name =", value, "statName");
            return (Criteria) this;
        }

        public Criteria andStatNameNotEqualTo(String value) {
            addCriterion("stat_name <>", value, "statName");
            return (Criteria) this;
        }

        public Criteria andStatNameGreaterThan(String value) {
            addCriterion("stat_name >", value, "statName");
            return (Criteria) this;
        }

        public Criteria andStatNameGreaterThanOrEqualTo(String value) {
            addCriterion("stat_name >=", value, "statName");
            return (Criteria) this;
        }

        public Criteria andStatNameLessThan(String value) {
            addCriterion("stat_name <", value, "statName");
            return (Criteria) this;
        }

        public Criteria andStatNameLessThanOrEqualTo(String value) {
            addCriterion("stat_name <=", value, "statName");
            return (Criteria) this;
        }

        public Criteria andStatNameLike(String value) {
            addCriterion("stat_name like", value, "statName");
            return (Criteria) this;
        }

        public Criteria andStatNameNotLike(String value) {
            addCriterion("stat_name not like", value, "statName");
            return (Criteria) this;
        }

        public Criteria andStatNameIn(List<String> values) {
            addCriterion("stat_name in", values, "statName");
            return (Criteria) this;
        }

        public Criteria andStatNameNotIn(List<String> values) {
            addCriterion("stat_name not in", values, "statName");
            return (Criteria) this;
        }

        public Criteria andStatNameBetween(String value1, String value2) {
            addCriterion("stat_name between", value1, value2, "statName");
            return (Criteria) this;
        }

        public Criteria andStatNameNotBetween(String value1, String value2) {
            addCriterion("stat_name not between", value1, value2, "statName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andStatValueIsNull() {
            addCriterion("stat_value is null");
            return (Criteria) this;
        }

        public Criteria andStatValueIsNotNull() {
            addCriterion("stat_value is not null");
            return (Criteria) this;
        }

        public Criteria andStatValueEqualTo(Long value) {
            addCriterion("stat_value =", value, "statValue");
            return (Criteria) this;
        }

        public Criteria andStatValueNotEqualTo(Long value) {
            addCriterion("stat_value <>", value, "statValue");
            return (Criteria) this;
        }

        public Criteria andStatValueGreaterThan(Long value) {
            addCriterion("stat_value >", value, "statValue");
            return (Criteria) this;
        }

        public Criteria andStatValueGreaterThanOrEqualTo(Long value) {
            addCriterion("stat_value >=", value, "statValue");
            return (Criteria) this;
        }

        public Criteria andStatValueLessThan(Long value) {
            addCriterion("stat_value <", value, "statValue");
            return (Criteria) this;
        }

        public Criteria andStatValueLessThanOrEqualTo(Long value) {
            addCriterion("stat_value <=", value, "statValue");
            return (Criteria) this;
        }

        public Criteria andStatValueIn(List<Long> values) {
            addCriterion("stat_value in", values, "statValue");
            return (Criteria) this;
        }

        public Criteria andStatValueNotIn(List<Long> values) {
            addCriterion("stat_value not in", values, "statValue");
            return (Criteria) this;
        }

        public Criteria andStatValueBetween(Long value1, Long value2) {
            addCriterion("stat_value between", value1, value2, "statValue");
            return (Criteria) this;
        }

        public Criteria andStatValueNotBetween(Long value1, Long value2) {
            addCriterion("stat_value not between", value1, value2, "statValue");
            return (Criteria) this;
        }

        public Criteria andSampleSizeIsNull() {
            addCriterion("sample_size is null");
            return (Criteria) this;
        }

        public Criteria andSampleSizeIsNotNull() {
            addCriterion("sample_size is not null");
            return (Criteria) this;
        }

        public Criteria andSampleSizeEqualTo(Long value) {
            addCriterion("sample_size =", value, "sampleSize");
            return (Criteria) this;
        }

        public Criteria andSampleSizeNotEqualTo(Long value) {
            addCriterion("sample_size <>", value, "sampleSize");
            return (Criteria) this;
        }

        public Criteria andSampleSizeGreaterThan(Long value) {
            addCriterion("sample_size >", value, "sampleSize");
            return (Criteria) this;
        }

        public Criteria andSampleSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("sample_size >=", value, "sampleSize");
            return (Criteria) this;
        }

        public Criteria andSampleSizeLessThan(Long value) {
            addCriterion("sample_size <", value, "sampleSize");
            return (Criteria) this;
        }

        public Criteria andSampleSizeLessThanOrEqualTo(Long value) {
            addCriterion("sample_size <=", value, "sampleSize");
            return (Criteria) this;
        }

        public Criteria andSampleSizeIn(List<Long> values) {
            addCriterion("sample_size in", values, "sampleSize");
            return (Criteria) this;
        }

        public Criteria andSampleSizeNotIn(List<Long> values) {
            addCriterion("sample_size not in", values, "sampleSize");
            return (Criteria) this;
        }

        public Criteria andSampleSizeBetween(Long value1, Long value2) {
            addCriterion("sample_size between", value1, value2, "sampleSize");
            return (Criteria) this;
        }

        public Criteria andSampleSizeNotBetween(Long value1, Long value2) {
            addCriterion("sample_size not between", value1, value2, "sampleSize");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionIsNull() {
            addCriterion("stat_description is null");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionIsNotNull() {
            addCriterion("stat_description is not null");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionEqualTo(String value) {
            addCriterion("stat_description =", value, "statDescription");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionNotEqualTo(String value) {
            addCriterion("stat_description <>", value, "statDescription");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionGreaterThan(String value) {
            addCriterion("stat_description >", value, "statDescription");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("stat_description >=", value, "statDescription");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionLessThan(String value) {
            addCriterion("stat_description <", value, "statDescription");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionLessThanOrEqualTo(String value) {
            addCriterion("stat_description <=", value, "statDescription");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionLike(String value) {
            addCriterion("stat_description like", value, "statDescription");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionNotLike(String value) {
            addCriterion("stat_description not like", value, "statDescription");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionIn(List<String> values) {
            addCriterion("stat_description in", values, "statDescription");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionNotIn(List<String> values) {
            addCriterion("stat_description not in", values, "statDescription");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionBetween(String value1, String value2) {
            addCriterion("stat_description between", value1, value2, "statDescription");
            return (Criteria) this;
        }

        public Criteria andStatDescriptionNotBetween(String value1, String value2) {
            addCriterion("stat_description not between", value1, value2, "statDescription");
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