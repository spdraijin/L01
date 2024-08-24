import java.util.Scanner;

public class L01EX08 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double weight;
        String city;

        System.out.print("Type your weight (in kg): ");
        weight = input.nextDouble();

        System.out.print("Type the city where you live: ");
        city = input.next();

        System.out.println("Your weight is " + weight + "kg" + 
        "\nand the city where you live is " + city);
    }
    
}