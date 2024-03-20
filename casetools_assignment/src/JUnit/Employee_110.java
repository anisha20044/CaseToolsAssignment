package JUnit;

public class Employee_110 {
	    private String name;
	    private String jobTitle;
	    private double basicSalary;

	    // Constructor
	    public Employee_110(String name, String jobTitle, double basicSalary) {
	        this.name = name;
	        this.jobTitle = jobTitle;
	        this.basicSalary = basicSalary;
	    } 
	    
	    public double calculateDA() {
	        return 0.10 * basicSalary; // DA is 10% of basic salary
	    }

	    public double calculateTotalSalary() {
	        double DA = calculateDA();
	        double HRA = 5000;
	        return basicSalary + DA + HRA;
	    }

	    public void updateBasicSalary(double newSalary) {
	        this.basicSalary = newSalary;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getJobTitle() {
	        return jobTitle;
	    }

	    public double getBasicSalary() {
	        return basicSalary;
	    }


}
