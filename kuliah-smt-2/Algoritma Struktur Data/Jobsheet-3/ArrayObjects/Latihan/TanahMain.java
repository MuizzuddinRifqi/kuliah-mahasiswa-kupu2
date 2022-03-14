import java.util.*;
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String modifan = "=".repeat(30);
        System.out.println(modifan);
        System.out.print("Jumlah Tanah : ");
        int jumTanah = sc.nextInt();

        Tanah[] arrTanah = new Tanah[jumTanah];

        for (int i = 0; i < jumTanah; i++) {
            arrTanah[i] = new Tanah();
            System.out.println(modifan);
            System.out.println("Tanah " + (i+1));
            System.out.print("Panjang Tanah : ");
            arrTanah[i].panjang = sc.nextInt();

            System.out.print("Lebar Tanah   : ");
            arrTanah[i].lebar = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < jumTanah; i++) {
            System.out.println("Luas Tanah " + (i+1) + " = " + arrTanah[i].luasTanah());
        }  

        int tanah1 = 0, tanah2 = 0;
        for (int i = 0; i < arrTanah.length; i++) {
            if (tanah1 < arrTanah[i].luasTanah()) {
                tanah1 = arrTanah[i].luasTanah();
                tanah2 = i+1;
            }
        }

        System.out.println();
        System.out.println("Tanah Terluas : Tanah " + tanah2);
    }
}