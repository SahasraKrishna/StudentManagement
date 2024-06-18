package studentmgmt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Scanner;

public class Actions {
	// Scanner so = new Scanner(System.in);
	ArrayList<Student> students = new ArrayList<>();

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * It displays all students in the system
	 * 
	 * @return returns nothing
	 * @exception no
	 *                exceptions
	 * 
	 */
	void displayStudents() {
		System.out.println("  REGNO  \t   AGE  \t  NAME  \t  GENDER  \t  GRADE ");
		for (Student k : students)
			System.out.println(k);
	}

	/**
	 * It adds the student details into the arraylist
	 * 
	 * @return returns nothing
	 * @exception the
	 *                name has to be of finite length also name consists of only
	 *                alphabets but no numbers in it
	 * 
	 */
	void addStudent() {
		String name = readName();
		System.out.print("enter the age:");
		int age = readAge();
		System.out.print("enter the gender:");
		String gender = "M";
		try {
			gender = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		System.out.print("enter the grade:");
		// int gr = sc.nextInt();
		int gr = 44;
		Student l = new Student(age, name, gender, gr);
		students.add(l);
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (name.length() > 50);
		return name;
	}

	/**
	* 
	*/
	void deleteStudent() {

		int gr1 = readRegno();
		// students.removeIf(s -> s.getRegno() == gr1);
	}

	private int readRegno() {
		int regno = 0;
		try {
			System.out.print("enter the regno:");
			String tmp = br.readLine();
			regno = Integer.parseInt(tmp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return regno;

	}

	void modifyStudent() {
		System.out.println("enter the regno of student to be modified:");
		// int regno1 = sc.nextInt();
		// sc.nextLine();
		// for (Student s1 : students) {
		// if (s1.getRegno() == regno1) {
		// System.out.print("enter the age:");
		// int age = sc.nextInt();
		// sc.nextLine();
		// System.out.print("enter the name:");
		// String name1 = sc.nextLine();
		// System.out.print("enter the gender:");
		// String gender = sc.nextLine();
		// System.out.print("enter the grade:");
		// int gr = sc.nextInt();
		// s1.setAge(age);
		// s1.setName(name1);
		// s1.setGender(gender);
		// s1.setGrade(gr);
		// }

		// }
	}
}
