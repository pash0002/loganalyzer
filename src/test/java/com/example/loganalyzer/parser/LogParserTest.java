package com.example.loganalyzer.parser;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogParserTest {

  LogParser logParser;

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void getParsedString() {
    String logText = "2018-09-18 04:49:38,215 ERROR (default task-95) IP-Address=157.49.141.133" +
        "#,!User-Agent=Mozilla/5.0 (Windows NT 10.0; WOW64;Trident/7.0; rv:11.0) like Gecko" +
        "#,!X-Request-From=UIX#,!Request-Type=POST#,!API=/v1/admin/developers#,!User-Login=test@demo.com" +
        "#,!User-Name=testUser#,!EnterpriseId=2#,!EnterpriseName=Enterprise-2#,!Auth-Status=#,!Status-Code=200" +
        "#,!Response-Time=346#,!Request-Body=";
    logParser = new LogParser(logText);
    logParser.parse();
  }


}