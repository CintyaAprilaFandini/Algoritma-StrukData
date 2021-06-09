public class graph4 {
            int vertex;
            LinkedList list[];
            boolean directedGraph = false;
            
            public Graph4(int vertex, boolean type){
                this.vertex = vertex;
                list = new LinkedList[vertex];
                for (int i = 0; i < vertex; i++) {
                    list[i] = new LinkedList();
                }
                this.directedGraph = type;
            }
            
            public void addEdge(String source, String destination, int index, int index2){
                list[index].addFirst(destination);
                                if (directedGraph == false) {
                    list[index2].addFirst(source);
                } 
            }
            
        public void degree(int source) throws Exception{
                System.out.println("degree vertex "+source+" : "+list[source].size());
                int k, totalIn = 0, totalOut = 0;
                for (int i = 0; i < vertex; i++){
                    for (int j = 0; j < list[i].size(); j++){
                        if (list[i].get(j).equals(source))
                            ++totalIn;
                        
                    }
                    for (k = 0; k < list[source].size(); k++){
                        list[source].get(k);
                    }
                    totalOut = k;
                }
                System.out.println("Indegree dari vertex "+ source +" : "+totalIn);
                System.out.println("Outdegree dari vertex "+ source +" : "+totalOut);
                System.out.println("degree dari vertex "+ source +" : "+(totalIn+totalOut));
            }
            
            public void removeEdge(int source, int destination) throws Exception{
                for (int i = 0; i < list[source].size(); i++) {
                    if (i == destination) {
                        list[source].remove(i);
                    }
                }
            }
            
            public void removeAllEdges(){
                for (int i = 0; i < vertex; i++) {
                    list[i].clear();
                }
                System.out.print("Graph berhasil dikosongkan");
            }
            
            public void printGraph() throws Exception{
                for (int i = 0; i < vertex; i++) {
                    if (list[i].size() > 0) { 
                        System.out.print("Vertex " + i + " terhubung dengan : ");
                        for (int j = 0; j < list[i].size(); j++) {
                            System.out.print(list[i].get(j) + " ");
                        }
                        System.out.println("");
                    }
                }
                System.out.println(" ");
            }
}
