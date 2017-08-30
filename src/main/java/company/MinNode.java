package company;

/**
 * Created by Tuhin on 3/19/2017.
 */
public class MinNode {
    BinarySearchTree node;

    int min;

    public MinNode(int min) {
        this.min = min;
    }

    public BinarySearchTree getNode() {
        return node;

    }

    public void setNode(BinarySearchTree node) {
        this.node = node;
    }



    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }



}
