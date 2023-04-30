package com.isaachome.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args)  {
      try {
          var obj = new BufferedInputStreamDemo();
          obj.readData();

      }catch (IOException ex){
          ex.printStackTrace();
      }
    }
    public  void  readData()throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./input-text.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int i=0;
        while ((i=bufferedInputStream.read())!=-1){
            System.out.print((char)i);
        }
        fileInputStream.close();
        bufferedInputStream.close();
        System.out.println("Success Reading...");
    }
}
