import java.util.Scanner;

public class L01EX04 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double height;
        String shirtSize;

        System.out.print("Type your height: ");
        height = input.nextDouble();

        System.out.print("Type your shirt size: ");
        shirtSize = input.next();

        System.out.println("Your height is: " + height +
        "\nand your shirt size is: " + shirtSize);
    }
}
