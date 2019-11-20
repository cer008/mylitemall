package com.cer.mall.mylitemall.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {
    private String db;

    private String name;

    private String definer;

    private Date executeAt;

    private Integer intervalValue;

    private String intervalField;

    private Date created;

    private Date modified;

    private Date lastExecuted;

    private Date starts;

    private Date ends;

    private String status;

    private String onCompletion;

    private String sqlMode;

    private String comment;

    private Integer originator;

    private String timeZone;

    private String characterSetClient;

    private String collationConnection;

    private String dbCollation;

    private byte[] body;

    private byte[] bodyUtf8;

    private static final long serialVersionUID = 1L;

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer == null ? null : definer.trim();
    }

    public Date getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(Date executeAt) {
        this.executeAt = executeAt;
    }

    public Integer getIntervalValue() {
        return intervalValue;
    }

    public void setIntervalValue(Integer intervalValue) {
        this.intervalValue = intervalValue;
    }

    public String getIntervalField() {
        return intervalField;
    }

    public void setIntervalField(String intervalField) {
        this.intervalField = intervalField == null ? null : intervalField.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getLastExecuted() {
        return lastExecuted;
    }

    public void setLastExecuted(Date lastExecuted) {
        this.lastExecuted = lastExecuted;
    }

    public Date getStarts() {
        return starts;
    }

    public void setStarts(Date starts) {
        this.starts = starts;
    }

    public Date getEnds() {
        return ends;
    }

    public void setEnds(Date ends) {
        this.ends = ends;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOnCompletion() {
        return onCompletion;
    }

    public void setOnCompletion(String onCompletion) {
        this.onCompletion = onCompletion == null ? null : onCompletion.trim();
    }

    public String getSqlMode() {
        return sqlMode;
    }

    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode == null ? null : sqlMode.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getOriginator() {
        return originator;
    }

    public void setOriginator(Integer originator) {
        this.originator = originator;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone == null ? null : timeZone.trim();
    }

    public String getCharacterSetClient() {
        return characterSetClient;
    }

    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient == null ? null : characterSetClient.trim();
    }

    public String getCollationConnection() {
        return collationConnection;
    }

    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection == null ? null : collationConnection.trim();
    }

    public String getDbCollation() {
        return dbCollation;
    }

    public void setDbCollation(String dbCollation) {
        this.dbCollation = dbCollation == null ? null : dbCollation.trim();
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public byte[] getBodyUtf8() {
        return bodyUtf8;
    }

    public void setBodyUtf8(byte[] bodyUtf8) {
        this.bodyUtf8 = bodyUtf8;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", db=").append(db);
        sb.append(", name=").append(name);
        sb.append(", definer=").append(definer);
        sb.append(", executeAt=").append(executeAt);
        sb.append(", intervalValue=").append(intervalValue);
        sb.append(", intervalField=").append(intervalField);
        sb.append(", created=").append(created);
        sb.append(", modified=").append(modified);
        sb.append(", lastExecuted=").append(lastExecuted);
        sb.append(", starts=").append(starts);
        sb.append(", ends=").append(ends);
        sb.append(", status=").append(status);
        sb.append(", onCompletion=").append(onCompletion);
        sb.append(", sqlMode=").append(sqlMode);
        sb.append(", comment=").append(comment);
        sb.append(", originator=").append(originator);
        sb.append(", timeZone=").append(timeZone);
        sb.append(", characterSetClient=").append(characterSetClient);
        sb.append(", collationConnection=").append(collationConnection);
        sb.append(", dbCollation=").append(dbCollation);
        sb.append(", body=").append(body);
        sb.append(", bodyUtf8=").append(bodyUtf8);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}