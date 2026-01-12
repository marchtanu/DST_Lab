package Lab01;

//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();
        System.out.println("Underweight.");
        scanner.close();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Overweight.");
        } else {
            System.out.println("Obese.");
        }
    }
}