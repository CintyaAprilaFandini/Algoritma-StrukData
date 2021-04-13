package PERTEMUAN9.Nomor2;
import java.util.Scanner;
public class tugas2Main {
    public static void main(String[] args){
        Scanner cinta =  new Scanner(System.in);
        Scanner cinta1 =  new Scanner (System.in);
        tugas2 tgss = new tugas2(8);
        char pilih;
        System.out.println("--------Masukkan data-------");
        do {
            System.out.print("Masukkan nomor Transaksi   : ");
            int nmr = cinta1.nextInt();
            System.out.print("Masukkan tanggal pembelian : ");
            String tgl = cinta.nextLine();
            System.out.print("Masukkan jumlah barang : ");
            int jml = cinta1.nextInt();
            System.out.print("Total Harga : ");
            int harga = cinta1.nextInt();

            tugas2 tugs = new tugas2(nmr, tgl, jml, harga);
            System.out.print("Apakah anda aka menambah data baru ke stack? (y/n) ");
            pilih = cinta.next().charAt(0);
            cinta.nextLine();
            tgss.push(tugs);
            System.out.println("------------------------");
        }while (pilih == 'y');
        System.out.println("STRUK NOTA");
        tgss.print();
        System.out.print("Masukkan jumlah struk yang akan diambil : ");
        int st = cinta1.nextInt();

        for(int i = 0; i < st; i++){
            tgss.pop();
        }
        System.out.println("STruk nota tersedia saat ini");
        tgss.print();
    }
    
}
