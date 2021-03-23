package PERTEMUAN6.Nomor1;
import java.util.Scanner;
public class mainTiket {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        tiketService data = new tiketService();
        int jumTkt = 3;       
        for(int a=0; a<jumTkt; a++) {
            System.out.print("Nama pesawat = ");
            String maskapai= s.nextLine();
            System.out.print("Harga tiket pesawat = ");
            int harga= s.nextInt();
            System.out.print("asal= ");
            String asal= s.nextLine();
            System.out.print("tujuan = ");
            String tujuan= s.nextLine();
            tiket e = new tiket(maskapai, harga, asal, tujuan);
            data.tambah(e);
        }        
        System.out.println("Data sebelum sorting = ");
        data.tampil();
        
        System.out.println("Data setelah sorting bubble sort = ");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("Data selection sort sorting = ");
        data.selectionSort();
        data.tampil();
    } 
}
