package PERTEMUAN9.Nomor1;

import java.util.Scanner;
public class tugas1Main {
    public static void main(String[] args){
    Scanner cicin = new Scanner(System.in);
    String hasil = "";

    System.out.print("Masukkan kalimat : ");
    String kata = cicin.nextLine();

    tugas1 tgs = new tugas1(kata.length());
    for(int i = kata.length() - 1; i >= 0; i--){
        hasil += String.valueOf(kata.charAt(i));
        tgs.push(hasil);
    }
    System.out.print("hasil : " + hasil);

    }
}
