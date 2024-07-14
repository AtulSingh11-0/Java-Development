package FileHandling.reader;

import java.io.FileReader;
import java.io.IOException;

/*
* This class demonstrates how to read a file using FileReader.
* */
public class FileReaderExample {
  public static void main ( String[] args ) {

    /* create a FileReader object to read the file "sample.txt" */
    try ( FileReader reader = new FileReader("src/main/java/File-Handling/sample.txt") ) {
      System.out.println("Reading the file..."); // print the message to the console

      int value = reader.read(); // read the first character from the file
      while ( reader.ready() ) { // check if the reader is ready to read more characters
        System.out.print((char) value); // print the character to the console
        value = reader.read(); // read the next character from the file
      }

      System.out.println("\nclosing the reader..."); // print the closing message to the console
    } catch ( IOException e) { // catch the IOException if it is thrown
      System.out.println(e.getMessage()); // print the error message to the console
    }
  }
}
/*
* What we learned is that the FileReader class is used to read characters from a file.
* The read() method reads a single character from the file and returns it as an integer.
* The ready() method checks if the reader is ready to read more characters.
* The close() method closes the reader and releases any system resources associated with it.
*
* The FileReader class is used to read text files character by character.
* It is often used in combination with the BufferedReader class to read text files line by line.
* */