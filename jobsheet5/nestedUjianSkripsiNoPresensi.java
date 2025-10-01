import java.util.Scanner;
public class nestedUjianSkripsiNoPresensi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim();
        System.out.println("Masukkan jumlah bimbingan log 1");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukkan jumlah bimbingan log 2");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >=4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendafatar ujian skripsi ";
            } else if (bimbinganP1 <8 && bimbinganP2 <4) {
                pesan = "Gagal! bimbingan P1 kurang dari 8 kali dan bimbingan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! bimbingan P1 belum mencapai 8 kali";
            } else{
                pesan = "Gagal! bimbingan P2 belum mencapai 4 kali";
            }
            System.out.println(pesan);
        }

        sc.close();
    }
}