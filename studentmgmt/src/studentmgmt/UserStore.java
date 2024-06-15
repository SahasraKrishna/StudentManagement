package studentmgmt;

import java.util.ArrayList;

public class UserStore {
	ArrayList<Student> students;
	UserStore(Student a)
	{
		
		students = new ArrayList<>();
		Student s1 = new Student(12, "abel", "M", 3);
		Student s2 = new Student(13, "John", "M", 5);
		Student s3 = new Student(15, "Mary", "F", 8);
		Student s4 = new Student(12, "LiZZie", "F", 2);
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
