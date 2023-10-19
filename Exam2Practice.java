import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class Exam2Practice {
	
	public static int Question1(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Employee{\n");
		System.out.println("\tpublic void work() { System.out.println(\"Employee working hard!\"); }");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {\n");
		if (explain == 1) System.out.println("\t\\\\ Work function for a manager will print \"Manager is slacking off\"");
		System.out.println("\tpublic void work() { System.out.print(\"Manager slacking off!\"); }\n");
		System.out.println("}\n");
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\\\\ Creates a new Manager object of type Employee");
		System.out.println("\t\tEmployee es = new Manager();\n");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the work function of a manager");
		System.out.println("\t\tes.work();\n");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ The answer is 2");
		System.out.println("-----------------------------------------");
		System.out.println("1) Employee working hard!");
		System.out.println("2) Manager slacking off!");
		System.out.println("3) None of the other options\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e)	{}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question2(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Employee{\n");
		System.out.println("\tpublic void work() { System.out.println(\"Employee working hard!\"); }");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {\n");
		if (explain == 1) System.out.println("\t\\\\ This never gets called");
		System.out.println("\tpublic void work(int hours) { System.out.print(\"Manager slept for \" + hours); }\n");
		System.out.println("}\n");
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\\\\ Creates a new Manager object of type Employee");
		System.out.println("\t\tEmployee es = new Manager();\n");
		if (explain == 1) System.out.println("\t\t\\\\ Calls a work function that doesn't exist for Employee");
		System.out.println("\t\tes.work(4);\n");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ The program does not compile, the answer is 2");
		System.out.println("-----------------------------------------");
		System.out.println("1) Employee working hard!");
		System.out.println("2) None of the other options");
		System.out.println("3) Manager slept for 0");
		System.out.println("4) Manager sleptfor 4\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question3(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Employee{\n");
		System.out.println("\tpublic void work() { System.out.println(\"Employee working hard!\"); }");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {\n");
		System.out.println("\tpublic void work() { System.out.print(\"Manager slacking off!\"); }\n");
		System.out.println("}\n");
		System.out.println("class Supervisor extends Employee {\n");
		if (explain == 1) System.out.println("\t\\\\ Calls this function in main");
		System.out.println("\tpublic void work() { System.out.print(\"Supervisor taking a nap!\"); }\n");
		System.out.println("}\n");
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates a new Supervisor object of type Employee");
		System.out.println("\t\tEmployee es = new Supervisor();\n");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the work() function for Supervisor");
		System.out.println("\t\tes.work();\n");
		if (explain == 1) System.out.println("t't\\\\ Prints \" AND \"");
		System.out.println("\t\tSystem.out.printlnl(\" AND \");\n");
		if (explain == 1) System.out.println("\t\t\\\\ Object now points to a new Manager object");
		System.out.println("\t\tes = new Manager();\n");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ The answer is 2");
		System.out.println("-----------------------------------------");
		System.out.println("1) Supervisor taking a nap! AND Manager slacking off!");
		System.out.println("2) Supervisor taking a nap! AND ");
		System.out.println("3) None of the other options");
		System.out.println("4) Employee working hard!\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question4(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Employee{\n");
		System.out.println("\tpublic void work() { System.out.println(\"Employee working hard!\"); }");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {\n");
		if (explain == 1) System.out.println("\t\t\\\\ This function gets called by main");
		System.out.println("\tpublic void work() { System.out.print(\"Manager slacking off!\"); }\n");
		System.out.println("}\n");
		System.out.println("class Supervisor extends Employee {\n");
		System.out.println("\tpublic void work() { System.out.print(\"Supervisor taking a nap!\"); }\n");
		System.out.println("}\n");
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ es points to a new Supervisor object of type Employee");
		System.out.println("\t\tEmployee es = new Supervisor();");
		if (explain == 1) System.out.println("\t\t\\\\ em points to a new Manager object of type Employee");
		System.out.println("\t\tEmployee em = new Manager();");
		if (explain == 1) System.out.println("\t\t\\\\ e points to a new Employee object of type Employee");
		System.out.println("\t\tEmployee e = new Employee();\n");
		if (explain == 1) System.out.println("\t\t\\\\ e now points to a em's Manager object");
		System.out.println("\t\te = em;");
		if (explain == 1) System.out.println("\t\t\\\\ em now points to a es's Supervisor object");
		System.out.println("\t\tem = es;");
		if (explain == 1) System.out.println("\t\t\\\\ es now points to a e's Manager object");
		System.out.println("\t\tes = e;\n");
		if (explain == 1) System.out.println("\t\t\\\\ calls the Manager work() function");
		System.out.println("\t\tes.work();\n");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ The answer is 1");
		System.out.println("-----------------------------------------");
		System.out.println("1) Manager slacking off!");
		System.out.println("2) None of the other options");
		System.out.println("3) Supervisor taking a nap!");
		System.out.println("4) Employee working hard!\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question5(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates an array of String object references called \"names\" of size 3");
		System.out.println("\t\tString[] names = new String[3];\n");
		System.out.println("\t\tint i = 0;\n");
		if (explain == 1) System.out.println("\t\t\\\\ Iterates through the String references in the array");
		System.out.println("\t\tfor (String name: names) {");
		if (explain == 1) System.out.println("\t\t\t\\\\ Creates a new String object of content \"S\"");
		System.out.println("\t\t\tname = new String(\"S\");");
		if (explain == 1) System.out.println("\t\t\t\\\\ Sets each spot in the array to the new String object");
		System.out.println("\t\t\tnames[i] = name;");
		System.out.println("\t\t\ti++;");
		System.out.println("\t\t}\n");
		System.out.println("\t\ttry {");
		if (explain == 1) System.out.println("\t\t\t\\\\ Iterates through the String objects in the array");
		System.out.println("\t\t\tfor (String name: names)");
		if (explain == 1) System.out.println("\t\t\t\t\\\\ Prints the contents of each String object");
		System.out.println("\t\t\t\tSystem.out.print(name);");
		System.out.println("\t\t}");
		if (explain == 1) System.out.println("\t\t\\\\ It is only printing the value of the references so no NullPointerException and it does");
		if (explain == 1) System.out.println("\t\t\\\\ not try to go out of the bounds of the array so no exceptions are caught");
		System.out.println("\t\tcatch (Exception e) {");
		System.out.println("\t\t\tSystem.out.println(\"E\");");
		System.out.println("\t\t}");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"SSS\" so the answer is 2");
		System.out.println("-----------------------------------------");
		System.out.println("1) S");
		System.out.println("2) None of the other options");
		System.out.println("3) SSSE");
		System.out.println("4) E\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question6(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ fastBoat points to a new Boat object of type Vehicle");
		System.out.println("\t\tVehicle fastBoat = new Boat();");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the print() function in the Vehicle class");
		System.out.println("\t\tfastBoat.print();");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("class Vehicle {");
		if (explain == 1) System.out.println("\t\\\\ Function is called and returned back to main");
		System.out.println("\tpublic int print() {");
		System.out.println("\t\tSystem.out.print(\"Vehicle\");");
		System.out.println("\t\treturn 0;");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("class Boat extends Vehicle {");
		System.out.println("\tpublic void print(int i) {");
		System.out.println("\t\tSystem.out.print(\"Boat\");");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"Vehicle\" so the answer is 2");
		System.out.println("-----------------------------------------");
		System.out.println("1) None of the other options");
		System.out.println("2) Vehicle");
		System.out.println("3) VehicleBoat");
		System.out.println("4) Boat\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question7(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		System.out.println("\t\tint a = 0, b = 3;");
		System.out.println("\t\tint[] array = { 1, 2, 3 };\n");
		System.out.println("\t\ttry {");
		if (explain == 1) System.out.println("\t\t\t\\\\ Tries to print the value at array[3] which does not exist");
		System.out.println("\t\t\tSystem.out.println(array[b]);\n");
		System.out.println("\t\t\ttry {");
		System.out.println("\t\t\t\tSystem.out.println(b \\ a);");
		System.out.println("\t\t\t} catch (NullPointerException npe) {");
		System.out.println("\t\t\t\tSystem.out.print(\"A\");");
		System.out.println("\t\t\t}\n");
		if (explain == 1) System.out.println("\t\t\\\\ The out of bounds exception is caught");
		System.out.println("\t\t} catch (Exception e) {");
		if (explain == 1) System.out.println("\t\t\t\\\\ Prints \"B\"");
		System.out.println("\t\t\tSystem.out.print(\"B\");");
		System.out.println("\t\t} finally {\n");
		if (explain == 1) System.out.println("\t\t\t\\\\ Prints \"C\"");
		System.out.println("\t\t\tSystem.out.print(\"C\");");
		System.out.println("\t\t}");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"BC\" so the answer is 3");
		System.out.println("-----------------------------------------");
		System.out.println("1) None of the other options");
		System.out.println("2) ABC");
		System.out.println("3) BC");
		System.out.println("4) 3BC\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question8(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		System.out.println("\t\tParent[] list = new Child[2];\n");
		if (explain == 1) System.out.println("\t\t\\\\ Iterates through the list and creates new Child objects with x = 1, y = 2");
		System.out.println("\t\tfor (Parent p: list) { p = new Child(1,2); }\n");
		System.out.println("\t\ttry {");
		if (explain == 1) System.out.println("\t\t\t\\\\ Tries to call the print function for list[0] which is a null pointer");
		System.out.println("\t\t\tlist[0].print();");
		System.out.println("\t\t\tlist[1].print();");
		System.out.println("\t\t}");
		if (explain == 1) System.out.println("\t\t\\\\ NullPointerException is caught here and the message is printed");
		System.out.println("\t\tcatch (Exception e) { System.out.println(\"Have a nice Thanksgiving!\"); }");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("abstract class Parent {");
		System.out.println("\tprivate int x;");
		System.out.println("\tpublic Parent(int x) { this.x = x; }");
		System.out.println("\tpublic abstract void print();");
		System.out.println("}\n");
		System.out.println("class Child extends Parent {");
		System.out.println("\tprivate int y;\n");
		System.out.println("\tpublic Child(int x, int y) {");
		System.out.println("\t\tsuper(x);");
		System.out.println("\t\tthis.y = y;");
		System.out.println("\t}\n");
		System.out.println("\tpublic void print() {");
		System.out.println("\t\tSystem.out.print(y);");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"Have a nice Thanksgiving!\" so the answer is 3");
		System.out.println("-----------------------------------------");
		System.out.println("1) 12");
		System.out.println("2) 22");
		System.out.println("3) Have a nice Thanksgiving!");
		System.out.println("4) None of the other options\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question9(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("interface P");
		System.out.println("{");
		System.out.println("\tpublic void doNothing();");
		System.out.println("}\n");
		System.out.println("public class Main implements P{\n");
		System.out.println("\tpublic void doNothing() {");
		if (explain == 1) System.out.println("\t\t\\\\ Prints \"abc\"");
		System.out.println("\t\tSystem.out.print(\"abc\");");
		System.out.println("\t}");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the doNothing(int dammy) function");
		System.out.println("\t\tdoNothing(0);");
		System.out.println("\t}");
		System.out.println("\tpublic static void doNothing(int dammy) {");
		if (explain == 1) System.out.println("\t\t\\\\ Uses Main to call the non-static doNothing() function first");
		System.out.println("\t\t(new Main()).doNothing();");
		if (explain == 1) System.out.println("\t\t\\\\ Then prints \"xyz\"");
		System.out.println("\t\tSystem.out.print(\"xyz\");");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"abcxyz\" so the answer is 5");
		System.out.println("-----------------------------------------");
		System.out.println("1) xyzabc");
		System.out.println("2) abc");
		System.out.println("3) xyz");
		System.out.println("4) None of the other options");
		System.out.println("5) abcxyz\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question10(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ obj refers to a new MyClass object of type MyAbstract");
		System.out.println("\t\tMyAbstract obj = new MyClass();");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the print(int i) method in class MyAbstract");
		System.out.println("\t\tobj.print(5);");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("abstract class MyAbstract {");
		System.out.println("\tpublic int i;");
		System.out.println("\tpublic void print(int i) {");
		if (explain == 1) System.out.println("\t\t\\\\ Sets the obj.i to 6");
		System.out.println("\t\tthis.i = 6;");
		if (explain == 1) System.out.println("\t\t\\\\ Prints the value of argument i");
		System.out.println("\t\tSystem.out.println(i);");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("class MyClass extendsd MyAbstract {");
		System.out.println("\tpublic void print() {");
		System.out.println("\t\ti = 5;");
		System.out.println("\t\tSystem.out.println(this.i);");
		System.out.println("\t}\n");
		System.out.println("\tpublic MyClass() {");
		System.out.println("\t\ti = 4;");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"5\" so the answer is 3");
		System.out.println("-----------------------------------------");
		System.out.println("1) None of the other options");
		System.out.println("2) 6");
		System.out.println("3) 5");
		System.out.println("4) 4\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question11(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class KitchenAppliance {");
		System.out.println("\tprivate String appName;");
		System.out.println("\tprivate String appUse;\n");
		System.out.println("\tpublic void setDetails(String appName, String appUse) {");
		System.out.println("\t\tthis.appName = appName;");
		System.out.println("\t\tthis.appUse = appUse;");
		System.out.println("\t}\n");
		System.out.println("\tpublic void printDetails() {");
		System.out.println("\t\tSystem.out.print(appName+\"|\"+appUse+\"|\");");
		System.out.println("\t}\n");
		System.out.println("\tpublic void setPrice(double price) {");
		System.out.println("\t\tprice = 199.99;");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("public class Blender extends KitchenAppliance {");
		System.out.println("\tprivate double appPrice;\n");
		System.out.println("\tpublic void setPrice(double appPrice) {");
		System.out.println("\t\tthis.appPrice = appPrice;");
		System.out.println("\t}\n");
		System.out.println("\tpublic void printDetails() {");
		System.out.println("\t\tsuper.printDetails();");
		System.out.println("\t}\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates reference mxCompany to a new Blender object of type KitchenAppliance");
		System.out.println("\t\tKitchenAppliance mxCompany = new Blender();");
		if (explain == 1) {System.out.println("\t\t\\\\ Calls the setDetails(String appName, String appUse) method");
						   System.out.println("\t\t\\\\ Sets mxCompany.appName to \"Blender\" and mxCompany.appUse to \"blends food\"");}
		System.out.println("\t\tmxCompany.setDetails(\"Blender\", \"blends food\");");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the setPrice(double price) method to set mxCompany.price to 145.99");
		System.out.println("\t\tmxCompany.setPrice(145.99);");
		if (explain == 1) { System.out.println("\t\t\\\\ Calls the printDetails() method in the Blender class");
		                  System.out.println("\t\t\\\\ Which calls the printDetails() method in the KitchenAppliance class"); }
		System.out.println("\t\tmxCompany.printDetails();");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"Blender|blends food|\" so the answer is 3");
		System.out.println("-----------------------------------------");
		System.out.println("1) 145.99|");
		System.out.println("2) Blender|blends food|145.99|");
		System.out.println("3) Blender|blends food|");
		System.out.println("4) None of the other options\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question12(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Vehicle {");
		System.out.println("\tprivate String vehicleName\n;");
		System.out.println("\tpublic void setName(String name) {");
		System.out.println("\t\tvehicleName = name;");
		System.out.println("\t}\n");
		System.out.println("\tpublic String toString() {");
		System.out.println("\t\treturn vehicleName;");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("class Boat extends Vehicle {");
		System.out.println("\tprivate int numEngines;\n");
		System.out.println("\tpublic Boat(int num) {");
		System.out.println("\t\tnumEngines = num;");
		System.out.println("\t}\n");
		System.out.println("\tpublic String toString() {");
		System.out.println("\t\treturn super.toString() + \" \" + numEngines;");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("public class Main {");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates reference fastBoat to a new Boat object of type Boat");
		System.out.println("\t\tBoat fastBoat = new Boat(2);");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the setName(String name) method to set fastBoat.vehicleName to \"Firebird\"");
		System.out.println("\t\tfastBoat.setName(\"Firebird\");");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the toString method for Boat which calls the toString method for Vehicle");
		System.out.println("\t\tSystem.out.print(fastboat);");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"Firebird 2\" so the answer is 4");
		System.out.println("-----------------------------------------");
		System.out.println("1) Firebird");
		System.out.println("2) None of the other options");
		System.out.println("3) fastBoat");
		System.out.println("4) Firebird 2");
		System.out.println("5) Boat@f35a442b\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question13(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("interface Thing {");
		System.out.println("\tpublic void doingSomething();");
		System.out.println("}\n");
		System.out.println("class Vehicle implements Thing {");
		System.out.println("\t@Override");
		System.out.println("\tpublic String toString() {");
		System.out.println("\t\treturn \"Vehicle for \";");
		System.out.println("\t}");
		if (explain == 1) System.out.println("\t\\\\ The class Vehicle does not have a doingSomething() function, this will not compile");
		System.out.println("}\n");
		System.out.println("class Boat extends Vehicle {");
		System.out.println("@Override");
		System.out.println("\tpublic String toString() {");
		System.out.println("\t\treturn \"Boat for \";");
		System.out.println("\t}");
		System.out.println("\t@Override");
		System.out.println("\tpublic void doingSomething() {");
		System.out.println("\t\tSystem.out.print(\"boating\");");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("public class Main {");
		System.out.println("\tpublic static void main(String[] args) {");
		System.out.println("\t\tVehicle vb = new Boat();");
		System.out.println("\t\tSystem.out.print(vb);");
		System.out.println("\t\tvb.doingSomething();");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This program does not compile so the answer is 2");
		System.out.println("-----------------------------------------");
		System.out.println("1) Boat for boating");
		System.out.println("2) None of the other options");
		System.out.println("3) vb boating");
		System.out.println("4) Vehicle for Boating\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question14(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("interface Thing {");
		System.out.println("\tpublic void doingSomething();");
		System.out.println("}\n");
		System.out.println("class Vehicle implements Thing {\n");
		System.out.println("\t@Override");
		System.out.println("\tpublic void doingSomething() {");
		System.out.println("\t\tSystem.out.print(\"vroom vroom\");");
		System.out.println("\t}\n");
		System.out.println("\t@Override");
		System.out.println("\tpublic String toString() {");
		System.out.println("\t\treturn \"Vehicle for \";");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("class Boat extends Vehicle {\n");
		System.out.println("\t@Override");
		System.out.println("\tpublic void doingSomething() {");
		System.out.println("\t\tSystem.out.print(\"sail sail\");");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("public class Main {");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates a reference vb to a new Boat object of type Vehicle");
		System.out.println("\t\tVehicle vb = new Boat();");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the toString() for the Vehicle class");
		System.out.println("\t\tSystem.out.print(vb);");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the doingSomething() method in the Boat Class");
		System.out.println("\t\tvb.doingSomething();");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"Vehicle for sail sail\" so the answer is 1");
		System.out.println("-----------------------------------------");
		System.out.println("1) Vehicle for sail sail");
		System.out.println("2) Vehicle for vroom vroom");
		System.out.println("3) None of the other options");
		System.out.println("4) sail sail\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question15(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates a reference p to a new Child object of type Parent where p.y = 1");
		System.out.println("\t\tParent p = new Child(1,2);");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the print() method in the Child class");
		System.out.println("\t\tp.print();;");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("abstract class Parent {");
		System.out.println("\tprivate int x;\n");
		System.out.println("\tpublic void setX(int x) {");
		System.out.println("\t\tthis.x = x;");
		System.out.println("\t}\n");
		System.out.println("\tpublic Parent() {");
		System.out.println("\t\tthis.x = 2;");
		System.out.println("\t}\n");
		System.out.println("\tpublic abstract void print();");
		System.out.println("}\n");
		System.out.println("class Child extends Parent {");
		System.out.println("\tprivate int y;\n");
		System.out.println("\tpublic Child(int x, int y) {");
		System.out.println("\t\tthis.y = x;");
		System.out.println("\t}\n");
		System.out.println("\tpublic void print() {");
		System.out.println("\t\tSystem.out.print(y);");
		System.out.println("\t}");
		System.out.println("}");
		if (explain == 1) System.out.println("\\\\ This prints \"1\" so the answer is 1");
		System.out.println("-----------------------------------------");
		System.out.println("1) 1");
		System.out.println("2) y");
		System.out.println("3) None of the other options");
		System.out.println("4) 2\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question16(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class MyException extends Exception {");
		System.out.println("\tpublic String getMessage() {");
		System.out.println("\t\treturn \"My Bad!\";");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("public class Main {");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Tries to print the message");
		System.out.println("\t\ttry{");
		System.out.println("\t\t\tSystem.out.print(\"In try: \");");
		if (explain == 1) System.out.println("\t\t\t\\\\ Print is successful but throws MyException exception");
		System.out.println("\t\t\tthrow new MyException();");
		if (explain == 1) System.out.println("\t\t\\\\ MyException exception is caught and the getMessage() method is called");
		System.out.println("\t\t} catch (MyException me) {");
		System.out.println("\t\t\tSystem.out.print(me.getMessage());");
		if (explain == 1) System.out.println("\t\t\\\\ An exception has already been caught, skip this");
		System.out.println("\t\t} catch (Exception e) {");
		System.out.println("\t\t\tSystem.out.print(\"Ah!\");");
		if (explain == 1) System.out.println("\t\t\\\\ This is always called");
		System.out.println("\t\t} finally {");
		System.out.println("\t\t\tSystem.out.print(\"Regardless\");");
		System.out.println("\t\t}");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"In try: My Bad!Regardless\" so the answer is 4");
		System.out.println("-----------------------------------------");
		System.out.println("1) In try: Regardless");
		System.out.println("2) None of the other options");
		System.out.println("3) In try: MyBad!Ah!Regardless");
		System.out.println("4) In try: MyBad!Regardless\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}

	public static int Question17(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Employee {");
		System.out.println("\tpublic void work(Employee e) {");
		System.out.println("\t\tSystem.out.print(\"A\");");
		System.out.println("\t}\n");
		System.out.println("\tpublic void work(Manager m) {");
		System.out.println("\t\tSystem.out.print(\"B\");");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {");
		System.out.println("\tpublic void work(Employee e) {");
		System.out.println("\t\tSystem.out.print(\"C\");");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("public class Main {");
		System.out.println("\tpublic static void checkingOn(Employee e1, Employee e2) {");
		if (explain == 1) System.out.println("\t\t\\\\ Calls work(Employee e2) method in class Employee");
		System.out.println("\t\te1.work(e2);");
		System.out.println("\t}\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates reference e to new Employee object of type Employee");
		System.out.println("\t\tEmployee e = new Employee();");
		if (explain == 1) System.out.println("\t\t\t\\\\ Creates reference m to new Manager object of type Manager");
		System.out.println("\t\tManager m = new Manager();");
		if (explain == 1) System.out.println("\t\t\\\\ Creates reference em to new Manager object of type Employee");
		System.out.println("\t\tEmployee em = new Manager();\n");
		if (explain == 1) { System.out.println("\t\t\\\\ Calls checkingOn(Employee e, Manager m) method in Main");
						  System.out.println("\t\t\\\\ This is only allowed because all Managers are also Employees");}
		System.out.println("\t\tcheckingOn(e, m);");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"A\" so the answer is 3");
		System.out.println("-----------------------------------------");
		System.out.println("1) B");
		System.out.println("2) None of the other options");
		System.out.println("3) A");
		System.out.println("4) C\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question18(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("abstract class Employee {");
		System.out.println("\tpublic abstract void work();");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {");
		System.out.println("\tprivate double salary;\n");
		System.out.println("\tpublic void work() { salary = 0; }");
		System.out.println("\tpublic Manager(double salary) { this.salary = salary; }");
		System.out.println("\tpublic void work(double salary) { System.out.print(\"M\" + salary);");
		System.out.println("}\n");
		System.out.println("class Supervisor extends Manager {");
		System.out.println("\tpublic Supervisor() { super(100); }");
		System.out.println("\tpublic void work() { System.out.print(\"S\"); }");
		System.out.println("}\n");
		System.out.println("public class Main {");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates reference m to new Manager object of type Employee with m.salary = 50");
		System.out.println("\t\tEmployee m = new Manager(50);");
		if (explain == 1) System.out.println("\t\t\t\\\\ Creates reference s to new Supervisor object of type Employee with s.salary = 100");
		System.out.println("\t\tManager s = new Supervisor();\n");
		if (explain == 1) System.out.println("\t\t\\\\ m now references the same Supervisor object as s");
		System.out.println("\t\tm = s;\n");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the work() method in the Supervisor class");
		System.out.println("\t\tm.work();");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"S\" so the answer is 1");
		System.out.println("-----------------------------------------");
		System.out.println("1) S");
		System.out.println("2) M100");
		System.out.println("3) None of the other options");
		System.out.println("4) M50\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question19(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("interface Person {");
		System.out.println("\tpublic String type();");
		System.out.println("}\n");
		System.out.println("abstract class Employee implements Person {");
		System.out.println("\tpublic void work(int salary) { System.out.print(\"M\" + salary);\n");
		System.out.println("\tpublic abstract void work();");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {");
		System.out.println("\tprivate int salary;\n");
		System.out.println("\tpublic String type() { return \"Manager\"; }");
		System.out.println("\tpublic void work() { salary = 0; }");
		System.out.println("\tpublic Manager(int salary) { this.salary = salary; }");
		System.out.println("\tpublic void work(int salary) { System.out.print(\"M\" + salary); }");
		System.out.println("}\n");
		System.out.println("public class Main {");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates reference m to new Manager object of type Manager with m.salary = 50");
		System.out.println("\t\tManager m = new Manager(50);");
		if (explain == 1) System.out.println("\t\t\t\\\\ Creates reference e to new Manager object of type Employee with e.salary = 100");
		System.out.println("\t\tEmployee e = new Manager(100);\n");
		if (explain == 1) System.out.println("\t\t\\\\ calls the type() method in class Manager and prints the statement");
		System.out.println("\t\tSystem.out.print(m.type() + \" and \" );");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the work() method in the Employee class");
		System.out.println("\t\te.work();");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"Manager and M50\" so the answer is 3");
		System.out.println("-----------------------------------------");
		System.out.println("1) None of the other options");
		System.out.println("2) Manager and M100");
		System.out.println("3) Manager and M50");
		System.out.println("4) Manager and M0\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question20(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates an array of String object references of size 2");
		System.out.println("\t\tString[] names = new String[2];\n");
		System.out.println("\tint i = 0;\n");
		if (explain == 1) System.out.println("\t\t\t\\\\ Iterates through all of the String references in names");
		System.out.println("\t\tfor (String name: names) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates new String objects of content \"1\" and adds them to names");
		System.out.println("\t\t\tname = new String(\"1\");");
		System.out.println("\t\t\tnames[i] = name;");
		System.out.println("\t\t\ti++;");
		System.out.println("\t\t}\n");
		if (explain == 1) System.out.println("\t\t\\\\ Tries to iterate through names and print all of the Strings");
		System.out.println("\t\ttry {");
		System.out.println("\t\t\tfor (String name: names)");
		System.out.println("\t\t\t\tSystem.out.print(name);\n");
		if (explain == 1) System.out.println("\t\t\t\\\\ The system will successfully print all of the names, so NullPointerException is thrown");
		System.out.println("\t\t\tthrow new NullPointerException();\n");
		if (explain == 1) System.out.println("\t\t\\\\ NullPointerException caught here, \"A\" is printed");
		System.out.println("\t\t} catch (NullPointerException npe) {");
		System.out.println("\t\t\tSystem.out.print(\"A\");");
		if (explain == 1) System.out.println("\t\t\\\\ Exception already caught, skip this");
		System.out.println("\t\t} catch (Exception e) {");
		System.out.println("\t\t\tSystem.out.print(\"ERROR\");");
		if (explain == 1) System.out.println("\t\t\\\\ This will always be called, \"A\" is printed");
		System.out.println("\t\t} finally {");
		System.out.println("\t\t\tSystem.out.print(\"A\");");
		System.out.println("\t\t}");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"11AA\" so the answer is 4");
		System.out.println("-----------------------------------------");
		System.out.println("1) 11ERRORA");
		System.out.println("2) 11ERRPR");
		System.out.println("3) 11A");
		System.out.println("4) None of the other options\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question21(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {");
		System.out.println("\tpublic static void main(String[] args) {");
		System.out.println("int a = 0, b = 3;\n");
		if (explain == 1) System.out.println("\t\t\\\\ Tries to run the following code");
		System.out.println("\t\ttry {");
		if (explain == 1) System.out.println("\t\t\\\\ Tries to print b / a");
		System.out.println("\t\t\t try{");
		System.out.println("\t\t\t\tSystem.out.println(b / a);");
		if (explain == 1) System.out.println("\t\t\\\\ This is an ArithmeticException not a NullPointerExcepiton so it is not caught");
		System.out.println("\t\t\t} catch (NullPointerException npe) {");
		System.out.println("\t\t\t\tSystem.out.print(\"A\");");
		if (explain == 1) System.out.println("\t\t\\\\ This is always called, \"B\" is printed");
		System.out.println("\t\t\t} finally {");
		System.out.println("\t\t\t\tSystem.out.print(\"B\");");
		System.out.println("\t\t\t}");
		if (explain == 1) System.out.println("\t\t\\\\ Catches the Exception from the nested try block, \"C\" is printed");
		System.out.println("\t\t} catch (Exception e) {");
		System.out.println("\t\t\tSystem.out.print(\"C\");");
		if (explain == 1) System.out.println("\t\t\\\\ This is always called, \"D\" is printed");
		System.out.println("\t\t} finally {");
		System.out.println("\t\t\tSystem.out.print(\"D\");");
		System.out.println("\t\t}");
		System.out.println("\t}");
		System.out.println("}\n");
		
		if (explain == 1) System.out.println("\\\\ This prints \"BCD\" so the answer is 3");
		System.out.println("-----------------------------------------");
		System.out.println("1) None of the other options");
		System.out.println("2) CD");
		System.out.println("3) BCD");
		System.out.println("4) ABCD\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question22(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class A {\n");
		System.out.println("}\n");
		System.out.println("class B extends A {");
		System.out.println("\tpublic String toString() {");
		System.out.println("\t\treturn super.toString() + \"A\";");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("class C extends B {");
		System.out.println("\tpublic String toString() {");
		System.out.println("\t\treturn \"C\";");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("public class Main {");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates reference aObject of a new C object of type A");
		System.out.println("\t\tA aObject = new C();");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the toString in the C class");
		System.out.println("\t\tSystem.out.println(aObject);");
		System.out.println("\t}");
		System.out.println("}\n");
		
		if (explain == 1) System.out.println("\\\\ This prints \"C\" so the answer is 3");
		System.out.println("-----------------------------------------");
		System.out.println("1) AC");
		System.out.println("2) C@36baf30cAC");
		System.out.println("3) C");
		System.out.println("4) None of the other options\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question23(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Employee{\n");
		System.out.println("\tpublic void work() { System.out.println(\"Employee working hard!\"); }");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {\n");
		System.out.println("\tpublic void work(int hours) { System.out.print(\"Manager slept for \" + hours); }\n");
		System.out.println("}\n");
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\\\\ Creates a new Manager object of type Employee");
		System.out.println("\t\tEmployee es = new Manager();\n");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the work() method in class Employee");
		System.out.println("\t\tes.work();\n");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"Employee working hard!\" so the answer is 1");
		System.out.println("-----------------------------------------");
		System.out.println("1) Employee working hard!");
		System.out.println("2) None of the other options");
		System.out.println("3) Manager slept for 0");
		System.out.println("4) Manager sleptfor 4\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question24(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Employee{\n");
		System.out.println("\tpublic void work(int hours) { System.out.println(\"Employee working hard!\"); }");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {\n");
		System.out.println("\tpublic void work(int hours) { System.out.print(\"Manager slept for \" + hours); }\n");
		System.out.println("}\n");
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\\\\ Creates a new Manager object of type Employee");
		System.out.println("\t\tEmployee es = new Manager();\n");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the work() method in the class Manager");
		System.out.println("\t\tes.work(4);\n");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"Manager slept for 4\" so the answer is 4");
		System.out.println("-----------------------------------------");
		System.out.println("1) Employee working hard!");
		System.out.println("2) None of the other options");
		System.out.println("3) Manager slept for 0");
		System.out.println("4) Manager sleptfor 4\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question25(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Employee{\n");
		System.out.println("\tpublic void work() { System.out.println(\"Employee working hard!\"); }");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {\n");
		System.out.println("\tpublic void work() { System.out.print(\"Manager slacking off!\"); }\n");
		System.out.println("}\n");
		System.out.println("class Supervisor extends Employee {\n");
		if (explain == 1) System.out.println("\t\\\\ Calls this function in main");
		System.out.println("\tpublic void work(int time) { System.out.print(\"Supervisor taking a nap!\"); }\n");
		System.out.println("}\n");
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates a new Supervisor object of type Employee");
		System.out.println("\t\tEmployee es = new Supervisor();\n");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the work() function for Employee");
		System.out.println("\t\tes.work();\n");
		if (explain == 1) System.out.println("t't\\\\ Prints \" AND \"");
		System.out.println("\t\tSystem.out.printlnl(\" AND \");\n");
		if (explain == 1) System.out.println("\t\t\\\\ Object now points to a new Manager object");
		System.out.println("\t\tes = new Manager();\n");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"Employee working hard! AND \" so the answer is 4");
		System.out.println("-----------------------------------------");
		System.out.println("1) Supervisor taking a nap! AND Manager slacking off!");
		System.out.println("2) Supervisor taking a nap! AND ");
		System.out.println("3) None of the other options");
		System.out.println("4) Employee working hard! AND \n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question26(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Employee{\n");
		System.out.println("\tpublic void work() { System.out.println(\"Employee working hard!\"); }");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {\n");
		if (explain == 1) System.out.println("\t\\\\ Calls this function in main");
		System.out.println("\tpublic void work() { System.out.print(\"Manager slacking off!\"); }\n");
		System.out.println("}\n");
		System.out.println("class Supervisor extends Manager {\n");
		System.out.println("\tpublic void work(int time) { System.out.print(\"Supervisor taking a nap!\"); }\n");
		System.out.println("}\n");
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates a new Supervisor object of type Employee");
		System.out.println("\t\tEmployee es = new Supervisor();\n");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the work() method for Manager since that is the next parent class with a usable work() method");
		System.out.println("\t\tes.work();\n");
		if (explain == 1) System.out.println("t't\\\\ Prints \" AND \"");
		System.out.println("\t\tSystem.out.printlnl(\" AND \");\n");
		if (explain == 1) System.out.println("\t\t\\\\ Object now points to a new Manager object");
		System.out.println("\t\tes = new Manager();\n");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"Manager slacking off! AND \" so the answer is 2");
		System.out.println("-----------------------------------------");
		System.out.println("1) Supervisor taking a nap! AND Manager slacking off!");
		System.out.println("2) Manager taking a nap! AND ");
		System.out.println("3) None of the other options");
		System.out.println("4) Employee working hard! AND \n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question27(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Employee{\n");
		System.out.println("\tpublic void work() { System.out.println(\"Employee working hard!\"); }");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {\n");
		if (explain == 1) System.out.println("\t\\\\ Calls this function in main");
		System.out.println("\tpublic void work(int time) { System.out.print(\"Manager slacking off!\"); }\n");
		System.out.println("}\n");
		System.out.println("class Supervisor extends Manager {\n");
		System.out.println("\tpublic void work(int time) { System.out.print(\"Supervisor taking a nap!\"); }\n");
		System.out.println("}\n");
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates a new Supervisor object of type Employee");
		System.out.println("\t\tEmployee es = new Supervisor();\n");
		if (explain == 1) System.out.println("\t\t\\\\ Calls the work() method for Employee since that is the next parent class with a usable work() method");
		System.out.println("\t\tes.work();\n");
		if (explain == 1) System.out.println("t't\\\\ Prints \" AND \"");
		System.out.println("\t\tSystem.out.printlnl(\" AND \");\n");
		if (explain == 1) System.out.println("\t\t\\\\ Object now points to a new Manager object");
		System.out.println("\t\tes = new Manager();\n");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"Employee working hard! AND \" so the answer is 4");
		System.out.println("-----------------------------------------");
		System.out.println("1) Supervisor taking a nap! AND Manager slacking off!");
		System.out.println("2) Manager taking a nap! AND ");
		System.out.println("3) None of the other options");
		System.out.println("4) Employee working hard! AND \n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question28(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("class Employee{\n");
		System.out.println("\tpublic void work(int salary) { System.out.println(\"Employee working hard!\"); }");
		System.out.println("}\n");
		System.out.println("class Manager extends Employee {\n");
		System.out.println("\tpublic void work() { System.out.print(\"Manager slacking off!\"); }\n");
		System.out.println("}\n");
		System.out.println("class Supervisor extends Employee {\n");
		System.out.println("\tpublic void work() { System.out.print(\"Supervisor taking a nap!\"); }\n");
		System.out.println("}\n");
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ es points to a new Supervisor object of type Employee");
		System.out.println("\t\tEmployee es = new Supervisor();");
		if (explain == 1) System.out.println("\t\t\\\\ em points to a new Manager object of type Employee");
		System.out.println("\t\tEmployee em = new Manager();");
		if (explain == 1) System.out.println("\t\t\\\\ e points to a new Employee object of type Employee");
		System.out.println("\t\tEmployee e = new Employee();\n");
		if (explain == 1) System.out.println("\t\t\\\\ e now points to a em's Manager object");
		System.out.println("\t\te = em;");
		if (explain == 1) System.out.println("\t\t\\\\ em now points to a es's Supervisor object");
		System.out.println("\t\tem = es;");
		if (explain == 1) System.out.println("\t\t\\\\ es now points to a e's Manager object");
		System.out.println("\t\tes = e;\n");
		if (explain == 1) System.out.println("\t\t\\\\ Calls a function that does not exist in the class Employee");
		System.out.println("\t\tes.work();\n");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This code does not compile so the answer is 2");
		System.out.println("-----------------------------------------");
		System.out.println("1) Manager slacking off!");
		System.out.println("2) None of the other options");
		System.out.println("3) Supervisor taking a nap!");
		System.out.println("4) Employee working hard!\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question29(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates an array of String object references called \"names\" of size 3");
		System.out.println("\t\tString[] names = new String[3];\n");
		System.out.println("\t\tint i = 0;\n");
		if (explain == 1) System.out.println("\t\t\\\\ Iterates through the String references in the array");
		System.out.println("\t\tfor (String name: names) {");
		if (explain == 1) System.out.println("\t\t\t\\\\ Creates a new String object of content \"S\"");
		System.out.println("\t\t\tname = new String(\"S\");");
		System.out.println("\t\t\ti++;");
		System.out.println("\t\t}\n");
		System.out.println("\t\ttry {");
		if (explain == 1) System.out.println("\t\t\t\\\\ Iterates through the String objects in the array");
		System.out.println("\t\t\tfor (String name: names)");
		if (explain == 1) System.out.println("\t\t\t\t\\\\ Prints the contents of each String object");
		System.out.println("\t\t\t\tSystem.out.print(name);");
		System.out.println("\t\t}");
		if (explain == 1) System.out.println("\t\t\\\\ It is only printing the value of the references so no NullPointerException and it does");
		if (explain == 1) System.out.println("\t\t\\\\ not try to go out of the bounds of the array so no exceptions are caught");
		System.out.println("\t\tcatch (Exception e) {");
		System.out.println("\t\t\tSystem.out.println(\"E\");");
		System.out.println("\t\t}");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"nullnullnull\" so the answer is 2");
		System.out.println("-----------------------------------------");
		System.out.println("1) S");
		System.out.println("2) None of the other options");
		System.out.println("3) SSSE");
		System.out.println("4) E\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question30(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates an array of String object references called \"names\" of size 3");
		System.out.println("\t\tString[] names = new String[3];\n");
		System.out.println("\t\tint i = 0;\n");
		if (explain == 1) System.out.println("\t\t\\\\ Iterates through the String references in the array");
		System.out.println("\t\tfor (String name: names) {");
		if (explain == 1) System.out.println("\t\t\t\\\\ Creates a new String object of content \"S\"");
		System.out.println("\t\t\tname = new String(\"S\");");
		System.out.println("\t\t\ti++;");
		System.out.println("\t\t}\n");
		System.out.println("\t\ttry {");
		if (explain == 1) System.out.println("\t\t\t\\\\ Iterates through the String objects in the array");
		System.out.println("\t\t\tfor (String name: names)");
		if (explain == 1) System.out.println("\t\t\t\t\\\\ Prints the contents of each String object");
		System.out.println("\t\t\t\tSystem.out.print(name.toString());");
		System.out.println("\t\t}");
		if (explain == 1) System.out.println("\t\t\\\\ The references are null pointers therefore the toString() will throw a NullPointerException");
		if (explain == 1) System.out.println("\t\t\\\\ This is caught here and \"E\" is printed");
		System.out.println("\t\tcatch (Exception e) {");
		System.out.println("\t\t\tSystem.out.println(\"E\");");
		System.out.println("\t\t}");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This prints \"E\" so the answer is 4");
		System.out.println("-----------------------------------------");
		System.out.println("1) S");
		System.out.println("2) None of the other options");
		System.out.println("3) SSSE");
		System.out.println("4) E\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question31(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ Creates an array of String object references called \"names\" of size 3");
		System.out.println("\t\tString[] names = new String[3];\n");
		System.out.println("\t\tint i = 0;\n");
		if (explain == 1) System.out.println("\t\t\\\\ Iterates through the String references in the array");
		System.out.println("\t\tfor (String name: names) {");
		if (explain == 1) System.out.println("\t\t\t\\\\ Creates a new String object of content \"S\"");
		System.out.println("\t\t\tname = new String(\"S\");");
		System.out.println("\t\t\ti++;");
		System.out.println("\t\t}\n");
		System.out.println("\t\ttry {");
		if (explain == 1) System.out.println("\t\t\t\\\\ Iterates through the String objects in the array");
		System.out.println("\t\t\tfor (String name: names)");
		if (explain == 1) System.out.println("\t\t\t\t\\\\ Prints the contents of each String object");
		System.out.println("\t\t\t\tSystem.out.print(name.toString());");
		System.out.println("\t\t}");
		if (explain == 1) System.out.println("\t\t\\\\ The references are null pointers therefore the toString() will throw a NullPointerException");
		if (explain == 1) System.out.println("\t\t\\\\ This is not caught here since it is not an ArrayIndexOutOfBoundsException so the program will crash");
		System.out.println("\t\tcatch (ArrayIndexOutOfBoundsException aioobe) {");
		System.out.println("\t\t\tSystem.out.println(\"E\");");
		System.out.println("\t\t}");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This program crashes so the answer is 2");
		System.out.println("-----------------------------------------");
		System.out.println("1) S");
		System.out.println("2) None of the other options");
		System.out.println("3) SSSE");
		System.out.println("4) E\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static int Question32(int explain)
	{
		int choice = 0;
		if (explain == 1) {System.out.println("\nIncorrect answer...printing explanation...");
		System.out.println("-----------------------------------------");}
		System.out.println("public class Main {\n");
		System.out.println("\tpublic static void main(String[] args) {");
		if (explain == 1) System.out.println("\t\t\\\\ fastBoat points to a new Boat object of type Vehicle");
		System.out.println("\t\tVehicle fastBoat = new Boat();");
		if (explain == 1) System.out.println("\t\t\\\\ Attempts to call the print(int i) method but it does not exist in the Vehicle class");
		System.out.println("\t\tfastBoat.print(1);");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("class Vehicle {");
		System.out.println("\tpublic int print() {");
		System.out.println("\t\tSystem.out.print(\"Vehicle\");");
		System.out.println("\t\treturn 0;");
		System.out.println("\t}");
		System.out.println("}\n");
		System.out.println("class Boat extends Vehicle {");
		System.out.println("\tpublic void print(int i) {");
		System.out.println("\t\tSystem.out.print(\"Boat\");");
		System.out.println("\t}");
		System.out.println("}\n");
		if (explain == 1) System.out.println("\\\\ This program does not compile so the answer is 1");
		System.out.println("-----------------------------------------");
		System.out.println("1) None of the other options");
		System.out.println("2) Vehicle");
		System.out.println("3) VehicleBoat");
		System.out.println("4) Boat\n");
		
		if (explain == 1)
		{
			System.out.print("Proceed? (Type \"1\"): ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
			
			while (choice != 1)
			{
				System.out.println("Invalid answer option.");
				System.out.print("Proceed? (Type \"1\"): ");
				try
				{
					choice = (new Scanner(System.in)).nextInt();
				}
				catch (Exception e) {}
			}
			return choice;
		}
		
		System.out.print("Answer: ");
		try
		{
			choice = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e) {}
		
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4)
		{
			System.out.println("Invalid answer option.");
			System.out.print("Answer: ");
			try
			{
				choice = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {}
		}
		return choice;
	}
	
	public static void main(String[] args)
	{
		int[] questions = new int[32];
		int answer = 0, correct = 0, i = 0, num, q = 1, k, temp, total = 0, max = 32;
		
		System.out.println("Welcome to the Exam 2 Practice!");
		System.out.println("How many questions would you like to practice? (Max: 32)");
		try
		{
			total = (new Scanner(System.in)).nextInt();
		}
		catch (Exception e)
		{
			
		}
		
		while (total < 1 || total > 32)
		{
			try
			{
				total = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e)
			{
				
			}
		}
		
		UniqueRng rng = new UniqueRng(max);
		while (rng.hasNext()) {
			num = rng.next();
		    questions[i] = num;
		    i++;
		}
		
		i = 0;
		for (k=0;k<total;k++)
		{
			System.out.println("\nQuestion " + q);
			System.out.println("-----------------------------------------");
			
			if (questions[i] == 1)
			{
				answer = Question1(0);
				if (answer != 2)
				{
					Question1(1);
				}
				else
				{
					System.out.println("Correct answer! \n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 2)
			{
				answer = Question2(0);
				if (answer!= 2)
				{
					Question2(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct ++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 3)
			{
				answer = Question3(0);
				if (answer!= 2)
				{
					Question3(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 4)
			{
				answer = Question4(0);
				if (answer!= 1)
				{
					Question4(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 5)
			{
				answer = Question5(0);
				if (answer!= 2)
				{
					Question5(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 6)
			{
				answer = Question6(0);
				if (answer!= 2)
				{
					Question6(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 7)
			{
				answer = Question7(0);
				if (answer!= 3)
				{
					Question7(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 8)
			{
				answer = Question8(0);
				if (answer!= 3)
				{
					Question8(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 9)
			{
				answer = Question9(0);
				if (answer!= 5)
				{
					Question9(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 10)
			{
				answer = Question10(0);
				if (answer!= 3)
				{
					Question10(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 11)
			{
				answer = Question11(0);
				if (answer!= 3)
				{
					Question11(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 12)
			{
				answer = Question12(0);
				if (answer!= 4)
				{
					Question12(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 13)
			{
				answer = Question13(0);
				if (answer!= 2)
				{
					Question13(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 14)
			{
				answer = Question14(0);
				if (answer!= 1)
				{
					Question14(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 15)
			{
				answer = Question15(0);
				if (answer!= 1)
				{
					Question15(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 16)
			{
				answer = Question16(0);
				if (answer!= 4)
				{
					Question16(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 17)
			{
				answer = Question17(0);
				if (answer!= 3)
				{
					Question17(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 18)
			{
				answer = Question18(0);
				if (answer!= 1)
				{
					Question18(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 19)
			{
				answer = Question19(0);
				if (answer!= 3)
				{
					Question19(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 20)
			{
				answer = Question20(0);
				if (answer!= 4)
				{
					Question20(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 21)
			{
				answer = Question21(0);
				if (answer!= 3)
				{
					Question21(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 22)
			{
				answer = Question22(0);
				if (answer!= 3)
				{
					Question22(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 23)
			{
				answer = Question23(0);
				if (answer!= 1)
				{
					Question23(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 24)
			{
				answer = Question24(0);
				if (answer!= 4)
				{
					Question24(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 25)
			{
				answer = Question25(0);
				if (answer!= 4)
				{
					Question25(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 26)
			{
				answer = Question26(0);
				if (answer!= 2)
				{
					Question26(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 27)
			{
				answer = Question27(0);
				if (answer!= 4)
				{
					Question27(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 28)
			{
				answer = Question28(0);
				if (answer!= 2)
				{
					Question28(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 29)
			{
				answer = Question29(0);
				if (answer!= 2)
				{
					Question29(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 30)
			{
				answer = Question30(0);
				if (answer!= 4)
				{
					Question30(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 31)
			{
				answer = Question31(0);
				if (answer!= 2)
				{
					Question31(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
			else if (questions[i] == 32)
			{
				answer = Question32(0);
				if (answer!= 1)
				{
					Question32(1);
				}
				else
				{
					System.out.println("Correct answer!\n");
					correct++;
				}
				i++;
				q++;
			}
		}
		System.out.println("-----------------------------------------");
		System.out.println("Finished!!");
		System.out.println("You got " + correct + " question(s) correct out of " + total);
		System.out.println("Keep studying hard!\n\n");
	}
}

class UniqueRng implements Iterator<Integer> {
    private List<Integer> numbers = new ArrayList<>();
    
    public UniqueRng(int n) {
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
    }
    
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return numbers.remove(0);
    }

    @Override
    public boolean hasNext() {
        return !numbers.isEmpty();
    }
}


