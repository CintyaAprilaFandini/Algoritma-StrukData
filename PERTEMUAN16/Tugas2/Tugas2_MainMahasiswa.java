
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Tugas2_MainMahasiswa {
            
    List<Tugas2_Mahasiswa> mhs = new ArrayList<>();
    List<Tugas2_MataKuliah> mk = new ArrayList<>();
    List<Tugas2_NilaiMahasiswa> nli = new ArrayList<>();
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        Tugas2_MainMahasiswa obj = new Tugas2_MainMahasiswa();
        int input;
        obj.setData();
        do {
            System.out.println("***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("***********************************************");
            System.out.print("Pilih	: ");
            input = cin.nextInt();

            if (input == 1) {
                obj.pilih1();
            } else if (input == 2) {
                obj.pilih2();
            } else if (input == 3) {
                obj.pilih3();
            } else if (input == 4) {
                obj.pilih4();
            } else {
                System.out.println("Good Bye!	");
            }
        } while (input >= 1 && input <= 4);
    }

    void setData() {
        mhs.add(new Tugas2_Mahasiswa("20001", "Cintya", "021xxx"));
        mhs.add(new Tugas2_Mahasiswa("20002", "Aprila", "021xxx"));
        mhs.add(new Tugas2_Mahasiswa("20003", "Fandini", "021xxx"));
        mhs.add(new Tugas2_Mahasiswa("20004", "cheryn", "021xxx"));
        mhs.add(new Tugas2_Mahasiswa("20005", "Anindita", "021xxx"));
        mhs.add(new Tugas2_Mahasiswa("20006", "Cindy", "021xxx"));

        mk.add(new Tugas2_MataKuliah("00001", "Sistem operasi", "3"));
        mk.add(new Tugas2_MataKuliah("00002", "Algoritma dan Struktur Data", "2"));
        mk.add(new Tugas2_MataKuliah("00003", "Pemrograman Berbasis Objek", "2"));
        mk.add(new Tugas2_MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", "3"));
        mk.add(new Tugas2_MataKuliah("00005", "Praktikum Pemrograman Berbasis Objek", "3"));
    }

    void pilih1() {
        cin.nextLine();
        System.out.println("Masukkan Data ");
        System.out.print("Kode	: ");
        String kode = cin.next();
        System.out.print("Nilai : ");
        float nilai = cin.nextFloat();
        System.out.println("");
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("***********************************************");
        System.out.printf("%-15s	%-15s	%-14s\n", "NIM", "Nama", "Telf");
        for (Tugas2_Mahasiswa mahasiswa : mhs) {
            System.out.printf("%-15s	%-15s	%-14s\n", mahasiswa.nim, mahasiswa.nama, mahasiswa.notelp);

        }
        boolean ditemukan = true;
        String pilihmahasiswa;
        int konfirmasi2 = 0;
        do {
            System.out.print("Pilih Mahasiswa by NIM : ");
            pilihmahasiswa = cin.next();
            for (Tugas2_Mahasiswa mahasiswa : mhs) {
                if (pilihmahasiswa.equals(mahasiswa.nim)) {
                    ditemukan = false;
                    konfirmasi2++;
                }
            }
            if (konfirmasi2 == 0) {
                System.out.println("Data Kode NIM Tidak Ditemukan");
            }
        } while (ditemukan);
        System.out.println("");
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("***********************************************");
        System.out.printf("%-15s	%-40s	%-40s\n", "Kode", "Mata Kuliah", "SKS");
        for (Tugas2_MataKuliah matakuliah : mk) {
            System.out.printf("%-15s	%-40s	%-40s\n", matakuliah.kode,
                    matakuliah.nmMatkul, matakuliah.sks);
        }
        boolean ditemukan2 = true;
        String pilihmatakuliah;
        int konfirmasi = 0;
        do {
            System.out.print("Pilih Mata Kuliah by Kode : ");
            pilihmatakuliah = cin.next();
            for (Tugas2_MataKuliah mklh : mk) {
                if (pilihmatakuliah.equals(mklh.kode)) {
                    ditemukan2 = false;
                    konfirmasi++;

                }
            }
            if (konfirmasi == 0) {
                System.out.println("Data Kode Matakuliah Tidak Ditemukan");
            }
        } while (ditemukan2);
        nli.add(new Tugas2_NilaiMahasiswa(kode, nilai, pilihmatakuliah, pilihmahasiswa));
    }

    void pilih2() {
        System.out.println("NIM\tNama Mahasiswa\tMata Kuliah\t\t\tSKS\tNilai");
        nli.forEach(nilaisatuan -> {
            System.out.print(nilaisatuan.nimMhs + "\t");
            for (Tugas2_Mahasiswa mahasiswa : mhs) {
                if (mahasiswa.nim.equals(nilaisatuan.nimMhs)) {
                    System.out.print(mahasiswa.nama + "\t\t");
                }
            }
            for (Tugas2_MataKuliah matkul : mk) {
                if (matkul.kode.equals(nilaisatuan.kodeMatakul)) {
                    System.out.print(matkul.nmMatkul + "\t\t" + matkul.sks + "\t");
                }
            }
            System.out.println(nilaisatuan.nilai);
        });
    }

    void pilih3() {
        pilih2();
        System.out.print("Masukkan Data Mahasiswa[nim] : ");
        String cariNIM = cin.next();
        int konfirmasi3 = 0;
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("***********************************************");
        System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\tSKS\tNilai");
        for (Tugas2_NilaiMahasiswa carinilai : nli) {
            if (carinilai.nimMhs.equals(cariNIM)) {
                System.out.print(carinilai.nimMhs + "\t");
                for (Tugas2_Mahasiswa mahasiswa : mhs) {
                    if (mahasiswa.nim.equals(carinilai.nimMhs)) {
                        System.out.print(mahasiswa.nama + "\t");
                    }
                }
                for (Tugas2_MataKuliah matkul : mk) {
                    if (matkul.kode.equals(carinilai.kodeMatakul)) {
                        System.out.print(matkul.nmMatkul + "\t" + matkul.sks + "\t");
                    }
                }
                System.out.println(carinilai.nilai);
                konfirmasi3++;
            }

        }
        if (konfirmasi3 == 0) {
            System.out.println("Data Dengan NIM " + cariNIM + " Tidak Ditemukan");
        }
    }

    void pilih4() {
        for (int i = 0; i < nli.size() - 1; i++) {
            for (int j = 0; j < nli.size() - i - 1; j++) {
                if (nli.get(j).nilai > nli.get(j + 1).nilai) {
                    float swap = nli.get(j).nilai;
                    nli.get(j).nilai = nli.get(j + 1).nilai;
                    nli.get(j + 1).nilai = swap;
                }
            }
        }
        pilih2();
    }
}
