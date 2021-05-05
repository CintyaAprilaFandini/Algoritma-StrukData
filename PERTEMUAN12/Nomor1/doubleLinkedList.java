public class doubleLinkedList {
    node head;
    int size;

    public doubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        if (isEmpty()) {
            head = new node(null, data, null);
        } else {
            node newNode = new node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            node newNode = new node(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int data, int index) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                node newNode = new node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                node newNode = new node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        } else {
            node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void print() {
        if (!isEmpty()) {
            node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List kosong!");
        }
    }

    public void FindSeqSearch(int cari) {
        int posisi = -1;
        node tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            posisi++;
            if (tmp.data == cari) {
                System.out.println("Data ditemukan pada index ke " + posisi);
                break;
            }
        }
    }

    public void bubbleSort() {
        node tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.data > tmp.next.data) {
                tmp = tmp.next;
                //proses swap atau penukaran
                int temp = tmp.data;
                tmp.data = tmp.next.data;
                tmp.next.data = temp;
            }
        }
    }
}
