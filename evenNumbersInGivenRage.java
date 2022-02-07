import java.util.*;


public class evenNumbersInGivenRage {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of the range: ");
        int a = sc.nextInt();
        if(a < 1 ) {
            System.out.println("Enter a valid number: ");
        }
        else {
            for(int i = 1; i <= a;i++) {
               // System.out.println(i);
                if(i % 2 == 0) {
                    System.out.println("The even numbers in the specified range are:  ");
                    System.out.println(i);
                }
                

            }
        }
        




    }
    
}
