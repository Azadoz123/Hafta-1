import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolcuTipi;
        double biletFiyat;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolcuTipi = input.nextInt();

        //Hatalı veri girişini engellemek için koşulu sağlama
        if(mesafe > 0 && yas > 0 && (yolcuTipi >=1 && yolcuTipi <=2)){
            biletFiyat = mesafe * 0.1;

            //İndirim Uygulama
            if( yas < 12){
                biletFiyat = biletFiyat /2;
            } else if (yas >= 12 && yas <= 24) {
                biletFiyat = biletFiyat - (biletFiyat * 0.1);
            } else if (yas > 65) {
                biletFiyat = biletFiyat - (biletFiyat * 0.3);
            }
            if(yolcuTipi == 2){
                biletFiyat = biletFiyat - (biletFiyat * 0.2) ;
                biletFiyat = biletFiyat * 2;
            }

            System.out.println("Toplam Tutar = " + biletFiyat);
        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}