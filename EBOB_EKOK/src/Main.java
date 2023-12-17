import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n1, n2, ebob = 1, ekok=1, i=1;
        Scanner input = new Scanner(System.in);
        System.out.print("N1 sayısını giriniz : ");
        n1 = input.nextInt();
        System.out.print("N2 sayısını giriniz : ");
        n2 = input.nextInt();

        int enKucuk = n1, enBuyuk =n2;

        if(n1>n2){
            enKucuk = n2;
            enBuyuk = n1;
        }

        while (i <= enKucuk){
            if( (n1 % i) == 0 && (n2 % i == 0))
                ebob = i;
            i++;
        }
        System.out.println("EBOB : " + ebob);

        i =enBuyuk;

        while (i <= (n1*n2)){
            if ((i % n2 == 0) && ( i % n1 == 0)){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("EKOK : " + ekok);
    }
}