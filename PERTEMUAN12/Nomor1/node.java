public class node {
    int data;
    node prev;
    node next;

    node(node prev, int data, node head) {
        this.prev = prev;
        this.data = data;
        this.next = head;
    }  
}
