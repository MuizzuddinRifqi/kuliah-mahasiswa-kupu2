public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga[] sArray = new Segitiga[4];

        sArray[0] = new Segitiga(10, 4);
        sArray[1] = new Segitiga(20, 10);
        sArray[2] = new Segitiga(15, 6);
        sArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sArray.length; i++) {
            System.out.println("Luas Segitiga Ke - " + i + "     = " +sArray[i].hitungLuas());
            System.out.println("Keliling Segitiga Ke - " + i + " = " +sArray[i].hitungKeliling());
        }
    }
}