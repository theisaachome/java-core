package com.isaachome.io;

import java.io.*;

public class EOLFixerDemo {
    public static void main(String[] args) {
        String fixedEOL="\r\n";
        try(BufferedReader reader = new BufferedReader(new FileReader("input-text.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("eol-text.txt"))) {

//            String lines = reader.readLine();
//            while (lines !=null){
//                writer.write(lines + fixedEOL);
//                lines = reader.readLine();
//            }
//            reader.close();
//            writer.close();

//            --- using Stream -----
            reader.lines()
                    .map(line -> line+fixedEOL)
                    .forEach(line->{
                        try {
                            writer.write(line);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
            System.out.println("EOL fixed Successful ...");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
