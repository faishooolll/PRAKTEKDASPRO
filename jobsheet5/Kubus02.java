public class Kubus02{
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }
    public static void main(String[] args) {
        double sisi = 5.0;
        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Kubus dengan sisi: " + sisi);
        System.out.println("Volume: " + volume);
        System.out.println("Luas Permukaan: " + luasPermukaan);
    }
}
