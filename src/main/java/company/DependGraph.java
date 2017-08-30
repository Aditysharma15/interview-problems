package company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Tuhin on 3/3/2017.
 */
public class DependGraph
{
    HashMap<DependencyStructure,Boolean> dependGraph= new HashMap();


    public void addNode(DependencyStructure d1,DependencyStructure d2){
        if (ifContains(d1)&&ifContains(d2)){

        }

        if(ifContains(d1)){
            if(ifChildListEmpty(d1)) {
                d1.getChildren().add(d2);
            }
            else{
                if(ifChildAlreadyExist(d1,d2)){
                    System.out.println("There is already relation");
                }
                else{
                    d1.getChildren().add(d2);
                }
            }
        }
        else{
            if(ifContains(d2)){

            }
        }

    }

    public Boolean ifContains(DependencyStructure d1){
        if(dependGraph.containsKey(d1)){
            return true;
        }
        else
        {return false;}
    }



    public Boolean ifChildAlreadyExist(DependencyStructure d1, DependencyStructure d2){
        ArrayList<DependencyStructure> listOfChildren= new ArrayList<>();
        listOfChildren=d1.getChildren();
        Boolean val=false;

        for(DependencyStructure s1:listOfChildren){
            if(s1==d2){
                val=true;
            }


        }
        return val;
    }
    public Boolean ifChildListEmpty(DependencyStructure d1) {
        ArrayList<DependencyStructure> listOfChildren = new ArrayList<>();
        listOfChildren = d1.getChildren();
        Boolean val = false;
        if (listOfChildren == null) {
            val = true;
        }
        return val;
    }
}

