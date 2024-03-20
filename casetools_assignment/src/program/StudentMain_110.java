package program;

public class StudentMain_110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student_110 student1 = new Student_110();
	        Student_110 student2 = new Student_110();
	        Student_110 student3 = new Student_110();
 
	        student1.setInfo("John", 20); 
	        student2.setInfo("Alice", 22, "123 Main St");
	        student3.setInfo("Bob", 21, "456 Elm St");
 
	        System.out.println("Student 1:");
	        student1.printInfo();

	        System.out.println("Student 2:");
	        student2.printInfo();

	        System.out.println("Student 3:");
	        student3.printInfo();
	    }


}
