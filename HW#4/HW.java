// //Jacob Gadberry, Kaelyn Gadberry, Layla Severance COP 3330 HW#4
// import java.util.*;

// public class HW {
//     public static void main(String[] args) {
//         Employee emp1 = new Employee(111, "Jimmy Dean", 5256.32, 0);
//         Employee emp2 = new Employee(598, "Jen Johnson", 47370, 5);
//         Employee emp3 = new Employee(920, "Jan Jones", 47834.25, 1);
                
//         System.out.println(emp1.equals(emp3));
        
//         ArrayList<Employee> list = new ArrayList<>();
        
//         list.add(emp1);
//         list.add(emp2);
//         list.add(emp3);
            
//         list.sort(new sortByNetSalary());
//         System.out.println("Sorting Complete\n");
        
//         for (Employee e : list)
//             System.out.println(e);
//     }
// }

// class Employee {
//     private int id;
//     private String name;
//     private double salary;
//     private int numberOfDependents;

//     public Employee(int id, String name, double salary, int numberOfDependents) {
//         this.id = id;
//         this.name = name;
//         this.salary = salary;
//         this.numberOfDependents = numberOfDependents;
//     }

//     public Employee() {
//         this.id = -1;
//         this.name = "NoName";
//         this.salary = 0.0;
//         this.numberOfDependents = 0;
//     }

//     public int getId() {
//         return this.id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getName() {
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public double getSalary() {
//         return this.salary;
//     }

//     public void setSalary(double salary) {
//         this.salary = salary;
//     }

//     public int getNumberOfDependents() {
//         return this.numberOfDependents;
//     }

//     public void setNumberOfDependents(int numberOfDependents) {
//         this.numberOfDependents = numberOfDependents;
//     }

//     public double getNetPay(){
//         return this.netPay();
//     }

//     @Override
//     public String toString() {
//         return "[" + this.id + ", " + this.name + ", " + String.format("%.2f",this.netPay()) + "]";
//     }

//     private double netPay() {
//         return (this.salary * 0.91) + (this.numberOfDependents * 0.01 * this.salary);
//     }

//     @Override
//     public boolean equals(Object o) {
//         Employee e = (Employee) o;

//         if (!(o instanceof Employee) || o == null)
//             return false;

//         if (this.netPay() == e.netPay())
//             return true;
//         return false;
//     }
// }

// class sortByNetSalary implements Comparator<Employee> {

//     @Override
//     public int compare(Employee e, Employee f) {

//         return Double.compare(e.getNetPay(), f.getNetPay());
//     }
// }