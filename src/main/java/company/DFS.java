package company;

import jdk.nashorn.internal.ir.BinaryNode;
import sun.reflect.generics.tree.*;

import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;

/**
 * Created by Tuhin on 3/9/2017.
 */
public class DFS {

    public void dfs(BinarySearchTree node, int val){

        if(node==null){
            return;
        }

        dfs(node.left,val);

        dfs(node.right,val);
        if(node.getVal()==val){
            System.out.println("foud value "+ node.getVal());
        }

    }




}
