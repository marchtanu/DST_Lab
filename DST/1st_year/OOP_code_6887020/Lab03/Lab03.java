//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        welcome();
        choosing();
    };

    private static void welcome() {
        System.out.println("""
                === Welcome to Customized Wallpaper System ===
                We have 3 popular styles here:""");
        System.out.println("=== Style 1 === ");
        style1(5);
        System.out.println("=== Style 2 === ");
        style2(5, '_');
        System.out.println("=== Style 3 === ");
        style3(5, '_');
    }

    private static void choosing() {
        int totalBill = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please choose your style: ");
            int style = scanner.nextInt();
            if (style == -1) {
                scanner.close();
                System.out.println("Bye");
                System.out.print("Total Bill: " + totalBill);
                return;
            }
            System.out.print("Size: ");
            int size = scanner.nextInt();
            System.out.print("Symbol: ");
            char symbol = scanner.next().charAt(0);
            if (style == 1) {
                style1(size);
                totalBill += 100;
            }
            if (style == 2) {
                style2(size, symbol);
                totalBill += 200;
            }
            if (style == 3) {
                style3(size, symbol);
                totalBill += 300;
            }

        }

    }

    private static void style1(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void style2(int size, char _char) {
        for (int i = size; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(_char + " ");
            }
            System.out.println();
        }
    };

    private static void style3(int size, char _char) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int k = size; k > i; k--) {
                System.out.print(_char + " ");
            }
            System.out.println();
        }
    };
}
