import java.util.Scanner;

public class find_largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        int no3 = sc.nextInt();
        if (no1 > no2 && no1 > no3)
            System.out.println("The value of number 1 = " + no1 + " is greater.");
        else if (no2 > no1 && no2 > no3)
            System.out.println("The value of number 2 = " + no2 + " is greater.");
        else
            System.out.println("The value of number 3 = " + no3 + " is greater.");
    }
}
