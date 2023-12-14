import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int r;
        double alan, cevre, pi= 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz :");
        r = input.nextInt();

        cevre = 2 * pi * r;
        System.out.println("Daire çevresi :" + cevre);
        alan = pi * r * r;
        System.out.println("Daire alanı :" + alan);
    }
}