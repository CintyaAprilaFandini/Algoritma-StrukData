package PERTEMUAN6.Nomor1;

public class tiket {
    public String maskapai, asal, tujuan;
    public int harga;

    void tiket(String m, int h, String a, String t){
        maskapai = m;
        asal = a;
        harga = h;
        tujuan = t;
    }
    void tampil(){
        System.out.println("Nama Pesawat =" + maskapai);
        System.out.println("Harga Tiket Pesawat =" + harga);  
        System.out.println("asal  =" + asal);
        System.out.println("tujuan =" + tujuan);      
    }
    }