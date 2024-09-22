public class contohmethostaticdannonstatic {
    public static double hitungluaspersegi(double sisi) {
        return sisi * sisi;
    }
    public static void tampilkanpesanselamatdatang(String nama) {
        System.out.println("Selamat datang. " + nama + "!");
    }
    public static void main(String[] args) {
        double luaspersegi = contohmethostaticdannonstatic.hitungluaspersegi(5);
        System.out.println("Luas persegi dengan sisi 5: " + luaspersegi);
         contohmethostaticdannonstatic objek = new contohmethostaticdannonstatic();
         objek.tampilkanpesanselamatdatang("John");
        objek.hitungluaspersegi(5);
    }
}