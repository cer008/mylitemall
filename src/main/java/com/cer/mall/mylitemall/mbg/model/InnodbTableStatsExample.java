package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InnodbTableStatsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InnodbTableStatsExample() {
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

        public Criteria andNRowsIsNull() {
            addCriterion("n_rows is null");
            return (Criteria) this;
        }

        public Criteria andNRowsIsNotNull() {
            addCriterion("n_rows is not null");
            return (Criteria) this;
        }

        public Criteria andNRowsEqualTo(Long value) {
            addCriterion("n_rows =", value, "nRows");
            return (Criteria) this;
        }

        public Criteria andNRowsNotEqualTo(Long value) {
            addCriterion("n_rows <>", value, "nRows");
            return (Criteria) this;
        }

        public Criteria andNRowsGreaterThan(Long value) {
            addCriterion("n_rows >", value, "nRows");
            return (Criteria) this;
        }

        public Criteria andNRowsGreaterThanOrEqualTo(Long value) {
            addCriterion("n_rows >=", value, "nRows");
            return (Criteria) this;
        }

        public Criteria andNRowsLessThan(Long value) {
            addCriterion("n_rows <", value, "nRows");
            return (Criteria) this;
        }

        public Criteria andNRowsLessThanOrEqualTo(Long value) {
            addCriterion("n_rows <=", value, "nRows");
            return (Criteria) this;
        }

        public Criteria andNRowsIn(List<Long> values) {
            addCriterion("n_rows in", values, "nRows");
            return (Criteria) this;
        }

        public Criteria andNRowsNotIn(List<Long> values) {
            addCriterion("n_rows not in", values, "nRows");
            return (Criteria) this;
        }

        public Criteria andNRowsBetween(Long value1, Long value2) {
            addCriterion("n_rows between", value1, value2, "nRows");
            return (Criteria) this;
        }

        public Criteria andNRowsNotBetween(Long value1, Long value2) {
            addCriterion("n_rows not between", value1, value2, "nRows");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeIsNull() {
            addCriterion("clustered_index_size is null");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeIsNotNull() {
            addCriterion("clustered_index_size is not null");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeEqualTo(Long value) {
            addCriterion("clustered_index_size =", value, "clusteredIndexSize");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeNotEqualTo(Long value) {
            addCriterion("clustered_index_size <>", value, "clusteredIndexSize");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeGreaterThan(Long value) {
            addCriterion("clustered_index_size >", value, "clusteredIndexSize");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("clustered_index_size >=", value, "clusteredIndexSize");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeLessThan(Long value) {
            addCriterion("clustered_index_size <", value, "clusteredIndexSize");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeLessThanOrEqualTo(Long value) {
            addCriterion("clustered_index_size <=", value, "clusteredIndexSize");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeIn(List<Long> values) {
            addCriterion("clustered_index_size in", values, "clusteredIndexSize");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeNotIn(List<Long> values) {
            addCriterion("clustered_index_size not in", values, "clusteredIndexSize");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeBetween(Long value1, Long value2) {
            addCriterion("clustered_index_size between", value1, value2, "clusteredIndexSize");
            return (Criteria) this;
        }

        public Criteria andClusteredIndexSizeNotBetween(Long value1, Long value2) {
            addCriterion("clustered_index_size not between", value1, value2, "clusteredIndexSize");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesIsNull() {
            addCriterion("sum_of_other_index_sizes is null");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesIsNotNull() {
            addCriterion("sum_of_other_index_sizes is not null");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesEqualTo(Long value) {
            addCriterion("sum_of_other_index_sizes =", value, "sumOfOtherIndexSizes");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesNotEqualTo(Long value) {
            addCriterion("sum_of_other_index_sizes <>", value, "sumOfOtherIndexSizes");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesGreaterThan(Long value) {
            addCriterion("sum_of_other_index_sizes >", value, "sumOfOtherIndexSizes");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesGreaterThanOrEqualTo(Long value) {
            addCriterion("sum_of_other_index_sizes >=", value, "sumOfOtherIndexSizes");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesLessThan(Long value) {
            addCriterion("sum_of_other_index_sizes <", value, "sumOfOtherIndexSizes");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesLessThanOrEqualTo(Long value) {
            addCriterion("sum_of_other_index_sizes <=", value, "sumOfOtherIndexSizes");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesIn(List<Long> values) {
            addCriterion("sum_of_other_index_sizes in", values, "sumOfOtherIndexSizes");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesNotIn(List<Long> values) {
            addCriterion("sum_of_other_index_sizes not in", values, "sumOfOtherIndexSizes");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesBetween(Long value1, Long value2) {
            addCriterion("sum_of_other_index_sizes between", value1, value2, "sumOfOtherIndexSizes");
            return (Criteria) this;
        }

        public Criteria andSumOfOtherIndexSizesNotBetween(Long value1, Long value2) {
            addCriterion("sum_of_other_index_sizes not between", value1, value2, "sumOfOtherIndexSizes");
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