package Lab02;
//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1

import java.util.Scanner;

public class Lab2Q2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("");
    double baht = scanner.nextDouble();
    scanner.close();

    System.out.println("10: " + (int) Math.floor(baht / 10));
    if (baht < 10){
      return ;
    }
    baht -= 10 *Math.floor(baht / 10);
    System.out.println("5: " + (int) Math.floor(baht / 5));
    baht -= 5 * Math.floor(baht / 5);
    System.out.println("1: " + (int) baht);
  };
}
