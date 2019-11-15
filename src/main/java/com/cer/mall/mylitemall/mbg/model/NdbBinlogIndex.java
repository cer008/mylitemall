package com.cer.mall.mylitemall.mbg.model;

import java.io.Serializable;

public class NdbBinlogIndex implements Serializable {
    private Long epoch;

    private Integer origServerId;

    private Long origEpoch;

    private Long position;

    private String file;

    private Integer inserts;

    private Integer updates;

    private Integer deletes;

    private Integer schemaops;

    private Integer gci;

    private static final long serialVersionUID = 1L;

    public Long getEpoch() {
        return epoch;
    }

    public void setEpoch(Long epoch) {
        this.epoch = epoch;
    }

    public Integer getOrigServerId() {
        return origServerId;
    }

    public void setOrigServerId(Integer origServerId) {
        this.origServerId = origServerId;
    }

    public Long getOrigEpoch() {
        return origEpoch;
    }

    public void setOrigEpoch(Long origEpoch) {
        this.origEpoch = origEpoch;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Integer getInserts() {
        return inserts;
    }

    public void setInserts(Integer inserts) {
        this.inserts = inserts;
    }

    public Integer getUpdates() {
        return updates;
    }

    public void setUpdates(Integer updates) {
        this.updates = updates;
    }

    public Integer getDeletes() {
        return deletes;
    }

    public void setDeletes(Integer deletes) {
        this.deletes = deletes;
    }

    public Integer getSchemaops() {
        return schemaops;
    }

    public void setSchemaops(Integer schemaops) {
        this.schemaops = schemaops;
    }

    public Integer getGci() {
        return gci;
    }

    public void setGci(Integer gci) {
        this.gci = gci;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", epoch=").append(epoch);
        sb.append(", origServerId=").append(origServerId);
        sb.append(", origEpoch=").append(origEpoch);
        sb.append(", position=").append(position);
        sb.append(", file=").append(file);
        sb.append(", inserts=").append(inserts);
        sb.append(", updates=").append(updates);
        sb.append(", deletes=").append(deletes);
        sb.append(", schemaops=").append(schemaops);
        sb.append(", gci=").append(gci);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}