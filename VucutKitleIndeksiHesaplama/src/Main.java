import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double boy, kilo, indeks;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz :");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        //Sonucu Hesaplama
        indeks = kilo / ( boy * boy );
        System.out.println("Vücut Kitle İndeksiniz :" + indeks);

    }
}