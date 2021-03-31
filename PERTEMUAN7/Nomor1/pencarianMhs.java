package PERTEMUAN7.Nomor1;
public class pencarianMhs {
    mahasiswa ListMhs[];
    int idx;
    void tambah(mahasiswa m){
        if ( idx < ListMhs.length){
            ListMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah Penuh!!");
        }
    }
    void tampil(){
        for(mahasiswa m : ListMhs){
            m.tampil();
            System.out.println("============================");
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < ListMhs.length; j++) {
            if (ListMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void tampilPosisi(int x, int pos){
        if (pos!= -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        }else{
            System.out.println("data " + x + "Tidak ditemukan");
        }
    }
    public void tampilData ( int x, int pos){
        if (pos!= -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + ListMhs[pos].nama);
            System.out.println("Umur\t : " + ListMhs[pos].umur);
            System.out.println("IPK\t : " + ListMhs[pos].ipk);
            
        }else{
            System.out.println("Data " + x + "Tidak ditemukan");
        }
    }
    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right)/ 2;
            if (cari == ListMhs[mid].nim) {
                return (mid);
            }else if(ListMhs[mid].nim > cari){
                return findBinarySearch(cari, right, mid + 1);
            }else{
                return findBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }
    public void bubbleSort(){
        for(int i=0; i<ListMhs.length-1; i++) {
            for(int j=1; j<ListMhs.length-i; j++) {
                if(ListMhs[j].nim > ListMhs[j-1].nim) {
                    mahasiswa tmp = ListMhs[j];
                    ListMhs[j] = ListMhs[j-1];
                    ListMhs[j-1] = tmp;
                }
            }
        }
    }
}
