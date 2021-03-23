package PERTEMUAN6.Nomor1;

public class tiketService {
    tiket tkt[] = new tiket[5];
    int idx;

    void tambah(tiket t) {
        if(idx<tkt.length) {
            tkt[idx] = t;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    
   void tampil() {
    for(tiket t : tkt) {
          t.tampil();
          System.out.println("---------------------");
    }
    }
    void bubbleSort() {
        for(int i=0; i<tkt.length-1; i++) {
            for(int j=1; j<tkt.length-i; j++) {
                if(tkt[j].harga > tkt[j-1].harga) {
                  
                    tiket tmp = tkt[j];
                    tkt[j] = tkt[j-1];
                    tkt[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionSort() {
        for(int i=0; i<tkt.length-1; i++) {
            int idxMin = i;
            for(int j=i+1; j<tkt.length; j++) {
                if(tkt[j].harga < tkt[idxMin].harga) {
                    idxMin = j;
                }
            }
                    
                    tiket tmp = tkt[idxMin];
                    tkt[idxMin] = tkt[i];
                    tkt[i] = tmp;
        }
    }
}
