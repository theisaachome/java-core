package com.isaachome.io;

import java.io.*;

public class EOLFixer {
    public static void main(String[] args) {
        String inputFileName = "input.txt"; // name of input file
        String outputFileName = "output.txt"; // name of output file
        String fixedEOL = "\r\n"; // fixed EOL character

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            reader.lines()
                    .map(line -> line + fixedEOL)
                    .forEach(line -> {
                        try {
                            writer.write(line);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

            System.out.println("EOLs fixed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
