import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a, b, c, sonuc;
        //Kullanıcıdan sayı alma
        Scanner input = new Scanner(System.in);
        System.out.print( "a sayısını giriniz :");
        a = input.nextInt();
        System.out.print( "b sayısını giriniz :");
        b = input.nextInt();
        System.out.print( "c sayısını giriniz :");
        c = input.nextInt();

        //Sonucu yazdır
        sonuc = ((a + b) * c) - b;
        System.out.println("İşlemin sonucu : " + sonuc);
    }
}