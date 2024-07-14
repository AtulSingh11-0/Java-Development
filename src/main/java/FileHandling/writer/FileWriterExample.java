package FileHandling.writer;

import java.io.FileWriter;
import java.io.IOException;

/*
* This class demonstrates how to write a text file using FileWriter.
* */
public class FileWriterExample {
  public static void main ( String[] args ) {

    /*
    * creating a FileWriter object with the file path.
    * */
    try ( FileWriter writer = new FileWriter("src/main/java/FileHandling/sample.txt", true) ) {
      /*
      * message to write in the file.
      * */
      String message = """
          This is a sample text file.
          This file is created using FileWriter.
          """;
      writer.write(message); // writing the message to the file.
      System.out.println("File is written successfully."); // printing the success message.
      writer.flush(); // flushing the writer.
    } catch ( IOException e ) { // catching the IOException.
      System.out.println(e.getMessage()); // printing the exception message.
    }
  }
}
/*
* We can use the FileWriter class to write a text file. The FileWriter class is used to write character-oriented data to a file.
* The FileWriter class is a subclass of the OutputStreamWriter class.
*
* The FileWriter class has no public methods of its own. So, it uses the methods of its parent classes, which it inherits, such as OutputStreamWriter, Writer, and Object classes.
*
* */