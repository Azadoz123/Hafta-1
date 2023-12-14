import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int mesafe;
        double tutar, odenecekTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz mesafeyi giriniz :");
        mesafe = input.nextInt();

        tutar = 10 + (mesafe * 2.2);
        odenecekTutar = (tutar <= 20) ? 20 : tutar;

        System.out.println("Ödenecek Tutar :" + odenecekTutar);
    }
}