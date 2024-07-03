package studentmgmt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Scanner;

public class Actions {
	// Scanner so = new Scanner(System.in);
//	private ArrayList<Student> students;
	private BufferedReader br;
	private FileOperation fo;
	private StudentDatabse db;

	public Actions() throws Exception {
		//students = new ArrayList<>();
		br = new BufferedReader(new InputStreamReader(System.in));
		fo = new FileOperation();
		db = new StudentDatabse();
	}

	/**
	 * It displays all students in the system
	 * 
	 * @return returns nothing
	 * @throws Exception
	 * @throws IOException
	 * @exception no
	 * 
	 */
	public void displayStudents() throws Exception {
		// ArrayList<Student> studentList = fo.displayData();
		// for (Student student : studentList)
		// System.out.println(student.regno + " \t" + student.age + " \t" + student.name
		// + " \t" + student.gender
		// + " \t" + student.grade);
		db.displayData();
	}

	/**
	 * It adds the student details into the arraylist
	 * 
	 * @return returns nothing
	 * @throws IOException
	 * @exception the
	 *                name has to be of finite length also name consists of only
	 *                alphabets but no numbers in it
	 * 
	 */
	public Student addStudent() {
		int regno = 0;
		String name = readName();
		int age = readAge();
		String gender = readGender();
		int grade = readGrade();
		Student student = new Student(regno, age, name, gender, grade);
		// fo.save(student);
		db.addData(student);
		return student;
	}

	/**
	 * used to store the value of the age of the student
	 * 
	 * @return age of student
	 * @exception NumberFormat
	 *                Exception
	 */

	private int readAge() {
		int result = 0;
		try {
			System.out.print("enter the age:");
			// return sc.nextInt();
			String tmp = br.readLine();
			result = Integer.parseInt(tmp);
		} catch (Exception e) {
			System.out.println("\nInvalid number,  Enter number values for Age");
			System.out.println(e.getMessage());
			// sc.reset();
			result = readAge();
		}
		return result;
	}

	/**
	 * it is used to store the name of the student
	 * 
	 * @return name of student @exception
	 */

	private String readName() {
		String name = null;
		do {
			System.out.println("enter the name:");
			// name = sc.nextLine();
			try {
				name = br.readLine();
				// System.out.println("Length :"+name.length());
				if (name.length() >= 50) {
					System.out.print("excceeds the required length");
					System.out.println("re-enter the name:");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (name.length() > 50);
		return name;
	}

	/*
	 * used to store the gender of the student
	 * 
	 * @return gender
	 * 
	 * @exception invalid gender
	 */
	private String readGender() {
		String gen = null;
		System.out.print("enter the gender:");
		try {
			gen = br.readLine();
			String[] g = { "male", "female", "M", "F", "male", "female", "m", "f" };
			boolean result = false;
			for (String gender : g) {
				if (gen.equalsIgnoreCase(gender)) {
					result = true;
					break;
				}
			}
			if (!result) {
				System.out.println("Inalid details, Please check the gender");
				return readGender();
			}

		} catch (IOException e) {
			System.out.println("\nInvalid details,  Enter values for gender");
			e.printStackTrace();
		}
		return gen;
	}

	/*
	 * it stores the grade of the student
	 * 
	 * @return student grade
	 * 
	 * @exception NumberFormatException
	 */
	private int readGrade() {
		int grade = 0;
		System.out.print("enter the grade:");
		String tmp;

		try {
			tmp = br.readLine();
			grade = Integer.parseInt(tmp);
			if (grade > 13) {
				System.out.println("please check the grade and re-enter:");
				return readGrade();
			}
		} catch (IOException e) {
			System.out.println("\n Invalid details, Enter number value for grade ");
			e.printStackTrace();
		}
		return grade;
	}

	/**
	 * deletes the student record
	 * 
	 * @return nothing
	 * @throws Exception
	 * @exception no
	 */
	public void deleteStudent() throws Exception {

		int regno = readRegno();
		// students.removeIf(s -> s.getRegno() == gr1);
		db.deleteData(regno);
	}

	/*
	 * it modifies the student details
	 * 
	 * @return the student record
	 * 
	 * @exception no
	 */
	public void modifyStudent() throws IOException {
		System.out.println("enter the regno of student to be modified:");
		int regno1 = readRegno();
		ArrayList<Student> students = fo.displayData();
		for (Student s1 : students) {
			if (s1.getRegno() == regno1) {
				int age = readAge();
				String name1 = readName();
				String gender = readGender();
				int gr = readGrade();
				// s1.setRegno(regno1);
				s1.setAge(age);
				s1.setName(name1);
				s1.setGender(gender);
				s1.setGrade(gr);
				// Student updatedstudent = new Student(regno1, age, name1, gender, gr);
				// students.add(updatedstudent);
				// fo.save(s1);
				// String path="E:\\WS2\\SamplePractice\\studentmgmt";
				// fo.writeToFile(path, s1.fileFormat(),regno1);
			}
			// else {
			// System.out.println(" given regno not found in the list");
			// }
		}
	}

	/*
	 * it takes the value of registrationnumber
	 * 
	 * @return registrationnumber
	 * 
	 * @exception NumberFormat Exception
	 */
	private int readRegno() {
		int regno = 0;
		String tmp;
		System.out.println("enter the regno:");
		try {
			tmp = br.readLine();
			regno = Integer.parseInt(tmp);
		} catch (IOException e) {
			System.out.print(" \n Invalid data, Enter number for the regno");
			e.printStackTrace();
		}
		return regno;
	}
}
