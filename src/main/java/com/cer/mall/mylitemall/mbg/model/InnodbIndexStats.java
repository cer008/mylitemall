package com.cer.mall.mylitemall.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class InnodbIndexStats implements Serializable {
    private String databaseName;

    private String tableName;

    private String indexName;

    private String statName;

    private Date lastUpdate;

    private Long statValue;

    private Long sampleSize;

    private String statDescription;

    private static final long serialVersionUID = 1L;

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getStatValue() {
        return statValue;
    }

    public void setStatValue(Long statValue) {
        this.statValue = statValue;
    }

    public Long getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(Long sampleSize) {
        this.sampleSize = sampleSize;
    }

    public String getStatDescription() {
        return statDescription;
    }

    public void setStatDescription(String statDescription) {
        this.statDescription = statDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", databaseName=").append(databaseName);
        sb.append(", tableName=").append(tableName);
        sb.append(", indexName=").append(indexName);
        sb.append(", statName=").append(statName);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append(", statValue=").append(statValue);
        sb.append(", sampleSize=").append(sampleSize);
        sb.append(", statDescription=").append(statDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}