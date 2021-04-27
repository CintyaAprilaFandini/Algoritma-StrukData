public class tugas1_SingleLinked {
    tugas1_node head;
    tugas1_node tail;
public boolean isEmpty() {
    return head == null;
}
public void print() {
    if(!isEmpty()) {
    tugas1_node tmp = head;
    System.out.print("Isi Linked List: \t");
    while (tmp != null) {
    System.out.print(tmp.data + "\t");
    tmp = tmp.next;
    }
    System.out.println("");
    } else {
    System.out.println("Linked list kosong");
    }
}
public void addFirst(int input) {
    tugas1_node ndInput = new tugas1_node (input, null);
    if (isEmpty()) {
    head = ndInput;
    tail = ndInput;
    } else {
    ndInput.next = head;
    head = ndInput;
    }
}
public void addLast(int input) {
    tugas1_node ndInput = new tugas1_node(input, null);
    if (isEmpty()) {
    head = ndInput;
    tail = ndInput;
    } else {
    tail.next = ndInput;
    tail = ndInput;
    }
}
public void insertAfter(int key, int input) {
    tugas1_node ndInput = new tugas1_node(input, null);
    tugas1_node temp = head;
    do {
    if (temp.data == key) {
    ndInput.next = temp.next;
    temp.next = ndInput;
    if (ndInput.next==null) tail=ndInput;
    break;
    }
    temp = temp.next;
    } while (temp != null);
}
public void insertAt(int index, int input) {
    if (index < 0) {
    System.out.println("indeks salah");
    } else if (index == 0) 
    {
     addFirst(input);
    } else {
    tugas1_node temp = head;
    for (int i = 0; i < index - 1 ; i++) {
    temp = temp.next;
    }
    temp.next = new tugas1_node(input, temp.next);
    if (temp.next.next==null) tail = temp.next;
    }
}

public int getData(int index) {
    tugas1_node tmp = head;
    for (int i = 0; i < index; i++) {
    tmp = tmp.next;
    }
    return tmp.data;
}
public int indexOf(int key) {
    tugas1_node tmp = head;
    int index = 0;
    while (tmp != null && tmp.data != key) {
    tmp = tmp.next;
    index++;
    }
    if (tmp == null) {
    return -1;
    } else {
    return index;
    }
}
public void removeFirst() {
    if (isEmpty()) {
    System.out.println("Linked List masih kosong tidask dapat dihapus");
    } else if ( head == tail ) {
    head = tail = null;
    } else {
    head = head.next;
    }
}
public void removeLast() {
    if (isEmpty()) {
    System.out.println("Linked List masih kosong, tidak dapat dihapus");
    } else if ( head == tail) {
    head = tail = null;
    } else {
    tugas1_node temp = head;
    while (temp.next != tail) {
    temp = temp.next;
    }
    temp.next = null;
    tail = temp;
    }
}
public void remove(int key) {
    if (isEmpty()) {
    System.out.println("Linked List masih kosong, tidak dapat dihapus");
    } else {
    tugas1_node temp = head;
    while (temp != null) {
    if ((temp.data == key) && (temp == head))     {
    this.removeFirst();
    break;
    } else if (temp.next.data == key) {
    temp.next = temp.next.next;
    if (temp.next == null) {
    tail = temp;
    }
    break;
    }
    temp = temp.next;
    }
}
}
public void removeAt(int index) {
    if (index == 0) {
    removeFirst();
    } else {
    tugas1_node temp = head;
    for (int i = 0; i < index -1 ; i++) {
    temp = temp.next;
    }
    temp.next = temp.next.next;
    if (temp.next == null) {
    tail = temp;
    }
    }
}
public void insertBefore(int key, int input) {
    tugas1_node ndInput = new tugas1_node(input, null);
    tugas1_node temp = head;
    while (temp != null) {
        if ((temp.data == key) && (temp == head)) {
            this.addFirst(input);
            System.out.println("Berhasil Menambahkan Data");     
            break;
        } else if (temp.next.data == key) {
            ndInput.next = temp.next;
            temp.next = ndInput;
            System.out.println("Berhasil Menambahkan Data.");
            break;
        }
        temp = temp.next;
    }
}
}
