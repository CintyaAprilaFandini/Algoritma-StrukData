import java.util.Scanner;
public class graphMain1 {
            public static void main (String[] args) throws Exception {
                        int count = 1, to, from;
                        Graph1 graph = new Graph1(6);
                        Scanner input = new Scanner(System.in);
                        System.out.print("Masukkan jumlah  lintasan : ");
                        int jumlah = input.nextInt();
                        System.out.println("------------------------------------");
                        System.out.print("Masukkan edges: ");
                        while (count <= jumlah) {
                            to = input.nextInt();
                            from = input.nextInt();
                            graph.addEdge(to, from);
                            count++;
                        }
                        System.out.println("");
                        graph.printGraph();
                        graph.degree(2);
                        graph.removeEdge(1, 2);
                        graph.printGraph();
                    }
}
