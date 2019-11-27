package com.cer.mall.mylitemall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SlaveRelayLogInfo implements Serializable {
    @ApiModelProperty(value = "Internal Id that uniquely identifies this record.")
    private Integer id;

    @ApiModelProperty(value = "Number of lines in the file or rows in the table. Used to version table definitions.")
    private Integer numberOfLines;

    @ApiModelProperty(value = "The relay log position of the last executed event.")
    private Long relayLogPos;

    @ApiModelProperty(value = "The master log position of the last executed event.")
    private Long masterLogPos;

    @ApiModelProperty(value = "The number of seconds that the slave must lag behind the master.")
    private Integer sqlDelay;

    private Integer numberOfWorkers;

    @ApiModelProperty(value = "The name of the current relay log file.")
    private String relayLogName;

    @ApiModelProperty(value = "The name of the master binary log file from which the events in the relay log file were read.")
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