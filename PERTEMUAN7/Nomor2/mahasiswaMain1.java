package PERTEMUAN7.Nomor2;
import java.util.Scanner;
public class mahasiswaMain1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        pencarianMhs1 data = new pencarianMhs1();
        System.out.print("Masukkan Jumlah Data Mahasiswa : ");
        int jumMhs = s.nextInt();
        mahasiswa1[] x = new mahasiswa1 [jumMhs];
        data.ListMhs = x;
        System.out.println("----------------------");
        System.out.println("Masukkan data Mahasiswa");
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
            mahasiswa1 m = new mahasiswa1(nim, nama, umur, ipk);
            data.tambah(m);
        }
            System.out.println("---------------------");
            System.out.println("Data keseluruhan Mahasiswa : ");
            data.tampil();
            System.out.println("__________________________");
            System.out.println("__________________________");
            System.out.println("Pencarian Data : ");
            System.out.println("Masukkan NamaMahasiswa yang dicari : ");
            System.out.println("Nama : ");
            String cari = s1.next();
            System.out.println("Menggunakan Sequential search");
            int posisi = data.FindSeqSearch(cari);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
            
        }
    }
