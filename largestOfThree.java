import java.util.*;


public class largestOfThree {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        if(a>=b && a>=c) {
            System.out.println(a+ " "+ "Is the greatest number among three ");
        }
        else if(b>=a && b>=c) {
            System.out.println(b+ " "+ "Is the greatest number among three ");
        }
        else {
            System.out.println(c+ " "+ "Is the greatest number among three ");
        }
    }
    
}
