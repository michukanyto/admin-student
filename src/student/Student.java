package student;

public class Student {
	int idStudent;
	String nameStudent;
	int ageStudent;
	String addressStudent;
	String telephoneStudent;
	String emailStudent;
	
	public Student(int id, String name, int age, String address, String telephone, String email) {
		idStudent = id;
		nameStudent = name;
		ageStudent = age;
		addressStudent = address;
		telephoneStudent = telephone;
		emailStudent = email;
	}
	
	public int getIdstudent() {
		return idStudent;
	}
	
	public String getNameStudent() {
		return nameStudent;
	}
	
	public int getAgeStudent() {
		return ageStudent;
	}
	
	public String getAddressStudent() {
		return addressStudent;
	}
	
	public String getTelephoneStudent() {
		return telephoneStudent;
	}
	
	public String getEmailStudent() {
		return emailStudent;
	}
	
	

}
