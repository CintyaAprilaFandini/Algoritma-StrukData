import java.util.Scanner;
public class SllMain_tgs4 {
    public static void main(String[] args) {
        Sll_tgs4 sll = new Sll_tgs4();
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        char pilih;
        int menu;
        do {
            System.out.println("Pilihan Menu");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data Terakhir");
            System.out.println("3. Lihat Antrian Paling Depan");
            System.out.println("4. Lihat Antrian Paling Belakang");
            System.out.println("5. Mencari Data Nasabah Melalui Index");
            System.out.println("6. Tampilkan Data");
            System.out.print("Masukkan Pilihan Menu (1-6): ");
            menu = sc.nextInt();
            System.out.println("");

            switch (menu) {
                case 1: {
                    do {
                        System.out.print("Masukkan Nomor Rekening Nasabah : ");
                        String no = in.nextLine();
                        System.out.print("Nama Nasabah                    : ");
                        String nama = in.nextLine();
                        System.out.print("Alamat Nasabah                  : ");
                        String alamat = in.nextLine();
                        System.out.print("Apakah anda ingin menambah data baru?(y/n) : ");
                        pilih = sc.next().charAt(0);
                        sll.tambahData(no, nama, alamat);
                        System.out.println("");
                    } while (pilih == 'y' || pilih == 'Y');
                }
                break;
                case 2: {
                    sll.remove();
                    System.out.println("");
                }
                break;
                case 3: {
                    sll.antrianDepan();
                    System.out.println("");
                }
                break;
                case 4: {
                    sll.antrianBelakang();
                    System.out.println("");
                }
                break;
                case 5: {
                    System.out.print("Masukkan Index Pada Data Yang Dicari : ");
                    int idx = sc.nextInt();
                    sll.cariDataIndex(idx);
                    System.out.println("");
                }
                break;
                case 6: {
                    sll.print();
                    System.out.println("");
                }
                break;
        } 
    } while (menu > 0 && menu < 6) ;
    System.out.println("TERIMA KASIH");
}
}
