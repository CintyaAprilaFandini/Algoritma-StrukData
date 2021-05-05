public class node4 {
    String nim, nama;
    double ipk;
    node4 prev, next;

    node4(node4 prev, String nim, String nama, double ipk, node4 next){
        this.prev = prev;
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.next = next;
    }
}
