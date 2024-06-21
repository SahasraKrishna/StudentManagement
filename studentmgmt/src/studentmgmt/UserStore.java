package studentmgmt;

import java.util.ArrayList;

public class UserStore {
	ArrayList<Student> students;
	UserStore(Student a)
	{
		
		students = new ArrayList<>();
		int regno=0;
		Student s1 = new Student(regno,12, "abel", "M", 3);
		Student s2 = new Student(regno,13, "John", "M", 5);
		Student s3 = new Student(regno,15, "Mary", "F", 8);
		Student s4 = new Student(regno,12, "LiZZie", "F", 2);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
	}
		void disp()
		{
			for(Student k:students)
				System.out.println(k);
		}
	}
