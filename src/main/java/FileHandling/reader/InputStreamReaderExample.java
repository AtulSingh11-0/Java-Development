package FileHandling.reader;

import java.io.IOException;
import java.io.InputStreamReader;

/*
* This class demonstrates how to read bytes from the standard input stream
* */
public class InputStreamReaderExample {
  public static void main ( String[] args ) {

    /* create an InputStreamReader object to read bytes from the standard input stream */
    try ( InputStreamReader reader = new InputStreamReader(System.in) ) {
      System.out.print("Input something: "); // prompt the user to input something

      int value = reader.read(); // read the first byte from the input stream
      System.out.print("You typed: "); // print the message to the console
      while ( reader.ready() ) { // check if the reader is ready to read more bytes
        System.out.print((char)value); // print the byte as a character
        value = reader.read(); // read the next byte from the input stream
      }

      /*
      * displaying the closing message to the console
      * IMPORTANT: the reader will be closed automatically after the try block, so we don't need to close it manually
      * */
      System.out.println("\nclosing the reader...");
    } catch ( IOException e ) { // catch the IOException if it is thrown
      System.out.println(e.getMessage()); // print the error message to the console
    }
  }
}
/*
* What we learned is that the InputStreamReader class is used to read bytes from the standard input stream.
* The read() method reads a single byte from the input stream and returns it as an integer. The ready() method checks if the reader is ready to read more bytes.
* The close() method closes the reader and releases any system resources associated with it.
*
* The InputStreamReader class is a bridge between byte streams and character streams.
* It reads bytes and decodes them into characters using a specified charset.
* The InputStreamReader class is used to read text from the standard input stream, files, or network connections.
* It is often used in combination with the BufferedReader class to read text from the standard input stream.
*
* Since Java 7, the try-with-resources statement can be used to automatically close the reader after the try block.
* */