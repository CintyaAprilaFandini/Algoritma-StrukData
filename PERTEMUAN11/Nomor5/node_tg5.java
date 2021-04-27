public class node_tg5 {
    String nama, alamat, noRek;
    node_tg5 next;

    public node_tg5(String nomorrekening, String nama, String alamat, node_tg5 berikutnya) {
        this.noRek = nomorrekening;
        this.nama = nama;
        this.alamat = alamat;
        this.next = berikutnya;
    }
}
