import java.util.Scanner;



public class PosnegZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();



        if (number == 0) {

            System.out.println("********************");

            System.out.println("The number is zero.");

        } else if (number > 0) {

            if (number % 2 == 0) {

                System.out.println("*********************************");

                System.out.println("The number is even and positive.");

            } else {

                System.out.println("*********************************");

                System.out.println("The number is odd and positive.");

            }

        } else {

            if (number % 2 == 0) {

                System.out.println("*********************************");

                System.out.println("The number is even and negative.");

            } else {

                System.out.println("*********************************");

                System.out.println("The number is odd and negative.");

            }

        }

    }

}