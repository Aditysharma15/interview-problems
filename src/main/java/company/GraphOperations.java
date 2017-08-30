package company;

import java.util.ArrayList;

/**
 * Created by Tuhin on 3/16/2017.
 */
public class GraphOperations {

    ArrayList<GraphNode> list= new ArrayList<>();

    //Add a Link between two nodes

    public GraphNode addEdge(GraphNode node1, GraphNode node2){
        if(node1==null){
            return node2;
        }
        else if (node2==null){
            return node1;
        }
        for(GraphNode nodes:node1.getList()){
            if(node2==nodes){
                System.out.println("Link Already exist");
                return node1;
            }
            else{
                node1.getList().add(node2);
            }
        }
        return node1;
    }

    public void addEdge(int item1, int item2) {
        GraphNode node1 = new GraphNode(item1);
        GraphNode node2 = new GraphNode(item2);
        if (!list.isEmpty()) {

            for (GraphNode edge : list) {
                if (edge.getData() == item1) {
                    node1 = edge;
                } else if (edge.getData() == item2) {
                    node2 = edge;
                }
            }


        } else {

            list.add(node1);
        }
        if (node1.getList().size() != 0) {
            if (!node1.getList().contains(node2.data)){

            node1.getList().add(node2);
        }

         }
        else{
                node1.getList().add(node2);
            }

    }
    public void printList(ArrayList<GraphNode> list){
        if(list==null){
            return;
        }
        for( GraphNode node:list){
            //System.out.println(node.data);
            printList(node.getList());
            System.out.println(node.data);
        }
    }



    public static void main(String[] args) {
        GraphOperations graphOperations=new GraphOperations();
        graphOperations.addEdge(9,10);
        graphOperations.addEdge(9,11);
        graphOperations.addEdge(10,12);
        graphOperations.addEdge(11,13);
        graphOperations.printList(graphOperations.list);

    }
}

