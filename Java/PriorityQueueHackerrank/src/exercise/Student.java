package exercise;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double cgpa;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCGPA() {
		return cgpa;
	}

	public int compareTo(Student studentToCompare) {
		if (this.cgpa > studentToCompare.cgpa) {
			return -1;
		} else if (this.cgpa < studentToCompare.cgpa) {
			return 1;
		} else {
			if (name.compareTo(studentToCompare.name) == 0) {
				if (id == studentToCompare.id) {
					return 0;
				} else if (id > studentToCompare.id) {
					return 1;
				} else {
					return -1;
				}
			} else {
				if (this.name.compareTo(studentToCompare.name) < 0) {
					return -1;
				} else if (this.name.compareTo(studentToCompare.name) == 0) {
					return 0;
				} else {
					return 1;
				}
			}
		}
	}
}
