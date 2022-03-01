package com.example.loganalyzer.model;


public final class LogDataModel {

  private final String ipAddress;
  private final String userAgent;
  private final Integer statusCode;
  private final String requestType;
  private final String api;
  private final String user;
  private final String enterpriseId;
  private final String enterpriseName;
  
  private LogDataModel(Builder builder) {
    this.ipAddress = builder.ipAddress;
    this.userAgent = builder.userAgent;
    this.statusCode = builder.statusCode;
    this.requestType = builder.requestType;
    this.api = builder.api;
    this.user = builder.user;
    this.enterpriseId = builder.enterpriseId;
    this.enterpriseName = builder.enterpriseName;
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
    
    public Builder() { }

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

    public LogDataModel build() {
      return new LogDataModel(this);
    }

  }

}
