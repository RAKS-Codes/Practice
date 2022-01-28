import java.util.*;

public class numberTypeChecker {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int a = sc.nextInt();
        if(a > 0) {
            System.out.println("1");
        }
        else if(a < 0 ) {
            System.out.println("-1");
        }
        else {
            System.out.println("0");
        }

    }
    
}
