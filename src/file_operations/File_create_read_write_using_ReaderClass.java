package file_operations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_create_read_write_using_ReaderClass {

	public static void main(String[] args) throws IOException {
		Boolean isfilecreated = false;

		File file = new File("D:\\Testing Learning\\Java\\File_create_read_write_using_ReaderClass.txt");// create file
																											// object
		isfilecreated = file.createNewFile();// create a new file

		// check whether file is created or not
		if (isfilecreated == true) {
			System.out.println("File is created succesfully");
		} else {
			System.out.println("File already exists in the specified location");
		}

		// Write data into file using FileWriter
		FileWriter writer = new FileWriter(file); // Creates an object of FileWriter
		writer.write(Data.sampleString()); // writes string to the file
		writer.close(); // closes the writer
		System.out.println("Write data = " + Data.sampleString().toString());

		// Read data into file using FileWriter
		char[] readData = new char[100];
		FileReader reader = new FileReader(file); // Creates an object of FileWriter
		reader.read(readData); // writes string to the file
		String readDatatoString = new String(readData);
		System.out.println("Data read = " + readDatatoString);
		reader.close();

		// Delete file
		Boolean isdeleted = file.delete();

		if (isdeleted == true) {
			System.out.println("File is deleted successfully");
		} else {
			System.out.println("File is not deleted");
		}
	}

}
