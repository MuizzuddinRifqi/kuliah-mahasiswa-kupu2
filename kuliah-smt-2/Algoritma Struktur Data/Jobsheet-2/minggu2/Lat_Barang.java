public class Lat_Barang {
    String nama;
    int hargaSatuan, jumlah;

    int hitungHargaTotal() {
        return hargaSatuan*jumlah;
    }

    int hitungDiskon() {
        if (hitungHargaTotal() > 100000) {
            return hitungHargaTotal() * 10 / 100;
        } 
        else if (hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000) {
            return hitungHargaTotal() * 5 / 100;
        }
        else {
            return hitungHargaTotal();
        }
    }

    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
}