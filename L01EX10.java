import java.util.Scanner;

public class L01EX10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String surname;
        int shoeSize;
        double weight;

        System.out.print("Type your surname: ");
        surname = input.next();

        System.out.print("Type your shoe size: ");
        shoeSize = input.nextInt();

        System.out.print("Type your weight (in kg): ");
        weight = input.nextDouble();
        System.out.println("Your surname is " + surname +", " +
        "\nyour shoe size is " + shoeSize + 
        "\nand your weight is " + weight + " kg");
    }
}
