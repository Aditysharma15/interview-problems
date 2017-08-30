package company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Tuhin on 2/10/2017.
 */
public class Dependencies {

    //ArrayList<String> dependent= new ArrayList();
    ArrayList<DependencyStructure> dependentArray=new ArrayList<>();
    public DependencyStructure root=null;
    public int size;
    public Dependencies(){
        this.root=null;
        this.size=0;


    }


    public void takeInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter file to Download");

        String filename = scanner.nextLine();

        //int count=0;
        //System.out.println("Please Mention Dependencies for "+ filename + " ,Enter X to Exit");
        //dependent = takeDependencyInput(scanner);
        //DependencyStructure dependencyStructure=new DependencyStructure(filename,root,takeDependency(scanner));
        DependencyStructure dpr= new DependencyStructure();

        if (root==null){
            root=dpr;
            size++;
        }
        dpr.setName(filename);

        System.out.println(dpr.getName());
        //dependentArray.add(dpr);
         //DependencyStructure dp= new DependencyStructure();
        System.out.println("Please Mention Dependencies for " + filename +" Enter X to Exit");

        //dpr.getChildren().add(takeDependencyInput(dpr));
        dpr.setChildren(null);

        takeDependencyInput(dpr);
        //dependentArray.add(dp);
        //dpr.setChildren(dependentArray);


        //dependent.add(filename);
        //dependent = takeDependencyInput(scanner);
    /*   for (int i =0 ; i <dependent.size();i++) {
            System.out.println("Please enter file dependencies for "+dependent.get(i));

            //takeDependencyInput(scanner);
        }*/

    }


    public DependencyStructure takeDependencyInput(DependencyStructure dprfirst){

        Scanner scanner = new Scanner(System.in);
        root=dprfirst;
        DependencyStructure dp=null;
        //ArrayList<DependencyStructure> temp=null;

        for(int i =0;i<size;i++){
            //temp=new ArrayList<>();
          //  if(i>0) {
            //System.out.println("Please Mention Dependencies for " + dprfirst.getChildren().get(i).getName() + " Enter X to Exit");
           // }
            while (scanner.hasNext()) {

                System.out.println("Please Mention Dependencies for " +  " Enter X to Exit");
                String input = scanner.next();
                if (input.equals("X")) {


                    /*if(root.getChildren()==null) {
                        root.getChildren().add(dprfirst);
                    }*/


                    System.out.println("Please Mention Dependencies for " + dprfirst.getName()+ " Enter X to Exit");

                   /* for (DependencyStructure d:dprfirst.getChildren()){
                        System.out.println("Please Mention Dependencies for " + d.getName()+ " Enter X to Exit");
                        takeDependencyInput(d);
                    }*/
                    break;

                } else {
                    dp=new DependencyStructure();
                    dp.setName(input);
                    //temp.add(dp);
                   /* Iterator<DependencyStructure> itr = dprfirst.getChildren().iterator();
                    if(itr.hasNext()) {
                       dprfirst= itr.next();
                    }*///takeDependencyInput(dp);
                    dp.getChildren().add(takeDependencyInput(dp));
                    dprfirst.getChildren().add(dp);
                    size++;
                }
            }

        }
        printTree(dprfirst," ");
        //dprfirst.setChildren(dependentArray);
        for(int i =0;i<dprfirst.getChildren().size();i++){
            System.out.println("ffffffffff " + dprfirst.getChildren().get(i).getName() + " ,Enter X to Exit");

        }
        return dprfirst;
    }

    private static void printTree(DependencyStructure dp, String appender) {
        System.out.println(appender + dp.getName());
        for (DependencyStructure each : dp.getChildren()) {
            printTree(each, appender + appender);
        }
    }

    public void addchild(DependencyStructure parent,String name){
        DependencyStructure newChild=new DependencyStructure();
        newChild.setName(name);
        parent.getChildren().add(newChild);

    }


    public DependencyStructure takeDependencyInput(Scanner scanner,DependencyStructure dprfirst)

    {
        if (root==null){
            dprfirst=root;
            size++;
        }

        DependencyStructure dpr=dprfirst;
        //dprfirst.setChildren(dpr);
        //int count=0;

        //int count=0;
        for (int i =0 ; i <dependentArray.size() ;i++) {
                if (i==0) {
                    System.out.println("Please Mention Dependencies for " + dprfirst.getName() + " ,Enter X to Exit");
                }
                else{
                    System.out.println("Please Mention Dependencies for " + dpr.getName() + " ,Enter X to Exit");
                }

            //ArrayList<String> dependency = new ArrayList<>();
            while (scanner.hasNext()) {
                String input = scanner.next();
                //ArrayList<DependencyStructure<String>> dparray =new ArrayList();
                dpr= new DependencyStructure();
                // DependencyStructure<String> in= input;
                if (input.equals("X")) {
                    //dpr.setName(input);
                    dpr.setChildren(null);
                    break;

                } else {
                    //DependencyStructure dpr =new DependencyStructure<>();
                    dpr.setName(input);
                    dependentArray.add(dpr);
                    if (dprfirst.getChildren()==null){

                        dprfirst.setChildren(dependentArray);
                    }
                    else {

                        dpr.setChildren(dependentArray);
                    }//dependent.add(input);
                    //dependencyStructure
                    size++;

                }
            }
        }
        return dpr;

    }

  /*  public void addnode(ArrayList name){
        ArrayList <DependencyStructure<String>> children= new ArrayList<>();
        for (int i =0 ; i <name.size();i++) {

            children.add(name.get(i));
        }
        if (this.root==null){
            root=name;
        }
        DependencyStructure Node= new DependencyStructure();
        Node=root;
        while(Node.getChildren()!=null){
            root.setChildren(name);

        }

    }

    public ArrayList<DependencyStructure<String>> takeDependency(Scanner scanner){
        int count=0;
        while(scanner.hasNext())
        {
            String input=scanner.next();

           // DependencyStructure<String> in= input;
            if (input.equals("X")) {
                break;

            }
            else {
                DependencyStructure in =new DependencyStructure<>();
                in.setName(input);
                in.setChildren(takeDependency(scanner));
                dependency.add(in);
                //dependencyStructure
                count++;
            }
        }
        return dependency;
    }*/
    public static void main (String[] args){
        Dependencies dependencies=new Dependencies();
        dependencies.takeInput();
    }
}
