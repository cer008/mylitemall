package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SlaveMasterInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlaveMasterInfoExample() {
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

        public Criteria andPortIsNull() {
            addCriterion("Port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("Port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("Port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("Port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("Port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("Port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("Port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("Port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("Port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("Port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("Port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("Port not between", value1, value2, "port");
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

        public Criteria andConnectRetryIsNull() {
            addCriterion("Connect_retry is null");
            return (Criteria) this;
        }

        public Criteria andConnectRetryIsNotNull() {
            addCriterion("Connect_retry is not null");
            return (Criteria) this;
        }

        public Criteria andConnectRetryEqualTo(Integer value) {
            addCriterion("Connect_retry =", value, "connectRetry");
            return (Criteria) this;
        }

        public Criteria andConnectRetryNotEqualTo(Integer value) {
            addCriterion("Connect_retry <>", value, "connectRetry");
            return (Criteria) this;
        }

        public Criteria andConnectRetryGreaterThan(Integer value) {
            addCriterion("Connect_retry >", value, "connectRetry");
            return (Criteria) this;
        }

        public Criteria andConnectRetryGreaterThanOrEqualTo(Integer value) {
            addCriterion("Connect_retry >=", value, "connectRetry");
            return (Criteria) this;
        }

        public Criteria andConnectRetryLessThan(Integer value) {
            addCriterion("Connect_retry <", value, "connectRetry");
            return (Criteria) this;
        }

        public Criteria andConnectRetryLessThanOrEqualTo(Integer value) {
            addCriterion("Connect_retry <=", value, "connectRetry");
            return (Criteria) this;
        }

        public Criteria andConnectRetryIn(List<Integer> values) {
            addCriterion("Connect_retry in", values, "connectRetry");
            return (Criteria) this;
        }

        public Criteria andConnectRetryNotIn(List<Integer> values) {
            addCriterion("Connect_retry not in", values, "connectRetry");
            return (Criteria) this;
        }

        public Criteria andConnectRetryBetween(Integer value1, Integer value2) {
            addCriterion("Connect_retry between", value1, value2, "connectRetry");
            return (Criteria) this;
        }

        public Criteria andConnectRetryNotBetween(Integer value1, Integer value2) {
            addCriterion("Connect_retry not between", value1, value2, "connectRetry");
            return (Criteria) this;
        }

        public Criteria andEnabledSslIsNull() {
            addCriterion("Enabled_ssl is null");
            return (Criteria) this;
        }

        public Criteria andEnabledSslIsNotNull() {
            addCriterion("Enabled_ssl is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledSslEqualTo(Boolean value) {
            addCriterion("Enabled_ssl =", value, "enabledSsl");
            return (Criteria) this;
        }

        public Criteria andEnabledSslNotEqualTo(Boolean value) {
            addCriterion("Enabled_ssl <>", value, "enabledSsl");
            return (Criteria) this;
        }

        public Criteria andEnabledSslGreaterThan(Boolean value) {
            addCriterion("Enabled_ssl >", value, "enabledSsl");
            return (Criteria) this;
        }

        public Criteria andEnabledSslGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Enabled_ssl >=", value, "enabledSsl");
            return (Criteria) this;
        }

        public Criteria andEnabledSslLessThan(Boolean value) {
            addCriterion("Enabled_ssl <", value, "enabledSsl");
            return (Criteria) this;
        }

        public Criteria andEnabledSslLessThanOrEqualTo(Boolean value) {
            addCriterion("Enabled_ssl <=", value, "enabledSsl");
            return (Criteria) this;
        }

        public Criteria andEnabledSslIn(List<Boolean> values) {
            addCriterion("Enabled_ssl in", values, "enabledSsl");
            return (Criteria) this;
        }

        public Criteria andEnabledSslNotIn(List<Boolean> values) {
            addCriterion("Enabled_ssl not in", values, "enabledSsl");
            return (Criteria) this;
        }

        public Criteria andEnabledSslBetween(Boolean value1, Boolean value2) {
            addCriterion("Enabled_ssl between", value1, value2, "enabledSsl");
            return (Criteria) this;
        }

        public Criteria andEnabledSslNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Enabled_ssl not between", value1, value2, "enabledSsl");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertIsNull() {
            addCriterion("Ssl_verify_server_cert is null");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertIsNotNull() {
            addCriterion("Ssl_verify_server_cert is not null");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertEqualTo(Boolean value) {
            addCriterion("Ssl_verify_server_cert =", value, "sslVerifyServerCert");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertNotEqualTo(Boolean value) {
            addCriterion("Ssl_verify_server_cert <>", value, "sslVerifyServerCert");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertGreaterThan(Boolean value) {
            addCriterion("Ssl_verify_server_cert >", value, "sslVerifyServerCert");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Ssl_verify_server_cert >=", value, "sslVerifyServerCert");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertLessThan(Boolean value) {
            addCriterion("Ssl_verify_server_cert <", value, "sslVerifyServerCert");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertLessThanOrEqualTo(Boolean value) {
            addCriterion("Ssl_verify_server_cert <=", value, "sslVerifyServerCert");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertIn(List<Boolean> values) {
            addCriterion("Ssl_verify_server_cert in", values, "sslVerifyServerCert");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertNotIn(List<Boolean> values) {
            addCriterion("Ssl_verify_server_cert not in", values, "sslVerifyServerCert");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertBetween(Boolean value1, Boolean value2) {
            addCriterion("Ssl_verify_server_cert between", value1, value2, "sslVerifyServerCert");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Ssl_verify_server_cert not between", value1, value2, "sslVerifyServerCert");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIsNull() {
            addCriterion("Heartbeat is null");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIsNotNull() {
            addCriterion("Heartbeat is not null");
            return (Criteria) this;
        }

        public Criteria andHeartbeatEqualTo(Float value) {
            addCriterion("Heartbeat =", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatNotEqualTo(Float value) {
            addCriterion("Heartbeat <>", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatGreaterThan(Float value) {
            addCriterion("Heartbeat >", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatGreaterThanOrEqualTo(Float value) {
            addCriterion("Heartbeat >=", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatLessThan(Float value) {
            addCriterion("Heartbeat <", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatLessThanOrEqualTo(Float value) {
            addCriterion("Heartbeat <=", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIn(List<Float> values) {
            addCriterion("Heartbeat in", values, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatNotIn(List<Float> values) {
            addCriterion("Heartbeat not in", values, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatBetween(Float value1, Float value2) {
            addCriterion("Heartbeat between", value1, value2, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatNotBetween(Float value1, Float value2) {
            addCriterion("Heartbeat not between", value1, value2, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andRetryCountIsNull() {
            addCriterion("Retry_count is null");
            return (Criteria) this;
        }

        public Criteria andRetryCountIsNotNull() {
            addCriterion("Retry_count is not null");
            return (Criteria) this;
        }

        public Criteria andRetryCountEqualTo(Long value) {
            addCriterion("Retry_count =", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountNotEqualTo(Long value) {
            addCriterion("Retry_count <>", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountGreaterThan(Long value) {
            addCriterion("Retry_count >", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountGreaterThanOrEqualTo(Long value) {
            addCriterion("Retry_count >=", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountLessThan(Long value) {
            addCriterion("Retry_count <", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountLessThanOrEqualTo(Long value) {
            addCriterion("Retry_count <=", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountIn(List<Long> values) {
            addCriterion("Retry_count in", values, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountNotIn(List<Long> values) {
            addCriterion("Retry_count not in", values, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountBetween(Long value1, Long value2) {
            addCriterion("Retry_count between", value1, value2, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountNotBetween(Long value1, Long value2) {
            addCriterion("Retry_count not between", value1, value2, "retryCount");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionIsNull() {
            addCriterion("Enabled_auto_position is null");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionIsNotNull() {
            addCriterion("Enabled_auto_position is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionEqualTo(Boolean value) {
            addCriterion("Enabled_auto_position =", value, "enabledAutoPosition");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionNotEqualTo(Boolean value) {
            addCriterion("Enabled_auto_position <>", value, "enabledAutoPosition");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionGreaterThan(Boolean value) {
            addCriterion("Enabled_auto_position >", value, "enabledAutoPosition");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Enabled_auto_position >=", value, "enabledAutoPosition");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionLessThan(Boolean value) {
            addCriterion("Enabled_auto_position <", value, "enabledAutoPosition");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionLessThanOrEqualTo(Boolean value) {
            addCriterion("Enabled_auto_position <=", value, "enabledAutoPosition");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionIn(List<Boolean> values) {
            addCriterion("Enabled_auto_position in", values, "enabledAutoPosition");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionNotIn(List<Boolean> values) {
            addCriterion("Enabled_auto_position not in", values, "enabledAutoPosition");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionBetween(Boolean value1, Boolean value2) {
            addCriterion("Enabled_auto_position between", value1, value2, "enabledAutoPosition");
            return (Criteria) this;
        }

        public Criteria andEnabledAutoPositionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Enabled_auto_position not between", value1, value2, "enabledAutoPosition");
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