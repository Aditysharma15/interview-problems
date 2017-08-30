package company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by Tuhin on 4/2/2017.
 */
public class BlackRock2 {
   /* public static Nodes root=null;
    static int findMax(int n, String tree) {




            String[] nodeData=tree.split(" ");

            int[] nodesData=new int[n];
            if(n!=nodeData.length){
                System.out.println("invalid value");
            }
            for(int i=0; i <n; i ++){
               nodesData[i] = Integer.parseInt(nodeData[i]);

            }
*/


    static int findMax(int n, String tree) {


        String[] nodeData=tree.split(" ");

        int[] nodesData=new int[n];
        if(n!=nodeData.length+1){
            System.out.println("invalid value");
        }
        createTreeNode(nodeData,1);
        levelOrderTraversal(  createTreeNode(nodeData,1));
        return 0;

    }



    static Nodes createTreeNode(String[] input, int index){
        if(index<=input.length){
            String value = input[index-1];
            if(value!="#"){
                Nodes t = new Nodes(value);
                t.left = createTreeNode(input, index*2);
                t.right = createTreeNode(input, index*2+1);
                //System.out.println("t.data = " + t.data);
                return t;
            }
        }
        return null;
    }
    public static void levelOrderTraversal(Nodes node){
        if(node==null){
            return;
        }
        Queue<Nodes> q= new java.util.LinkedList<>();

        q.add(node);
        while(!q.isEmpty()){
            Nodes node1=q.poll();
            if (node1.data.equals("#")){
                node1.data="0";
            }

                int data = Integer.parseInt(node1.data);

                System.out.print(node1.data + " ");
                if (node1.left != null) {
                    q.add(node1.left);
                }
                if (node1.right != null) {
                    q.add(node1.right);
                }
            }
            //

        System.out.println();
    }

    public  static class Nodes{

        Nodes left=null;
        Nodes right=null;
        String data=null;

        public Nodes(String data){
            this.data=data;
        }
    }
   

  /*  public  static void createTree(Nodes root,String[] array){

        if(root==null){
            root.data=array[0];
        }

        for(int i=1; i<array.length ; i++){
            Nodes left=new Nodes(array[i]);
            root.left=left;

            if(array[i]=="#"){

            }

        }

    }*/


    public static void main(String[] args) throws IOException {
        /*Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        String _tree;
        try {
            _tree = in.nextLine();
        } catch (Exception e) {
            _tree = null;
        }

        res = findMax(_n, _tree);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();*/

        findMax(6,"3 4 5 1 3 # 1");
    }
   
  



}
