import java.util.Scanner;
public class wifiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;
        int sks;
        System.out.print("siapakah anda (dosen/mahasiswa): ");
        user = sc.nextLine();
        if (user.equalsIgnoreCase("dosen")) {
            System.out.println("Akses wifi diberikan");
        }else if(user.equalsIgnoreCase("mahasiswa")){
            System.out.println("Berapa jumlah sks yang sudah anda tempuh?");
            sks = sc.nextInt();
            if (sks>=12) {
                System.out.println("Akses wifi diberikan");
            }else if(sks<12){
                System.out.println("Akses wifi tidak diberikan");
            }
        }else{
            System.out.println("Akses ditolak");
        }

        sc.close();
    }
}
