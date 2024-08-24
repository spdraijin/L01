import java.util.Scanner;

public class L01EX06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String collegeName;
        String transportType;

        System.out.print("Type your college name: ");
        collegeName = input.next();

        System.out.print("Type what kind of transport you use to go to college: ");
        transportType = input.next();

        System.out.println("Your college name is: " + collegeName +
        "\nand you use " + transportType + " to go to college");
    }
}
