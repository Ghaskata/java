import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("1. Extract vowels\n2. Extract non-vowels\nEnter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("1. Uppercase\n2. Lowercase\nEnter your choice: ");
        int caseChoice = sc.nextInt();
        sc.close();

        String vowels = "aeiouAEIOU";
    String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (choice == 1 && vowels.indexOf(c) != -1 || choice == 2 && vowels.indexOf(c) == -1) {
                result += c;
            }
        }

        if (caseChoice == 1) {
            result = result.toUpperCase();
        } else {
            result = result.toLowerCase();
        }
        System.out.println("Result: " + result);
    }
}
