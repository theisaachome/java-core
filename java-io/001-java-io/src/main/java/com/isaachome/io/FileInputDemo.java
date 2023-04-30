package com.isaachome.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputDemo {
    public static void main(String[] args) {
        System.out.println("File Input Demo...");
        var obj = new FileInputExample1();
       try {
            obj.readeFile();
       }catch (IOException ex){
           ex.printStackTrace();
       }
    }
}

abstract class AbstractFileInput{
     public  abstract void readeFile()throws IOException;
}

class  FileInputExample1 extends  AbstractFileInput{

    @Override
    public void readeFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./input-text.txt");
        int i=0;
        while ((i=fileInputStream.read())!=-1){
            System.out.print((char) i);
        }
        fileInputStream.close();
        System.out.println("Success Reading...");
    }
}