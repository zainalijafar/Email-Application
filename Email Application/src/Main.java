//import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		TextUserInterface txt = new TextUserInterface();
		txt.start();
		
/*		String firstName = "Zain";
		String lastName = "Jafar";
		
		Employee employee = new Employee(firstName,lastName);
		Employee employee2 = new Employee("Safder","Haider");
		employee.setId(260605943);
		employee2.setId(260605941);
//		employee.generateEmail();
		
//		System.out.println(employee.generatePassword());
//		employee.changePassword("daredevil123l");
//		System.out.println(employee.checkPasswordValidity("daredevil123!l"));
		
		Company company = new Company();
		company.addEmployee(employee);
		company.addEmployee(employee2);
		company.printAll();
		
		company.sortById(260605943);
		
		
/*		String firstName = firstName();
		String lastName = secondName();
		
		Company myemail = new Company(firstName,lastName);
		System.out.println(myemail.printInfo());
		
		Scanner userinput = new Scanner(System.in);
		System.out.println("You are welcome to change your password but enter generated password first: ");
		
		String passwordCheck = userinput.nextLine();
		
		if (passwordCheck.equals(myemail.getPassword())) {
			
			System.out.println("You have entered the right password" + " Now feel free to change by using special characters");
			
			String newpassword = userinput.nextLine();
			
			if (myemail.checkValidPassword(newpassword)) {
				
				myemail.changePassword(newpassword);
				System.out.println("Congratulations, here is your new password : " + myemail.getPassword());
				
			} else {
				
				throw new IllegalArgumentException("You have not satisfied requirements for change");
			}
			
		} else {
			
			throw new IllegalArgumentException("You have entered wrong password");
		}
*/	}
}