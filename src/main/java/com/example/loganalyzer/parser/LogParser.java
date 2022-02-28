package com.example.loganalyzer.parser;

import com.example.loganalyzer.datasource.LogDataSource;

public class LogParser {

  private final String logText;

  public LogParser(String logText) {
    this.logText = logText;
  }

  public LogDataSource parse() {
    LogProcessor processor = new LogProcessor(this.logText);
    return processor.processAndGetLogDataSourceObject();
  }

}
