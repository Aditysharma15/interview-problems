package company;

/**
 * Created by Tuhin on 2/16/2017.
 */
import java.util.List;

public class DependencyNode {

    String name;
    List<DependencyNode> dependencies;

    public DependencyNode(String name, List<DependencyNode> dependencies) {
        this.name = name;
        this.dependencies = dependencies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DependencyNode> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<DependencyNode> dependencies) {
        this.dependencies = dependencies;
    }

}



