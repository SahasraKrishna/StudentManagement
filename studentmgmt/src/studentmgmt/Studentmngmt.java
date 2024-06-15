package studentmgmt;

import java.util.*;

public class Studentmngmt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Actions ac = new Actions();
		int choice;
		Menu m = new Menu();
		m.displayMenu();
		do {
			System.out.println("choose the choice from menu :");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				ac.displayStudents();
				break;
			case 2:
				ac.addStudent();
				System.out.println("Student record added successfully");
				break;
			case 3:
				ac.deleteStudent();
				System.out.println("Student record deleted successfully");
				break;
			case 4:
				ac.modifyStudent();
				System.out.println("Student record modifies successfully");
				break;
			case 5:
				break;
			}
		} while (choice != 5);
		sc.close();
	}
}
