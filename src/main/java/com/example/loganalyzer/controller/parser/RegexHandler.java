package com.example.loganalyzer.controller.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.example.loganalyzer.controller.parser.constants.LogLevelEnum.*;
import static com.example.loganalyzer.controller.parser.constants.RegexPatternConstants.*;

public class RegexHandler {

  private final String logText;
  private final static String BLANK_STRING = "";
  private final static String EQUAL_TO_SPLITTER = "=";
  private static final Pattern IP_PATTERN = Pattern.compile(IP_ADDRESS, Pattern.CASE_INSENSITIVE);
  private static final Pattern USER_AGENT_PATTERN = Pattern.compile(USER_AGENT, Pattern.CASE_INSENSITIVE);
  private static final Pattern STATUS_CODE_PATTERN = Pattern.compile(STATUS_CODE, Pattern.CASE_INSENSITIVE);
  private static final Pattern REQUEST_TYPE_PATTERN = Pattern.compile(REQUEST_TYPE, Pattern.CASE_INSENSITIVE);
  private static final Pattern API_PATTERN = Pattern.compile(API, Pattern.CASE_INSENSITIVE);
  private static final Pattern USER_PATTERN = Pattern.compile(USER, Pattern.CASE_INSENSITIVE);
  private static final Pattern ENTERPRISE_ID_PATTERN = Pattern.compile(ENTERPRISE_ID, Pattern.CASE_INSENSITIVE);
  private static final Pattern ENTERPRISE_NAME_PATTERN = Pattern.compile(ENTERPRISE_NAME, Pattern.CASE_INSENSITIVE);

  public RegexHandler(String logText) {
    this.logText = logText;
  }

  public String getLogLevel() {
    if (this.logText.contains(ERROR)) {
      return ERROR;
    } else if (this.logText.contains(WARN)) {
      return WARN;
    } else if (this.logText.contains(INFO)) {
      return INFO;
    } else if (this.logText.contains(DEBUG)) {
      return DEBUG;
    } else {
      System.out.println("No Level found");
      return BLANK_STRING;
    }
  }

  public String getIpAddressWithRegex() {
    Matcher matcher = IP_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return BLANK_STRING;
    }
  }

  public String getUserAgent() {
    Matcher matcher = USER_AGENT_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return BLANK_STRING;
    }
  }

  public Integer getStatusCode() {
    Matcher matcher = STATUS_CODE_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return Integer.parseInt(splitAndGetValue(matcher.group(0)));
    } else {
      return -1;
    }
  }

  public String getRequestType() {
    Matcher matcher = REQUEST_TYPE_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return BLANK_STRING;
    }
  }

  public String getApi() {
    Matcher matcher = API_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return BLANK_STRING;
    }
  }

  public String getUser() {
    Matcher matcher = USER_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return BLANK_STRING;
    }
  }

  public String getEnterpriseId() {
    Matcher matcher = ENTERPRISE_ID_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return BLANK_STRING;
    }
  }

  public String getEnterpriseName() {
    Matcher matcher = ENTERPRISE_NAME_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return BLANK_STRING;
    }
  }

  private String splitAndGetValue(String val) {
    return val.split(EQUAL_TO_SPLITTER)[1];
  }

}
