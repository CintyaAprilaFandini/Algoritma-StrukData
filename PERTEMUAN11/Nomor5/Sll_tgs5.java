public class Sll_tgs5 {
    node_tg5 front;
    node_tg5 rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void print() {
        if (!isEmpty()) {
            node_tg5 tmp = front;
            int urut = 0;
            System.out.println("Antrian : ");
            while (tmp != null) {
                System.out.println("Nasabah ke-" + urut + " = " + tmp.noRek
                        + " " + tmp.nama + " " + tmp.alamat);
                tmp = tmp.next;
                urut++;
            }
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            node_tg5 tmp = front;
            System.out.println("Antrian paling depan : \n"
                    + tmp.noRek + " " + tmp.nama + " " + tmp.alamat);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            node_tg5 tmp = front;
            while (tmp != null) {
                if (tmp == rear) {
                    System.out.println("Antrian paling belakang : \n" + tmp.noRek
                            + " " + tmp.nama + " " + tmp.alamat);
                }
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void Enqueue(String nomorRekening, String nama, String alamat) {
        node_tg5 ndInput = new node_tg5(nomorRekening, nama, alamat, null);
        if (isEmpty()) {
            front = ndInput;
            rear = ndInput;
        } else {
            rear.next = ndInput;
            rear = ndInput;
        }
    }

    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong, tidak dapat dihapus!");
        } else if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            System.out.println("Dequeue Sukses");
        }
    }

    public void peekAt(int index) {
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            node_tg5 tmp = front;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada Index ke-"
                    + index + " adalah " + tmp.noRek
                    + " " + tmp.nama + " " + tmp.alamat);
        }
    }

    public void peekPosition(String key) {
        node_tg5 tmp = front;
        int index = 0;
        while (tmp != null && (!(tmp.noRek.equals(key)))) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Data " + key + " berada pada index ke " + index);
        }
        System.out.println("Data nasabah : \n" + tmp.noRek + " " + tmp.nama + " "
                + tmp.alamat);
    }
    
}
