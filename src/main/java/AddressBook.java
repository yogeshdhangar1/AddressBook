import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first name");
       String  fName = sc.next();
        System.out.println("Enter the last Name");
         String lName = sc.next();
        System.out.println("Enter the city");
        String City = sc.next();
        System.out.println("Enter the Address");
        String Address = sc.next();
        System.out.println("Enter the number");
        int Number = sc.nextInt();
        System.out.println("Enter the mail");
        String Email = sc.next();
    }
}