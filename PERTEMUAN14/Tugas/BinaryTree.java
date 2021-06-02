public class BinaryTree {
Node root;
    
public BinaryTree(){
root = null;   
}
boolean isEmpty(){
     return root == null;   
}
void add(int data){
            if (isEmpty()) {
             root = new Node(data);
            } else {
             Node current = root;
             while(true){
                 if (data<current.data) {
                     if(current.left!=null){
                         current= current.left;
                         break;
                     }else{
                         current.left= new Node(data);
                         break;
                     }
                 } else if(data >current.data) {
                     if (current.right!=null) {
                         current= current.right;
                     } else {
                         current.right=new Node(data);
                         break;
                     }
                 }else{
                     break;
                 }
             }
         }
     }
    boolean find(int data){
        boolean hasil= false;
        Node current = root;
        while(current!= null){
            if (current.data ==data) {
                hasil= true;
                break;
            }else if(data<current.data){
                current=current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }
void traversePreOrder(Node node){
    if(node != null){
        System.out.println(" "+ node.data);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}
void traversePostOrder(Node node){
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.println(" "+node.data);
    }
}
void traverseInOrder(Node node){
    if (node != null){
        traverseInOrder(node.left);
        System.out.println(" "+ node.data);
        traverseInOrder(node.right);
    }
}
Node getSuccessor(Node del){
            Node successor = del.right;
            Node successorParent = del;
                while(successor.left!=null){
                        successorParent = successor;
                        successor = successor.left;
            }
            if (successor!=del.right) {
            successorParent.left = successor.right;
            successor.right=del.right;
            }
            return successor;
}
void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChiled = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChiled = true;
            }else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChiled = false;
            }
        }
        //deletion
        if(current == null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            //if there is no child, simply delete it
            if(current.left == null && current.right == null ){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftChiled){
                        parent.left = null;   
                    }else{
                        parent.right = null;
                    }  
                }
            }else if(current.left == null){//if there is 1 child (right)
                if(current == root){
                    root = current.right;
                }else{
                    if(isLeftChiled){
                        parent.left = current.right;   
                    }else{
                        parent.right = current.left;
                    }  
                }
            }else if(current.right == null){//if there is 1 child (left)
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChiled){
                        parent.left = current.left;   
                    }else{
                        parent.right = current.left;
                    }  
                }
            }else{//if there is 2 childs
                Node successor = getSuccessor(current);
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChiled){
                        parent.left = successor;   
                    }else{
                        parent.right =successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
boolean addRekursif(Node root, int data){ //penambahan method rekursif
            boolean set = true;
            if(this.root == null){
                        Node node = new Node(data);
                        this.root = node;
                        System.out.println("set : " + data);
                        set = true;
            }else{
                        if(data > root.data){
                                    System.out.println(" go to right leaf of : " + root.data);
                                    if(root.right == null){
                                                Node node = new Node(data);
                                                root.right = node;
                                                set = true;
                                                System.out.println("Current -> set " + node.data);
                                    }else{
                                                return addRekursif(root.right, data);
                                                }
                                    }
                        }if(data < root.data){
                                    System.out.println("go to left leaf of :  " + root.data );
                                    if(root.left == null){
                                                Node node = new Node(data);
                                                root.left = node;
                                                set = true;
                                                System.out.println("Current -> set "+ node.data);
                                    }else{
                                                return addRekursif(root.left, data);
                                    }
                                    if(data == root.data){
                                                set = false;
                                    }
                        }
                        return set;
            }
            public void cariNilaiTerkecil(Node current) { // penambahan method cari nilai terkecil
                if (current.left != null) {
                    cariNilaiTerkecil(current.left);
                } else {
                    System.out.println("Data terkecil: " + current.data);
        
                }
            }
        
            public void cariNilaiTerbesar(Node current) { // penambahan method cari nilai terbesar
                if (current.right != null) {
                    cariNilaiTerbesar(current.right);
                } else {
                    System.out.println("Data terbesar: " + current.data);
                }
            }
            void leaf(Node node) { // penambahan method penampilan data di leaf
                if (node == null) {
                    return;
                }
                if (node.left == null && node.right == null) {
                    System.out.println(node.data + "");
                }
                leaf(node.left);
                leaf(node.right);
            }
            public int jumLeaf(Node node) { // penambahan method jumlah leaf.
                if (node == null) {
                    return 0;
                }
                if (node.left == null && node.right == null) {
                    return 1;
                } else {
                    return jumLeaf(node.left) + jumLeaf(node.right);
                }
            }
            public void print(Node node) {
                if (node != null) {
                    if (node.left == null && node.right == null) {
                        System.out.print(node.data + " ");
                    }
                    print(node.left);
                    print(node.right);
                }
            }
        
}
