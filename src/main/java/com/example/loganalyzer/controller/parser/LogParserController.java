package com.example.loganalyzer.controller.parser;

import com.example.loganalyzer.model.LogDataModel;
import com.example.loganalyzer.controller.parser.LogParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogParserController {

  @GetMapping("/parse")
  public ResponseEntity<List<LogDataModel>> getParsedLogs(@RequestParam(name="filepath") String filePath) {
    System.out.println("FilePath - " + filePath);
    LogParser parser = new LogParser(filePath);
    return new ResponseEntity<>(parser.parse(), HttpStatus.OK);
  }

}
