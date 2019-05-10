import java.util.*;

public class Company {
	
	private HashMap <String,Employee>employeeList;
	
	public Company() {
		this.employeeList = new HashMap<String,Employee>();
	}
	
	public void addEmployee(Employee employee) {
		
		String iD = employee.getId();
		this.employeeList.put(iD,employee);
	}
	
	public void removeEmployee(String iD) {
		
		this.employeeList.remove(iD);
	}
	
	public void printAll() {
		
		for (Employee e : this.employeeList.values()) {
			
			System.out.println(e);
		}
	}
	
	public void sortById(String iD) {
		
		System.out.println("First Name :");
		System.out.println(this.employeeList.get(iD).getfirstName());
		System.out.println("Last Name :");
		System.out.println(this.employeeList.get(iD).getlastName());
		System.out.println("Department : ");
		System.out.println(this.employeeList.get(iD).getDepartment());
		System.out.println("Email : ");
		System.out.println(this.employeeList.get(iD).generateEmail());
	}
}