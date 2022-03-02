package com.example.loganalyzer.parser;

import com.example.loganalyzer.controller.parser.LogParser;
import com.example.loganalyzer.model.LogData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

class LogParserTest {

  LogParser logParser;
  String inputFile =  "./build/resources/main/log-files/demo-logfile.log";

  @Test
  void getParsedData() {
    logParser = new LogParser(inputFile);
    List<LogData> logDataList = logParser.parse();
    LogData mockData = new LogData.Builder()
        .setLogLevel("ERROR")
        .setIpAddress("157.49.141.133")
        .setUserAgent("Mozilla/5.0 (Windows NT 10.0; WOW64;Trident/7.0; rv:11.0) like Gecko")
        .setStatusCode(200)
        .setRequestType("POST")
        .setApi("/v1/admin/developers")
        .setUser("testUser")
        .setEnterpriseId("2")
        .setEnterpriseName("Enterprise-2")
        .build();
    assertEquals(logDataList.get(0), mockData);
    assertEquals(logDataList.size(), 13);
  }


}