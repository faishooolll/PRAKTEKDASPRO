public class pengunjungCafe02{
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for(int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 3. Eksekusi fungsi daftarPengunjung dari dalam fungsi main
        daftarPengunjung("Ali", "Budi", "Citra");
        // 5. Tambahkan dua baris berikut
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}