import java.util.Scanner;

public class L01EX02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double distance;

        System.out.print("Type the distance between your home and your college (in km): ");
        distance = input.nextDouble();

        System.out.println("The distance between your home and college is: " + distance + "km" );
    }
}
