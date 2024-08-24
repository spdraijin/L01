import java.util.Scanner;

public class L01EX09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int birthYear;
        String district;

        System.out.print("Type your name: ");
        name = input.next();

        System.out.print("Type the year of your birth: ");
        birthYear = input.nextInt();

        System.out.print("Type the district where you live: ");
        district = input.next();

        System.out.println("Your name is " + name +
                "\nthe year of your birth is " + birthYear +
                "\nand the name of the district where you live is " + district);
    }
}
