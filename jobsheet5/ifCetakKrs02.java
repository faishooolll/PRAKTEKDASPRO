import java.util.Scanner;

public class ifCetakKrs02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS Siakad ---");
        System.out.print("Apakah ukt sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("pEMBAYARAN uKT Sudah Lunas");
            System.out.println("Silahkan Cetak Krs dan minta tanda tangan DPA");
        }
        sc.close();
    }
}