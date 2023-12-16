import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int n,j=1,k=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz : ");
        n = input.nextInt();

        while(n>k){
            System.out.println((j));
            System.out.println((k));
            j*=4;
            k*=5;
        }
    }
}