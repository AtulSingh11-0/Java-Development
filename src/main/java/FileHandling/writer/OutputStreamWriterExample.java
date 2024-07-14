package FileHandling.writer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
* This class demonstrates how to use OutputStreamWriter to write data to the output stream.
* */
public class OutputStreamWriterExample {
  public static void main ( String[] args ) {

    /*
    * 1. creating an instance of OutputStreamWriter to write data to the output stream.
    * 2. creating an instance of BufferedReader to read data from the input stream.
    * */
    OutputStreamWriter writer = new OutputStreamWriter(System.out);
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
    try {
      writer.write("Enter something: "); // writing data to the output stream.
      writer.flush(); // flushing the data to the output stream.

      String line = reader.readLine(); // reading data from the input stream.

      writer.write("646"); // writing data to the output stream.
      writer.write("\nInput String: " + line); // writing data to the output stream.
      writer.flush(); // flushing the data to the output stream.
      writer.close(); // closing the writer.
    } catch ( IOException e ) { // catching the IOException.
      System.out.println(e.getMessage()); // printing the exception message.
    }
  }
}
/*
* We can use OutputStreamWriter to write data to the output stream.
* In this example, we have created an instance of OutputStreamWriter to write data to the output stream.
* We have also created an instance of BufferedReader to read data from the input stream.
* We have written some data to the output stream using the write() method of OutputStreamWriter.
* We have also read some data from the input stream using the readLine() method of BufferedReader.
* Finally, we have closed the writer using the close() method.
*
* It is important to flush the data to the output stream using the flush() method after writing the data.
* This ensures that the data is written to the output stream immediately or else it may be buffered and not written immediately.
*
* The close() method should be called after writing the data to the output stream to release the resources used by the writer.
*
* OutputStreamWriter is a bridge between character streams and byte streams. It converts characters into bytes using a specified character encoding.
* OutputStreamWriter is best suited for writing text data to the output stream.
*
* */