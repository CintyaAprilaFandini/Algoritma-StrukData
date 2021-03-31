package PERTEMUAN7.Nomor3;

public class data {
    int posisi = 0;
    int posisi1 = 0;
    int[][] data;

    data(int [][] nilai){
        data = nilai;
    }
    public void searching(int [][] data, int cari){
        for(int i = 0; i <3; i++){
            for(int j = 0; j < 5; j++){
                if(data[i][j] == cari){
                    posisi = i;
                    posisi1 = j;
                    break;
                }
            }
        }
    }
    public void tampilPosisi(int cari){
        if(posisi != -1){
            System.out.println("Data : " + cari + " ditemukan pada baris ke- " + posisi + " dan pada kolom ke- " + posisi1);
        }else{
            System.out.println("Data : " + cari + "tidak ditemukan");
        }
    }
}
