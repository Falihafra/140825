import java.util.Scanner;

public class BelanjaBarangFaliha {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nama Barang1");
        String namabarang1 = input.nextLine();
        System.out.println("Masukkan Harga Barang1:");
        int Harga1 = input.nextInt();

        System.out.println("Masukkan Nama Barang2");
        String namabarang2 = input.next();
        System.out.println("Masukkan Harga Barang2:");
        int Harga2 = input.nextInt();
        int penjumlahan = Harga1+Harga2;

    
        System.out.println("Barang Yang Dibeli: "+ namabarang1 + " dan " + namabarang2);
        System.out.println("Harga:"+ Harga1 + " dan " + Harga2);
        System.out.println("Total belanja: "+ penjumlahan);
        System.out.println("Nominal uang: ");
        int Nominal = input.nextInt();
        int kembalian = Nominal - penjumlahan;
        System.out.println("Kembalian: "+ kembalian);

    


    

       

        

    }
    
}
