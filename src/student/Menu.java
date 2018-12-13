package student;

import java.util.Scanner;

public class Menu {
	
	String line = "\n\t\t*************************************************************************************************";
	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
//	Scanner input3 = new Scanner(System.in);
//	Scanner input4 = new Scanner(System.in);
//	Scanner input5 = new Scanner(System.in);

	public int mainMenu() {
		int option;
		System.out.println(line);
		System.out.println("\t\t\t\t\t######### WELCOME TO MANAGER STUDENT #########");
		System.out.println("\n\n\t\t\t\t\t\t\t1. Create new student.");
		System.out.println("\n\t\t\t\t\t\t\t2. Delete student.");
		System.out.println("\n\t\t\t\t\t\t\t3. Print student list.");
		System.out.println("\n\t\t\t\t\t\t\t4. Search Student.");
		System.out.println("\n\t\t\t\t\t\t\t5. Exit.");
		System.out.print("\n\t\t\tPlease Enter your Option here => ");
		
		
		while(!(input.hasNextInt())) {
			 System.out.println("\n\t\t\tYOU TYPED A WRONG OPTION, TRY (1,2,3) ");
			 System.out.print("\n\t\t\tPlease Enter your Option here => ");
			 input.next();
		 }
		
		option = input.nextInt();
		System.out.println(line);
		
		return option;
	}
	
	public Student studentDataMenu() {
		String name;
		String address;
		String email;
		String phone;
		int age;
		int id;
		
		Scanner input5 = new Scanner(System.in);
		System.out.println(line);
		System.out.println("\n\t\t\t\t\t\t\t    STUDENT CREATION PROCESS");
		System.out.print("\n\t\t\t\tStudent ID =>   ");
		id = Integer.parseInt(input5.nextLine());
		System.out.print("\n\t\t\t\tStudent name =>   ");
		name = input5.nextLine();
		System.out.print("\n\t\t\t\tStudent age =>   ");
		age = Integer.parseInt(input5.nextLine());
		System.out.print("\n\t\t\t\tStudent address =>   ");
		address = input5.nextLine();
		System.out.print("\n\t\t\t\tStudent phone =>   ");
		phone = input5.nextLine();
		System.out.print("\n\t\t\t\tStudent email =>   ");
		email = input5.nextLine();
		System.out.println(line);
		Student student = new Student(id,name,age,address,phone,email);
		return student;
	}

}
