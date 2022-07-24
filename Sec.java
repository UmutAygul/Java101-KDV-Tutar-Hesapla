import java.util.Scanner;

public class Sec {
    public static void main(String[] args) {
        double total,kdvli;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar gir:");
        total = input.nextDouble();
        System.out.println("Kdvsiz fiyat: " + total);
        boolean turumu= total > 0 && total <1000;
        double kdv = turumu ? 0.18 : 0.08;

        System.out.println("Kdv oranı: " + kdv);
        kdvli = total + total*kdv;
        System.out.println("Kdv'li fiyat: "+ kdvli);
        
        
        
        
        
    }
}
