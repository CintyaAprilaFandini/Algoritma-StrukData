public class queue {
    int max, size, front, rear;
    int Q[];
    
    public queue(int n){
        max = n;
        create();
    }
    public void create(){
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + Q[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while(i != rear){
                System.out.println(Q[i] + " " );
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " " );
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("queue berhasil dikosongkan");
        }else{
            System.out.println("queue masih kosong");
        }
    }
    public void enqueue(int data){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        }else{
            if(isEmpty()){
                front = rear = 0;
            }else{
                if (rear == max - 1) {
                    rear = 0;
                }else{
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }
    public int dequeue(){
        int data = 0;
        if (isEmpty()) {
            System.out.println("queue masih kosong");
        }else{
            data = Q[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }else{
                if (front == max - 1) {
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
    public void peekPosition(int data){
        int position = -1;
        for(int i=0; i<Q.length; i++){
            if(Q[i] == data){
                position = i;
                break;
            }
        }if (position != -1){
            System.out.println("Data : " + data + " di temukan pada indeks ke-" + position);
        }else{
            System.out.println("Data : " + data + " tidak ditemukan");
        }
    }
    public peekAt(int position){
        if(position > -1 && position < size){
            System.out. println("Data pada indeks ke-" + position + " : " + Q[position]);
        }else{
            System.out. println("Data pada indeks ke-" + position + " data tidak ditemukan");
        }
    }
}