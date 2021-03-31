package PERTEMUAN7.Nomor4;

public class array1Main {
    public static void main(String[] args){
        int bil[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        array1 arr = new array1 (bil);
        int jum = 10;
        int max = 0;

        System.out.println("------------------");
        System.out.println("-----DATA-----");
        arr.tampil();

        arr.bubbleSort();
        System.out.println("--------------------");
        System.out.println("setelah diSorting");
        arr.tampil();

        arr.nilaiTerbesar();
        arr.searching(max, 0, jum-1);
        arr.tampilPosisi(max);

    }
}
