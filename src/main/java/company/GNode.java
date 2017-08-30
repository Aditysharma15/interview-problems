package company;

import java.util.ArrayList;

/**
 * Created by Tuhin on 4/2/2017.
 */


public class GNode {

    int data;
    ArrayList<GNode> siblings=new ArrayList<>();
    boolean isVisited;

    public GNode(int data) {
        this.data = data;
    }
}
