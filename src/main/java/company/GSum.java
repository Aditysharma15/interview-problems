package company;

import java.util.ArrayList;

/**
 * Created by Tuhin on 4/2/2017.
 */
public class GSum {

    public GSum(){

        //this.root=null;
    }

    public static void addEdge(GNode g1, GNode g2){

        for(GNode n:g1.siblings ){
            if(n.data==g2.data){
                return;
            }

        }
        g1.siblings.add(g2);

    }

   public static void printGraph(GNode gFirst){
        if(gFirst==null ){
            return;
        }

       if(!gFirst.isVisited) {
           gFirst.isVisited = true;
           System.out.println("node = " + gFirst.data);
       }
        if(gFirst.siblings==null){
            return;
        }
        for(GNode node:gFirst.siblings){

            printGraph(node);


        }
   }

    public static int sumGraph(GNode gFirst,int sum){
        if(gFirst==null ){
            return 0;
        }

        if(!gFirst.isVisited) {
            gFirst.isVisited = true;
            sum+=gFirst.data;
            System.out.println("node = " + gFirst.data);
        }
        if(gFirst.siblings==null){
            return 0;
        }
        for(GNode node:gFirst.siblings){

            sum=sumGraph(node,sum);


        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<GNode> edges= new ArrayList<>();
        GNode first= new GNode(1);
        GNode second= new GNode(2);
        GNode third= new GNode(3);
        GNode fourth= new GNode(4);
        GNode five= new GNode(5);
        GNode six= new GNode(6);
        edges.add(second);
        edges.add(fourth);
        first.siblings.addAll(edges);
        addEdge(fourth,five);
        addEdge(five,second);
        addEdge(fourth,third);
        addEdge(third,six);
       // printGraph(first);
        //int sum=0;
        //sumGraph(first,sum);
        System.out.println(sumGraph(first,0));
       // System.out.println("SUm is " + sum);
    }
}
