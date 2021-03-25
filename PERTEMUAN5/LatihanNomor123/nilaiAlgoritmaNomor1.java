package PERTEMUAN5.LatihanNomor123;

public class nilaiAlgoritmaNomor1 {
    public String namaMhs;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    public double rataRata, total;
    
    public nilaiAlgoritmaNomor1(String nama, int nt, int nq, int nut, int una){
        this.namaMhs = nama;
        this.nilaiTugas = nt;
        this.nilaiKuis = nq;
        this.nilaiUTS = nut;
        this.nilaiUAS = una;
    } 
    double hitungTotalNilai(){
        total = (nilaiTugas * 0.3) + (nilaiKuis * 0.2) + (nilaiUTS * 0.2) + (nilaiUAS * 0.3);
        return total;
    }
    
}
