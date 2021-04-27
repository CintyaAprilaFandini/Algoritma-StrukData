public class tugas2_SLLMMain {
    public static void main (String[] args){
        tugas2_SingleLinked SLL = new tugas2_SingleLinked();

        SLL.addFirst('a');
        SLL.print();
        SLL.addLast('e');
        SLL.print();
        SLL.insertAfter('a', 'c');
        SLL.print();
        SLL.insertBefore('e', 'd');
        SLL.print();
        SLL.insertAt(1, 'b');
        SLL.print();
    }

}
