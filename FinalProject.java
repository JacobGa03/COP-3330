//Final Project COP 3330
//Jacob Gadberry, Kaelyn Gadberry, Layla Severance 
//TA -
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class FinalProject {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //We will use the .length() to keep track of how many people have been entered
        ArrayList<Person> list = new ArrayList<Person>(100);
        //We will also create a student list in order to sort them later
        ArrayList<Student> stuList = new ArrayList<Student>();
        System.out.println("\t\t\t\tWelcome to my Personal Management Program\n\n");

        int choice = menu();

        while(choice != 8 && list.size()<=100){

            switch(choice){
                case 1:
                    addPersonToList(list,stuList, "faculty");
                    break;
                case 2:
                    addPersonToList(list,stuList, "student");
                    break;
                case 3:
                    printPerson(list,"student");
                    break;
                case 4:
                    printPerson(list,"faculty");
                    break;
                case 5:
                    addPersonToList(list,stuList, "staff");
                    break;
                case 6:
                    printPerson(list,"staff");
                    break;
                case 7:
                    deletePerson(list,stuList);
                    break;
                default:
                    System.out.println("Sorry, that is not a valid response. Please try again.");
                    break;
            }

            choice = menu();
        }

        System.out.println("\n\n");

        System.out.println("Would you like to create the report? (Y/N): ");

        if(scanner.nextLine().toLowerCase().equals("y")){
            System.out.print("Would like to sort your students by descending gpa or name (1 for gpa, 2 for name): ");

            boolean sortCheck = false;
            String sort = scanner.nextLine();
            while(!sortCheck){
                if(sort.toLowerCase().equals("1")){
                    Collections.sort(stuList, new sortByGPA());
                    break;
                }

                else if(sort.toLowerCase().equals("2")){
                    Collections.sort(stuList, new sortByName());
                    break;
                }

                else{
                    System.out.println("Invalid Input. Please try again.");
                    sort = scanner.nextLine();
                }
            }

            //Write the sorted student list to a txt file once done
            try{
                FileWriter file = new FileWriter("report.txt");

                //Get the current date
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
                LocalDateTime now = LocalDateTime.now(); 

                //Used to display the correct ordinal number when printing faculty and staff
                int numFound = 1;

                file.write("\t\t\tReport created on " + dtf.format(now)+"\n\t\t\t****************************\n\n");
                
                file.write("\tFaculty Members\n\t-------------------------\n");
                for(int i = 0; i<list.size(); i++){
                    if(list.get(i) instanceof Faculty){
                        String print = "\t\t"+(numFound) + ". "+list.get(i).getName() + "\n\t\tID: " + list.get(i).getId()+"\n\t\t"+(((Faculty) list.get(i)).getDepartment()) + ", "+ (((Faculty) list.get(i)).getRank()+"\n\n");
                        file.write(print);
                        numFound++;
                    }
                }
                numFound = 1;

                file.write("\tStaff Members\n\t-------------------------\n");
                for(int i = 0; i<list.size(); i++){
                    if(list.get(i) instanceof Staff){
                        String print = "\t\t"+(numFound) + ". "+list.get(i).getName() + "\n\t\tID: " + list.get(i).getId()+"\n\t\t"+(((Staff) list.get(i)).getDepartment()) + ", "+ (((Staff) list.get(i)).getStatus()+"\n\n");
                        file.write(print);
                        numFound++;
                    }
                }

                file.write("\tStudents\n\t-------------------------\n");
                for(int i = 0; i<stuList.size(); i++){
                    String print = "\t\t"+(i+1) + ". "+stuList.get(i).getName() + "\n\t\tID: " + stuList.get(i).getId()+"\n\t\tGpa: "+(((Student) stuList.get(i)).getGpa()) + "\n\t\tCredit Hours: "+ (((Student) stuList.get(i)).getNumberOfCreditHours()+"\n\n");
                    file.write(print);
                }

                file.close();
                
                System.out.println("\nReport was successfully added to your hard drive.");
            }
            catch(IOException ioe){
                System.out.println("Sorry, the file you are looking for doesn't exist. No report can be written.");
            }
        }
        
        System.out.println("Goodbye!");
    }

    public static int menu(){
        boolean enterCorrect = false;
        int choice = 0;

        System.out.println("Choose one of the options:\n");
        System.out.println("1- Enter the information a faculty");
        System.out.println("2- Enter the information of a student");
        System.out.println("3- Print tuition invoice for a student");
        System.out.println("4- Print faculty information");
        System.out.println("5- Enter the information of a staff member");
        System.out.println("6- Print the information of a staff member");
        System.out.println("7- Delete a person");
        System.out.println("8- Exit Program");
        
        while(!enterCorrect){
            //Check to make sure the response is a number
            try{
                System.out.print("Enter your selection: ");
                choice = scanner.nextInt();
                if((choice<1 || choice>8))
                    throw new InputMismatchException();
                enterCorrect = true;
            }
            catch(InputMismatchException ime){
                System.out.print("Sorry, that is not a valid response. Please try again. ");
                enterCorrect = false;
                scanner.nextLine();
            }
            scanner = new Scanner(System.in);
        }
        System.out.println("\n");

        return choice;
    }

    //Used to find people within the list or check to see if an id already exists
    public static boolean doesIdExist(ArrayList<Person> list, String id){

        for(int i = 0; i<list.size(); i++){
            if(list.get(i).getId().equals(id))
                return true;
        }

        return false;
    }

    //Method returns true if the id follows the format of 'LetterLetterDigitDigitDigitDigit'
    public static boolean properIDFormat(String id){

        return id.matches("[a-z]{2}[0-9]{4}");
    }

    //Method takes in ArrayList<Person> along with the type (enter like "student") of person they would like to add
    public static void addPersonToList(ArrayList<Person> list,ArrayList<Student> stuList, String typeOfPerson){

        switch(typeOfPerson){
                case "student":
                    String[] personInfo = getPersonInfo(list, "Student");

                    double[] studentInfo = getStudentInfo(list);

                    //Add the student to the list
                    list.add(new Student(personInfo[0],personInfo[1],studentInfo[0],(int) studentInfo[1]));
                    stuList.add(new Student(personInfo[0],personInfo[1],studentInfo[0],(int) studentInfo[1]));
                    System.out.println("Student added!");
                    break;

                case "faculty":
                    personInfo = getPersonInfo(list, "Faculty");

                    String[] facultyInfo = getEmployeeInfo(list, "faculty");

                    //Add the faculty member to the list
                    list.add(new Faculty(personInfo[0],personInfo[1],facultyInfo[0],facultyInfo[1]));
                    System.out.println("Faculty added!");
                    break;

                case "staff":
                    personInfo = getPersonInfo(list, "Staff");
                    
                    String[] staffInfo = getEmployeeInfo(list, "staff");

                    //Add the faculty member to the list
                    list.add(new Staff(personInfo[0],personInfo[1],staffInfo[0],staffInfo[1]));
                    System.out.println("Staff member added!");
                    break;
                    
                default:
                    System.out.println("\t\tInvalid Entry. Try Again.");
                    break;
        }
    }

    //Method takes ArrayList<Person> to search in, then a type of person to search, and then uses the print() from within that person's class
    public static void printPerson(ArrayList<Person> list, String person){
        System.out.print("Enter the "+ person + "'s id: ");
        String id = scanner.nextLine();
        if(!properIDFormat(id)){
            System.out.println("Invalid ID format. Must be LetterLetterDigitDigitDigitDigit");
            id = scanner.nextLine();
        }

        if(!doesIdExist(list, id)){
            System.out.println("No " + person + " matched!");
            return;
        }

        for(int i = 0; i<list.size(); i++){
            if(list.get(i).getId().equals(id)){
                //If we find the person, print them then break out of the 
                list.get(i).print();
                return;
            }
        }
    }
    //Takes in both normal ArrayList and Student ArrayList and will remove a person based on the id given.
    //In addition, if the person found is of type 'Student', then that person will also be removed from the stuList as well
    public static void deletePerson(ArrayList<Person> list,ArrayList<Student> stuList){

        System.out.print("Enter the id of the person to delete: ");
        String id = scanner.nextLine();
        if(!properIDFormat(id)){
            System.out.println("Invalid ID format. Must be LetterLetterDigitDigitDigitDigit");
            id = scanner.nextLine();
        }

        if(!doesIdExist(list, id)){
            System.out.println("Sorry no such person exists.");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {

                // If the person removed from the original list was a student, remove them from the student list too
                if (list.get(i) instanceof Student) {
                    Student stuToRemove = null;
                    for (Student student : stuList) {
                        if (student.getId().equals(id)) {
                            stuToRemove = student;
                            break;
                        }
                    }
                    if (stuToRemove != null) {
                        stuList.remove(stuToRemove);
                    }
                }
    
                // If we find the person, remove them from the list
                list.remove(i);
                System.out.println("Person was successfully deleted!\n");
                return;
            }
        }
    }

    //Collects the info for the person object
    public static String[] getPersonInfo(ArrayList<Person> list, String type){
        String[] personInfo = new String[2];

        //Name
        System.out.println("Enter the " + type + " Info: ");
        System.out.print("\t\tName of "+ type+ ": ");
        String name = scanner.nextLine();
        name = name.trim();

        while(!name.matches("[a-zA-Z ]+") || name.equals("")){
            System.out.println("\t\tInvalid Input. Names should only contain alphabetical characters.");
            System.out.print("\t\tName of Student: ");
            name = scanner.nextLine();
            name = name.trim();
        }

        name = name.trim();
        String[] properFormatName = name.split(" ");
        properFormatName[0] = properFormatName[0].replace(properFormatName[0].charAt(0), Character.toUpperCase(properFormatName[0].charAt(0)));
        properFormatName[0] = properFormatName[0].replace(properFormatName[0].substring(1), properFormatName[0].substring(1).toLowerCase());
        properFormatName[1] = properFormatName[1].replace(properFormatName[1].charAt(0), Character.toUpperCase(properFormatName[1].charAt(0)));
        properFormatName[1] = properFormatName[1].replace(properFormatName[1].substring(1), properFormatName[1].substring(1).toLowerCase());
        name = properFormatName[0] + " " + properFormatName[1];

        //ID
        System.out.print("\t\tID: ");
        String id = scanner.nextLine();
        id = id.trim();
        boolean idCheck = false;
        while(!idCheck){
            if(!properIDFormat(id) || id.equals("")){
                System.out.println("\t\tInvalid ID format. Must be LetterLetterDigitDigitDigitDigit");
                System.out.print("\t\tID: ");
                id = scanner.nextLine();
                id = id.trim();
            }
            else if(doesIdExist(list, id)){
                System.out.println("\t\tInvalid ID. The ID entered already exists in the database.");
                System.out.print("\t\tID: ");
                id = scanner.nextLine();
                id = id.trim();
            }
            else
                idCheck = true;
            }
            id = id.trim();
        //Input the information into the array
        personInfo[0] = name;
        personInfo[1] = id;

        return personInfo;
    }

    public static double[] getStudentInfo(ArrayList<Person> list){
        double[] studentInfo = new double[2];

        System.out.print("\t\tGPA: ");
            boolean gpaCheck = false;
            String grade = "";
            double gpa = 0;

            grade = scanner.nextLine();
            while(!gpaCheck){

                try{
                    gpa = Double.parseDouble(grade);
                    if(gpa<0 || gpa>4)
                        throw new NumberFormatException();

                    gpaCheck = true;
                }
                catch(NumberFormatException nfe){
                    System.out.println("\t\tInvalid GPA entered. Make sure you enter a decimal number.");
                    System.out.print("\t\tGPA: ");
                    grade = scanner.nextLine();
                }
            }
            //Credit Hours
            System.out.print("\t\tCredit Hours: ");
            boolean credCheck = false;
            String credHours = "";
            int creditHours = 0;

            credHours = scanner.nextLine();
            while(!credCheck){

                try{
                    creditHours = Integer.parseInt(credHours);
                    if(creditHours<0)
                        throw new NumberFormatException();

                    credCheck = true;
                }
                catch(NumberFormatException nfe){
                    System.out.println("Invalid Input. Please make sure you enter a non-negative whole number.");
                    System.out.print("\t\tCredit Hours: ");
                    credHours = scanner.nextLine();
                }
            }

        studentInfo[0] = gpa;
        studentInfo[1] = (double) creditHours;

        return studentInfo;
    }
    //Gets information for the Employee object, takes in the type of employee to create the different type of employees
    public static String[] getEmployeeInfo(ArrayList<Person> list, String typeOfEmployee){
        String[] employeeInfo = new String[2];

        if(typeOfEmployee.equals("faculty")){
            System.out.print("\t\tRank: ");
            String rank = scanner.nextLine();
            rank = rank.trim();
            while(!(rank.toLowerCase().equals("professor")||rank.toLowerCase().equals("adjunct")) || rank.equals("")){
                System.out.println("\t\t\""+rank+"\" is invalid");
                System.out.print("\t\tRank: ");
                rank = scanner.nextLine();
                rank = rank.trim();
            }
            if(rank.equals("professor"))
                rank = "Professor";
            else
                rank = "Adjunct";

            //Deparment
            System.out.print("\t\tDepartment: ");
            String department = scanner.nextLine();
            department = department.trim();
            while(!((department.toLowerCase().equals("mathematics"))||(department.toLowerCase().equals("engineering"))||(department.toLowerCase().equals("english")))|| department.equals("")){
                System.out.println("\t\t\""+department+"\" is invalid");
                System.out.print("\t\tDepartment: ");
                department = scanner.nextLine();
                department = department.trim();
            }
            if(department.equals("mathematics"))
                department = "Mathematics";
            else if(department.equals("engineering"))
                department = "Engineering";
            else
                department = "English";

            employeeInfo[0] = department;
            employeeInfo[1] = rank;

        }
        else if(typeOfEmployee.equals("staff")){
            System.out.print("\t\tDepartment: ");
            String department = scanner.nextLine();
            department = department.trim();
            while(!((department.toLowerCase().equals("mathematics"))||(department.toLowerCase().equals("engineering"))||(department.toLowerCase().equals("english")))|| department.equals("")){
                System.out.println("\t\t\""+department+"\" is invalid");
                System.out.print("\t\tDepartment: ");
                department = scanner.nextLine();
                department = department.trim();
            }
            if(department.equals("mathematics"))
                department = "Mathematics";
            else if(department.equals("engineering"))
                department = "Engineering";
            else
                department = "English";

            //Status
            System.out.print("\t\tStatus, Enter P for Part Time, or Enter F for Full Time: ");
            String status = scanner.nextLine();
            status = status.trim();
            while(!(status.toLowerCase().equals("p")||status.toLowerCase().equals("f"))|| status.equals("")){
                System.out.println("\t\t\""+status+"\" is invalid");
                System.out.print("\t\tStatus, Enter P for Part Time, or Enter F for Full Time: ");
                status = scanner.nextLine();
                status = status.trim();
            }
            if(status.equals("f")){
                status = "Full Time";
            }
            else
                status = "Part Time";

            employeeInfo[0] = department;
            employeeInfo[1] = status;
        }

        return employeeInfo;
    }
}
//---------------------------
abstract class Person{
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Person(){
        this.name = "NoName";
        this.id = "no0000";
    }
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Takes in the name of the person and makes sure that capitlization is correct
    public String formatName(String name){
        String[] properFormatName = name.split(" ", 2);
        properFormatName[0] = properFormatName[0].replace(properFormatName[0].charAt(0), Character.toUpperCase(properFormatName[0].charAt(0)));
        properFormatName[0] = properFormatName[0].replace(properFormatName[0].substring(1,properFormatName[0].length()), properFormatName[0].substring(1,properFormatName[0].length()).toLowerCase());
        properFormatName[1] = properFormatName[1].replace(properFormatName[1].charAt(0), Character.toUpperCase(properFormatName[1].charAt(0)));
        properFormatName[1] = properFormatName[1].replace(properFormatName[1].substring(1,properFormatName[1].length()), properFormatName[1].substring(1,properFormatName[0].length()).toLowerCase());

        return properFormatName[0] + " " + properFormatName[1];
    }
        
    public abstract void print();
}
//---------------------------
class Student extends Person{
    private double gpa;
    private int numberOfCreditHours;

    public Student(String name, String id, double gpa, int numberOfCreditHours) {
        super(name, id);
        this.gpa = gpa;
        this.numberOfCreditHours = numberOfCreditHours;
    }

    public Student() {
        super();
        this.gpa = 0.0;
        this.numberOfCreditHours = 0;
    }

    public double getGpa() {
        return gpa;
    }

    public int getNumberOfCreditHours() {
        return numberOfCreditHours;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setNumberOfCreditHours(int numberOfCreditHours) {
        this.numberOfCreditHours = numberOfCreditHours;
    }

    //Student will get a 25% discount on tuition if the gpa >= 3.85
    @Override
    public void print(){
        //If the gpa >= 3.85 then we can display the 25% discount the student will recieve
        int goodGPA = 0;
        if(this.gpa>=3.85)
            goodGPA = 1;
        
        String[] money = formatMoney(goodGPA, this.numberOfCreditHours);
        String properName = formatName(this.getName());
        
        System.out.println("Here is the tuition invoice for " + this.getName() +":\n\n---------------------------------------------------------------------------");
        System.out.println(properName+"\t\t\t"+this.getId());
        System.out.println("Credit Hours: "+this.numberOfCreditHours+" ($236.45/credit hour)");
        System.out.println("Fees: $52\n\n");
        System.out.println("Total payment (after discount): $" +(money[0])+"\t\t($"+(money[1])+" discount applied)");
        System.out.println("---------------------------------------------------------------------------");
    }

    //Returns a String with formatting #,###.## so it is readable for the user
    private static String[] formatMoney(int goodGPA, int numberOfCreditHours){
        //moneyOwed[0] - Money owed | moneyOwed[1] - Discount applied
        String [] moneyOwed = new String[2];

        DecimalFormat df = new DecimalFormat("#,##.##");
        df.setGroupingUsed(true);
        df.setGroupingSize(3);
        
        if(goodGPA == 1){
            moneyOwed[0] = df.format((numberOfCreditHours * 236.45- (numberOfCreditHours * 236.45 * 0.25 * goodGPA))+52);
            moneyOwed[1] = df.format(numberOfCreditHours * 236.45 * 0.25 * goodGPA);
        }
        else{
            moneyOwed[0] = df.format((numberOfCreditHours * 236.45)+52);
            moneyOwed[1] = df.format(numberOfCreditHours * 236.45 * 0.25 * goodGPA);
        }

        return moneyOwed;
    }
}
//---------------------------
abstract class Employee extends Person{
    private String department;

    public Employee(String name, String id, String department){
        super(name,id);
        this.department = department;
    }

    public Employee(){
        super();
        this.department = "None";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    } 
}
//---------------------------
class Faculty extends Employee{
    private String rank;

    public Faculty(String name, String id, String department, String rank){
        super(name,id,department);
        this.rank = rank;
    }

    public Faculty(){
        super();
        this.rank = "None";
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public void print(){
        String properName= formatName(this.getName());

        System.out.println("---------------------------------------------------------------------------");
        System.out.println(properName +"\t\t\t"+this.getId());
        System.out.println(this.getDepartment()+ " Department, "+ this.getRank());
        System.out.println("---------------------------------------------------------------------------");
    }
}
//---------------------------
class Staff extends Employee{
    private String status;

    public Staff(String name, String id, String department, String status){
        super(name,id,department);
        this.status = status;
    }

    public Staff(){
        super();
        this.status = "None";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void print(){
        String properName = formatName(this.getName());

        System.out.println("---------------------------------------------------------------------------");
        System.out.println(properName +"\t\t\t"+this.getId());
        System.out.println(this.getDepartment()+ " Department, "+ getFullStatus(this.getStatus()));
        System.out.println("---------------------------------------------------------------------------");
    }
    
    private String getFullStatus(String status){
        if(status.equals("f"))
            return "Full Time";
        else
            return "Part Time";
    }
}
//------------Comparators---------------
class sortByGPA implements Comparator<Student>{

    @Override
    public int compare(Student s, Student t){
        return -1* Double.compare(s.getGpa(), t.getGpa());
        
    }
}
//---------------------------
class sortByName implements Comparator<Student>{

    @Override
    public int compare(Student s, Student t){
        return s.getName().compareToIgnoreCase(t.getName());
    }
}