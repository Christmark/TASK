import java.util.Scanner;



public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns (1-10): ");

        int n = scanner.nextInt();

        scanner.close();



        System.out.println("Multiplication Table " + n + "x" + n + ":\n");



       

        System.out.print("   ");

        for (int col = 1; col <= n; col++) {

            System.out.printf("%4d", col);

        }

        System.out.println("\n-----------------------------------------");



        // ITO AY PARA SA multiplication table

        for (int row = 1; row <= n; row++) {

            System.out.printf("%2d |", row);

            for (int col = 1; col <= n; col++) {

                System.out.printf("%4d", row * col);

            }

            System.out.println();

        }

    }

}

