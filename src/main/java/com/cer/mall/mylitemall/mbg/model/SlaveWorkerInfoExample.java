package com.cer.mall.mylitemall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SlaveWorkerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlaveWorkerInfoExample() {
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

        public Criteria andCheckpointRelayLogPosIsNull() {
            addCriterion("Checkpoint_relay_log_pos is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointRelayLogPosIsNotNull() {
            addCriterion("Checkpoint_relay_log_pos is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointRelayLogPosEqualTo(Long value) {
            addCriterion("Checkpoint_relay_log_pos =", value, "checkpointRelayLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointRelayLogPosNotEqualTo(Long value) {
            addCriterion("Checkpoint_relay_log_pos <>", value, "checkpointRelayLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointRelayLogPosGreaterThan(Long value) {
            addCriterion("Checkpoint_relay_log_pos >", value, "checkpointRelayLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointRelayLogPosGreaterThanOrEqualTo(Long value) {
            addCriterion("Checkpoint_relay_log_pos >=", value, "checkpointRelayLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointRelayLogPosLessThan(Long value) {
            addCriterion("Checkpoint_relay_log_pos <", value, "checkpointRelayLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointRelayLogPosLessThanOrEqualTo(Long value) {
            addCriterion("Checkpoint_relay_log_pos <=", value, "checkpointRelayLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointRelayLogPosIn(List<Long> values) {
            addCriterion("Checkpoint_relay_log_pos in", values, "checkpointRelayLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointRelayLogPosNotIn(List<Long> values) {
            addCriterion("Checkpoint_relay_log_pos not in", values, "checkpointRelayLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointRelayLogPosBetween(Long value1, Long value2) {
            addCriterion("Checkpoint_relay_log_pos between", value1, value2, "checkpointRelayLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointRelayLogPosNotBetween(Long value1, Long value2) {
            addCriterion("Checkpoint_relay_log_pos not between", value1, value2, "checkpointRelayLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosIsNull() {
            addCriterion("Checkpoint_master_log_pos is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosIsNotNull() {
            addCriterion("Checkpoint_master_log_pos is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosEqualTo(Long value) {
            addCriterion("Checkpoint_master_log_pos =", value, "checkpointMasterLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosNotEqualTo(Long value) {
            addCriterion("Checkpoint_master_log_pos <>", value, "checkpointMasterLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosGreaterThan(Long value) {
            addCriterion("Checkpoint_master_log_pos >", value, "checkpointMasterLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosGreaterThanOrEqualTo(Long value) {
            addCriterion("Checkpoint_master_log_pos >=", value, "checkpointMasterLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosLessThan(Long value) {
            addCriterion("Checkpoint_master_log_pos <", value, "checkpointMasterLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosLessThanOrEqualTo(Long value) {
            addCriterion("Checkpoint_master_log_pos <=", value, "checkpointMasterLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosIn(List<Long> values) {
            addCriterion("Checkpoint_master_log_pos in", values, "checkpointMasterLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosNotIn(List<Long> values) {
            addCriterion("Checkpoint_master_log_pos not in", values, "checkpointMasterLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosBetween(Long value1, Long value2) {
            addCriterion("Checkpoint_master_log_pos between", value1, value2, "checkpointMasterLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointMasterLogPosNotBetween(Long value1, Long value2) {
            addCriterion("Checkpoint_master_log_pos not between", value1, value2, "checkpointMasterLogPos");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoIsNull() {
            addCriterion("Checkpoint_seqno is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoIsNotNull() {
            addCriterion("Checkpoint_seqno is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoEqualTo(Integer value) {
            addCriterion("Checkpoint_seqno =", value, "checkpointSeqno");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoNotEqualTo(Integer value) {
            addCriterion("Checkpoint_seqno <>", value, "checkpointSeqno");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoGreaterThan(Integer value) {
            addCriterion("Checkpoint_seqno >", value, "checkpointSeqno");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("Checkpoint_seqno >=", value, "checkpointSeqno");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoLessThan(Integer value) {
            addCriterion("Checkpoint_seqno <", value, "checkpointSeqno");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoLessThanOrEqualTo(Integer value) {
            addCriterion("Checkpoint_seqno <=", value, "checkpointSeqno");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoIn(List<Integer> values) {
            addCriterion("Checkpoint_seqno in", values, "checkpointSeqno");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoNotIn(List<Integer> values) {
            addCriterion("Checkpoint_seqno not in", values, "checkpointSeqno");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoBetween(Integer value1, Integer value2) {
            addCriterion("Checkpoint_seqno between", value1, value2, "checkpointSeqno");
            return (Criteria) this;
        }

        public Criteria andCheckpointSeqnoNotBetween(Integer value1, Integer value2) {
            addCriterion("Checkpoint_seqno not between", value1, value2, "checkpointSeqno");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeIsNull() {
            addCriterion("Checkpoint_group_size is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeIsNotNull() {
            addCriterion("Checkpoint_group_size is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeEqualTo(Integer value) {
            addCriterion("Checkpoint_group_size =", value, "checkpointGroupSize");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeNotEqualTo(Integer value) {
            addCriterion("Checkpoint_group_size <>", value, "checkpointGroupSize");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeGreaterThan(Integer value) {
            addCriterion("Checkpoint_group_size >", value, "checkpointGroupSize");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Checkpoint_group_size >=", value, "checkpointGroupSize");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeLessThan(Integer value) {
            addCriterion("Checkpoint_group_size <", value, "checkpointGroupSize");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeLessThanOrEqualTo(Integer value) {
            addCriterion("Checkpoint_group_size <=", value, "checkpointGroupSize");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeIn(List<Integer> values) {
            addCriterion("Checkpoint_group_size in", values, "checkpointGroupSize");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeNotIn(List<Integer> values) {
            addCriterion("Checkpoint_group_size not in", values, "checkpointGroupSize");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeBetween(Integer value1, Integer value2) {
            addCriterion("Checkpoint_group_size between", value1, value2, "checkpointGroupSize");
            return (Criteria) this;
        }

        public Criteria andCheckpointGroupSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("Checkpoint_group_size not between", value1, value2, "checkpointGroupSize");
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