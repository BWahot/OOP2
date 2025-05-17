import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of your school:");
        String write=scanner.nextLine();
        System.out.println(write);
        scanner.close();
    }
}
