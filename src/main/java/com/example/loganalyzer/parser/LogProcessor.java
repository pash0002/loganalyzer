package com.example.loganalyzer.parser;

import com.example.loganalyzer.datasource.LogDataSource;
import com.example.loganalyzer.io.InputFileReader;

public class LogProcessor {

//  private  RegexHandler regexHandler;
  private final InputFileReader reader;

  public LogProcessor(InputFileReader reader) {
    this.reader = reader;

  }

  public LogDataSource processAndGetLogDataSourceObject(String line) {
    RegexHandler regexHandler = new RegexHandler(line);
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
