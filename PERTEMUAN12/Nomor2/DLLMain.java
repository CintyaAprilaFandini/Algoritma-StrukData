import java.util.Scanner;
public class DLLMain {
    public static void menu() {
        System.out.println("=======================================================================");
        System.out.println("========================Data Buku Perpustakaan=========================");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println("=======================================================================");
        System.out.print("Silahkan Pilih Menu yang Ada : ");
    }
      public static void main(String args[]) throws Exception {
           Scanner sc = new Scanner(System.in);
           Scanner input = new Scanner(System.in);
           doubleLinkedList2 doubleLinked = new doubleLinkedList2();
           System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
           System.out.println("|==================================================================|");
           System.out.println("|             PROGRAM DOUBLE LINKED LIST PERPUSTAKAAN              |");
           System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
           System.out.println("|==================================================================|");
           System.out.println("");
           doubleLinked.addLast("3D Computer Vision");
           doubleLinked.addLast("Understanding Software");
           doubleLinked.addLast("Algorithms Noter for Professional");
           doubleLinked.addLast("Getting   Started   with   C++   audio Programming for Game Development");
            int pilih = 0;
            do {
                menu();
                pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("-------------------");
                        System.out.println("Masukkan Judul Buku");
                        System.out.println("-------------------");
                        String jdl = sc.nextLine();
                        doubleLinked.addLast(jdl);
                        break;
                    case 2:
                        System.out.println("----------------------------------------");
                        System.out.println("Buku pada tumpukan teratas telah diambil");
                        System.out.println("----------------------------------------");
                        doubleLinked.removeFirst();
                        break;
                    case 3:
                        System.out.println("-----------------");
                        System.out.println("Cek Buku Teratas");
                        System.out.println("-----------------");
                        System.out.println(doubleLinked.getFirst());
                        break;
                    case 4:
                        System.out.println("------------------------");
                        System.out.println("Cetak Seluruh Judul Buku");
                        System.out.println("------------------------");
                        doubleLinked.print();
                        break;
                }
            } while (pilih != 5);
        }
}
