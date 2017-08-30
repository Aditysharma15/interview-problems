package company;

import java.util.Arrays;
import java.util.Queue;

/**
 * Created by Tuhin on 3/23/2017.
 */
public class BFS {


    /*enum color{white,grey,black};
    public void bfs(GraphNode g,int start, int end) {
        Queue<GraphNode> q = new LinkedList<>();

        for(GraphNode k:g.adjacentList()){
            k.color= color.white;
        }
        q.add(start);
        while(!q.isEmpty()){
            GraphNode node=q.poll();
            if(node!=null){
            for(GraphNode l:node.adjacentList()){
                if(l.data==end){
                    System.out.println("Found");
                    return;
                }
                if(l.color==white){
                    l.color=grey;
                    q.add(l);
                }
            }
         }
        }

    }
*/
}
