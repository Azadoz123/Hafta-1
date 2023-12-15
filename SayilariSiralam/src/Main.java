import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a, b, c, enKucuk, enBuyuk, orta;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        b = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz :");
        c = input.nextInt();

        enKucuk = a;
        enBuyuk = a;
        orta = a;

        if(b < enKucuk){
            enKucuk = b;
        }
        if(c < enKucuk){
            enKucuk =c;
        }

        if(b > enBuyuk){
           enBuyuk = b;
        }
        if(c > enBuyuk){
            enBuyuk = c;
        }


        if(b > enKucuk && b < enBuyuk){
            orta = b;
        }
        if(c > enKucuk && c < enBuyuk){
            orta = c;
        }

        System.out.println( enKucuk +"," + orta + "," + enBuyuk);
    }
}