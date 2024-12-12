import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {

   
    static String[] buku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
    static int[] hargabuku = {350000, 450000, 500000, 95000};

    
    public static void DaftarBuku() {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < buku.length; i++) {
            System.out.println((i + 1) + ". " + buku[i] + " " + hargabuku[i]);
        }
    }

    
    public static int hitungTotalHargaBuku(ArrayList<Integer> belanja) {
        int total = 0;
        for (int index : belanja) {
            total += hargabuku[index];
        }
        return total;
    }

    
    public static int hitungVoucher(int total) {
        if (total < 200000) {
            return 0;
        } else if (total <= 500000) {
            return 50000;
        } else if (total <= 750000) {
            return 100000;
        } else if (total <= 1000000) {
            return 150000;
        } else {
            return 200000;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> belanja = new ArrayList<>();
        String pilihan;

        do {
            DaftarBuku();

            
            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int pilihanBuku = scanner.nextInt() - 1;

            
            if (pilihanBuku >= 0 && pilihanBuku < buku.length) {
                belanja.add(pilihanBuku);
            } else {
                System.out.println("Pilihan tidak valid.");
            }

          
            System.out.print("Input lagi (Y/N)?: ");
            pilihan = scanner.next();

        } while (pilihan.equalsIgnoreCase("Y"));
        int totalHarga = hitungTotalHargaBuku(belanja);
        int voucher = hitungVoucher(totalHarga);

       
        System.out.println("Total voucher belanja = " + voucher);
        System.out.println("Total yang harus dibayar = " + totalHarga);

        scanner.close();
        
          System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
