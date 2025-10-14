import java.util.Scanner;

public class caseMETHOD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiUTS, nilaiUAS, nilaiTUGAS;
        int nilaiUTS1, nilaiUAS1, nilaiTUGAS1;
        long nim;
        String nama;

        System.out.println("======= INPUT DATA MAHASISWA =======");
        System.out.print("NAMA: ");
        nama = sc.nextLine();
        System.out.print("NIM: ");
        nim = sc.nextLong();

        System.out.println("--- MATA KULIAH 1: ALGORITMA DAN PEMROGRAMAN");
        System.out.print("NILAI UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.print("NILAI UAS: ");
        nilaiUAS = sc.nextInt();
        System.out.print("NILAI TUGAS: ");
        nilaiTUGAS = sc.nextInt();
        
        System.out.println("--- MATA KULIAH 2: STRUKTUR DATA");
        System.out.print("NILAI UTS: ");
        nilaiUTS1 = sc.nextInt();
        System.out.print("NILAI UAS: ");
        nilaiUAS1 = sc.nextInt();
        System.out.print("NILAI TUGAS: ");
        nilaiTUGAS1 = sc.nextInt();

        double nilaiAkhir = (nilaiUTS * 0.3) + (nilaiUAS * 0.4) + (nilaiTUGAS * 0.3);
        double nilaiAkhir1 = (nilaiUTS1 * 0.3) + (nilaiUAS1 * 0.4) + (nilaiTUGAS1 * 0.3);
        double nilaiTotal = (nilaiAkhir + nilaiAkhir1) / 2;

        String nilaiHuruf = "";
        String nilaiHuruf1 = "";

        // IF STATEMENT ALGORITMA
        if (nilaiAkhir <= 100 &&  nilaiAkhir >80) {
            nilaiHuruf = "A";
        }
        else if (nilaiAkhir <= 80 &&  nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        }
        else if (nilaiAkhir <= 73 &&  nilaiAkhir >65) {
            nilaiHuruf = "B";
        }
        else if (nilaiAkhir <= 65 &&  nilaiAkhir >60) {
            nilaiHuruf = "C+";
        }
        else if (nilaiAkhir <= 60 &&  nilaiAkhir >50) {
            nilaiHuruf = "C";
        }
        else if (nilaiAkhir <= 50 &&  nilaiAkhir >39) {
            nilaiHuruf = "D";
        }
        else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        }else{
            System.out.println("INVALID INPUT");
        }

        // IF STATEMENT STRUKTTUR DATA
        if (nilaiAkhir1 <= 100 &&  nilaiAkhir1 >80) {
            nilaiHuruf1= "A";
        }
        else if (nilaiAkhir1 <= 80 &&  nilaiAkhir1 > 73) {
            nilaiHuruf1 = "B+";
        }
        else if (nilaiAkhir1 <= 73 &&  nilaiAkhir1 >65) {
            nilaiHuruf1 = "B";
        }
        else if (nilaiAkhir1 <= 65 &&  nilaiAkhir1 >60) {
            nilaiHuruf1 = "C+";
        }
        else if (nilaiAkhir1 <= 60 &&  nilaiAkhir1 >50) {
            nilaiHuruf1 = "C";
        }
        else if (nilaiAkhir1 <= 50 &&  nilaiAkhir1 >39) {
            nilaiHuruf1 = "D";
        }
        else if (nilaiAkhir1 <= 39) {
            nilaiHuruf1 = "E";
        }else{
            System.out.println("INVALID INPUT");
        }


        if (nilaiAkhir < 60 && nilaiAkhir1 <60) {
             System.out.println("============= HASIL PENILAIAN AKADEMIK =============");
        System.out.println("NAMA: " + nama);
        System.out.println("NIM:" +nim);
        System.out.println("Mata Kuliah                    UTS   UAS   TUGAS   NILAI AKHIR   NILAI HURUF   STATUS");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("ALGORITMA PEMROGRAMAN        " + nilaiUTS +"    " +nilaiUAS + "      " + nilaiTUGAS+ "        " + nilaiAkhir + "          " + nilaiHuruf+"          TIDAK LULUS");
        System.out.println("STRUKTUR DATA                  " + nilaiUTS1 +"    " +nilaiUAS1 + "      " + nilaiTUGAS1+ "        " + nilaiAkhir1 + "           " + nilaiHuruf1 +"          TIDAK LULUS");
        }else if (nilaiAkhir >= 60 && nilaiAkhir1 >= 60) {
             System.out.println("============= HASIL PENILAIAN AKADEMIK =============");
        System.out.println("NAMA: " + nama);
        System.out.println("NIM: " +nim);
        System.out.println("Mata Kuliah                    UTS   UAS   TUGAS   NILAI AKHIR   NILAI HURUF   STATUS");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("ALGORITMA PEMROGRAMAN          " + nilaiUTS +"    " +nilaiUAS + "      " + nilaiTUGAS+ "        " + nilaiAkhir + "           " + nilaiHuruf+"          LULUS");
        System.out.println("STRUKTUR DATA                  " + nilaiUTS1 +"    " +nilaiUAS1 + "      " + nilaiTUGAS1+ "        " + nilaiAkhir1 + "           " + nilaiHuruf1+ "          LULUS");
        }else if (nilaiAkhir >= 60 && nilaiAkhir1 < 60) {
             System.out.println("============= HASIL PENILAIAN AKADEMIK =============");
        System.out.println("NAMA: " + nama);
        System.out.println("NIM: " +nim);
        System.out.println("Mata Kuliah                    UTS   UAS   TUGAS   NILAI AKHIR   NILAI HURUF   STATUS");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("ALGORITMA PEMROGRAMAN          " + nilaiUTS +"    " +nilaiUAS + "      " + nilaiTUGAS+ "        " + nilaiAkhir + "           " + nilaiHuruf+"          LULUS");
        System.out.println("STRUKTUR DATA                  " + nilaiUTS1 +"    " +nilaiUAS1 + "      " + nilaiTUGAS1+ "        " + nilaiAkhir1 + "           " + nilaiHuruf1+ "          TIDAK LULUS");
        }else if (nilaiAkhir < 60 && nilaiAkhir1 >= 60) {
             System.out.println("============= HASIL PENILAIAN AKADEMIK =============");
        System.out.println("NAMA: " + nama);
        System.out.println("NIM: " +nim);
        System.out.println("Mata Kuliah                    UTS   UAS   TUGAS   NILAI AKHIR   NILAI HURUF   STATUS");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("ALGORITMA PEMROGRAMAN          " + nilaiUTS +"    " +nilaiUAS + "      " + nilaiTUGAS+ "        " + nilaiAkhir + "           " + nilaiHuruf+"          TIDAK LULUS");
        System.out.println("STRUKTUR DATA                  " + nilaiUTS1 +"    " +nilaiUAS1 + "      " + nilaiTUGAS1+ "        " + nilaiAkhir1 + "           " + nilaiHuruf1+ "          LULUS");
        }
        if (nilaiTotal <70) {
            System.out.println("Rata rata nilai akhir: " + nilaiTotal );
            System.out.println("STATUS SEMESTER: TIDAK LULUS (RATA RATA < 70)");
        }else if (nilaiTotal >= 70) {
            System.out.println("Rata rata nilai akhir adalah " + nilaiTotal );
            System.out.println("STATUS SEMESTER: LULUS (RATA RATA >= 70)");
        }
       

        sc.close();
    }
}
