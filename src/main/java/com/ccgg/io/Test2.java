package com.ccgg.io;

import java.io.*;

public class Test2 {
    public static void main(String[] args){
        int x = 1234567;
        double d = 3.1415926;
        boolean b = true;
        try(
                FileOutputStream fos = new FileOutputStream("resources/test2.dat");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                DataOutputStream dos = new DataOutputStream(bos);
        ){
            dos.writeInt(x);
            dos.writeDouble(d);
            dos.writeBoolean(b);
            dos.writeBoolean(false);
        }catch(IOException e){
            System.err.println(e);
        }
    }

}
