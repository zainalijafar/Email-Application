import java.util.*;

public class Employee {

	private String firstName;
	private String lastName;
	private String iD;
	private String department;
	private String changePassword;
	private int SetDefaultPasswordLength = 8;
	private String companyName = "zainsenterprise.com";
	private ArrayList<Character> charList;
	
	public Employee() {
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	
	public String generateEmail() {
		
		System.out.println("Your generated email is : ");
		return getfirstName().toLowerCase()+"."+getlastName().toLowerCase()+"@"+this.department+"."+this.companyName;
	}
	
	public String generatePassword() {
		
		String password = "ABCDEFGHIJKLMNOPQRSTUVXYZ1234567890!@#$%^&";
		
		String genPassword = "";
		
		for (int i=0; i<this.SetDefaultPasswordLength; i++) {
			
			Random rand = new Random();
			int number = rand.nextInt(password.length());
			genPassword = genPassword + password.charAt(number);
		}
		System.out.println("Your generated password is the following");
		return genPassword;
	}
	
	public String setDepartment(int number) {
		
		if (number==1) {
			
			this.department = "AnalyticsDev";
			return this.department;
			
		}else if (number ==2) {
			
			this.department = "DataServerDev";
			return this.department;
			
		}else if (number ==3) {
			
			this.department = "ApplicationDev";
			return this.department;
			
		}else {
			
			return "This department does not exist";
		}
	}
	
	public void changePassword(String changePassword) {
		
		this.changePassword = changePassword;
	}
	
	public String returnChangePassword() {
		
		return this.changePassword;
	}
	
	public String getDepartment() {
		
		return this.department;
	}
	
	public String getfirstName() {
		
		return this.firstName;
	}
	
	public String getlastName() {
		
		return this.lastName;
	}
	
	public boolean checkPasswordValidity(String changePassword) {
		
		String specialChars = "1234567890!@#$%^&*()";
		this.charList = new ArrayList<>();
		
		for (int i=0; i<specialChars.length(); i++) {
			
			this.charList.add(specialChars.charAt(i));
		}
			
		for (int i=0; i<changePassword.length(); i++) {
				
			if (this.charList.contains(changePassword.charAt(i))) {
					
				return true;
			}
		}
		return false;
	}
	
	public String setId() {
		
		String input = "123";
		String setId = "";
		
		for (int i=0; i<input.length(); i++) {
			
			Random rand = new Random();
			int rando = rand.nextInt(input.length());
			setId = setId + input.charAt(rando);
		}
		
		this.iD = setId;
		return setId;
	}
	
	public String getId() {
		
		return this.iD;
	}
	
	public String toString() {
		
		return this.iD + " : corresponds to " + this.firstName + " " + this.lastName + " in the department " + this.department; 
	}
}