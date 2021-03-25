package PERTEMUAN5.LatihanNomor123;
import java.util.Scanner;
public class mainNomor123{
    public static void main(String[] args){
    Scanner tya = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Mahasiswa : ");
    int n = tya.nextInt();
    nilaiAlgoritmaNomor1[] cinArray= new nilaiAlgoritmaNomor1[n];
    System.out.println("------------------------------------");
    
    for (int i = 0; i < n; i++) {
        System.out.println("Mahasiswa ke-" + (i+1));
        System.out.print("Nama Mahasiswa : ");
        String namaMhs = tya.next();
        System.out.println("Data Nilai Mahasiswa  :  ");
        System.out.println("______________________________________");
        System.out.print("Nilai Tugas\t: ");
        int nilaiTugas = tya.nextInt();
        System.out.print("Nilai Kuis\t: ");
        int nilaiKuis = tya.nextInt();
        System.out.print("Nilai UAS\t: ");
        int nilaiUAS = tya.nextInt();
        System.out.print("Nilai UTS\t: ");
        int nilaiUTS = tya.nextInt();
        cinArray[i] = new nilaiAlgoritmaNomor1(namaMhs, nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS);
        System.out.println("....................................................................");
    }
    System.out.println();
    for(int i =0; i<n; i++){
        System.out.println("===================================================================");
        System.out.println("Nilai Keseluruhan Mahasiswa adalah : ");
        System.out.println("Nama Mahasiswa      : " + cinArray[i].namaMhs);
        System.out.println("Total Nilai Adalah  : " + cinArray[i].hitungTotalNilai());
        System.out.println("===================================================================");
    }
    System.out.println("----------------------------------terimakasih-----------------------------------");
    }
    
} 
