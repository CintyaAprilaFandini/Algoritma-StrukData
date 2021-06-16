public class Tugas2_Mahasiswa {
            String nim, nama, notelp;

public Tugas2_Mahasiswa() {
    }

public Tugas2_Mahasiswa(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
}

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp="+ notelp + '}';
    }
}
