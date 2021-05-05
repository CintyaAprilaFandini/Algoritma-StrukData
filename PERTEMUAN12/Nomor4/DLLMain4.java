import java.util.Scanner;
public class DLLMain4 {
    static void menu() {
        System.out.println("|==================================================================|");
        System.out.println("|==================SISTEM PENGOLAHAN DATA MAHASISWA================|");
        System.out.println("|==================================================================|");
        System.out.println("|1. Tambah Data Awal                                               |");
        System.out.println("|2. Tambah Data Akhir                                              |");
        System.out.println("|3. Tambah Data Index Tertentu                                     |");
        System.out.println("|4. Hapus Data Pertama                                             |");
        System.out.println("|5. Hapus Data Terakhir                                            |");
        System.out.println("|6. Hapus Data Tertentu                                            |");
        System.out.println("|7. Cetak                                                          |");
        System.out.println("|8. Cari NIM                                                       |");
        System.out.println("|9. Urut Data IPK-DESC                                             |");
        System.out.println("|10. Keluar                                                        |");
        System.out.println("|==================================================================|");
        System.out.print("Masukkan Menu Pilihan Anda : ");
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        DLL4 doubleLinked = new DLL4 ();
        int pilihan;
        do {
            menu();
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1: {
                    System.out.println("Masukkan Data Mahasiswa di Posisi Awal");
                    System.out.print("NIM  : ");
                    String nim = sc.next();
                    System.out.print("Nama : ");
                    String nama = sc.next();
                    sc.next();
                    System.out.print("IPK  : ");
                    double ipk=sc.nextDouble();
                    doubleLinked.addFirst(nim,nama,ipk);
                    break;
                }
                case 2: {
                    System.out.println("Masukkan data di posisi tail : ");
                    System.out.print("NIM  : ");
                    String induk = sc.next();
                    System.out.print("Nama : ");
                    String name = sc.next();
                    sc.next();
                    System.out.print("IPK  : ");
                    double indeksP=sc.nextDouble();
                    doubleLinked.addLast(induk,name,indeksP);
                    break;
                }
                case 3: {
                    System.out.println(" Masukkan Data Mahasiswa ");
                    System.out.println("Data node      : ");
                    System.out.print("NIM            : ");
                    String ni=sc.next();
                    System.out.print("Nama           : ");
                    String n = sc.next();
                    sc.next();
                    System.out.print("IPK            : ");
                    double ip=sc.nextDouble();
                    System.out.print("Data Mahasiswa Akan Dimasukkan Pada Urutan Ke-");
                    int ind=sc.nextInt();
                    doubleLinked.add(ni,n,ip,ind);
                    break;
                }
                case 4: {
                    System.out.println("Hapus Data Pertama");
                    doubleLinked.removeFirst();
                    System.out.println("Data Pertama Berhasil Dihapus");
                    break;
                }
                case 5: {
                    System.out.println("Hapus Data Terakhir");
                    doubleLinked.removeLast();
                    System.out.println("Data Terakhir Berhasil Dihapus");
                    break;
                }
                case 6: {
                    System.out.println("Hapus Data Tertentu");
                    System.out.println("Data Yang Di Hapus : ");
                    int idx = input.nextInt();
                    doubleLinked.remove(idx);
                    break;
                }
                case 7: {
                    System.out.println("Cetak Data");
                    doubleLinked.print();
                    break;
                }
                case 8: {
                    System.out.println("Cari Data");
                    sc.nextLine();
                    System.out.print("Masukkan NIM yang dicari : ");
                    String nim = sc.nextLine();
                    doubleLinked.search(nim);
                    break;
                }
                case 9: {
                    System.out.println("Data Setelah Diurutkan");
                    doubleLinked.bubbleSort();
                    break;
                }
                
            }
            System.out.println("");
        } while (pilihan != 10);
    }  
}
