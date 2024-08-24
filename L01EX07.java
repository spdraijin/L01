import java.util.Scanner;

public class L01EX07 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int age;
        String hairColor;

        System.out.print("Type your age: ");
        age = input.nextInt();

        System.out.print("Type the color of your hair: ");
        hairColor = input.next();

        System.out.println("You are " + age + " years old" + 
        "\nand the color of your hair is " + hairColor);
    }
}
