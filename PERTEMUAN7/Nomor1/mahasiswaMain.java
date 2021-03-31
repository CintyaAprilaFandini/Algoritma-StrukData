package PERTEMUAN7.Nomor1;
import java.util.Scanner;
public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        pencarianMhs data = new pencarianMhs();
        System.out.print("Masukkan Jumlah Data Mahasiswa : ");
        int jumMhs = s.nextInt();
        mahasiswa[] x = new mahasiswa [jumMhs];
        data.ListMhs = x;
        
        System.out.println("----------------------");
        System.out.println("Masukkan data Mahasiswa secara urut dari Nim terkecil");
        for (int i = 0; i <jumMhs; i++) {
            System.out.println("-------------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();
            
            mahasiswa m = new mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
            System.out.println("---------------------");
            System.out.println("Data keseluruhan Mahasiswa : ");
            data.tampil();
            System.out.println("----------------------");
            System.out.println("Data Setelah dilakukan sorting :  ");
            data.bubbleSort();
            data.tampil();
            System.out.println("__________________________");
            System.out.println("__________________________");
            System.out.println("Pencarian Data : ");
            System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
            System.out.println("NIM : ");
            int cari = s.nextInt();
            System.out.println("Menggunakan Sequential search");
            int posisi = data.FindSeqSearch(cari);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
            System.out.println("Menggunakan Binary search");
            posisi = data.findBinarySearch(cari, 0, jumMhs-1);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
            
    }
}
