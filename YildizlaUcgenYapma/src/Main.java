import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz : ");
        int n;
        n = input.nextInt();
        int k=n, l =1;

        for(int i =0; i<=2 * n;i++) {
            for (int j=0; j < k; j++){
                System.out.print(" ");
            }
            for (int j=0; j < l ; j++){
                System.out.print("*");
            }
       //     for (int j=0; j < k; j++){
      //          System.out.print(" ");
       //     }
            System.out.println();
            if(i < n ){
                k-=1;
                l+=2;
            }else{
                k+=1;
                l-=2;
            }
        }
    }
}