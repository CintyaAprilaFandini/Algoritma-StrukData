public class SLLMain_tugas3 {
    public static void main(String[] args){
        SLL_tugas3 singll = new SLL_tugas3();

        singll.pushFirst("Bahasa");
        singll.pushFirst("Android");
        singll.pushFirst("Komputer");
        singll.pushFirst("Basis Data");
        singll.pushFirst("Matematika");
        singll.pushFirst("Algoritma");
        singll.pushFirst("Statistika");
        singll.pushFirst("Multimedia");
        singll.print();
        singll.peek();
    }
}
