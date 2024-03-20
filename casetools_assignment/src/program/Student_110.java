package program;

public class Student_110 {
	private String name;
    private int age;
    private String address;

    public Student_110() {
        this.name = "Unknown";
        this.age = 0;  
        this.address = "Not available";
    }
 
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
 
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();
    }

}
