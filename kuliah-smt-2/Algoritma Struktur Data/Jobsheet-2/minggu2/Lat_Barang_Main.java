import java.util.Scanner;
public class Lat_Barang_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lat_Barang item = new Lat_Barang();
        String modifan = "=".repeat(40);

        System.out.println(modifan);
        System.out.println(modifan);
        System.out.print("Masukkan Nama Barang      : ");
        item.nama = sc.nextLine();
        System.out.print("Masukkan Harga Satuan     : ");
        item.hargaSatuan = sc.nextInt();
        System.out.print("Masukkan Jumlah Barang    : ");
        item.jumlah = sc.nextInt();
        System.out.println(modifan);
        System.out.println(modifan);

        System.out.println("Harga Total     : " + item.hitungHargaTotal());
        System.out.println("Total Diskon    : " + item.hitungDiskon());
        System.out.println("Harga Bayar     : " + item.hitungHargaBayar());

        System.out.println(modifan);
        System.out.println(modifan);
    }
}
