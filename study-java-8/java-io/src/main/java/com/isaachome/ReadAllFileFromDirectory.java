package com.isaachome;

import java.io.*;

public class ReadAllFileFromDirectory {
    public static void main(String[] args) throws IOException {
        File dir = new File("data/input/");

        // create object of PrintWriter for output file
        PrintWriter pw = new PrintWriter(new FileWriter("data/outbox/output.txt"));

        String [] files= dir.list();
        for (String file : files) {
            System.out.println("Reading from " + file);
            // create instance of file from Name of
            // the file stored in string Array
            File f = new File(dir, file);
            BufferedReader br = new BufferedReader(new FileReader(f));
            pw.println(String.format("==========Content of %s===========",f.getName()));

            // Read from current file
            String line = br.readLine();
            while (line != null) {

                // write to the output file
                pw.println(line);
                line = br.readLine();
            }
            pw.flush();
        }
        System.out.println("Reading from all files" +" in directory " + dir.getName() + " Completed");
        purgeDirectoryButKeepSubDirectories(dir);
    }

    static void purgeDirectoryButKeepSubDirectories(File directory) {
        if (directory.isDirectory()) {
            // Get all the files in the directory
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        // Attempt to delete each file
                        if (file.delete()) {
                            System.out.println(file.getName() + " deleted successfully.");
                        } else {
                            System.out.println("Failed to delete " + file.getName());
                        }
                    }
                }
            }
        } else {
            System.out.println("The specified path is not a directory.");
        }
    }
}
