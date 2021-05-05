public class DLL {
    node3 head;
    int size;

    public DLL(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int antrian, String nama) {
        if (isEmpty()) {
            head = new node3(null, antrian, nama, null);
        } else {
            node3 nd = new node3(null, antrian, nama, head);
            head.prev = nd;
            head = nd;
        }
        size++;
    }

   
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, Tidak Dapat Dihapus");
        } else if (size == 1) {
            head = null;
            size = 0;
        } else {
            System.out.println(head.nama + " Telah Selesai Melakukan Vaksinasi.");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            node3 tmp = head;
            while (tmp != null) {
                System.out.println("|" + tmp.antrian + "\t   |" + tmp.nama + "\t|");
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian : "+size);
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
