package com.example.loganalyzer.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHandler {

  private final String logText;
  private static final Pattern IP_PATTERN =
      Pattern.compile("(IP-Address=[0-9.]+)", Pattern.CASE_INSENSITIVE);
  private static final Pattern USER_AGENT_PATTERN =
      Pattern.compile("(User-Agent=[a-zA-Z0-9/. ();:]+)", Pattern.CASE_INSENSITIVE);
  private static final Pattern STATUS_CODE_PATTERN =
      Pattern.compile("(Status-Code=[0-9]+)", Pattern.CASE_INSENSITIVE);
  private static final Pattern REQUEST_TYPE_PATTERN =
      Pattern.compile("(Request-Type=[a-zA-Z]+)", Pattern.CASE_INSENSITIVE);
  private static final Pattern API_PATTERN =
      Pattern.compile("(API=[a-zA-Z0-9/]+)", Pattern.CASE_INSENSITIVE);
  private static final Pattern USER_PATTERN =
      Pattern.compile("(User-Name=[a-zA-Z0-9/]+)", Pattern.CASE_INSENSITIVE);
  private static final Pattern ENTERPRISE_ID_PATTERN =
      Pattern.compile("(EnterpriseId=[a-zA-Z0-9]+)", Pattern.CASE_INSENSITIVE);
  private static final Pattern ENTERPRISE_NAME_PATTERN =
      Pattern.compile("(EnterpriseName=[a-zA-Z0-9-]+)", Pattern.CASE_INSENSITIVE);

  public RegexHandler(String logText) {
    this.logText = logText;
  }

  public String getIpAddressWithRegex() {
    Matcher matcher = IP_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return "";
    }
  }

  public String getUserAgent() {
    Matcher matcher = USER_AGENT_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return "";
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
      return "";
    }
  }

  public String getApi() {
    Matcher matcher = API_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return "";
    }
  }

  public String getUser() {
    Matcher matcher = USER_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return "";
    }
  }

  public String getEnterpriseId() {
    Matcher matcher = ENTERPRISE_ID_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return "";
    }
  }

  public String getEnterpriseName() {
    Matcher matcher = ENTERPRISE_NAME_PATTERN.matcher(this.logText);
    if (matcher.find()) {
      return splitAndGetValue(matcher.group(0));
    } else {
      return "";
    }
  }

  private String splitAndGetValue(String val) {
    return val.split("=")[1];
  }
}
