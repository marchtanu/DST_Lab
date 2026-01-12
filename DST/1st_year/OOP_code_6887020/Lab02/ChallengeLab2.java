package Lab02;
//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1

import java.util.Scanner;

public class ChallengeLab2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("");
    String[] numStrings = scanner.nextLine().split(" ");
    System.out.print("");
    int method = scanner.nextInt();
    scanner.close();
    int n1 = Integer.parseInt(numStrings[0]);
    int n2 = Integer.parseInt(numStrings[1]);
    switch (method) {
      case 1:
        System.out.print(n1 + n2);
        break;
      case 2:
        System.out.print(n1 - n2);
        break;
      case 3:
        System.out.print(n1 * n2);
        break;
      case 4:
        System.out.print(n1 / n2);
        break;

      default:
        System.out.print("Invalid operation");
        break;
    };

  }
}