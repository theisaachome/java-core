package com.isaachome.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {

        try{
          CreateNewFile.createFile();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
class  CreateNewFile{
    public  static  void createFile()throws IOException {
         File file = new File("new-file.txt");
        if (file.createNewFile()){
            System.out.println("new file created..");
        }else{
            System.out.println("File already exist!.");
        }
    }
}
