import java.util.Scanner;

public class LadyBug {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI LADY BUG!");
        System.out.println("---------------------------------");

        System.out.println("Aturan Main: " +
                "Permainan akan berakhir ketika menyentuh boom.  ");
        System.out.println("Lady bug harus memakan ulat, untuk menambah poin");
        System.out.println("Memakan Ulat akan menambah 1 Poin");
        System.out.println("Menyentuh boom, maka permainan berakhir");
        System.out.println("Arah gerakan: \n1. Kanan\n2. Tengah\n3. Kiri");
        System.out.println("\nMasukkan nama Lady Bugmu : ");

        System.out.print("Nama Pemain: ");
        String tangkapanPertama = input.next();

        int scoreTimPertama = 0;

/**        int max = 3;
 for (int i = 0; i <= 3; i++) {
 int bom = (int) (Math.random() * max);
 System.out.println(bom);*/

        for (int a = 1; a < 3 ; a++)
        {
            System.out.print("Masukkan arah tangkapan " + tangkapanPertama + ": ");
            int arahTangkapanPertama = input.nextInt();

            int max = 3;
            for (int i = 0; i <= 3; i++) {
                int ulat = (int) (Math.random() * max);
                System.out.println(ulat);
                if (arahTangkapanPertama == ulat) {
                    System.out.println("tim \n" + tangkapanPertama + " Berhasil!!!");
                } else {
                    System.out.println("tim \n" + tangkapanPertama + " Gagal");
                    scoreTimPertama++;
                }
            }

            System.out.println("\n" + tangkapanPertama +  " = " + scoreTimPertama + ":" );
            System.out.println("Terima Kasih telah bermainn!! :)");

        }

    }
}
