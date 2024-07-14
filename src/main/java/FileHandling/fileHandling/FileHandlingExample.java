package FileHandling.fileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

/*
* This class demonstrates how to create a file using File class
* */
public class FileHandlingExample {
  public static void main ( String[] args ) {
    File file = new File("src/main/java/FileHandling/hello.txt"); // the constructor creates a new File object by
    // converting the given
    // pathname string into an abstract pathname
    try {
      if ( !file.exists() ) { // checks if the file exists
        boolean newFile = file.createNewFile(); // creates a new file
        if ( newFile ) // returns true if the file was created successfully
          System.out.println("File created Successfully"); // prints the message if the file was created successfully
        else // returns false if the file was not created
          System.out.println("File not created!!!"); // prints the message if the file was not created
      } else { // if the file already exists
        throw new FileAlreadyExistsException("File already exists"); // throws an exception if the file already exists
      }
    } catch ( IOException e ) { // catches the exception if an I/O error occurs
      System.out.println(e.getMessage()); // prints the error message
    } finally {
      file.deleteOnExit(); // deletes the file when the JVM exits
      System.out.println("File deleted successfully"); // prints the message after the file is deleted
    }
  }
}
/*
* We have used the File class to create a file in this example. The File class is used to create a new File object by converting the given pathname string into an abstract pathname.
* The createNewFile() method is used to create a new file. It returns true if the file was created successfully, and false if the file already exists.
* The exists() method is used to check if the file exists.
* If the file does not exist, we create a new file using the createNewFile() method.
* If the file already exists, we throw a FileAlreadyExistsException.
* The catch block catches the IOException if an I/O error occurs.
*
* The deleteOnExit() method deletes the file when the JVM exits.
* We have used the finally block to delete the file after the execution of the try block so that when we push the code to the repository and nothing is done with the file, it will not be present in the repository.
* So, I have used the deleteOnExit() method to delete the file when the JVM exits.
*
* */