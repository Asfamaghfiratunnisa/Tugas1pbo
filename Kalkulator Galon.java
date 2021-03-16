package tugas;

import java.util.Scanner;

public class TugasPBO1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        double Gallons;
        double hasil;
        
        System.out.println("== Konversi Satuan Liter Galon ==");
        System.out.println("Masukkan Jumlah Galon : ");
        
        Gallons = scan.nextDouble();
        hasil = Gallons *3.785;
        
        System.out.printf("%.0f Galon = %.3f Liter \n\n", Gallons, hasil);
    }
}
