import java.util.Scanner;

public class L01EX01 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String name;

        System.out.print("Type your name: ");
        name = input.nextLine();

        System.out.println("Your name is: " + name);
    }
    
}
