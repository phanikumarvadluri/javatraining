package com.org.exceptionhandlingexamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundA {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = null;
            BufferedReader bufferReader = null;
            fileReader = new FileReader("C:\\Users\\Phani Kumar\\IdeaProjects\\HelloFirst\\src\\com\\org\\exceptionhandlingexamples\\Test.txt");
            // create an instance of the BufferedReader and pass the FileReader instance to it.
            bufferReader = new BufferedReader(fileReader);
            // declaring an empty string by passing null value
            String fileData = null;
            // use while loop to read and print data from buffered reader
            while ((fileData = bufferReader.readLine()) != null) {
                System.out.println(fileData);
            }
            // closing the BufferedReader object
            bufferReader.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Filenotfound");
        } catch (NullPointerException nullPointerException) {
            System.out.println("Nullpointer");
        } catch (IOException nullPointerException) {
            System.out.println("IO");
        } catch (Exception ex) {
            System.out.println("other exception");
        }
    }
}
