import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluşturalım
        int a, b;
        double c;

        //Kullanıcıdan verileri alalım
        Scanner input = new Scanner(System.in);
        System.out.print("İlk kenarı giriniz :");
        a = input.nextInt();
        System.out.print("İkinci kenarı giriniz:");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs :" + c);

    }
}