import  java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        int km ;
        double perKm=2.20,total;



        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        total = km * perKm;
        total += 10 ;
        total= (total<20)? 20: total;
        System.out.println("Toplam Tutar: " + total);

    }
}
