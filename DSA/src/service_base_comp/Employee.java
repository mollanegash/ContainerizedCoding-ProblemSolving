package service_base_comp;

public class Employee {


	// Define Employee class with id, name, and salary
	
	    private int id;
	    private String name;
	    private double salary;

	    // Constructor
	    public Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    // Getters
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    // Override toString method to display employee details
	    @Override
	    public String toString() {
	        return id + ", " + name + ", " + salary;
	    }
	}



	


