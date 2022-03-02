package com.example.loganalyzer.controller.parser;

import com.example.loganalyzer.model.LogData;
import com.example.loganalyzer.controller.parser.io.InputFileReader;

import java.util.*;

/**
 * Parser class which will be responsible for end to end parsing
 */
public class LogParser {

  private final String inputFile;
  private final List<LogData> listOfLogData;


  public LogParser(String inputFile) {
    listOfLogData = new ArrayList<>();
    this.inputFile = inputFile;
  }

  /**
   * Method will return the parsed object
   * @return List<LogData>
   */
  public List<LogData> parse() {
    LogProcessor processor = new LogProcessor();
    InputFileReader reader = getFile();
    while (reader.hasNext()) {
      listOfLogData.add(processor.processAndGetLogDataSourceObject(reader.nextLine()));
    }
    reader.close();
    return listOfLogData;
  }

  /**
   * Method to Read File
   * @return InputFileReader
   */
  private InputFileReader getFile() {
    return new InputFileReader(inputFile);
  }

}
