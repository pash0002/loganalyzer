package com.example.loganalyzer.model;


import java.util.Objects;

/**
 * The class will hold the Data
 */
public final class LogData {

  private final String logLevel;
  private final String ipAddress;
  private final String userAgent;
  private final Integer statusCode;
  private final String requestType;
  private final String api;
  private final String user;
  private final String enterpriseId;
  private final String enterpriseName;

  private LogData(Builder builder) {
    this.logLevel = builder.logLevel;
    this.ipAddress = builder.ipAddress;
    this.userAgent = builder.userAgent;
    this.statusCode = builder.statusCode;
    this.requestType = builder.requestType;
    this.api = builder.api;
    this.user = builder.user;
    this.enterpriseId = builder.enterpriseId;
    this.enterpriseName = builder.enterpriseName;
  }

  public String getLogLevel() {
    return logLevel;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public String getUserAgent() {
    return userAgent;
  }

  public Integer getStatusCode() {
    return statusCode;
  }

  public String getRequestType() {
    return requestType;
  }

  public String getApi() {
    return api;
  }

  public String getUser() {
    return user;
  }

  public String getEnterpriseId() {
    return enterpriseId;
  }

  public String getEnterpriseName() {
    return enterpriseName;
  }

  public static class Builder {
    private String ipAddress;
    private String userAgent;
    private Integer statusCode;
    private String requestType;
    private String api;
    private String user;
    private String enterpriseId;
    private String enterpriseName;
    private String logLevel;

    public Builder() {
    }

    public Builder setLogLevel(String logLevel) {
      this.logLevel = logLevel;
      return this;
    }

    public Builder setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
      return this;
    }

    public Builder setUserAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }

    public Builder setStatusCode(Integer statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    public Builder setRequestType(String requestType) {
      this.requestType = requestType;
      return this;
    }

    public Builder setApi(String api) {
      this.api = api;
      return this;
    }

    public Builder setUser(String user) {
      this.user = user;
      return this;
    }

    public Builder setEnterpriseId(String enterpriseId) {
      this.enterpriseId = enterpriseId;
      return this;
    }

    public Builder setEnterpriseName(String enterpriseName) {
      this.enterpriseName = enterpriseName;
      return this;
    }

    public LogData build() {
      return new LogData(this);
    }

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogData logData = (LogData) o;
    return Objects.equals(logLevel, logData.logLevel)
        && Objects.equals(ipAddress, logData.ipAddress)
        && Objects.equals(userAgent, logData.userAgent)
        && Objects.equals(statusCode, logData.statusCode)
        && Objects.equals(requestType, logData.requestType)
        && Objects.equals(api, logData.api)
        && Objects.equals(user, logData.user)
        && Objects.equals(enterpriseId, logData.enterpriseId)
        && Objects.equals(enterpriseName, logData.enterpriseName);
  }

}
