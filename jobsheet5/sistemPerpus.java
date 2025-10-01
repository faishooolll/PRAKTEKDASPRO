import java.util.Scanner;
public class sistemPerpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String ktm;
        String regis;

        System.out.print("Apakah anda sudah membawa ktm? (ya/tidak): ");
        ktm = sc.nextLine();
        System.out.print("Apakah anda sudah registrasi? (ya/tidak): ");
        regis = sc.nextLine();
        if (ktm.equalsIgnoreCase("ya") && regis.equalsIgnoreCase("ya")) {
            System.out.println("boleh masuk");
        }else{
            System.out.println("tidak boleh masuk");
        }
        sc.close();

    }
}
