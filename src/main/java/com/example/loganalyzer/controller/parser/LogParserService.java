package com.example.loganalyzer.controller.parser;

import com.example.loganalyzer.model.LogData;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class is responsible for providing various services on analyzed log data
 */
public class LogParserService {

  private final List<LogData> listOfLogData;

  LogParserService(List<LogData> listOfLogData) {
    this.listOfLogData = listOfLogData;
  }


  /**
   * Service for getting log by level like ERROR INFO
   *
   * @param level String
   * @return List<LogData>
   */
  public List<LogData> getLogsDataByLevel(String level) {
    return this.listOfLogData.stream()
        .filter(x -> x.getLogLevel().equalsIgnoreCase(level))
        .collect(Collectors.toList());
  }

  /**
   * Service for getting tail logs
   *
   * @param tailCount String
   * @return List<LogData>
   */
  public List<LogData> getTailLogs(Integer tailCount) {
    int size = listOfLogData.size();
    if (tailCount < 0) {
      throw new IndexOutOfBoundsException("Operation is not supported");
    } else if (tailCount == listOfLogData.size() || tailCount > size) {
      return listOfLogData;
    }
    return listOfLogData.subList(listOfLogData.size() - 1 - tailCount, listOfLogData.size() - 1);
  }

}
