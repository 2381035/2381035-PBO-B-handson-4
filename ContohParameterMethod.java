public class ContohParameterMethod {
    public static int kalidua(int angka) {
        return angka * 2;
    }
    public static double hitungluassegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
    public static void main(String[] args) {
        int hasilkalidua = kalidua(5);
        System.out.println("5 x 2 = " + hasilkalidua);
        double luassegitiga = hitungluassegitiga(5, 2);
        System.out.println("Luas segitiga = " + luassegitiga);
    }
}