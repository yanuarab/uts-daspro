import java.util.Scanner;

public class ManajemenNilaiSiswa25 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double totalNilai = 0;
        int jumlahSiswa = 0;
        int diAtasRataRata = 0;
        int diBawahRataRata = 0;
        String input;

        while (true) {
            System.out.print("Masukkan nama siswa (atau ketik 'selesai' untuk berhenti): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.print("Masukkan nilai siswa: ");
            double nilaiSiswa = scanner.nextDouble();
            scanner.nextLine(); 
            totalNilai += nilaiSiswa;
            jumlahSiswa++;
            double rataRata = totalNilai / jumlahSiswa;

            if (nilaiSiswa > rataRata) {
                diAtasRataRata++;
            } else if (nilaiSiswa < rataRata) {
                diBawahRataRata++;
            }

            System.out.println("Rata-rata saat ini: " + rataRata);
            System.out.println("Jumlah siswa di atas rata-rata: " + diAtasRataRata);
            System.out.println("Jumlah siswa di bawah rata-rata: " + diBawahRataRata);
            System.out.println();
        }

        if (jumlahSiswa > 0) {
            double rataRataAkhir = totalNilai / jumlahSiswa;
            System.out.println("Rata-rata akhir kelas: " + rataRataAkhir);
            System.out.println("Jumlah siswa di atas rata-rata: " + diAtasRataRata);
            System.out.println("Jumlah siswa di bawah rata-rata: " + diBawahRataRata);

            if ((double) diAtasRataRata / jumlahSiswa > 0.5) {
                System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
            } else {
                System.out.println("Mayoritas siswa tidak memiliki nilai di atas rata-rata.");
            }
        } else {
            System.out.println("Tidak ada data siswa yang dimasukkan.");
        }

        scanner.close();
    }
}
