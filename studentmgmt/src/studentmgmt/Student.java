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
		if (regno >= regnoGenerator) {
			this.regno = regno;
		} else {
			this.regno = ++regnoGenerator;
		}
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
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
		String[] parts = line.split("\\|");
		String regno1 = parts[0];
		int regno = Integer.parseInt(regno1);
		String age = parts[1];
		int age1 = Integer.parseInt(age);
		String name = parts[2];
		String gender = parts[3];
		String grade = parts[4];
		int grade1 = Integer.parseInt(grade);
		Student student = new Student(regno, age1, name, gender, grade1);
		student.regno = regno;
		if (regno > regnoGenerator) {
			regnoGenerator = regno;
		}
		return student;
	}
	// why static??
}
