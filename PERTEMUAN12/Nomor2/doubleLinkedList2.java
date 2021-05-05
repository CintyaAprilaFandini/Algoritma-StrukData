public class doubleLinkedList2 {
    node2 head;
    int size;

    public doubleLinkedList2() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(String item) {
        if (isEmpty()) {
            head = new node2(null, item, null);
        } else {
            node2 current = head;
            while (current.next != null) {
                current = current.next;
            }
            node2 newNode = new node2(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            head = null;
            size = 0;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

     
    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }
    
    
    public void print() {
        if (!isEmpty()) {
            node2 tmp = head;
            System.out.println("Cetak Seluruh Judul Buku");
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}
