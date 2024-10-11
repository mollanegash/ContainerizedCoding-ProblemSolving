package service_base_comp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TestData {

	    public static void main(String[] args) {
	        // Creating Employee objects
	        Employee e1 = new Employee(101, "CHETAN", 3000);
	        Employee e2 = new Employee(102, "AMAR", 2000);
	        Employee e3 = new Employee(103, "BHASKAR", 1500);

	        // Creating a HashMap to store Employee details
	        HashMap<Integer, Employee> employeeMap = new HashMap<>();
	        employeeMap.put(e1.getId(), e1);
	        employeeMap.put(e2.getId(), e2);
	        employeeMap.put(e3.getId(), e3);

	        // Get employee details in sorted order by employee name
	        List<Employee> sortedEmployees = employeeMap.values().stream()
	            .sorted(Comparator.comparing(Employee::getName))  // Sort by name
	            .collect(Collectors.toList());  // Collect sorted results to a list

	        // Print the sorted employee details
	        for (Employee emp : sortedEmployees) {
	            System.out.println(emp);
	        }
	    }
	}


