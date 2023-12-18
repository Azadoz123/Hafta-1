import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int n, number, enBuyuk, enKucuk;
        //Kaç sayı karşılaştırılacak
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        n = input.nextInt();
        System.out.print("1. Sayıyı giriniz: ");
        enBuyuk = input.nextInt();
        enKucuk = enBuyuk;

        //Kullanıcı sayıları girecek
        for(int i =2; i<=n; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            number = input.nextInt();
            //En büyük ve en küçük sayıları bulma
            if( number < enKucuk)
                enKucuk = number;
            if( number > enBuyuk)
                enBuyuk =number;
        }
        //Ekrana yazdırma
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}