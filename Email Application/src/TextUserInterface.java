import java.util.*;
public class TextUserInterface {
	
	private Scanner reader;
	private Company company; 
	private Employee employee;
	
	public TextUserInterface() {
		this.reader = new Scanner(System.in);
		this.company = new Company();
		System.out.println("Welcome to Zain's Enterprises");
	}
	
	public void start() {
		
		adminInterFace();
		userSelection();
	}
	
	public void adminInterFace() {
		
		System.out.println("Select one of the following options :");
		System.out.println("-------------------------------------");
		System.out.println("[1] Add employee to database");
		System.out.println("[2] Remove employee from database");
		System.out.println("[3] Print details of single employee");
		System.out.println("[4] Print all employees in the company");
		System.out.println("[5] To exit the system and login with your credentials");
	}
	
	public void userInterface() {
		
		System.out.println("Welcome to the user Interface");
		System.out.println("-----------------------------");
		System.out.println("[1] Change your password");
		System.out.println("[2] To Exit the System");
	}
	
	public void userSelection() {
		
		while (true) {
			
			int input = userInput();
			
			if (input==1) {
				
				addEmployee();
				System.out.println();
				adminInterFace();
				
			}else if (input==2) {
				
				removeEmployee();
				System.out.println();
				adminInterFace();
				
			}else if (input==3) {
				
				sortById();
				System.out.println();
				adminInterFace();
				
			}else if (input==4) {
				
				printEmployees();
				System.out.println();
				adminInterFace();
				
			}else if (input==5) {
				
				System.out.println("Thank you for using the database");
				break;
			}
		}
	}
	
	public void addEmployee() {
		
		System.out.println("Enter the name of the first name of the employee");
		String firstName = this.reader.nextLine();
		
		System.out.println("Enter the last name of the employee");
		String lastName = this.reader.nextLine();
		
		this.employee = new Employee();
		this.employee.setFirstName(firstName);
		this.employee.setLastName(lastName);
		System.out.println("Choose from the following departments");
		System.out.println("-------------------------------------");
		System.out.println("[1] for AnalyticsDev");
		System.out.println("[2] for DataServerDev");
		System.out.println("[3] for ApplicationDev");
		
		String department = this.reader.nextLine();
		this.employee.setDepartment(parseStringtoInt(department));
		
		this.employee.setId();
		System.out.println("Here's your assigned iD");
		System.out.println(this.employee.getId());
		
		System.out.println(this.employee.generateEmail());
		System.out.println(this.employee.generatePassword());
		this.company.addEmployee(this.employee);
	}
	
	public void removeEmployee() {
		
		System.out.println("Enter the iD you wish to remove");
		String input = this.reader.nextLine();
		this.company.removeEmployee(input);
	}
	
	public void sortById() {
		
		System.out.println("Enter the iD of the employee");
		String input = this.reader.nextLine();
		this.company.sortById(input);
	}
	
	public void printEmployees() {
		
		this.company.printAll();
	}
	
	public int userInput() {
		
		String input = this.reader.nextLine();
		return parseStringtoInt(input);
	}
	
	public int parseStringtoInt(String input) {
		
		int output = Integer.parseInt(input);
		return output;
	}
}