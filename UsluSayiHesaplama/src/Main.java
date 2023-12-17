import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n,k, result=1;

        Scanner input = new Scanner(System.in);
        System.out.println("üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.println("Üs olacak sayı : ");
        k = input.nextInt();

        for(int i=1; i<=k; i++){
            result*=n;
        }
        System.out.println("Sonuç : " + result);
    }
}