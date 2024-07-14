package FileHandling.reader;

import java.io.*;

/*
* This class demonstrates how to read from input stream and files using BufferedReader
* */
public class BufferedReaderExample {

  /*
  * This main method throws FileNotFoundException if the file is not found
  * */
  public static void main ( String[] args ) throws FileNotFoundException {

    /*
    * creating a BufferedReader object to read from input stream
    * */
    BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
    readFromInputStream( bufferedReader ); // calling readFromInputStream method and passing bufferedReader object to it

    /*
    * initializing bufferedReader object to read from file
    * */
    bufferedReader = new BufferedReader( new FileReader("src/sample.txt"));
    readFromFile( bufferedReader ); // calling readFromFile method and passing the reinitialized bufferedReader object to it
  }

  /*
  * This method reads from input stream by taking BufferedReader object as an argument
  * */
  public static void readFromInputStream ( BufferedReader reader ) {
    try {
      System.out.print( "Enter some text: " ); // prompting the user to enter some text
      String line = reader.readLine(); // reading the text entered by the user
      System.out.println( "Read from input stream: " + line ); // displaying the text entered by the user
    } catch ( IOException e ) { // catching the IOException
      System.out.println(e.getMessage()); // displaying the error message
    }
  }

  /*
  * This method reads from file by taking BufferedReader object as an argument
  * */
  public static void readFromFile ( BufferedReader reader ) {
    try {
      System.out.print( "\nRead from file: " ); // displaying the text
      while ( reader.ready() ) { // checking if the reader is ready to read
        System.out.println( reader.readLine() ); // reading the text from the file
      }
    } catch ( IOException e ) { // catching the IOException
      System.out.println(e.getMessage()); // displaying the error message
    }
  }
}
/*
* We learned how to read from input stream and files using BufferedReader.
* BufferedReader is used to read text from a character-input stream and provides buffering for efficient reading of characters, arrays, and lines and it is faster than Scanner class for reading text from input stream and files.
*
* We can read from input stream by creating a BufferedReader object and passing InputStreamReader object to it or by creating a BufferedReader object and passing FileReader object to it to read from files.
* We can read the text entered by the user by calling readLine() method on BufferedReader object and read the text from the file by calling readLine() method on BufferedReader object.
* We can check if the reader is ready to read by calling ready() method on BufferedReader object.
* BufferedReader class throws IOException, and we need to catch it.
*
* BufferedReader class is better than Scanner class for reading in the following ways:
* 1. BufferedReader is synchronized, and Scanner class is not synchronized.
* 2. BufferedReader is used to read text from input stream and files, and Scanner class is used to read text from input stream and files and parse primitive types and strings.
* 3. Scanner class parses the input into tokens using delimiter pattern, and BufferedReader reads the text line by line.
*
* */