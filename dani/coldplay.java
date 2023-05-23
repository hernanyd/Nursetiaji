//Nursetiaji Ramadhani
//227064516018
package javaapplication1;
import java.util.Scanner;
public class coldplay {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);

        System.out.println("## COLDPLAY MUSIC of SPHERES ##");
        System.out.println("========== WORLD TOUR ==========");
        System.out.println("GELORA BUNG KARNO STADIUM JAKARTA");

        System.out.println("Kategori tiket yang tersedia:");
        System.out.println("1. Category 1 (Rp5.000.000)");
        System.out.println("2. Category 2 (Rp4.000.000)");
        System.out.println("3. Category 3 (Rp3.250.000)");
        System.out.println("4. Category 4 (Rp2.500.000)");

        System.out.print("Pilih kategori tiket (1-4): ");
        int category = input.nextInt();

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int quantity = input.nextInt();

        int price = 0;
        switch (category) {
            case 1:
                price = 5000000;
                break;
            case 2:
                price = 4000000;
                break;
            case 3:
                price = 3250000;
                break;
            case 4:
                price = 2500000;
                break;
            default:
                System.out.println("Kategori tiket tidak valid!");
                return;
        }

        int totalPrice = price * quantity;

        System.out.println("=================================");
        System.out.println("       INVOICE PEMBELIAN");
        System.out.println("=================================");
        System.out.println("Kategori Tiket: Category " + category);
        System.out.println("Jumlah Tiket: " + quantity);
        System.out.println("Harga Tiket: Rp" + totalPrice);
        System.out.println("=================================");

        System.out.print("Masukkan jumlah uang yang akan dibayarkan: ");
        int payment = input.nextInt();

        int change = payment - totalPrice;

        System.out.println("Kembalian: Rp" + change);
        System.out.println("================================");
    }
}