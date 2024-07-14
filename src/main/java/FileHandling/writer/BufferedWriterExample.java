package FileHandling.writer;

import java.io.*;

/*
* This class demonstrates the use of BufferedWriter to write text to a file.
* We have used BufferedReader to read the text from a console and, BufferedWriter to write this text to a file.
* */
public class BufferedWriterExample {

  /*
  * The main method throws an IOException because we are writing to a file.
  * */
  public static void main ( String[] args ) throws IOException {
    String filePath = "src/main/java/FileHandling/sample.txt"; // file path

    /*
    * create a BufferedReader object to read the text from the console.
    * create a BufferedWriter object to write the text to the console.
    * */
    BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ));
    BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter( System.out ));
    writeToConsole( bufferedReader, bufferedWriter ); // calling the writeToConsole method

    /*
    * re-initialize the BufferedWriter object to write the text to the file.
    * */
    bufferedWriter = new BufferedWriter( new FileWriter(filePath, true) );
    writeToFile( bufferedReader, bufferedWriter ); // calling the writeToFile method
  }

  /*
  * This method reads the text from the console and writes it to the console.
  * It takes BufferedReader and BufferedWriter objects as arguments.
  * It throws an IOException because we are writing to the console.
  * */
  public static void writeToConsole (
      BufferedReader reader,
      BufferedWriter writer
  ) {
    try {
      writer.write( "Enter some text: " ); // write to the console
      writer.flush(); // flush the buffer
      writer.write( "Input String: " + reader.readLine() ); // read from the console and then write to the console
      writer.flush(); // flush the buffer
//      writer.close(); // since we are writing to file as well, we should not close the writer here or else it will not be able to write to file.
    } catch ( IOException e ) { // handle the exception
      System.out.println(e.getMessage()); // print the exception message
    }
  }

  /*
  * This method reads the text from the console and writes it to the file.
  * It takes BufferedReader and BufferedWriter objects as arguments.
  * It throws an IOException because we are writing to the file.
  * */
  public static void writeToFile (
      BufferedReader reader,
      BufferedWriter writer
  ) {
    try {
      System.out.print( "\nInput something to write in the file: " ); // print to the console
      String line = "\n" + reader.readLine(); // read from the console
      String message = line +  """
        This is a sample text.
        from BufferedWriterExample class
        
        We have used BufferedReader to read the text from a console and,
        We have used BufferedWriter to write this text to a file.
        """; // append the text to the message
      writer.write( message ); // write to the file
      writer.flush(); // flush the buffer
      System.out.println("Text written to file successfully."); // print to the console
      writer.close(); // close the writer
    } catch ( IOException e ) { // handle the exception
      System.out.println(e.getMessage()); // print the exception message
    }
  }
}
/*
* We have used the BufferedWriter class to write text to a file.
* We have used the write() method to write the text to the file.
* We have used the flush() method to flush the buffer.
* We have used the close() method to close the writer.
* We have used the readLine() method to read the text from the console.
*
* We have used the InputStreamReader class to read the text from the console.
* We have used the FileWriter class to write the text to the file.
* We have used the OutputStreamWriter class to write the text to the console.
*
* */