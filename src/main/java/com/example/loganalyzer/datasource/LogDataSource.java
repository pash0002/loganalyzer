package com.example.loganalyzer.datasource;


public final class LogDataSource {
  private String ipAddress;
  private String userAgent;
  private Integer statusCode;
  private String requestType;
  private String api;
  private String user;
  private String enterpriseId;
  private String enterpriseName;
  
  private LogDataSource() { }

  private LogDataSource setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  private LogDataSource setUserAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  private LogDataSource setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  private LogDataSource setRequestType(String requestType) {
    this.requestType = requestType;
    return this;
  }

  private LogDataSource setApi(String api) {
    this.api = api;
    return this;
  }

  private LogDataSource setUser(String user) {
    this.user = user;
    return this;
  }

  private LogDataSource setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
    return this;
  }

  private LogDataSource setEnterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
    return this;
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

    public LogDataSource build() {
      return new LogDataSource()
          .setIpAddress(this.ipAddress)
          .setUserAgent(this.userAgent)
          .setStatusCode(this.statusCode)
          .setRequestType(this.requestType)
          .setApi(this.api)
          .setUser(this.user)
          .setEnterpriseId(this.enterpriseId)
          .setEnterpriseName(this.enterpriseName);
    }
  }

}
