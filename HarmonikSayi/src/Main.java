import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n = input.nextInt();
        double result =0.0;
        for (int i= 1; i<=n; i++){
            result += 1 / (double) i;
        }
        System.out.println("Sonuç : " + result);
    }
}