package PERTEMUAN7.Nomor2;

public class mahasiswa1 {
    int nim;
    String nama;
    int umur;
    double ipk;
    
    mahasiswa1(int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }
    void tampil(){
        System.out.println("Nim = " + nim);
        System.out.println("nama = "  + nama);
        System.out.println("Umur " + umur);
        System.out.println("IPK = " + ipk);
    }
}
