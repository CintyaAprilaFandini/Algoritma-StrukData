import java.util.Scanner;
public class SllMain_tgs5 {
    public static void main(String[] args) {
        Sll_tgs5 sll = new Sll_tgs5();
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        char pilih;
        int menu, jmlh;
        int i = 0;
        System.out.print("Masukkan jumlah nasabah : ");
        jmlh = sc.nextInt();
        System.out.println("");
        do {
            System.out.println("Pilihan Menu");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Peek Rear");
            System.out.println("5. Mencari Data Nasabah Melalui Index");
            System.out.println("6. Tampilkan Data (Print)");
            System.out.print("Masukkan Pilihan Menu (1-7): ");
            menu = sc.nextInt();
            System.out.println("");
            switch (menu) {
                case 1: {
                    do {
                        if (i == jmlh) {
                            System.out.println("Data Anda Sudah Penuh, Pilih Menu Yang Lain!");
                            continue;
                        }
                        System.out.print("Masukkan Nomor Rekening Nasabah : ");
                        String no = in.nextLine();
                        System.out.print("Nama Nasabah                    : ");
                        String nama = in.nextLine();
                        System.out.print("Alamat Nasabah                  : ");
                        String alamat = in.nextLine();
                        sll.Enqueue(no, nama, alamat);
                        System.out.println("");
                        i++;
                    } while (i < jmlh);
                }
                break;
                case 2: {
                    sll.Dequeue();
                    System.out.println("");
                }
                break;
                case 3: {
                    sll.peek();
                    System.out.println("");
                }
                break;
                case 4: {
                    sll.peekRear();
                    System.out.println("");
                }
                break;
                case 5: {
                    System.out.print("Masukkan Index Pada Data Yang Dicari : ");
                    int idx = sc.nextInt();
                    sll.peekAt(idx);
                    System.out.println("");
                }
                break;
                case 6: {
                    sll.print();
                    System.out.println("");
                }
                break;
            }
        } while (menu > 0 && menu < 6);
        System.out.println("TERIMA KASIH");
    }
}
