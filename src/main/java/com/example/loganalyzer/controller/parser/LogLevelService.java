package com.example.loganalyzer.controller.parser;

import com.example.loganalyzer.model.LogData;

import java.util.List;
import java.util.stream.Collectors;

public class LogLevelService {

  private final List<LogData> listOfLogData;

  LogLevelService(List<LogData> listOfLogData) {
    this.listOfLogData = listOfLogData;
  }

  public List<LogData> getLogsDataByLevel(String level) {
    return this.listOfLogData.stream()
        .filter(x-> x.getLogLevel().equalsIgnoreCase(level))
        .collect(Collectors.toList());
  }

}
