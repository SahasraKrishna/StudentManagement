package studentmgmt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

	private BufferedWriter writer;

	public FileOperation() {
		try {
			writer = new BufferedWriter(new FileWriter("output.txt", true));
		} catch (IOException e) {
			System.out.println("unable to open file\n" + e.getMessage());

		}
	}

	void save(Student student) {
		try {
			writer.write(student.fileFormat());
			writer.flush();
			System.out.println("student added successfully");
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	public void displayData() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				
			}
			reader.close();
               
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}