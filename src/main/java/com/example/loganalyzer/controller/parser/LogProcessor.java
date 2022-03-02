package com.example.loganalyzer.controller.parser;

import com.example.loganalyzer.model.LogData;

/**
 * Processor class which will do processing on logs
 * */

public class LogProcessor {

  public LogProcessor() { }

  public LogData processAndGetLogDataSourceObject(String line) {
    RegexHandler regexHandler = new RegexHandler(line);
    String logLevel = regexHandler.getLogLevel();
    String ipAddress = regexHandler.getIpAddressWithRegex();
    String userAgent = regexHandler.getUserAgent();
    Integer statusCode = regexHandler.getStatusCode();
    String requestType = regexHandler.getRequestType();
    String api = regexHandler.getApi();
    String user = regexHandler.getUser();
    String enterpriseId = regexHandler.getEnterpriseId();
    String enterpriseName = regexHandler.getEnterpriseName();
    return new LogData
        .Builder()
        .setLogLevel(logLevel)
        .setIpAddress(ipAddress)
        .setUserAgent(userAgent)
        .setStatusCode(statusCode)
        .setRequestType(requestType)
        .setApi(api)
        .setUser(user)
        .setEnterpriseId(enterpriseId)
        .setEnterpriseName(enterpriseName)
        .build();
  }

}
