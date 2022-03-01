package com.example.loganalyzer.controller.parser;

import com.example.loganalyzer.model.LogDataModel;
import com.example.loganalyzer.controller.parser.io.InputFileReader;

public class LogProcessor {

  private final InputFileReader reader;

  public LogProcessor(InputFileReader reader) {
    this.reader = reader;

  }

  public LogDataModel processAndGetLogDataSourceObject(String line) {
    RegexHandler regexHandler = new RegexHandler(line);
    String ipAddress = regexHandler.getIpAddressWithRegex();
    String userAgent = regexHandler.getUserAgent();
    Integer statusCode = regexHandler.getStatusCode();
    String requestType = regexHandler.getRequestType();
    String api = regexHandler.getApi();
    String user = regexHandler.getUser();
    String enterpriseId = regexHandler.getEnterpriseId();
    String enterpriseName = regexHandler.getEnterpriseName();
    return new LogDataModel
        .Builder()
        .setIpAddress(ipAddress)
        .setUserAgent(userAgent)
        .setStatusCode(statusCode)
        .setRequestType(requestType)
        .setApi(api)
        .setUser(user)
        .setEnterpriseId(enterpriseId)
        .setEnterpriseName(enterpriseName)
        .build();
//    return new LogDataSource()
//        .setIpAddress(ipAddress)
//        .setUserAgent(userAgent)
//        .setStatusCode(statusCode)
//        .setRequestType(requestType)
//        .setApi(api)
//        .setUser(user)
//        .setEnterpriseId(enterpriseId)
//        .setEnterpriseName(enterpriseName);
  }

}
