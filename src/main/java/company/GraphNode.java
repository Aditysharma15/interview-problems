package company;

import java.util.ArrayList;

/**
 * Created by Tuhin on 3/16/2017.
 */
public class GraphNode {

    int data;
    ArrayList<GraphNode> list= new ArrayList<>();

    public GraphNode() {
    }


    public GraphNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ArrayList<GraphNode> getList() {
        return list;
    }

    public void setList(ArrayList<GraphNode> list) {
        this.list = list;
    }
}
