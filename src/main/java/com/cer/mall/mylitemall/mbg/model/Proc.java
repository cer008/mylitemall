package com.cer.mall.mylitemall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Proc implements Serializable {
    private String db;

    private String name;

    private String type;

    private String specificName;

    private String language;

    private String sqlDataAccess;

    private String isDeterministic;

    private String securityType;

    private String definer;

    private Date created;

    private Date modified;

    private String sqlMode;

    private String characterSetClient;

    private String collationConnection;

    private String dbCollation;

    private byte[] paramList;

    private byte[] returns;

    private byte[] body;

    private String comment;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSpecificName() {
        return specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName == null ? null : specificName.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getSqlDataAccess() {
        return sqlDataAccess;
    }

    public void setSqlDataAccess(String sqlDataAccess) {
        this.sqlDataAccess = sqlDataAccess == null ? null : sqlDataAccess.trim();
    }

    public String getIsDeterministic() {
        return isDeterministic;
    }

    public void setIsDeterministic(String isDeterministic) {
        this.isDeterministic = isDeterministic == null ? null : isDeterministic.trim();
    }

    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType == null ? null : securityType.trim();
    }

    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer == null ? null : definer.trim();
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

    public String getSqlMode() {
        return sqlMode;
    }

    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode == null ? null : sqlMode.trim();
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

    public byte[] getParamList() {
        return paramList;
    }

    public void setParamList(byte[] paramList) {
        this.paramList = paramList;
    }

    public byte[] getReturns() {
        return returns;
    }

    public void setReturns(byte[] returns) {
        this.returns = returns;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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
        sb.append(", type=").append(type);
        sb.append(", specificName=").append(specificName);
        sb.append(", language=").append(language);
        sb.append(", sqlDataAccess=").append(sqlDataAccess);
        sb.append(", isDeterministic=").append(isDeterministic);
        sb.append(", securityType=").append(securityType);
        sb.append(", definer=").append(definer);
        sb.append(", created=").append(created);
        sb.append(", modified=").append(modified);
        sb.append(", sqlMode=").append(sqlMode);
        sb.append(", characterSetClient=").append(characterSetClient);
        sb.append(", collationConnection=").append(collationConnection);
        sb.append(", dbCollation=").append(dbCollation);
        sb.append(", paramList=").append(paramList);
        sb.append(", returns=").append(returns);
        sb.append(", body=").append(body);
        sb.append(", comment=").append(comment);
        sb.append(", bodyUtf8=").append(bodyUtf8);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}