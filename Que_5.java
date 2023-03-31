import java.util.Scanner;
public class Que_5{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String original = input.nextLine();

    System.out.println("What do you want to change the case to?");
    System.out.println("1. Uppercase");
    System.out.println("2. Lowercase");
    System.out.println("3. Sentence case");
    System.out.println("4. Toggle case");
    System.out.print("Enter your choice: ");
    int choice = input.nextInt();
   switch (choice) {
      case 1:
        System.out.println("Uppercase: " + original.toUpperCase());
        break;
      case 2:
        System.out.println("Lowercase: " + original.toLowerCase());
        break;
      case 3:
        System.out.println("Sentence case: " + toSentenceCase(original));
        Break;
    case 4:
        System.out.println("Toggle case: " + toggleCase(original));
        break;
      default:
        System.out.println("Invalid choice.");
    }
  }
  public static String toSentenceCase(String str) {
    StringBuilder result = new StringBuilder();
    boolean capitalizeNext = true;
    for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);
      if (currentChar == ' ' || currentChar == '.') {
        capitalizeNext = true;
      } else if (capitalizeNext) {
        result.append(Character.toUpperCase(currentChar));
        capitalizeNext = false;
      } else {
        result.append(Character.toLowerCase(currentChar));
      }
    }
    return result.toString();
  }
  public static String toggleCase(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);
      if (Character.isUpperCase(currentChar)) {
        result.append(Character.toLowerCase(currentChar));
      } else if (Character.isLowerCase(currentChar)) {
        result.append(Character.toUpperCase(currentChar));
      } else {
        result.append(currentChar);
      }
    }
    return result.toString();                 
  }
}                         
