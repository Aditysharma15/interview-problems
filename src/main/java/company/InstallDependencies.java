package company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tuhin on 2/16/2017.
 */

public class InstallDependencies {

    DependencyNode ANode, BNode, CNode, DNode;

    Map<String, Boolean> installedMap = new HashMap<String, Boolean>();

    public void initializeDependencies() {
        ANode = new DependencyNode("A", null);
        BNode = new DependencyNode("B", Arrays.asList(ANode));
        CNode = new DependencyNode("C", Arrays.asList(BNode));
        DNode = new DependencyNode("D", Arrays.asList(CNode));
    }

    public void install(List<DependencyNode> orderOfInstallation) {
        for (DependencyNode node : orderOfInstallation) {
            System.out.println("Trying to install dependencies for " + node.getName());
            if (installedMap.containsKey(node.name)) {
                System.out.println(node.name + " is already installed");
                continue;
            } else {
                installSubDependencies(node);
                System.out.println("Installing " + node.name);
                installedMap.put(node.name, true);
            }

        }

    }

    public void installSubDependencies(DependencyNode dependencyNode) {

        if (dependencyNode.getDependencies() != null) {
            for (DependencyNode currentDependency : dependencyNode.getDependencies()) {
                if (installedMap.containsKey(currentDependency.getName())) {
                    System.out.println(currentDependency.getName() + " is already installed");
                } else {
                    installSubDependencies(currentDependency);
                    System.out.println("Installing " + currentDependency.getName());
                    installedMap.put(currentDependency.getName(), true);
                }

            }
        }
        // else {
        // System.out.println("Installing " + dependencyNode.getName());
        // installedMap.put(dependencyNode.getName(), true);
        // }
    }

    public static void main(String args[]) {
        InstallDependencies installDependencies = new InstallDependencies();
        installDependencies.initializeDependencies();
        installDependencies.install(Arrays.asList(installDependencies.CNode, installDependencies.BNode,
                installDependencies.ANode, installDependencies.DNode));
    }
}
