package studentmgmt;

public class Student {
	public static int regnoGenerator=0;
	int regno;
	int age;
	String name;
	String gender;
	int grade;

	public Student(int age, String name, String gender, int grade) {
		super();
		this.regno = ++regnoGenerator;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}

	public  int getRegno() {
		return regno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [regno=" + regno + ", age=" + age + ", name=" + name + ", gender=" + gender + ", grade=" + grade
				+ "]";
	}

}
