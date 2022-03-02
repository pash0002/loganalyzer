package com.example.loganalyzer.controller.parser;

import com.example.loganalyzer.model.LogData;

import java.util.List;
import java.util.stream.Collectors;

public class LogParserService {

  private final List<LogData> listOfLogData;

  LogParserService(List<LogData> listOfLogData) {
    this.listOfLogData = listOfLogData;
  }

  public List<LogData> getLogsDataByLevel(String level) {
    return this.listOfLogData.stream()
        .filter(x-> x.getLogLevel().equalsIgnoreCase(level))
        .collect(Collectors.toList());
  }

  public List<LogData> getTailLogs(Integer tailCount) {
    return this.listOfLogData.stream()
        .skip(listOfLogData.size() - tailCount)
        .collect(Collectors.toList());
  }

}