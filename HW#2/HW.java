// //Layla Severance, Jacob Gadberry, Kaelyn Gadberry
// import java.util.*;

// public class HW {

// 	public static void main(String[] args) {
		
// 		// String fullName = "Erika T. Jones";
// 		// String employeeNumber = "ej789";
// 		// double payRate = 10.50, hoursWorked = 36.0;
// 		// // TA will change the payrate and the hours worked to test your code

// 		// Employee e;
// 		// e = new Employee(fullName, employeeNumber, payRate, hoursWorked);
		
// 		// System.out.println(e); // To Test your toString method
		
// 		// e.printCheck(); // This prints the check of Erika T. Jones
		
// 		// Company company = new Company();
		
// 		// company.hire ( new Employee ("Saeed Happy", "sh895" , 2 , 200) );
// 		// company.hire (e);
		
// 		// Company.printCompanyInfo();
		
// 		// company.hire( new Employee("Enrico Torres" , "et897" , 3 , 150) );
		
// 		// //You may add as many employees to company as you want.
// 		// //The TAs will add their own employees
// 		// //Make sure that each employee of company has a unique employeeNumber
		
// 		// company.printCheck("ab784");
		
// 		// company.deleteEmployeesBySalary(256.36);
		
// 		// company.reverseEmployees();
		
// 		// System.out.println( company.SearchByName("WaLiD WiLLiAms") );

// 		// company.printEmployees();
		
// 		// System.out.println("Bye!");
// 	}
// }
// //____________________________
// class Employee{
	
//     private String fullName;
//     private String employeeNumber;
//     private double payRate;
//     private double hoursWorked;

//     public Employee(String fullName, String employeeNumber, double payRate, double hoursWorked){
//         this.fullName = fullName;
//         this.employeeNumber = employeeNumber;
//         this.payRate = payRate;
//         this.hoursWorked = hoursWorked;
//     }
	
// 	//Getters and Setters 
// 	public String getFullName(){
// 		return this.fullName;
// 	}
	
// 	public void setFullName(String fullName){
// 		this.fullName = fullName;
// 	}
	
// 	public String getEmployeeNumber(){
// 		return employeeNumber;
// 	}
	
// 	public void setEmployeeNumber(String employeeNumber){
// 		this.employeeNumber = employeeNumber;
// 	}
	
// 	public double getPayRate(){
// 		return payRate;
// 	}
	
// 	public void setPayRate(double payRate){
// 		this.payRate = payRate;
// 	}
	
// 	public double getHoursWorked(){
// 		return hoursWorked;
// 	}
	
// 	public void setHoursWorked(double hoursWorked){
// 		this.hoursWorked = hoursWorked;
// 	}

// 	//toString, printCheck, and netPay
// 	@Override 
// 	public String toString(){
// 		return "[" + employeeNumber + "/" + fullName + ", " + payRate + " Hours @ " + hoursWorked + " per hour]";
// 	} 

//     private double netPay(double payRate, double hoursWorked){
//         return (payRate*hoursWorked)-(.06*payRate*hoursWorked);
//     }

//     //Prints information and pay amount for individual employees
//     public void printCheck(){
//         System.out.println("Employee's name:\t"+fullName);
//         System.out.println("Employee's number\t"+employeeNumber);
//         System.out.printf("Hourly rate of pay:\t%.2f", payRate);
//         System.out.printf("\nHours worked:\t\t%.2f\n", hoursWorked);
//         System.out.println();

//         System.out.printf("Total Gross Pay:\t$%.2f", payRate*hoursWorked);
//         System.out.println("\n");

//         System.out.println("Deductions");
//         System.out.printf("Tax (6 %% )\t\t$%.2f", .06*payRate*hoursWorked);
//         System.out.println("\n");

//         System.out.printf("Net Pay:\t\t$%.2f Dollars", netPay(payRate,hoursWorked));
//         System.out.println("\n");
//     }
// }//end of class Employee

// //____________________________
// class Company {
	
// 	private ArrayList<Employee> employeeList;
// 	private static String companyName;
// 	private static String companyTaxId;
// 	private static int numEmployees = 0;

// 	public Company() {
// 		employeeList = new ArrayList<>();
// 		companyName = "People's Place";
// 		companyTaxId = "v1rtua7C0mpan1";
// 	}
	
// 	//Add static Setters and Getters for companyName and companyTaxId
// 	public static String getCompanyName(){
// 		return companyName;
// 	}
	
// 	public static void setCompanyName(String newCompanyName){
// 		companyName = newCompanyName;
// 	}
	
// 	public static String getCompanyTaxId(){
// 		return companyTaxId;
// 	}
	
// 	public static void setCompanyTaxId(String newCompanyTaxId){
// 		companyTaxId = newCompanyTaxId;
// 	}

// 	public static int getNumEmployees(){
// 		return numEmployees;
// 	}
// 	//No need to add a Setter and Getter for employeeList since it's static
	
// 	public boolean hire( Employee employee ) {
// 		//Add employee to employeeList
// 		//Note well that we can't add an employee whose employeeNumber already 
// 		//assigned to another employee. In that case, this method returns false.
// 		//This method returns true otherwise

// 		//First, we check to see if the employee id number already exists.
// 		//If it doesn't, then we add the employee.
// 		String checkID = employee.getEmployeeNumber();

// 		for(int i = 0; i<employeeList.size(); i++){
// 			if(employeeList.get(i).getEmployeeNumber().equals(checkID)){
// 				//If this is true, that means that the employee number already exists.
// 				//Therefore, we cannot add the employee and return false

// 				return false;
// 			}
// 		}

// 		//If we don't break out of the loop above, we add the employee to the list
// 		employeeList.add(employee);
// 		numEmployees++;

//         return true;
// 	}
	
// 	public static void printCompanyInfo() {
// 		//This method prints the company name, its tax id and the current number of employees
// 		//You may choose to print that any way you like!
// 		System.out.println(getCompanyName() + " | " + getCompanyTaxId());
// 		System.out.println("Number of employees: " + getNumEmployees());
// 	}

// 	public void printEmployees() {
// 		//This methods prints all employees (One employee per line)
// 		//Note that you already have toString in Employee

// 		for(int i =0;i<employeeList.size(); i++){
// 			System.out.println(employeeList.get(i).toString());
// 		}
// 	}
	
// 	public int countEmployees( double maxSalary ) {
// 		//This method returns the number of employees paid less than maxSalary
// 		int count = 0;

// 		for(int i = 0; i<employeeList.size(); i++){
// 			double hrWorked = employeeList.get(i).getHoursWorked();
// 			double payRate = employeeList.get(i).getPayRate();
// 			double salary = (hrWorked*payRate)-(0.06*hrWorked*payRate);

// 			if(salary<maxSalary){
// 				count++;
// 			}
// 		}

// 		return count;
// 	}
	
// 	public boolean SearchByName (String fullName ) {
// 		//This method returns true if fullName exists as an employee.
// 		//It returns false otherwise
// 		//this is a not a case sensitive search.

// 		for(int i =0; i<employeeList.size(); i++){
// 			if(employeeList.get(i).getFullName().equalsIgnoreCase(fullName)){
// 				return true;
// 			}
// 		}

// 		return false;
// 	}
	
// 	public void reverseEmployees () {
// 		//This method reverses the order in which the employees were added to the list. 
// 		//The last employee is swapped with the first employee, the second last with the second and so on..

// 		Employee tempEm;
		
// 		for(int i = 0; i<numEmployees; i++){
// 			//Use the temporary Employee object to keep track of one object so we can make the switch
// 			tempEm = employeeList.get(i);

// 			employeeList.set(i, employeeList.get(numEmployees-1-i));
// 			employeeList.set(numEmployees-1-i, tempEm);

// 			//numEmployees-1-i refers to the "last" item to be switched in the list
// 			//If i> "last" item (list is an even length) or i== "last" item (list is an odd length), that means all the switches have take place
// 			if(i>(numEmployees-1-i) || i == (numEmployees-1-i))
// 				break;
// 		}
// 	}
	
// 	public void deleteEmployeesBySalary (double targetSalary ) {
// 		//This method deletes all employees who are paid targetSalary as a net salary

// 		for(int i = 0; i<employeeList.size(); i++){
// 			double hrWorked = employeeList.get(i).getHoursWorked();
// 			double payRate = employeeList.get(i).getPayRate();
// 			double salary = (hrWorked*payRate)-(0.06*hrWorked*payRate);

// 			if(salary==targetSalary){
// 				employeeList.remove(i);
// 				numEmployees--;
// 			}
// 		}
// 	}
	
// 	public void printCheck ( String employeeNumber) {
// 		//This method prints the check of the employee whose employee number is
// 		//employeeNumber. It prints NO SUCH EMPLOYEE EXISTS if employeeNumber is not a registered employee number.

// 		for(int i=0; i<employeeList.size(); i++){
// 			if((employeeList.get(i).getEmployeeNumber()).equals(employeeNumber)){
// 				employeeList.get(i).printCheck();
// 				return;
// 			}
// 		}
// 		System.out.println("NO SUCH EMPLOYEE EXISTS");
// 	}
// }//end of class Company