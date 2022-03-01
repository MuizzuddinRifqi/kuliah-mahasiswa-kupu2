public class Barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;
    
    Barang() {
    }
    Barang(String namaBarang, String jenisBarang, int stok, int hargaSatuan) {
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }

    void tampilBarang() {
        System.out.println("Nama = " + namaBarang);
        System.out.println("Jenis = " + jenisBarang);
        System.out.println("Stok = " + stok);
        System.out.println("Harga Satuan = " + hargaSatuan);
    }

    void tambahStok(int n) {
        stok += n;
    }

    void kurangiStok(int n) {
        if (stok > 0) {
            stok -= n;
        }
    }

    int hitungHargaTotal(int jumlah) {
        return jumlah*hargaSatuan;
    }

}