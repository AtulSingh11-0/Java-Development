package FileHandling.fileHandling;

import java.io.*;
import java.util.Optional;

/*
* This class demonstrates how to create a custom file with the content provided by the user.
* */
public class CreatingCustomFile {
	public static void main ( String[] args ) {

		/*
		* create a BufferedReader object to read the input from the user
		* */
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

		try {
			System.out.print("Enter the file name without any extensions: "); // Ask the user to enter the file name
			Optional<String> optionalFileName = Optional.of("src/main/java/FileHandling/" + reader.readLine() + ".txt"); //
			// Read the
			// file name from the user and append the .txt extension to it

			// Check if the file name is provided by the user
			optionalFileName.ifPresentOrElse( fileName -> {
					try {
						boolean append = false; // flag to check if the user wants to append to the file

						/*
						* Create a new file object with the file name
						* */
						File file = new File(fileName);
						if ( file.exists() ) { // Check if the file already exists
							System.out.println("File already exists"); // If the file already exists, print a message to the user
						}

						boolean newFile = file.createNewFile(); // Create a new file with the file name
						if ( newFile ) { // Check if the file is created successfully
							System.out.println("File created successfully with path: " + file.getAbsolutePath()); // If the file is created successfully, print a message to the user
						} else { // If the file creation fails
							System.out.println("File creation failed"); // Print a message to the user
							System.out.print("Do you want to append to the file? (yes/no): "); // Ask the user if they want to append to the file
							append = reader.readLine().equalsIgnoreCase("y"); // Read the user input and set the append flag accordingly
						}
						/*
						* create a BufferedWriter object to write the content to the file
						* */
						BufferedWriter fileWriter = new BufferedWriter( new FileWriter(fileName, append));

						System.out.println("Enter the content to write to the file: "); // Ask the user to enter the content to write to the file
						String content = reader.readLine(); // Read the content from the user
						content = (append ? "\n" : "") + content; // If the user wants to append to the file, add a new line character before the content

						fileWriter.write(content); // Write the content to the file
						fileWriter.flush(); // Flush the content to the file
						System.out.println("Content written to the file successfully"); // Print a message to the user
						fileWriter.close(); // Close the file writer
					} catch ( IOException e) { // Catch any IOException that occurs
						System.out.println(e.getMessage()); // Print the error message to the user
					}
				},
				() -> System.out.println("File name is not provided") // If the file name is not provided by the user, print a message to the user
			);
		} catch ( IOException e ) { // Catch any IOException that occurs
			System.out.println(e.getMessage()); // Print the error message to the user
		}
	}
}
/*
* We tried to create a custom file with the content provided by the user.
* We asked the user to enter the file name without any extensions.
* We then read the file name from the user and appended the .txt extension to it.
* We created a new file object with the file name and checked if the file already exists.
* If the file already exists, we printed a message to the user. We then created a new file with the file name and checked if the file was created successfully.
* If the file was created successfully, we printed a message to the user.
* If the file creation failed, we printed a message to the user and asked the user if they wanted to append to the file.
* We then created a BufferedWriter object to write the content to the file.
* We asked the user to enter the content to write to the file and read the content from the user.
* We then wrote the content to the file and flushed the content to the file.
* We printed a message to the user and closed the file writer.
*
* This helped us to create a custom file with the content provided by the user and write the content to the file along with the option to append to the file and manage the file creation and writing process effectively.
*
* */