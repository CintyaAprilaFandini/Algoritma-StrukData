import java.util.Scanner;
public class doubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        int menu;

        doubleLinkedList d = new doubleLinkedList();

        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("==================================================");
            System.out.println("PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLE LINKED LIST");
            System.out.println("==================================================");
            System.out.println("1. Tambah head");
            System.out.println("2. Tambah tail");
            System.out.println("3. Tambah data");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari");
            System.out.println("9. Urut Data");
            System.out.println("10. Keluar");
            System.out.println("Masukkan pilihan menu : ");
            menu = in.nextInt();
            System.out.println("");
            switch (menu) {
                case 1: {
                    System.out.println("--- Tambah head ---");
                    System.out.print("Masukkan data yang akan ditambahkan : ");
                    int head = in.nextInt();
                    d.addFirst(head);
                    System.out.println("");
                }
                break;
                case 2: {
                    System.out.println("--- Tambah tail ---");
                    System.out.print("Masukkan data yang akan ditambahkan : ");
                    int tail = in.nextInt();
                    d.addLast(tail);
                    System.out.println("");
                }
                break;
                case 3: {
                    System.out.println("--- Tambah data ---");
                    System.out.print("Masukkan data           : ");
                    int data = in.nextInt();
                    System.out.print("Masukkan alamat pointer : ");
                    int idx = in.nextInt();
                    d.add(data, idx);
                    System.out.println("");
                }
                break;
                case 4: {
                    System.out.println("--- Hapus Data Pertama ---");
                    d.removeFirst();
                    System.out.println("");
                }
                break;
                case 5: {
                    System.out.println("--- Hapus Data Terakhir ---");
                    d.removeLast();
                    System.out.println("");
                }
                break;
                case 6: {
                    System.out.println("--- Hapus Data Tertentu ---");
                    System.out.print("Masukkan pointer yang ingin dihapus : ");
                    int idx = in.nextInt();
                    d.remove(idx);
                    System.out.println("");
                }
                break;
                case 7: {
                    System.out.println("--- Cetak Data : ----");
                    d.print();
                    System.out.println("");
                }
                break;
                case 8: {
                    System.out.println("--- Cari ---");
                    System.out.print("Masukkan data yang ingin dicari : ");
                    int cari = in.nextInt();
                    d.FindSeqSearch(cari);
                    System.out.println("");
                }
                break;
                case 9: {
                    System.out.println("--- Urut Data ---");
                    d.bubbleSort();
                    System.out.println("");
                }
                break;
            }
            if (menu > 10) {
                System.out.println("Masukkan angka 1-10");
                System.out.println("");
            }
        } while (menu > 0 && menu < 10);
        {
            in.close();
            sc.close();
        }
    }
}
