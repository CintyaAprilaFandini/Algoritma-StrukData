import java.util.Scanner;
public class BinaryTreeArrayMain {
            public static void main(String[] args) {
                    Scanner sc = new Scanner (System.in);
                    BinaryTreeArray bta = new BinaryTreeArray();
                    bta.data = new int[10];
                    int idxlast = 6;
            
                    for (int i=0; i< bta.data.length; i++){
                        System.out.print("Masukkan data : ");
                        bta.data[i] = sc.nextInt();
                        bta.add(bta.data[i], i);
                    }
                    bta.populateData(bta.data, idxlast);
                    System.out.print("\n===============================================");
                    System.out.println("\nBINARY TREE TRAVERSAL");
                    System.out.print("In Order \t: ");
                    bta.traverseInOrder(0);
                    System.out.print("\nPre Order \t: ");
                    bta.traversePreOrder(0);
                    System.out.print("\nPost Order \t: ");
                    bta.traversePostOrder(0);
            
                }
}

