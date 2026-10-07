import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa  : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = sc.nextLine().trim();
        System.out.print("Jumlah dokumen  : ");
        int dokumen = sc.nextInt();

        int kurang = 4 - dokumen;

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara : ");
            int juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + juara + ").");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }

        } else {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }

        sc.close();
    }
}