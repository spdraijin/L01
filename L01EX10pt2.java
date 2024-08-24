import java.util.Scanner;

public class L01EX10pt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String surname;
        String shoe;
        double weight;

        System.out.print("Type your surname: ");
        surname = input.next();

        System.out.print("Type what kind of shoes you are using: ");
        shoe = input.next();

        System.out.print("Type your weight (in kg): ");
        weight = input.nextDouble();
        System.out.println("Your surname is " + surname +", " +
        "\nthe type of shoes that you are using is " + shoe + 
        "\nand your weight is " + weight + " kg");
    }
}
