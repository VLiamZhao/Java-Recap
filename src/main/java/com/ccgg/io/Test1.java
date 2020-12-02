package com.ccgg.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
  public static void main(String[] args) {
      int[] array = {1, 2, 3, 4, 5};
      try(FileOutputStream fos = new FileOutputStream("resources/test1.dat")){
          for(int x : array){
              fos.write(x);
          }
      }catch (IOException e){
          System.err.println(e);
      }
  }
}
