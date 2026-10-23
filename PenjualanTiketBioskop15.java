import java.util.Scanner;
public class PenjualanTiketBioskop15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        int hargaTiket = 50000;
        int totalHarga;
        double diskon;
        int totalBayar;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak vali! Masuukan ulang.");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }
            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = totalHarga * 0.15;
            } else if (jumlahTiket > 4) {
                diskon = totalHarga * 0.10;
            } else {
                diskon = 0;
            }

            totalBayar = (int) (totalHarga - diskon);
            totalTiket += jumlahTiket;

            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Total harga: Rp" + totalHarga);
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total bayar: Rp" + totalBayar);
        } while (jumlahTiket != 0);

        System.out.println("Total tiket terjual hari ini: " + totalTiket);
        System.out.println("Program selesai");
    }
}