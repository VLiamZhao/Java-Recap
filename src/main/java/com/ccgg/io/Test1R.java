package com.ccgg.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1R {
  public static void main(String[] args) {
      try(FileInputStream fis = new FileInputStream("resources/test1.dat")){
          int x = fis.read();
          while(x != -1){
            System.out.println(x);
            x = fis.read();
          }
      }catch (IOException e){
          System.err.println(e);
      }
  }
}
