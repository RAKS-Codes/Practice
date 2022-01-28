import java.util.*;


public class factorial {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1; // initialized a new variable fact as 1 so that when someone enters 0 the answer to it 1.
        System.out.println("Enter the number you want the factorial of ");
        int n = sc.nextInt();
        if(n > 0 ) {  // checking conditions placed here so that we can figure whether to continue or not
            for(int i = 1; i<=n; i++) { // here i basically initialized the counter variable as 1 and then iterated it as many times it was lesser than and equal to number given by the user
                fact = fact * i;  // This line here is just multiplying the counter variable with the fact(which is already initialized) incrementally.
            }
            System.out.println("The factorial of" + " " + n + " " + "is" + " " +  fact);
        }
        else if (n == 0) {
            System.out.println("The factorial of" + " " + n + " " + "is" +  " " + fact );
        }
        else {
            System.out.println("Enter a valid number");
        }

    }       
}
