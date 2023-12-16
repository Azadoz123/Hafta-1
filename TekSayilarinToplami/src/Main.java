import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n, total = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Bir sayı giriniz : ");
            n = input.nextInt();
            if( n%4 == 0){
                total += n;
            }
        } while (n%2 == 0);

        System.out.println("Toplam : " + total);
    }
}