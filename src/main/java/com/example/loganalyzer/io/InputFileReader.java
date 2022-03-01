package com.example.loganalyzer.io;

import java.io.*;

public class InputFileReader {

  private BufferedReader reader;
  private String line;

  public InputFileReader(String inputFile) {
    try {
      reader = new BufferedReader(new FileReader(inputFile), 16384);
    } catch (FileNotFoundException fileNotFoundException) {
      System.out.println("File Not found");
    }

  }

  public Boolean hasNext() {
    try {
      line = reader.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return line != null;
  }

  public String nextLine() {
    return line;
  }

  public void close() {
    try {
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

//  public Scanner getScanner() {
//    return scanner;
//  }

}
