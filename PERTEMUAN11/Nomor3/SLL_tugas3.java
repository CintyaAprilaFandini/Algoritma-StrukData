public class SLL_tugas3{
    tugas3_node head;
    tugas3_node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            tugas3_node tmp = head;
            System.out.println("");
            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            tugas3_node tmp = head;

            System.out.println("Isi Stack Teratas = " + tmp.data);

        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void pushFirst(String input) {
        tugas3_node ndInput = new tugas3_node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
}