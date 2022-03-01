package com.example.loganalyzer.parser;

import com.example.loganalyzer.datasource.LogDataSource;
import com.example.loganalyzer.io.InputFileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogParser {

//  private String logText = "";
  private final String inputFile;
  private final List<LogDataSource> listOfLogDataSource;

//  public LogParser(String logText) {
//    this.logText = logText;
//  }

  public LogParser(String inputFile) {
    listOfLogDataSource = new ArrayList<>();
    this.inputFile = inputFile;
  }

  public List<LogDataSource> parse() {
    LogProcessor processor = new LogProcessor(getFile());
    InputFileReader reader = getFile();
    while (reader.hasNext()) {
      listOfLogDataSource.add(processor.processAndGetLogDataSourceObject(reader.nextLine()));
    }
    reader.close();
    return listOfLogDataSource;
  }

  private InputFileReader getFile() {
    return new InputFileReader(inputFile);
  }

}
