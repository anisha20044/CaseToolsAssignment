package program;

import java.util.Scanner;

public class TeachersMain_110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the subject being taught:");
	        String subject = scanner.nextLine();
 
	        TeacherTeaches teacher = new TeacherTeaches(subject, "John Doe");
 
	        teacher.subjects();

	}

}
