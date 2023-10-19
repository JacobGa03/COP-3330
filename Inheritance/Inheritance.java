// //Here we build on the idea of Inheritance
// public class Inheritance{
//     public static void main(String[] args) {
//         //Creating an Employee object works like it normally has

//         //Note: We can access public setters
//         // Salaried e = new Salaried();
//         // e.setId("2134");
//         // e.setName("John Smith");

//         //We don't have a toString() in Salaried, BUT we do have a public toString() inside the parent class
//         //If there was no toString(), then we would just print the default toString() from Java

//         //Constructing an inherited object
//         //Salaried e; 
//         //e = new Salaried("1234", "John Smith", 100000.0);
//         //e = new Salaried();

//         //System.out.println(e);

//         //e.printCheck();

//         //Another example of inheritance
//         //Hourly h = new Hourly("1234","Johnny Boi", 25, 15);
//         //h.printCheck();

//         //Legal, but not recommended
//         //Object j = new Employee();

//         Manager m = new Manager();

//         // //System.out.println(m);

//         m.setId("2134");
//         m.setName("John Smith");
//         m.setSalary(100000);
//         m.setBonus(1000);

//         // m.printCheck();

//         //_____________________________

//         Employee e; //We can create a refernce of type Employee
//         e = m;      //Now, e points to a Manager object
//         //System.out.println(e);

//         e = new Salaried("S234","Samid S.", 258);

//         //System.out.println(e.getSalary()); //Since e is an Employee reference, it can only see the public methods/
//         //fields of the data being overwritten

//         //If we tell Java that e is NOW of type Salaried, then we can access the fields within the Salaried object
//         //System.out.println(((Salaried)e).getSalary());

//         e = new Hourly("H234", "Jenna Jones",10,10);

        
//         /*
//          e = new Salaried();
//          e = new Hourly();

//          System.out.println(((Salaried)e).getSalary()); 
//          ^This will crash since e is an Hourly reference, NOT a Salaried

//          we can use the keyword "instanceof"
//          */

//         // if(e instanceof Salaried)
//         //     System.out.println("e is pointing Salaried object");
//         // else   
//         //     System.out.println("e isn't pointing to a Salaried object");


//         //Our Army of Employees
//         Employee [] list = new Employee[100]; //You have 0 Employee; you have a reference to an array of 100 Employee references

//         list[49] = new Manager("M1234", "Dizzy G.", 150000, 1000);
//         list[2] = new Hourly("H234","Hank Jones", 25,15.0);
//         list[0] = new Salaried("S546","Duke E.", 150000);

//         //We can do printCheck since it was first defined in the Employee class
        
//         for(Employee j : list){
//             //We need to make sure that our elements are NOT null when we print
//             if(j!=null)
//                 j.printCheck();
//         }
//     }
// }

// abstract class Employee{ //By making this abstract, no objects of type Employee can be made
//     //Every Employee has these reqs
//     private String id;
//     private String name;

//     public String getId(){
//         return id;
//     }

//     public void setId(String id){
//         this.id = id;
//     }

//     public String getName(){
//         return name;
//     }

//     public void setName(String name){
//         this.name = name;
//     }

//     public Employee(String id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     public Employee(){
//         this.id = "";
//         this.name = "";
//     }

//     @Override
//     public String toString(){
//         return "[Name: "+name+", ID: "+id+"]";
//     }

//     public void printCheck(){
//         System.out.println("Name: "+ name);
//         System.out.println("ID: "+ id);
//     }
    
// }

// //Here this type of employee inherits data and methods from its parent class (super class)
// class Salaried extends Employee{
//     //We can access ALL PUBLIC methods and data from within the parent class
//     private double salary;

//     public double getSalary(){
//         return salary;
//     }

//     public void setSalary(double salary){
//         this.salary = salary;
//     }

//     public Salaried(String id, String name, double salary){
//         //Calling the constructor in the parent class (MUST GO FIRST!)
//         super(id,name);
//         //Setting this field as normal;
//         this.salary = salary;
//     }
    
//     public Salaried(){
//         super();
//         this.salary = -1;
//     }

//     @Override
//     public String toString(){
//         //Works, but how can we display our employee info w/o using getters?
//         //return "Salary: "+salary;

//         //First, we call the toString() from Employee, then we call the toString() of Salaried
//         return super.toString() +" [Salary: "+salary +"]";
//     }

//     @Override
//     public void printCheck(){
//         //adding super is important since it tells Java were to go
//         //printCheck() will use recursion and cause a program crash since it is self-referential
//         super.printCheck();
//         System.out.println("Salary: "+salary);
//     }
// }

// class Hourly extends Employee{
//     private double hoursWorked;
//     private double wage;

//     public double getHoursworked(){
//         return hoursWorked;
//     }

//     public void setHoursWorked(double hoursWorked){
//         this.hoursWorked = hoursWorked;
//     }

//     public double getWage(){
//         return wage;
//     }

//     public void setWage(double wage){
//         this.wage = wage;
//     }

//     public Hourly(String id, String name, double hoursWorked, double wage){
//         super(id,name);
//         this.hoursWorked = hoursWorked;
//         this.wage = wage;
//     }

//     public Hourly(){
//         super();
//         //super("ID NOT SET", "NO NAME");
//         //^This will just call a different super constructor
//         this.hoursWorked = 0;
//         this.wage = 0;
//     }

//     public String toString(){
//         return super.toString() + "[ Hours Worked: " + hoursWorked + ", Wage: " + wage + " ]";
//     }

//     @Override
//     public void printCheck(){
//         super.printCheck();
//         System.out.println("[ Hours Worked: " + hoursWorked + ", Wage: " + wage + " ]");
//         System.out.println("Gross Payment: " + (hoursWorked*wage));
//     }
// }

// class Manager extends Salaried{
//     private double bonus;

//     public double getBonus(){
//         return bonus;
//     }

//     public void setBonus(double bonus){
//         this.bonus = bonus;
//     }

//     public Manager(){
//         //super(); //Still the empty constructor of Salary will be called
//         bonus = 0;
//     }

//     public Manager(String id, String name, double salary, double bonus){
//         super(id,name,salary);
//         this.bonus = bonus;
//     }

//     @Override //If we add an printCheck(int i ), this is no longer overriding, it is creating a NEW method entirely
//     public void printCheck(){
//         super.printCheck();
//         System.out.println("___________________");
//         System.out.println("Bonus: " + bonus);
//     }

//     @Override
//     public String toString(){
//         return "[Name: "+getName()+ ", ID: "+ getId() + "] [Manager bonus: " + bonus + " ]";
//     }
// }