package company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tuhin on 2/10/2017.
 */
public class DependencyStructure {

    String name;
    //DependencyStructure<String> parent;
    ArrayList<DependencyStructure> children=new ArrayList<>();

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    boolean visited;


    public DependencyStructure(String name,  ArrayList<DependencyStructure> children) {
        this.name = name;
      //  this.parent = parent;
        this.children = children;
    }

    public DependencyStructure() {
    }

    public DependencyStructure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<DependencyStructure> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<DependencyStructure> children) {
        this.children = children;
    }
}
