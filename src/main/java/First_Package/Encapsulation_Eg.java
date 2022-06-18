package First_Package;

public class Encapsulation_Eg {

	public static void main(String[] args) {
		// create an object of Student class
		Student s = new Student();
		// set fields values using setter methods
		s.setId(27);
		s.setname("Tom Lee");
		// print values using getter methods
		System.out.println("Student Data:" + "\nStudent ID:" + s.getId() + " Student Name:" + s.getname());
	}

}

class Student {
	private int Student_Id;
	private String name;

	// getters, setters for Student_Id and name fields.
	public int getId() {
		return Student_Id;
	}

	public void setId(int s_id) {
		this.Student_Id = s_id;
	}

	public String getname() {
		return name;
	}

	public void setname(String s_name) {
		this.name = s_name;
	}
}
