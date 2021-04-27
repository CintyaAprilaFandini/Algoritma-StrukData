
public class tugas2_SingleLinked {
    tugas2_node head;
    tugas2_node tail;
public boolean isEmpty() {
    return head == null;
}
public void print() {
    if(!isEmpty()) {
    tugas2_node tmp = head;
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
public void addFirst(char input) {
    tugas2_node ndInput = new tugas2_node (input, null);
    if (isEmpty()) {
    head = ndInput;
    tail = ndInput;
    } else {
    ndInput.next = head;
    head = ndInput;
    }
}
public void addLast(char input) {
    tugas2_node ndInput = new tugas2_node(input, null);
    if (isEmpty()) {
    head = ndInput;
    tail = ndInput;
    } else {
    tail.next = ndInput;
    tail = ndInput;
    }
}
public void insertAfter(char key, char input) {
    tugas2_node ndInput = new tugas2_node(input, null);
    tugas2_node temp = head;
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
public void insertAt(int index, char input) {
    if (index < 0) {
    System.out.println("indeks salah");
    } else if (index == 0) 
    {
     addFirst(input);
    } else {
    tugas2_node temp = head;
    for (int i = 0; i < index - 1 ; i++) {
    temp = temp.next;
    }
    temp.next = new tugas2_node(input, temp.next);
    if (temp.next.next==null) tail = temp.next;
    }
}
public void insertBefore(char key, char input) {
    tugas2_node ndInput = new tugas2_node(input, null);
    tugas2_node temp = head;
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
