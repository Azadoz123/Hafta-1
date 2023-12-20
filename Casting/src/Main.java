import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        double y;

        //Kullanıcıdan veri alma
        System.out.print("Bir tam sayı girniz: ");
        x = input.nextInt();
        System.out.print("Bir ondalıklı sayı girniz: ");
        y = input.nextDouble();

        //Dönüşümleri yapma
        System.out.println("Tam sayı => Ondalılı sayı " + x + " => " + (double) x);
        System.out.println("Ondalıklı sayı => Tam sayı " + y + " => " + (int) y);
    }
}