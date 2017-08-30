package company;

import java.util.ArrayList;

/**
 * Created by Tuhin on 4/1/2017.
 */
public class CheckBST {


    boolean checkBST(BinarySearchTree root) {

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                // System.out.println("No");
                return false;

            }


        }
        //System.out.println("Yes");
        return true;

    }

    public void inorder(BinarySearchTree root, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);


    }

}