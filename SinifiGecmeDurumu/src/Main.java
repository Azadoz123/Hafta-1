import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Double average = 0.0;
        double i = 0.0;
        int total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();


        if( (mat <= 100 && mat >= 0)) {
            total += mat;
            i++;
        }
        if( (fizik <= 100 && fizik >= 0) ){
            total += fizik;
            i++;
        }
        if ((turkce <= 100 && turkce >= 0) ){
            total += turkce;
            i++;
        }
         if ((kimya <= 100 && kimya >= 0) ) {
             total += kimya;
             i++;
         }
         if ((muzik <= 100 && muzik >= 0)) {
             total += muzik;
         }

         average = total / i;
         if(average <= 55){
             System.out.println("Sınıfta kaldınız.");
         }else {
             System.out.println("Tebrikler, sınıfı geçtiniz");
         }
         System.out.println("Ortalamanız :" + average);
    }
}