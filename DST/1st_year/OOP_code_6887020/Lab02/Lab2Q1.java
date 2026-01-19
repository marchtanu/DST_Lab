package Lab02;
//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1

import java.util.Scanner;

public class Lab2Q1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("");
    String[] weight = scanner.nextLine().split(" ");
    System.out.print("");
    String[] height = scanner.nextLine().split(" ");
    scanner.close();
    double sumWeight = 0;
    double sumHeight = 0;
    for (String i : weight) {
      double w = Double.parseDouble(i);
      sumWeight += w;
    }
    for (String i : height) {
      double h = Double.parseDouble(i);
      sumHeight += h;
    }

    System.out.println("The average weight is " + (sumWeight / weight.length) + " kg.");
    System.out.println("The average height is " + (sumHeight / height.length) + " cm.");
  }
}
