import java.util.Scanner;
import java.util.Random;

class Game {
    public void game() {
        Scanner sc = new Scanner(System.in);
        Random ram = new Random();
        System.out.println("Enter your choice:");
        System.out.println("Press 1 for game\nPress 2 for exit");
        int choice = sc.nextInt();
        switch(choice){
            case 1:{
                for (int i = 0; i < 100; i++) {
                    System.out.println("Please choose one condition:");
                    System.out.println("Press 0 for Rock\nPress 1 for Paper\nPress 2 for Scissor\n");
                    System.out.print("Enter your choice:");
                    int user = sc.nextInt();
                    int computer = ram.nextInt(3);
                    if (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1) {
                        System.out.println("You Win");
                    } else if (user == computer) {
                        System.out.println("Draw");
                    } else {
                        System.out.println("You Lose");
                    }
                    if (computer == 0) {
                        System.out.println("Computer choose Rock!");
                    } else if (computer == 1) {
                        System.out.println("Computer choose Paper!");
                    } else {
                        System.out.println("Computer choose Scissor!");
                    }
                }
            }
            case 2:{
                break;
            }
        }
        
    }
}

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Game G1 = new Game();
        G1.game();        
    }
}