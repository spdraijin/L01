import java.util.Scanner;

public class L01EX03 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int shoeSize;

        System.out.print("Type your shoe size: ");
        shoeSize = input.nextInt();

        System.out.println("Your shoe size is: " + shoeSize);
    }
}
