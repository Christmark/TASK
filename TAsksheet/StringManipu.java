import java.util.Scanner;

public class StringManipu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string (at least 10 characters): ");
        String inputString = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(inputString);

        System.out.println("Length: " + stringBuilder.length());
        System.out.println("First character: " + stringBuilder.charAt(0));
        System.out.println("Index of 'a': " + stringBuilder.indexOf("a"));
        System.out.println("Last character: " + stringBuilder.charAt(stringBuilder.length() - 1));
        System.out.println("Substring (3 to 6): " + stringBuilder.substring(3, 7));

        stringBuilder.append("123");
        stringBuilder.insert(4, "xyz");
        stringBuilder.delete(2, 5);
        stringBuilder.deleteCharAt(8);
        stringBuilder.reverse();

        System.out.println("Reverse of letter: " + stringBuilder);
    }
}
