package Lab02;
//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1

import java.util.Scanner;

public class Lab2Q3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("");
    double price = scanner.nextDouble();
    scanner.close();
    if (price < 50) {
      System.out.print(price);
    }
    if (price >= 50 && price < 100) {
      System.out.print(price * 0.95);
    }
    if (price >= 100 && price < 1000) {
      System.out.print(price * 0.9);
    }
    if (price >= 1000) {
      System.out.print(price * 0.8);
    }
  }
}
