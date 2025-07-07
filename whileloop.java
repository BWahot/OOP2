import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int maximum=scanner.nextInt();
        int x=1;
        while(x<=6) {
            System.out.println( "x:"+ x);
            x++;
        }
        scanner.close();
    }
}
