import java.util.Scanner;
public class PersegiPanjangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Length Array : ");
        int arr = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[arr];

        for (int i = 0; i < arr; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang Ke-" + i);
            System.out.print("Masukkan Panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < arr; i++) {
            System.out.println("Persegi Panjang Ke-" +i);
            System.out.println("Panjang : " + ppArray[i].panjang + " | Lebar : " + ppArray[i].lebar);
        }
    }
}