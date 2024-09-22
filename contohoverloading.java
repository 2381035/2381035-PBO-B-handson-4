import java.security.cert.TrustAnchor;
public class contohoverloading {
    public static double hitungluas(double sisi) {
        return sisi * sisi;
    }
    public static double hitungluas(double panjang, double lebar) {
        return panjang * lebar;
    }
    public static double hitungluas(double jarijari, boolean isilingkaran) {
        if(isilingkaran){
            return Math.PI * jarijari * jarijari;

        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        double luaspersegi = hitungluas(5);
         System.out.println("Luas persegi: " + luaspersegi);
        double luaspersegipanjang = hitungluas(6);
         System.out.println("Luas persegi panjang: " + luaspersegipanjang);
        double luaslingkaran = hitungluas(3, true);
         System.out.println("Luas lingkaran: " + luaslingkaran);
    }
}
