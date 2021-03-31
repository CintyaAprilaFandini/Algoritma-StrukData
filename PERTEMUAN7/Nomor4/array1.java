package PERTEMUAN7.Nomor4;

public class array1 {
    public int[] data;
    public int max = 0;
    public int posisi;
    public int jumlah = 0;

    array1(int nilai[]){
        data = nilai;
    }
    void tampil(){
        for(int i = 0; i< data.length; i++){
            System.out.print(data[i] + " ");
            System.out.println();
        }
    }
    void bubbleSort(){
        for(int i = 0; i < data.length; i++){
            for(int j = 1; j < data.length-i; j++){
                if(data[j] > data[j-1]){
                    int tmp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = tmp; 
                }
            }
        }
    }
    public int searching(int cari, int kiri, int kanan){
        int mid;
        if(kanan >= kiri){
            mid = (kiri+kanan) / 2; 
            if(cari == data[mid]){
                return (mid);
            }else if(data[mid] > cari){
                return searching(cari, mid+1, kanan);
            }else{
                return searching(cari, kiri, mid-1);
            }
        }
        return -1;
    }
    public int nilaiTerbesar(){
        for(int i=0; i < data.length; i++){
            if(data[i] > max ){
                max = data[i];
            }
        }
        System.out.println("Nilai terbesarnya adalah : " + max);
        return max;
    }
    public void tampilPosisi(int pos){
        for(int i = 0; i < data.length; i++){
            if(data[i] == max){
                jumlah++;
            }
        }
        System.out.print("dengan jumlah " + jumlah);
        System.out.println();
        posisi = max;
        for(int i = 0; i<data.length; i++){
            if(posisi == data[i]){
                pos = i;
                System.out.println("data ditemukan pada indeks ke- " + pos);
            }
        }
    }
}
