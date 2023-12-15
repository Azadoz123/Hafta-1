import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kaç kilo armut aldınız? :");
        double armut = input.nextDouble();
        System.out.println("Kaç kilo elma aldınız : ");
        double elma = input.nextDouble();
        System.out.println("kaç kilo domates aldınız? :");
        double domates = input.nextDouble();
        System.out.println("kaç kilo muz aldınız ? :");
        double muz = input.nextDouble();
        System.out.println("Kaç kilo patlıcam aldınız?");
        double patlıcan = input.nextDouble();

        double armutf = armut * 2.14;
        double elmaf = elma  * 3.67;
        double domatesf= domates * 1.11;
        double muzf= muz * 0.95;
        double patlıcanf = patlıcan * 5;

        double Toplam_ucret = armutf + elmaf + domatesf + muzf + patlıcanf;
        System.out.println("toplam ücret = " + Toplam_ucret);





    }



}