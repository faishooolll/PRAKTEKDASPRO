import java.util.Scanner;
public class NilaiMahasiswa02 {
    public static void isianArray(double[] nilaiArray, Scanner scanner) {
        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiArray[i] = scanner.nextDouble();
        }
    }
    public static void tampilArray(double[] nilaiArray) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiArray[i]);
        }
    }
    public static double hitTot(double[] nilaiArray) {
        double total = 0;
        for (int i = 0; i < nilaiArray.length; i++) {
            total += nilaiArray[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = scanner.nextInt();
        double[] nilaiMahasiswa = new double[N];
        isianArray(nilaiMahasiswa, scanner);
        tampilArray(nilaiMahasiswa);
        double totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);
        scanner.close();
    }
}