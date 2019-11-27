package com.cer.mall.mylitemall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SlaveMasterInfo implements Serializable {
    @ApiModelProperty(value = "The host name of the master.")
    private String host;

    @ApiModelProperty(value = "The network port used to connect to the master.")
    private Integer port;

    @ApiModelProperty(value = "Number of lines in the file.")
    private Integer numberOfLines;

    @ApiModelProperty(value = "The master log position of the last read event.")
    private Long masterLogPos;

    @ApiModelProperty(value = "The period (in seconds) that the slave will wait before trying to reconnect to the master.")
    private Integer connectRetry;

    @ApiModelProperty(value = "Indicates whether the server supports SSL connections.")
    private Boolean enabledSsl;

    @ApiModelProperty(value = "Whether to verify the server certificate.")
    private Boolean sslVerifyServerCert;

    private Float heartbeat;

    @ApiModelProperty(value = "Number of reconnect attempts, to the master, before giving up.")
    private Long retryCount;

    @ApiModelProperty(value = "Indicates whether GTIDs will be used to retrieve events from the master.")
    private Boolean enabledAutoPosition;

    @ApiModelProperty(value = "The name of the master binary log currently being read from the master.")
    private String masterLogName;

    @ApiModelProperty(value = "The user name used to connect to the master.")
    private String userName;

    @ApiModelProperty(value = "The password used to connect to the master.")
    private String userPassword;

    @ApiModelProperty(value = "The file used for the Certificate Authority (CA) certificate.")
    private String sslCa;

    @ApiModelProperty(value = "The path to the Certificate Authority (CA) certificates.")
    private String sslCapath;

    @ApiModelProperty(value = "The name of the SSL certificate file.")
    private String sslCert;

    @ApiModelProperty(value = "The name of the cipher in use for the SSL connection.")
    private String sslCipher;

    @ApiModelProperty(value = "The name of the SSL key file.")
    private String sslKey;

    @ApiModelProperty(value = "Displays which interface is employed when connecting to the MySQL server")
    private String bind;

    @ApiModelProperty(value = "The number of server IDs to be ignored, followed by the actual server IDs")
    private String ignoredServerIds;

    @ApiModelProperty(value = "The master server uuid.")
    private String uuid;

    @ApiModelProperty(value = "The file used for the Certificate Revocation List (CRL)")
    private String sslCrl;

    @ApiModelProperty(value = "The path used for Certificate Revocation List (CRL) files")
    private String sslCrlpath;

    private static final long serialVersionUID = 1L;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public Long getMasterLogPos() {
        return masterLogPos;
    }

    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    public Integer getConnectRetry() {
        return connectRetry;
    }

    public void setConnectRetry(Integer connectRetry) {
        this.connectRetry = connectRetry;
    }

    public Boolean getEnabledSsl() {
        return enabledSsl;
    }

    public void setEnabledSsl(Boolean enabledSsl) {
        this.enabledSsl = enabledSsl;
    }

    public Boolean getSslVerifyServerCert() {
        return sslVerifyServerCert;
    }

    public void setSslVerifyServerCert(Boolean sslVerifyServerCert) {
        this.sslVerifyServerCert = sslVerifyServerCert;
    }

    public Float getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(Float heartbeat) {
        this.heartbeat = heartbeat;
    }

    public Long getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
    }

    public Boolean getEnabledAutoPosition() {
        return enabledAutoPosition;
    }

    public void setEnabledAutoPosition(Boolean enabledAutoPosition) {
        this.enabledAutoPosition = enabledAutoPosition;
    }

    public String getMasterLogName() {
        return masterLogName;
    }

    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName == null ? null : masterLogName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getSslCa() {
        return sslCa;
    }

    public void setSslCa(String sslCa) {
        this.sslCa = sslCa == null ? null : sslCa.trim();
    }

    public String getSslCapath() {
        return sslCapath;
    }

    public void setSslCapath(String sslCapath) {
        this.sslCapath = sslCapath == null ? null : sslCapath.trim();
    }

    public String getSslCert() {
        return sslCert;
    }

    public void setSslCert(String sslCert) {
        this.sslCert = sslCert == null ? null : sslCert.trim();
    }

    public String getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher == null ? null : sslCipher.trim();
    }

    public String getSslKey() {
        return sslKey;
    }

    public void setSslKey(String sslKey) {
        this.sslKey = sslKey == null ? null : sslKey.trim();
    }

    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind == null ? null : bind.trim();
    }

    public String getIgnoredServerIds() {
        return ignoredServerIds;
    }

    public void setIgnoredServerIds(String ignoredServerIds) {
        this.ignoredServerIds = ignoredServerIds == null ? null : ignoredServerIds.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getSslCrl() {
        return sslCrl;
    }

    public void setSslCrl(String sslCrl) {
        this.sslCrl = sslCrl == null ? null : sslCrl.trim();
    }

    public String getSslCrlpath() {
        return sslCrlpath;
    }

    public void setSslCrlpath(String sslCrlpath) {
        this.sslCrlpath = sslCrlpath == null ? null : sslCrlpath.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", port=").append(port);
        sb.append(", numberOfLines=").append(numberOfLines);
        sb.append(", masterLogPos=").append(masterLogPos);
        sb.append(", connectRetry=").append(connectRetry);
        sb.append(", enabledSsl=").append(enabledSsl);
        sb.append(", sslVerifyServerCert=").append(sslVerifyServerCert);
        sb.append(", heartbeat=").append(heartbeat);
        sb.append(", retryCount=").append(retryCount);
        sb.append(", enabledAutoPosition=").append(enabledAutoPosition);
        sb.append(", masterLogName=").append(masterLogName);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", sslCa=").append(sslCa);
        sb.append(", sslCapath=").append(sslCapath);
        sb.append(", sslCert=").append(sslCert);
        sb.append(", sslCipher=").append(sslCipher);
        sb.append(", sslKey=").append(sslKey);
        sb.append(", bind=").append(bind);
        sb.append(", ignoredServerIds=").append(ignoredServerIds);
        sb.append(", uuid=").append(uuid);
        sb.append(", sslCrl=").append(sslCrl);
        sb.append(", sslCrlpath=").append(sslCrlpath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}