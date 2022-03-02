package com.example.loganalyzer.controller.parser;

import com.example.loganalyzer.model.LogData;

/**
 * Processor class which will do processing on logs
 */

public class LogProcessor {

  public LogProcessor() {
  }

  /**
   * Method will return the log data after processing
   *
   * @param line String
   * @return LogData
   */
  public LogData processAndGetLogDataSourceObject(String line) {
    final RegexHandler regexHandler = new RegexHandler(line);
    final String logLevel = regexHandler.getLogLevel();
    final String ipAddress = regexHandler.getIpAddressWithRegex();
    final String userAgent = regexHandler.getUserAgent();
    final Integer statusCode = regexHandler.getStatusCode();
    final String requestType = regexHandler.getRequestType();
    final String api = regexHandler.getApi();
    final String user = regexHandler.getUser();
    final String enterpriseId = regexHandler.getEnterpriseId();
    final String enterpriseName = regexHandler.getEnterpriseName();
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
