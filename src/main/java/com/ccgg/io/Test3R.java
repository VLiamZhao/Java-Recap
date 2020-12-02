package com.ccgg.io;

import java.io.*;

public class Test3R {
  public static void main(String[] args) {
      try (FileInputStream fis = new FileInputStream("resources/test3.dat");
           ObjectInputStream ois = new ObjectInputStream(fis);
      ){
          Data data = (Data)ois.readObject();
          System.out.println(data);
      } catch (IOException | ClassNotFoundException e) {
          System.err.println(e);
      }
  }
}
