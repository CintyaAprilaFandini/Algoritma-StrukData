
public class Sll_tgs4 {
    node_tgs4 head;
    node_tgs4 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            node_tgs4 tmp = head;
            int urut = 0;
            System.out.println("Antrian : ");
            while (tmp != null) {
                System.out.println("Nasabah ke-" + urut + " = " + tmp.noRek + " "
                        + tmp.nama + " " + tmp.alamat);
                tmp = tmp.next;
                urut++;
            }
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void antrianDepan() {
        if (!isEmpty()) {
            node_tgs4 tmp = head;
            System.out.println("Antrian paling depan : \n"
                    + tmp.noRek + " " + tmp.nama + " " + tmp.alamat);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void antrianBelakang() {
        if (!isEmpty()) {
            node_tgs4 tmp = head;
            while (tmp != null) {
                if (tmp == tail) {
                    System.out.println("Antrian paling belakang : \n" + tmp.noRek
                            + " " + tmp.nama + " " + tmp.alamat);
                }
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void tambahData(String nomorRekening, String nama, String alamat) {
        node_tgs4 ndInput = new node_tgs4 (nomorRekening, nama, alamat, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void cariDataIndex(int index) {
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            node_tgs4 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada Index ke-" + index + " adalah " + tmp.noRek
                    + " " + tmp.nama + " " + tmp.alamat);
        }
    }
    public void remove() {
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            node_tgs4 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
}
