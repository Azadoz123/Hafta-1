import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfı oluştur
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.println("Matematik Notunuz :");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz :");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz :");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuz :");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuz :");
        muzik = input.nextInt();

        //Ortalamayı hesapla
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0 ;
        System.out.println("Ortalmanız :" + sonuc);

        //Kaldı mı geçti mi ekrana yaz
        String str = (sonuc >= 60) ? "Geçti" : "Kaldı";
        System.out.println();
        System.out.println(str);

    }
}