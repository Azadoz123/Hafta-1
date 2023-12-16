import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int nFactoriel=1, rFactoriel=1, nEksiRFactoriel=1, result;
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını giriniz : ");
        int n = input.nextInt();
        System.out.print("R sayısını giriniz : ");
        int r =input.nextInt();


        for(int i = 1; i<=n ; i++){
            nFactoriel*=i;
        }

        for(int i = 1; i<=r ; i++){
            rFactoriel*=i;
        }

        for(int i = 1; i<(n-r); i++){
            nEksiRFactoriel*=i;
        }

        result = nFactoriel/(rFactoriel * nEksiRFactoriel);
        System.out.println(result);
    }
}