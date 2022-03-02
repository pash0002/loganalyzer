package com.example.loganalyzer.controller.parser.io;

import java.io.*;

import static com.example.loganalyzer.ApplicationLogger.LOGGER;

public class InputFileReader {

  private BufferedReader reader;
  private String line;

  public InputFileReader(String inputFile) {
    try {
      reader = new BufferedReader(new FileReader(inputFile), 16384);
    } catch (FileNotFoundException fileNotFoundException) {
      LOGGER.error(String.format("File not found at specified location - [%s]", inputFile));
    }

  }

  public Boolean hasNext() {
    try {
      line = reader.readLine();
    } catch (IOException ioException) {
      LOGGER.error("Error occurred while reading the file", ioException);
    }
    return line != null;
  }

  public String nextLine() {
    return line;
  }

  public void close() {
    try {
      reader.close();
    } catch (IOException ioException) {
      LOGGER.error("Error occurred while closing file", ioException);
    }
  }


}
