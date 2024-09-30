import java.util.Scanner;

class modul2 {
    public static void main(String[] args) {
        Scanner namaLengkapScanner = new Scanner(System.in);
        Scanner panggilanScanner = new Scanner(System.in);
        Scanner kotaScanner = new Scanner(System.in);
        Scanner sekolahScanner = new Scanner(System.in);
        Scanner fakultasScanner = new Scanner(System.in);
        Scanner prodiScanner = new Scanner(System.in);
        System.out.println("================== BIODATA ===================");
        System.out.println("Perkenalan Diri");
        System.out.print("Nama Lengkap: ");
        String namaLengkap = namaLengkapScanner.nextLine();
        System.out.print("Panggilan: ");
        String panggilan = panggilanScanner.nextLine();
        System.out.print("Asal Kota: ");
        String kota = kotaScanner.nextLine();
        System.out.print("Asal Sekolah: ");
        String sekolah = sekolahScanner.nextLine();
        System.out.print("Asal Fakultas: ");
        String fakultas = fakultasScanner.nextLine();
        System.out.print("Asal Prodi: ");
        String prodi = prodiScanner.nextLine();

        System.out.println("================== HASIL ===================");
        System.out.println("Perkenalkan nama Saya " + namaLengkap + " biasa dipanggil " + panggilan
                + " , asal saya dari kota " + kota + " , asal sekolah saya " + sekolah + ", saya dari fakultas "
                + fakultas + " dan mengambil prodi " + prodi);
    }
}
