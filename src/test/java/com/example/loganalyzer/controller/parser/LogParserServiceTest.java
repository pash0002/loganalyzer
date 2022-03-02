package com.example.loganalyzer.controller.parser;

import com.example.loganalyzer.model.LogData;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LogParserServiceTest {

  static LogParserService service;
  static List<LogData> mockLogDataList = new ArrayList<>();
  static {
    LogData mockLogData = new LogData.Builder()
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
    LogData mockLogData2 = new LogData.Builder()
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
    mockLogDataList.add(mockLogData);
    mockLogDataList.add(mockLogData2);
    service = new LogParserService(mockLogDataList);
  }

  @Test
  void getLogsDataByLevel() {
    List<LogData> output = service.getLogsDataByLevel("ERROR");
    assertEquals(output, mockLogDataList);
    assertEquals(output.get(0).getLogLevel(), "ERROR");
  }

  @Test
  void getTailLogs() {
    List<LogData> output = service.getTailLogs(2);
    assertEquals(output, mockLogDataList);
    assertEquals(mockLogDataList, output);
  }

  @Test
  void getTailLogsNegativeTest() {
    Exception negativeSizeException = assertThrows(IndexOutOfBoundsException.class, () ->
        service.getTailLogs(-1));
    assertEquals("Operation is not supported", negativeSizeException.getMessage());
    Exception greaterSizeException = assertThrows(IndexOutOfBoundsException.class, () ->
        service.getTailLogs(3));
    assertEquals("Operation is not supported", greaterSizeException.getMessage());
  }

}