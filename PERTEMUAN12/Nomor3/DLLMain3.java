import java.util.Scanner;
public class DLLMain3 {
    public static void menu() {
        System.out.println("===================================================================");
        System.out.println("=====================MENU PENGANTRIAN VAKSINASI====================");
        System.out.println("===================================================================");
        System.out.println("1. Tambah Data Penerima Vaksin"); 
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("===================================================================");
        System.out.print("Silahkan Pilih Menu Yang Tersedia : ");
}
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        DLL doubleLinked = new DLL();
        System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
        System.out.println("|==================================================================|");
        System.out.println("|             PROGRAM DOUBLE LINKED LIST VAKSINASI                 |");
        System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
        System.out.println("|==================================================================|");
        System.out.println("");
        doubleLinked.addFirst (001, "Cintya");
        doubleLinked.addFirst (002, "Cheryn");
        doubleLinked.addFirst (003, "Cindy");
        doubleLinked.addFirst (004, "Cery");
        doubleLinked.addFirst (005, "Chava");
        int pilih;
        do{
            menu();
            pilih = input.nextInt();
            switch(pilih){
                case 1 :

                   System.out.println("|==================================================================|");
                    System.out.println("Masukkan Data Penerima Vaksin : ");
                   System.out.println("|==================================================================|");
                    System.out.print("Nomor Antrian: ");
                    int antrian = input.nextInt();
                    System.out.print("Nama Pengantri: ");
                    String nama = sc.nextLine();
                    doubleLinked.addFirst(antrian,nama);
                    break;
                case 2 :
                    doubleLinked.removeFirst();
                    break;
                case 3:
                    System.out.println("|==================================================================|");
                    System.out.println("    Daftar Pengantri Vaksin     ");
                    System.out.println("|==================================================================|");
                    doubleLinked.print();
                    break;
            }
        } while (pilih!=4) ;
    }
}
