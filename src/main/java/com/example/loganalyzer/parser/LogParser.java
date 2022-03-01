package com.example.loganalyzer.parser;

import com.example.loganalyzer.model.LogDataModel;
import com.example.loganalyzer.io.InputFileReader;

import java.util.ArrayList;
import java.util.List;

public class LogParser {

  private final String inputFile;
  private final List<LogDataModel> listOfLogDataModel;


  public LogParser(String inputFile) {
    listOfLogDataModel = new ArrayList<>();
    this.inputFile = inputFile;
  }

  public List<LogDataModel> parse() {
    LogProcessor processor = new LogProcessor(getFile());
    InputFileReader reader = getFile();
    while (reader.hasNext()) {
      listOfLogDataModel.add(processor.processAndGetLogDataSourceObject(reader.nextLine()));
    }
    reader.close();
    return listOfLogDataModel;
  }

  private InputFileReader getFile() {
    return new InputFileReader(inputFile);
  }

}
