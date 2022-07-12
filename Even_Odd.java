/**
 * Even_Odd
 */
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no % 2 == 0)
            System.out.println(no + " is even number.");
        else
            System.out.println(no+ " is odd number.");            
    }    
}