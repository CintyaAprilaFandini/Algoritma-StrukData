package PERTEMUAN7.Nomor2;
public class pencarianMhs1 {
    mahasiswa1 ListMhs[];
    int idx;
    void tambah(mahasiswa1 m){
        if ( idx < ListMhs.length){
            ListMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah Penuh!!");
        }
    }
    void tampil(){
        for(mahasiswa1 m : ListMhs){
            m.tampil();
            System.out.println("============================");
        }
    }
    public int FindSeqSearch(String cari){
        int posisi = -1;
        for (int j = 0; j < ListMhs.length; j++) {
            if (ListMhs[j].nama.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
 public void tampilPosisi(String x, int pos){
        if (pos!= -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        }else{
            System.out.println("data " + x + "Tidak ditemukan");
        }
    } 
    public void tampilData ( String x, int pos){
        if (pos!= -1) {
            System.out.println("Nim\t : " + ListMhs[pos].nim);
            System.out.println("Nama\t : " + x);
            System.out.println("Umur\t : " + ListMhs[pos].umur);
            System.out.println("IPK\t : " + ListMhs[pos].ipk);
            
        }else{
            System.out.println("Data " + x + "Tidak ditemukan");
        }
    }
}
