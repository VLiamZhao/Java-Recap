package com.ccgg.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test3 {
  public static void main(String[] args) {
      try(
              FileOutputStream fos = new FileOutputStream("resources/test3.dat");
              ObjectOutputStream oos = new ObjectOutputStream(fos);
              ){
          Data data = new Data(2, 3.1415926, true);
          oos.writeObject(data);
      }catch (IOException e){
          System.err.println(e);
      }
  }
}
