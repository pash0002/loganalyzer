package com.example.loganalyzer.controller.parser.constants;

/**
 * Regex pattern constants
 */
public class RegexPatternConstants {

  public static final String IP_ADDRESS = "(IP-Address=[0-9.]+)";
  public static final String USER_AGENT = "(User-Agent=[a-zA-Z0-9/. ();:]+)";
  public static final String STATUS_CODE = "(Status-Code=[0-9]+)";
  public static final String REQUEST_TYPE = "(Request-Type=[a-zA-Z]+)";
  public static final String API = "(API=[a-zA-Z0-9/]+)";
  public static final String USER = "(User-Name=[a-zA-Z0-9/]+)";
  public static final String ENTERPRISE_ID = "(EnterpriseId=[a-zA-Z0-9]+)";
  public static final String ENTERPRISE_NAME = "(EnterpriseName=[a-zA-Z0-9-]+)";

}
