// //Jacob Gadberry, Kaelyn Gadberry, Layla Severance COP 3330 HW#3
// import java.util.*;

// public class HW {
//     public static void main(String[] args) {
//         //Used to keep track of our books and how many we have
//         Book arr[] = new Book[100];
//         int counter = 0;

//         Scanner scanner = new Scanner(System.in);
//         String str = new String();
//         double priceCheck = 0;
//         String deductionCheck[];
//         String subCheck = new String();

//         System.out.println("Would you like to create a book object? (yes/no): ");
//         str = getProperResponse(str, "yes", "no");

//         //Read in the books from the user
//         while(str.equals("yes") && counter<=100){
//             System.out.println("Enter the author, title and the isbn of the book separated by /: ");
//             str = scanner.nextLine();

//             String input[] = str.split("/");

//             System.out.println("Got it!\nNow, tell me if it is a bookstore book or a library book (enter BB for bookstore book or LB for library book): ");
//             str = getProperResponse(str, "lb", "bb");

//             System.out.println("Got it!");

//             //Now there are two different cases: either the book is a library book or a book store book
//             if(str.equals("bb")){
//                 System.out.println("Enter the list price of "+input[1].toUpperCase()+" by "+input[0].toUpperCase()+": ");
//                 priceCheck = scanner.nextDouble();
//                 scanner.nextLine();

//                 System.out.println("Is it on sale? (yes/no): ");
//                 str = getProperResponse(str, "yes", "no");

//                 if(str.equals("yes")){
//                     System.out.println("Deduction percentage: ");
//                     //Turn the String (15%) into an array and split it from the %
//                     //From there cast this String (15) into a double and divide by 100 to get the "actual" deduction
//                     deductionCheck = (scanner.nextLine()).split("%");
//                     double deduction = (Double.parseDouble(deductionCheck[0]))/100;

//                     arr[counter] = new BookstoreBook(input[0],input[1],input[2],priceCheck,true,deduction);
//                     System.out.println("Got it\n\nHere is your bookstore book information");

//                     //Display the information
//                     System.out.println(arr[counter]);

//                     //Increase the counter variable to keep track of how many books we have
//                     counter++;  
//                     System.out.println();
//                 }
                
//                 else if(str.equals("no")){
//                     arr[counter] = new BookstoreBook(input[0],input[1],input[2],priceCheck,false,0);
//                     System.out.println("Got it\n\nHere is your bookstore book information");

//                     //Display the information
//                     System.out.println(arr[counter]);

//                     //Increase the counter variable to keep track of how many books we have
//                     counter++;  
//                     System.out.println();
//                 }

//             }

//             else if(str.equals("lb")){
//                 System.out.println("What's the subject: ");
//                 subCheck = scanner.nextLine();

//                 //Utilize the help function to change the subject word into corresponding letter
//                 subCheck = determineSubject(subCheck);

//                 arr[counter] = new LibraryBook(input[0],input[1],input[2],subCheck);
//                 System.out.println("Got it\n\nHere is your library book information");

//                 //Display the information
//                 System.out.println(arr[counter]);

//                 //Increase the counter variable to keep track of how many books we have
//                 counter++;
//                 System.out.println();
//             }
        
//             System.out.println("Would you like to create a book object? (yes/no): ");
//             str = getProperResponse(str, "yes","no");
//         }

//         System.out.println("Sure!");
//         //Once user is done entering the books, print out the list of books they entered.
//         printLibrary(arr, counter);

//         //Next, prompt the user to serach any books in the array either by isbn, author, or title
//         System.out.println("Would like to search for a book? (yes/no):");
//         str = getProperResponse(str, "yes", "no");

//         while(str.equals("yes")){
//             //Use counter variables to keep track of the different books found
//             int numLibraryFound = 0, numBookstoreFound = 0;
            
//             System.out.println("Search by isbn, author or title?");
//             str = getProperResponse(str, "isbn", "author", "title");

//             if(str.equals("isbn")){
//                 System.out.println("Enter the ISBN of the book you are looking for");
//                 str = scanner.nextLine();

//                 for(int i = 0; i<counter; i++){
//                     if(arr[i].getISBN().equals(str)){
//                         System.out.println("We found the "+arr[i].getBookType()+" you were looking for: ");
//                         System.out.println(arr[i]);
//                         break;
//                     }
//                 }
//             }

//             else if(str.equals("author")){
//                 System.out.println("Enter the first three letters of the author you are looking for");
//                 str = scanner.nextLine();
//                 str = str.toLowerCase();

//                 //First, find the number of library/book store books were written by this person
//                 for(int i = 0; i<counter; i++){
//                     if(arr[i].getAuthor().substring(0, 3).toLowerCase().equals(str)){
//                         if(arr[i].getBookType().equals("Bookstore Book"))
//                             numBookstoreFound++;
//                         else
//                             numLibraryFound++;
//                     }
//                 }
//                 System.out.println("We have found " + numLibraryFound + " Library Books(s) and " + numBookstoreFound + " Book Store Books(s)");
//                 //Next, display the books from this person
//                 for(int i = 0; i<counter; i++){
//                     if(arr[i].getAuthor().substring(0, 3).toLowerCase().equals(str)){
//                         System.out.println(arr[i]);
//                     }
//                 }
//             }

//             else if(str.equals("title")){
//                 System.out.println("Enter the title of the book you are looking for");
//                 str = scanner.nextLine();
//                 str = str.toLowerCase();

//                 for(int i = 0; i<counter; i++){
//                     if(arr[i].getTitle().toLowerCase().equals(str)){
//                         System.out.println("We found the "+arr[i].getBookType()+" you were looking for: ");
//                         System.out.println(arr[i]);
//                         break;
//                     }
//                 }
//             }
//             System.out.println();

//             System.out.println("Would like to search for a book? (yes/no):");
//             str = getProperResponse(str, "yes", "no");
//         }

//         System.out.println("Take Care!");
//         scanner.close();
//     }

//     public static String determineSubject(String subject){

//         Scanner scanner = new Scanner(System.in);
//         String subjCode = "";
//         subject = subject.toLowerCase();
//         boolean corrInput = true;

//         while(corrInput){
//             switch(subject){
//                 case "general":
//                     subjCode = "A";
//                     corrInput = false;
//                     break;
//                 case "philosophy":
//                     subjCode = "B";
//                     corrInput = false;
//                     break;
//                 case "religion":
//                     subjCode = "C";
//                     corrInput = false;
//                     break;
//                 case "world history":
//                     subjCode = "D";
//                     corrInput = false;
//                     break;
//                 case "history of americas":
//                     subjCode = "E";
//                     corrInput = false;
//                     break;
//                 case "geography":
//                     subjCode = "F";
//                     corrInput = false;
//                     break;
//                 case "anthropology":
//                     subjCode = "G";
//                     corrInput = false;
//                     break;
//                 case "social science":
//                     subjCode = "H";
//                     corrInput = false;
//                     break;
//                 case "internet":
//                     subjCode = "I";
//                     corrInput = false;
//                     break;
//                 case "political science":
//                     subjCode = "J";
//                     corrInput = false;
//                     break;
//                 case "law":
//                     subjCode = "K";
//                     corrInput = false;
//                     break;
//                 case "education":
//                     subjCode = "L";
//                     corrInput = false;
//                     break;
//                 case "music":
//                     subjCode = "M";
//                     corrInput = false;
//                     break;
//                 case "fine arts":
//                     subjCode = "N";
//                     corrInput = false;
//                     break;
//                 case "language":
//                     subjCode = "P";
//                     corrInput = false;
//                     break;
//                 case "science":
//                     subjCode = "Q";
//                     corrInput = false;
//                     break;
//                 case "medicine":
//                     subjCode = "R";
//                     corrInput = false;
//                     break;
//                 case "agriculture":
//                     subjCode = "S";
//                     corrInput = false;
//                     break;
//                 case "technology":
//                     subjCode = "T";
//                     corrInput = false;
//                     break;
//                 case "military":
//                     subjCode = "U";
//                     corrInput = false;
//                     break;
//                 default:
//                     System.out.println("Oops! That's not a valid entry. Please try again:");
//                     subject = scanner.nextLine();
//                     subject = subject.toLowerCase();
//                     break;
//             }
//         }
//         return subjCode;
//     }

//     public static void printLibrary(Book arr[], int counter){
//         System.out.println("Here are all the books you entered...");

//         //It appears that the print prints books in order of type, maybe we could add a static counter variable for each type?
//         System.out.println("Library Books ("+LibraryBook.getBookAmount()+")");
//         for(int i = 0; i<counter; i++){
//             if(arr[i].getBookType().equals("Library Book"))
//                 System.out.println(arr[i]);
//         }
//         System.out.println("----");

//         System.out.println("Bookstore Books ("+BookstoreBook.getBookAmount()+")");
//         for(int i = 0; i<counter; i++){
//             if(arr[i].getBookType().equals("Bookstore Book"))
//                 System.out.println(arr[i]);
//         }
//         System.out.println("----");
//     }

//     //Used to get the reponse in the proper format, used when there are only two acceptable responses (yes or no/ lb or bb)
//     public static String getProperResponse(String str, String optA, String optB){
//         Scanner scanner = new Scanner(System.in);
//         str = scanner.nextLine();
//         str = str.toLowerCase();

//         while(!(str.equals(optA) || str.equals(optB))){
//             System.out.println("Oops! That's not a valid entry. Please try again: ");
//             str = scanner.nextLine();
//             str = str.toLowerCase();
//         }

//         return str;
//     }

//     //Used to get the reponse in the proper format, used when there are three acceptable responses (isbn, author, or title)
//     public static String getProperResponse(String str, String optA, String optB, String optC){
//         Scanner scanner = new Scanner(System.in);
//         str = scanner.nextLine();
//         str = str.toLowerCase();

//         while(!(str.equals(optA) || str.equals(optB) || str.equals(optC))){
//             System.out.println("Oops! That's not a valid entry. Please try again: ");
//             str = scanner.nextLine();
//             str = str.toLowerCase();
//         }

//         return str;
//     }
// }

// abstract class Book{
//     private String author;
//     private String title;
//     private String isbn;

//     public Book(String author, String title, String isbn){
//         this.author = author;
//         this. title = title;
//         this.isbn = isbn;
//     }

//     public Book(){
//         this.author = "NoName";
//         this. title = "NoTitle";
//         this.isbn = "NoISBN";
//     }

//     public void setAuthor(String author){
//         this.author = author;
//     }

//     public String getAuthor(){
//         return this.author;
//     }

//     public void setTitle(String title){
//         this.title = title;
//     }

//     public String getTitle(){
//         return this.title;
//     }

//     public void setISBN(String isbn){
//         this.isbn = isbn;
//     }

//     public String getISBN(){
//         return this.isbn;
//     }

//     @Override
//     public String toString(){
//         return "["+isbn+"-"+title.toUpperCase()+" by "+author.toUpperCase();
//     }

//     abstract public String getBookType();
// }

// class BookstoreBook extends Book{
//     private double price;
//     private boolean onSale;
//     private double saleRate;
//     private static int bookAmount;

//     public BookstoreBook(String author, String title, String isbn, double price, boolean onSale, double saleRate){
//         super(author, title, isbn);
//         this.price = price;
//         this.onSale = onSale;
//         this.saleRate = saleRate;
//         bookAmount++;
//     }

//     public BookstoreBook(){
//         super();
//         this.price = 0.0;
//         onSale = false;
//         saleRate = 0.0;
//         bookAmount++;
//     }

//     public void setPrice(double price){
//         this.price = price;
//     }

//     public double getPrice(){
//         return this.price;
//     }

//     public void setOnSale(boolean onSale){
//         this.onSale = onSale;
//     }

//     public boolean getOnSale(){
//         return this.onSale;
//     }

//     public void setSaleRate(double saleRate){
//         this.saleRate = saleRate;
//     }

//     public double getSaleRate(){
//         return this.saleRate;
//     }

//     public static int getBookAmount(){
//         return bookAmount;
//     }

//     @Override
//     public String toString(){
//         if(onSale)
//             return super.toString() + ", $"+ (String.format("%.2f",price)) + " listed for $" + (String.format("%.2f",((price)-(price*saleRate)))) +"]";
//         else
//             return super.toString() + ", $"+ (String.format("%.2f",price))+"]";
//     }

//     @Override
//     public String getBookType(){
//         return "Bookstore Book";
//     }
// }

// class LibraryBook extends Book{
//     private String subject;
//     private String callNumber;
//     private static int bookAmount;

//     public LibraryBook(String author, String title, String isbn, String subject){
//         super(author,title, isbn);
//         this.subject = subject;
//         //Maybe instead call a private method to generate a call number
//         this.callNumber = setCallNumber(author, isbn, subject);
//         bookAmount++;
//     }

//     public LibraryBook(){
//         super();
//         this.subject = "NoSubject";
//         this.callNumber = "NoCallNumber";
//         bookAmount++;
//     }

//     public void setSubject(String subject){
//         this.subject = subject;
//     }

//     public String getSubject(){
//         return this.subject;
//     }

//     /*No need for a setter sense each callNumber is set randomly*/
//     public String getCallNumber(){
//         return this.callNumber;
//     }

//     public static int getBookAmount(){
//         return bookAmount;
//     }

//     private String setCallNumber(String author, String isbn, String subject){
//         //Generate a random floor number from 1-15
//         int floor = 1+(int)(Math.random()*((15-1)+1));
//         String floorNum;

//         //Adding the leading zero to the floor number if it's less than 10
//         if((floor)<10)
//             floorNum = "0"+floor;
//         else
//             floorNum = String.valueOf(floor);

//         return subject.charAt(0) + "."+floorNum+"."+author.toUpperCase().substring(0, 3) + "." + isbn.toUpperCase().charAt(isbn.length()-1);
//     }

//     @Override
//     public String toString(){
//         return super.toString() + "-"+callNumber+"]";
//     }

//     @Override
//     public String getBookType(){
//         return "Library Book";
//     }
// }