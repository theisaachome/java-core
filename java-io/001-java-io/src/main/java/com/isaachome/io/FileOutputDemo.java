package com.isaachome.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputDemo {
    public static void main(String[] args) {
        System.out.println("FileOutput Demo...");
//        FileOutputExample1 obj=new FileOutputExample1();
        FileOutputExample2 obj= new FileOutputExample2();
        try {
            obj.generateFile("Hello From Java File IO");
        }catch (IOException ex){
             ex.printStackTrace();
        }
    }
}

abstract  class  AbstractFileOutput{
    public  abstract void generateFile(String contents)throws  IOException;
}
class FileOutputExample1 extends  AbstractFileOutput{
    public  void generateFile(String content)throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("./test.txt");
        fileOutputStream.write(65);
        fileOutputStream.close();
        System.out.println("Success....");
    }
}

class  FileOutputExample2 extends  AbstractFileOutput{
    @Override
    public void generateFile(String contents) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("./test.txt");
        fileOutputStream.write(contents.getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
        System.out.println("Write Successfully...");
    }

}
