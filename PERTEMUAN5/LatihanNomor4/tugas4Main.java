package PERTEMUAN5.LatihanNomor4;
import java.util.Scanner;
public class tugas4Main {
    public static void main(String[] args){
        Scanner tya = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("Pemilihan ketua BEM tahun 2020");
        System.out.println("===========================");
        tugas4 ch = new tugas4();
        tugas4 [] chr = new tugas4[ch.jumlahKandidat];

        for(int i=0; i<ch.jumlahKandidat; i++){
            chr[i] = new tugas4();
            System.out.print("Nama Kandidat ke- " + (i+1) + " : ");
            chr[i].kandidat = tya.nextLine();
        }

        System.out.println("=================================");
        for(int i=0; i<ch.jumlahKandidat; i++){
            System.out.print("Masukkan jumlah suara kandidat ke- " + (i+1) + " : ");
            chr[i].vote = tya.nextInt();
            ch.jumlahVote += chr[i].vote;
        }

        System.out.println("==================================");
        int hasil = ch.hitungHasil(ch.jumlahVote, chr[0].vote, chr[1].vote, chr[2].vote, chr[3].vote);
        if(hasil==0){
            System.out.println("Masing-masing kandidta memiliki mayoritas yang hampir sama");
        }else{
            System.out.println("ketua BEM yang terpilih adalah " + chr[hasil-1].kandidat);
        }

    }
}
