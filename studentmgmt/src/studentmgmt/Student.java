package studentmgmt;

public class Student {
	public static int regnoGenerator = 0;
	int regno;
	int age;
	String name;
	String gender;
	int grade;

	public Student(int regno, int age, String name, String gender, int grade) {
		super();
		this.regno = ++regnoGenerator;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}

	public int getRegno() {
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

	public String fileFormat() {
		return regno + "|" + age + "|" + name + "|" + gender + "|" + grade + "\n";

	}

	/*
	 * this method is used to convert the line from the file into the student object
	 * 
	 * @returns student object
	 * 
	 * @exception no
	 */
	public static Student fromFile(String line) {
		String[] parts = line.split("|");
		String regno = parts[0];
		int regno1 = Integer.parseInt(regno);
		String age = parts[1];
		int age1 = Integer.parseInt(age);
		String name = parts[2];
		String gender = parts[3];
		String grade = parts[4];
		int grade1 = Integer.parseInt(grade);
		return new Student(regno1, age1, name, gender, grade1);
	}
	//why static??
}
