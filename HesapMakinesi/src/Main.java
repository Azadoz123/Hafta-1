import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        if(select == 1){
            System.out.println("Toplam : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Çıkarma : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Çarpma : " + (n1 * n2));
        } else if (select == 4) {
            if(select != 0){
                System.out.println("Bölme : " + (n1 / n2));
            }else {
                System.out.println("Bir sayı 0'a Bölünemez!");
            }
        }else {
            System.out.println("Yanlış seçim yaptınız.");
        }
    }
}