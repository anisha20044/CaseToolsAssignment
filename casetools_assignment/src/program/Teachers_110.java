package program;

public class Teachers_110 {
	public String type;
 
    public void teaches() {
        System.out.println("This teacher teaches " + type);
    }
}

  
class TeacherTeaches extends Teachers_110 {
    // New member variable
    private String name;
 
    public TeacherTeaches(String type, String name) {
        this.type = type;
        this.name = name;
    }
 
    public void subjects() {
        System.out.println("The teacher " + name + " is teaching " + type);
    }
}

