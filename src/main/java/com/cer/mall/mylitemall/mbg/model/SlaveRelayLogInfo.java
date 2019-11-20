package com.cer.mall.mylitemall.mbg.model;

import java.io.Serializable;

public class SlaveRelayLogInfo implements Serializable {
    /**
     * Internal Id that uniquely identifies this record.
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * Number of lines in the file or rows in the table. Used to version table definitions.
     *
     * @mbggenerated
     */
    private Integer numberOfLines;

    /**
     * The relay log position of the last executed event.
     *
     * @mbggenerated
     */
    private Long relayLogPos;

    /**
     * The master log position of the last executed event.
     *
     * @mbggenerated
     */
    private Long masterLogPos;

    /**
     * The number of seconds that the slave must lag behind the master.
     *
     * @mbggenerated
     */
    private Integer sqlDelay;

    private Integer numberOfWorkers;

    /**
     * The name of the current relay log file.
     *
     * @mbggenerated
     */
    private String relayLogName;

    /**
     * The name of the master binary log file from which the events in the relay log file were read.
     *
     * @mbggenerated
     */
    private String masterLogName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public Long getRelayLogPos() {
        return relayLogPos;
    }

    public void setRelayLogPos(Long relayLogPos) {
        this.relayLogPos = relayLogPos;
    }

    public Long getMasterLogPos() {
        return masterLogPos;
    }

    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    public Integer getSqlDelay() {
        return sqlDelay;
    }

    public void setSqlDelay(Integer sqlDelay) {
        this.sqlDelay = sqlDelay;
    }

    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public String getRelayLogName() {
        return relayLogName;
    }

    public void setRelayLogName(String relayLogName) {
        this.relayLogName = relayLogName == null ? null : relayLogName.trim();
    }

    public String getMasterLogName() {
        return masterLogName;
    }

    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName == null ? null : masterLogName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", numberOfLines=").append(numberOfLines);
        sb.append(", relayLogPos=").append(relayLogPos);
        sb.append(", masterLogPos=").append(masterLogPos);
        sb.append(", sqlDelay=").append(sqlDelay);
        sb.append(", numberOfWorkers=").append(numberOfWorkers);
        sb.append(", relayLogName=").append(relayLogName);
        sb.append(", masterLogName=").append(masterLogName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}