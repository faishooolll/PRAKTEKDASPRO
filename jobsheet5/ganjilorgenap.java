import java.util.Scanner;
public class ganjilorgenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int angka;
        System.out.println("Masukkan Angka");
        angka = sc.nextInt();

        if (angka%2 == 0) {
            System.out.println("angka genap");
        }else{
            System.out.println("angka ganjil");
        }
    sc.close();
    }
}
