import java.util.Scanner;
class Library{
      String []arr = new String[10];
      Scanner sc = new Scanner(System.in);
      int count = 0;

      public void addBook(){
            if(count == 9){
                  System.out.println("Sorry! we are out of storage!");
            }
            else{
                  System.out.println("Enter the name of the book: ");
                  arr[count] = sc.nextLine(); 
                  count++;
                  System.out.println();
            }

      }
      public void issueBook(){
            if (count == 0){
                  System.out.println("Sorry! We are out of books");
            }
            else{
                  System.out.println("The available Books are: ");
                  for(int i = 0; i <  count; i++){
                        System.out.println((i+1) +". " + arr[i]);
                  }
            System.out.println("Enter the index number of book which you want to issue: ");
            int num = sc.nextInt();
            for (int i = num - 1; i < count ; i++){
                  arr[i]  = arr[i + 1];
            }
            count--;
            System.out.println();
            }
        }
      public void returnBook(){
            if(count == 9){
                  System.out.println("Currently we are out of storage please return it on another day");
            }
            else{
                  System.out.println("Enter the name of the book: ");
                  arr[count] = sc.nextLine(); 
                  count++;
            }
      }
      public void showAvailableBooks(){
            if (count == 0){
                  System.out.println("Sorry! We are out of books");
            }
            else{
                  System.out.println("The available Books are: ");
                  for(int i = 0; i < count; i++){
                        System.out.println((i+1) +". " + arr[i]);
                  }
                  System.out.println();
            }
      }
}
public class LibraryManagement{
      public static void main(String[] args) {
            Library rapid = new Library();
            Scanner sc = new Scanner(System.in);
            int number = 0;
            System.out.println("Welcome to Rapid Library");
            while(number != 5){
                  System.out.println("1. Addbook \t2. issueBook \t3. ReturnBook \t4.ShowAvailableBook \t5. for exit");
                  System.out.println("Enter your Choice: ");
                  number = sc.nextInt();
                  switch(number){
                        case 1 -> rapid.addBook();
                        case 2 -> rapid.issueBook();
                        case 3 -> rapid.returnBook();
                        case 4 -> rapid.showAvailableBooks();
                        default -> System.out.println("Opps! something went wrong!!!");    
                  }
            }
            System.out.println("Thank for visiting our library...");
      }
}