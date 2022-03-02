package com.example.loganalyzer.controller.parser;

import com.example.loganalyzer.model.LogData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller class which will be having REST API for the log processing
 * This class will show output in JSON format on any browser or REST API testing tools
 */

@RestController
public class LogParserController {

  private List<LogData> listOfLogData;

  /**
   * API will expose the parsed log data
   *
   * @param filePath String
   * @return ResponseEntity<List < LogData>>
   */
  @GetMapping("api/parse")
  public ResponseEntity<List<LogData>> getParsedLogs(@RequestParam(name = "path") String filePath) {
    LogParser parser = new LogParser(filePath);
    this.listOfLogData = parser.parse();
    return new ResponseEntity<>(this.listOfLogData, HttpStatus.OK);
  }

  /**
   * API will expose data by logging level
   *
   * @param level String
   * @return ResponseEntity<List < LogData>>
   */
  @GetMapping("api/parse/level")
  public ResponseEntity<List<LogData>> getParsedLogsByLevel(@RequestParam(name = "l") String level) {
    return new ResponseEntity<>(new LogParserService(listOfLogData).getLogsDataByLevel(level), HttpStatus.OK);
  }

  /**
   * API will expose tail logs via count of last lines
   *
   * @param tailCount Integer
   * @return ResponseEntity<List < LogData>>
   */
  @GetMapping("api/parse/tail")
  public ResponseEntity<List<LogData>> getTailLogs(@RequestParam(name = "t") Integer tailCount) {
    return new ResponseEntity<>(new LogParserService(listOfLogData).getTailLogs(tailCount), HttpStatus.OK);
  }

}
