package company;

/**
 * Created by Tuhin on 2/22/2017.
 */
public class BinarySearchTree {

    int val;
    BinarySearchTree left;
    BinarySearchTree right;

    public BinarySearchTree(int val) {
        this.val = val;
    }

    public BinarySearchTree() {
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public BinarySearchTree getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTree left) {
        this.left = left;
    }

    public BinarySearchTree getRight() {
        return right;
    }




    public void setRight(BinarySearchTree node){
        this.right=node;
    }



}
