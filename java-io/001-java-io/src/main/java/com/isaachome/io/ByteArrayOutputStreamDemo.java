package com.isaachome.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        try{
          ByteArrayOutputStreamDemo.generateFiles("Hello Using ByteArrayOutputStreamDemo");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public  static  void generateFiles(String contents)throws IOException {
        FileOutputStream f1 = new FileOutputStream("test-1.txt");
        FileOutputStream f2= new FileOutputStream("test-2.txt");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(contents.getBytes(StandardCharsets.UTF_8));
        byteArrayOutputStream.writeTo(f1);
        byteArrayOutputStream.writeTo(f2);

        f1.close();
        f2.close();
        byteArrayOutputStream.close();
        System.out.println("Success....");

    }
}
