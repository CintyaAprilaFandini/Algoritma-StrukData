public class node3 {
    int antrian;
    String nama;
    node3 prev,next;
   
    node3 (node3 prev, int antrian, String nama,node3 next){
        this.prev=prev;
        this.nama=nama;
        this.next=next;
        this.antrian = antrian;
     }   
}
