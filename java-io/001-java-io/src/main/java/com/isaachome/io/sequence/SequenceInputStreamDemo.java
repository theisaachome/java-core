package com.isaachome.io.sequence;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {

    public static void main(String[] args) {
        var obj = new ReadManyInputs();
         try{
             obj.readData();
         }catch (IOException ex){
             ex.printStackTrace();
         }
    }

}

abstract  class  AbstractInputs{
    public abstract void  readData() throws IOException;
}
class  ReadManyInputs extends  AbstractInputs{
    @Override
    public  void readData()throws  IOException{
        FileInputStream f1=new FileInputStream("./input-text.txt");
        FileInputStream f2= new FileInputStream("./input-text-2.txt");
        SequenceInputStream sequenceInputStream = new SequenceInputStream(f1,f2);
        int i=0;
        while ((i=sequenceInputStream.read())!=-1){
            System.out.print((char)i);
        }
        f1.close();
        f2.close();
        sequenceInputStream.close();
        System.out.println("Success...");
    }
}