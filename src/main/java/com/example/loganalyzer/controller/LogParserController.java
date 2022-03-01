package com.example.loganalyzer.controller;

import com.example.loganalyzer.datasource.LogDataSource;
import com.example.loganalyzer.parser.LogParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogParserController {

  String logText = "2018-09-18 04:49:38,215 ERROR (default task-95) IP-Address=157.49.141.133" +
      "#,!User-Agent=Mozilla/5.0 (Windows NT 10.0; WOW64;Trident/7.0; rv:11.0) like Gecko" +
      "#,!X-Request-From=UIX#,!Request-Type=POST#,!API=/v1/admin/developers#,!User-Login=test@demo.com" +
      "#,!User-Name=testUser#,!EnterpriseId=2#,!EnterpriseName=Enterprise-2#,!Auth-Status=#,!Status-Code=200" +
      "#,!Response-Time=346#,!Request-Body=";

  @GetMapping("/parse")
  public ResponseEntity<List<LogDataSource>> getParsedLogs(@RequestParam(name="filepath") String filePath) {
    System.out.println("FilePath - " + filePath);
    LogParser parser = new LogParser(filePath);
    return new ResponseEntity<>(parser.parse(), HttpStatus.OK);
  }

}
