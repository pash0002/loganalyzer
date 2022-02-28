package com.example.loganalyzer.datasource;

import org.springframework.http.ResponseEntity;

public class LogDataSource {
  private String ipAddress;
  private String userAgent;
  private Integer statusCode;
  private String requestType;
  private String api;
  private String user;
  private String enterpriseId;
  private String enterpriseName;
  
  public LogDataSource() { }

  public LogDataSource setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  public LogDataSource setUserAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  public LogDataSource setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  public LogDataSource setRequestType(String requestType) {
    this.requestType = requestType;
    return this;
  }

  public LogDataSource setApi(String api) {
    this.api = api;
    return this;
  }

  public LogDataSource setUser(String user) {
    this.user = user;
    return this;
  }

  public LogDataSource setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
    return this;
  }

  public LogDataSource setEnterpriseName(String enterpriseName) {
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

}
