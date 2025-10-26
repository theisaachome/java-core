package com.isaachome;

import java.io.*;

public class FileMerge {

    private static String PRE_FIX = "data/";
    public static void main(String[] args)throws IOException {


        File file = new File("test.txt");
        file.createNewFile();
        System.out.println(System.getProperty("user.dir"));
        if(file.exists()){
            System.out.println("Created File.");
        }
        PrintWriter pw = new PrintWriter("data/outbox/report_file.txt");
        // BufferedReader object for file1.txt
        BufferedReader br = new BufferedReader(new FileReader(PRE_FIX+"file1.txt"));

        String line = br.readLine();
        // loop to copy each line of
        // file1.txt to  file3.txt
        while (line != null) {
            pw.println(line);
            line = br.readLine();
        }
        BufferedReader br2 = new BufferedReader(new FileReader(PRE_FIX+"file2.txt"));
        String line2 = br2.readLine();
        while (line2 != null) {
            pw.println(line2);
            line2 = br2.readLine();
        }
        pw.flush();

        // closing resources
        br.close();
        pw.close();

        System.out.println("Merged file1.txt and file2.txt into file3.txt");
    }
}
