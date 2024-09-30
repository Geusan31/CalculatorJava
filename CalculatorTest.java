import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner angka1Scanner = new Scanner(System.in);
        Scanner angka2Scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("============ Kalkulator ============");
        System.out.print("Masukkan angka pertama : ");
        String angka1 = angka1Scanner.nextLine();
        System.out.print("Masukkan angka kedua : ");
        String angka2 = angka2Scanner.nextLine();

        int convertAngka1 = Integer.parseInt(angka1);
        int convertAngka2 = Integer.parseInt(angka2);

        int penjumlahan = convertAngka1 + convertAngka2;
        int pengurangan = convertAngka1 - convertAngka2;
        int perkalian = convertAngka1 * convertAngka2;
        int pembagian = convertAngka1 / convertAngka2;
        int sisaBagi = convertAngka1 % convertAngka2;
        System.out.println("\n");
        System.out.println("=========== Hasil ============");
        System.out.println("Angka Pertama : " + convertAngka1);
        System.out.println("Angka Kedua : " + convertAngka2);
        System.out
                .println("Hasil dari Penjumlahan " + convertAngka1 + " + " + convertAngka2 + " adalah " + penjumlahan);
        System.out
                .println("Hasil dari Pengurangan " + convertAngka1 + " - " + convertAngka2 + " adalah " + pengurangan);
        System.out.println("Hasil dari Perkalian " + convertAngka1 + " * " + convertAngka2 + " adalah " + perkalian);
        System.out.println("Hasil dari Pembagian " + convertAngka1 + " / " + convertAngka2 + " adalah " + pembagian);
        System.out.println("Hasil dari Sisa Bagi " + convertAngka1 + " % " + convertAngka2 + " adalah " + sisaBagi);
    }
}
