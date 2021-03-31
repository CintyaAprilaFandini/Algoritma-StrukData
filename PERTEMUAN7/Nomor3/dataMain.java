package PERTEMUAN7.Nomor3;

import java.util.Scanner;
public class dataMain {
    public static void main(String[] args){
        Scanner y = new Scanner (System.in);
        int[][] bil = {{45, 78, 7, 200, 80},
                {90, 1, 17, 100, 50},
                {21, 2, 40, 18, 65}};
        data arr = new data(bil);

        System.out.println("---------------------");
        System.out.println("-------Data----------");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(bil [i][j] + " ");
            }
        }
        System.out.println("----------------------");
        System.out.println("PENCARIAN DATA");
        System.out.print("Masukkan data yang akan dicari : ");
        int cari = y.nextInt();
        arr.searching(bil, cari);
        arr.tampilPosisi(cari);
    }
}
