import java.util.Scanner;

public class L01EX05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String pantsSize;
        String pantsColor;

        System.out.print("Type your pants size: ");
        pantsSize = input.next();

        System.out.print("Type your pants color: ");
        pantsColor = input.next();

        System.out.println("Your pants size is " + pantsSize +
        "\nand the color is " + pantsColor);
    }
}
