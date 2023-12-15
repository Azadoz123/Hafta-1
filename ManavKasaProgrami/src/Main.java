import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        double toplamTutar, armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.0;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız?");
        armutKilo = input.nextInt();
        System.out.print("Kaç kilo elma aldınız?");
        elmaKilo = input.nextInt();
        System.out.print("Kaç kilo domates aldınız?");
        domatesKilo = input.nextInt();
        System.out.print("Kaç kilo muz aldınız?");
        muzKilo = input.nextInt();
        System.out.print("Kaç kilo patlıcan aldınız?");
        patlicanKilo = input.nextInt();

        //Sonucu Hesaplayıp ekrana yazma
        toplamTutar = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlıcan * patlicanKilo);
        System.out.println("Toplam tutar" + toplamTutar);
    }
}