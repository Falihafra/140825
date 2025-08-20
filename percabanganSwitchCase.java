import java.util.Scanner;

public class percabanganSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan warna lampu");
        String lampu = input.next();

        switch (lampu) {
            case "merah":
                System.out.println("Anda harus berhenti");
                break;
            case "kuning":
                System.out.println("Mohon hati-hati");
                break;
            case "hijau":
                System.out.println("Silahkan jalan");
                break;
            default:
                System.out.println("Salah ketik ya");
                break;
        }
    }

}
