package studentmgmt;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;

public class StudentDatabse {
	private Connection con;
	Scanner sc = new Scanner(System.in);

	StudentDatabse() throws Exception {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true");
		System.out.println("connection established  " + con);
	}

	public void displayData() throws Exception {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from test.student3");
			while (rs.next()) {
				int regno = rs.getInt("Id");
				int age = rs.getInt("age");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				int grade = rs.getInt("grade");
				System.out.println("Regno: " + regno + ", Age: " + age + ", Name: " + name + ", Gender: " + gender
						+ ", Grade: " + grade);
			}
		} catch (Exception e) {
			System.out.println("exception-displaydata - " + e.getMessage());
		}
	}

	public void addData(Student student) {
		PreparedStatement stmt;
		String query = "insert into test.student3 (ID,age,name,gender,grade) values(?,?,?,?,?)";
		try {
			stmt = con.prepareStatement(query);
			stmt.setInt(1, student.getRegno());
			stmt.setInt(2, student.getAge());
			stmt.setString(3, student.getName());
			stmt.setString(4, student.getGender());
			stmt.setInt(5, student.getGrade());
			int insertedrow = stmt.executeUpdate();
			System.out.println("data added successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteData(int id) throws Exception {
		PreparedStatement stmt;
		try {
			String query = "delete * from test.student3 where Id=?";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			int deletedrow = stmt.executeUpdate();
			System.out.println("Data deleted successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void modifyData() {
		PreparedStatement stmt;
		System.out.println("enter the regno of student to be modified:");
		int id = sc.nextInt();
		try {
			System.out.println("enter the name:");
			String name = sc.nextLine();
			System.out.println("enter the age");
			int age = sc.nextInt();
			System.out.println("enter the grade");
			int grade = sc.nextInt();
			System.out.println("enter the gender");
			String gender = sc.nextLine();
			String query = "update test.student3 set age=?,name=?,grade=?,gender=? where id=?";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.setInt(2, age);
			stmt.setString(3, name);
			stmt.setString(4, gender);
			stmt.setInt(5, grade);
			@SuppressWarnings("unused")
			int updatedrow = stmt.executeUpdate(query);
			System.out.println("data modified successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
