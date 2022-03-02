package com.example.loganalyzer.controller.parser;

import com.example.loganalyzer.model.LogData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogParserController {

  List<LogData> listOfLogData;

  @GetMapping("api/parse")
  public ResponseEntity<List<LogData>> getParsedLogs(@RequestParam(name="path") String filePath) {
    LogParser parser = new LogParser(filePath);
    this.listOfLogData = parser.parse();
    return new ResponseEntity<>(this.listOfLogData, HttpStatus.OK);
  }

  @GetMapping("api/parse/level")
  public ResponseEntity<List<LogData>> getParsedLogsByLevel(@RequestParam(name="l") String level) {
    return new ResponseEntity<>(new LogLevelService(listOfLogData).getLogsDataByLevel(level), HttpStatus.OK);
  }

}
