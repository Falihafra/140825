import java.util.Scanner;

public class BelanjaBuahFaliha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah apel: ");
        int apel= input.nextInt();

        System.out.println("Masukkan jumlah kiwi: ");
        int kiwi= input.nextInt();

        System.out.println("Masukkan jumlah mangga");
        int mangga= input.nextInt();

        double hargaApel = 17000, hargaKiwi = 10000, hargaMangga = 8000;
        double total, bayar, kembalian;

        total=(apel*hargaApel)+(kiwi*hargaKiwi)+(mangga*hargaMangga);
        System.out.println("Total buah yang dibeli: "+ (apel + kiwi + mangga));
        System.out.println("Total pembayaran: "+total);
        System.out.println("Masukkan pembayaran: ");
        bayar=input.nextDouble();

        kembalian = bayar - total;
        System.out.println("Kembalian: "+ kembalian);
    }
}
