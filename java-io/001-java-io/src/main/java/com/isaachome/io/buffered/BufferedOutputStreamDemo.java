package com.isaachome.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        System.out.println(".......BufferedOutputStreamDemo.....");
        var obj = new BufferedOutputStreamExample();
        try {
            obj.generateFile("Welcome Highway 65...");
        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}

class BufferedOutputStreamExample{
    public  void generateFile(String contents) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("buffered-text.txt");
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(contents.getBytes(StandardCharsets.UTF_8));
        bufferedOutputStream.flush();
        System.out.println("Success Writing data...");
    }
}