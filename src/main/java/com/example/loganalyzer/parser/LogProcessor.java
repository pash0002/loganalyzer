package com.example.loganalyzer.parser;

import com.example.loganalyzer.datasource.LogDataSource;

public class LogProcessor {

  private final RegexHandler regexHandler;
  public LogProcessor(String logText) {
    regexHandler = new RegexHandler(logText);
  }

  public LogDataSource processAndGetLogDataSourceObject() {
    String ipAddress = regexHandler.getIpAddressWithRegex();
    String userAgent = regexHandler.getUserAgent();
    Integer statusCode = regexHandler.getStatusCode();
    String requestType = regexHandler.getRequestType();
    String api = regexHandler.getApi();
    String user = regexHandler.getUser();
    String enterpriseId = regexHandler.getEnterpriseId();
    String enterpriseName = regexHandler.getEnterpriseName();
    return new LogDataSource()
        .setIpAddress(ipAddress)
        .setUserAgent(userAgent)
        .setStatusCode(statusCode)
        .setRequestType(requestType)
        .setApi(api)
        .setUser(user)
        .setEnterpriseId(enterpriseId)
        .setEnterpriseName(enterpriseName);

  }

}
