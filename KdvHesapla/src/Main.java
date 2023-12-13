import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double fiyat, kdvOran, kdvOran1 = 0.18, kdvOran2 = 0.08 , kdvTutari, kdvliTutar;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan fiyat alma
        System.out.print("Ürün fiyatı giriniz :");
        fiyat = input.nextDouble();


        kdvTutari = (fiyat <= 1000 ) ? (fiyat * kdvOran1) : (fiyat * kdvOran2);
        kdvOran = (fiyat <= 1000 ) ? kdvOran1 : kdvOran2;
        kdvliTutar = fiyat + kdvTutari;

        System.out.println("KDV'siz fiyat :" + fiyat);
        System.out.println("KDV oranı :" + kdvOran);
        System.out.println("KDV'li fiyat :" + kdvliTutar);
        System.out.println("KDV tutarı :" + kdvTutari);
    }
}