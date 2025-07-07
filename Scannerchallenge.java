import java.util.Scanner;
public class Scannerchallenge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name=scanner.nextLine();
       System.out.println("Enter your school name:");
       String school=scanner.nextLine();
       System.out.println("Enter your admission number:");
       int number=scanner.nextInt();
       System.out.println(name+" attends "+school+" and his admission number is "+number);
       scanner.close();

    }
}
