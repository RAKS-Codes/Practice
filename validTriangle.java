import java.util.*;


public class validTriangle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd side: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd side: ");
        int c = sc.nextInt();
        System.out.println("------------------------");
        System.out.println("The sides entered by the user are: "+a + " " + b + " " + c);
        if(a+b>c && a+c>b && b+c>a) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        }
}
