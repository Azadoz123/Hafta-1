import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int dogumYili, kalan;
        String sonuc="";

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        dogumYili = input.nextInt();

        //Kalana göre hayvan adı bulunur
        kalan = dogumYili % 12;
        if(kalan == 0){
            sonuc = "Maymun";
        } else if (kalan == 1) {
            sonuc = "Horoz";
        }else if (kalan == 2) {
            sonuc = "Köpek";
        }else if (kalan == 3) {
            sonuc = "Domuz";
        }else if (kalan == 4) {
            sonuc = "Fare";
        }else if (kalan == 5) {
            sonuc = "Öküz";
        }else if (kalan == 6) {
            sonuc = "Kaplan";
        }else if (kalan == 7) {
            sonuc = "Tavşan";
        }else if (kalan == 8) {
            sonuc = "Ejderha";
        }else if (kalan == 9) {
            sonuc = "Yılan";
        }else if (kalan == 10) {
            sonuc = "At";
        }else if (kalan == 11) {
            sonuc = "Koyun";
        }

        //Sonucu yazdırma
        System.out.println("Çin Zodyağı Burcunuz : " + sonuc);
    }
}