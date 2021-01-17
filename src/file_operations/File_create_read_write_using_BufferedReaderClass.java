package file_operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_create_read_write_using_BufferedReaderClass {

	public static void main(String[] args) throws IOException {
		Boolean isfilecreated = false;

		File file = new File("D:\\Testing Learning\\Java\\File_create_read_write_using_BufferedReaderClass.txt");// create
		File file2 = new File("D:\\Testing Learning\\Java\\File_create_read_write_using_BufferedReaderClass1.txt"); // file
		// object
		isfilecreated = file.createNewFile();// create a new file

		// check whether file is created or not
		if (isfilecreated == true) {
			System.out.println("File is created succesfully");
		} else {
			System.out.println("File already exists in the specified location");
		}

		// Write data into file using FileWriter
		FileWriter writer = new FileWriter(file);
		BufferedWriter bufferedwriter = new BufferedWriter(writer); // Creates an object of FileWriter
		bufferedwriter.write(Data.sampleString()); // writes string to the file

		System.out.println("Write data = " + Data.sampleString().toString());
		FileReader reader2 = new FileReader(file2); // Creates an object of FileWriter
		BufferedReader bufferedreader2 = new BufferedReader(reader2);
		int c;
		while ((c = bufferedreader2.read()) != -1) {
			bufferedwriter.write(c);
		}
		bufferedwriter.close(); // closes the writer
		// Read data into file using FileWriter
		char[] readData = new char[100];
		FileReader reader = new FileReader(file); // Creates an object of FileWriter
		BufferedReader bufferedreader = new BufferedReader(reader);
		bufferedreader.read(readData); // writes string to the file

		String readDatatoString = new String(readData);
		System.out.println("Data read = " + readDatatoString);
		bufferedreader.close();

		// Delete file
		// Boolean isdeleted = file.delete();

		// if (isdeleted == true) {
		System.out.println("File is deleted successfully");
		// } else {
		System.out.println("File is not deleted");
		// }

	}

}
