package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
//	static Student[] students;
	static List<Student> students = new ArrayList<>();
	static Menu menu = new Menu();
	static Scanner input = new Scanner(System.in); 
	
	
	
	public static void main(String[] args) {
		int userOption;
		boolean flag= true;
		Main2 obj = new Main2();
		
		
		while(flag) {
			userOption = menu.mainMenu();
			
			switch (userOption) {
			
			case 1:
				obj.fillUp5Students();
				break;
			case 2:
				obj.deleteStudent();
				break;
			case 3:
				obj.printListStudent();
				break;
			case 4: 
				obj.searchStudent();
				break;
			case 5:
				System.out.println("\t\t\t\t\t\t\t\t\tHave a good day.");
				flag = false;
				break;
			default:
				System.out.println("\n\t WE SORRY, you typed a wrong option, please try again.");
			}
		}

	}
	
	
	
	public void fillUp5Students(){
		for(int j = 0; j < 5; j++) {
//			students[j] = menu.studentDataMenu();
			students.add(menu.studentDataMenu());
		}
		
	}
	
	
	public void printListStudent() {
		System.out.println("ID\t\tNAME\t\tAGE\t\tADDRESS\t\tTELEPHONE\t\tEMAIL");
		System.out.println("###################################################################################################################\n");
		for(int j = 0; j < students.size(); j++) {
			System.out.println(students.get(j).getIdstudent() + "\t\t" + students.get(j).getNameStudent() + "\t\t" + students.get(j).getAgeStudent() + "\t\t" + students.get(j).getAddressStudent() + "\t\t" + students.get(j).getTelephoneStudent() + "\t\t" + students.get(j).getEmailStudent());
		}
	}
	
	
	public void deleteStudent() {
		int studentId;
		System.out.println("\n\nPlease enter Student Id that you want delete.");
		studentId = input.nextInt();
		
		for(int j = 0; j < students.size(); j++) {
			if(students.get(j).getIdstudent() == studentId) {
				students.remove(j);
				j += 5;
			}
		}
	}
	
	public void searchStudent() {
		int studentId;
		System.out.println("\n\nPlease enter Student Id that you want search.");
		studentId = input.nextInt();
		
		for(int j = 0; j < students.size(); j++) {
			if(students.get(j).getIdstudent() == studentId) {
				System.out.println("ID\t\tNAME\t\tAGE\t\tADDRESS\t\tTELEPHONE\t\tEMAIL");
				System.out.println(students.get(j).getIdstudent() + "\t\t" + students.get(j).getNameStudent() + "\t\t" + students.get(j).getAgeStudent() + "\t\t" + students.get(j).getAddressStudent() + "\t\t" + students.get(j).getTelephoneStudent() + "\t\t" + students.get(j).getEmailStudent());
				j += 5;
				
			}
		}
	}
	

}
