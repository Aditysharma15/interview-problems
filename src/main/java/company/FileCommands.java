package company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Tuhin on 2/14/2017.
 */
public class FileCommands {

    String name;
    ArrayList list= new ArrayList();


    public FileCommands(String file, ArrayList list) {
        this.name = file;
        this.list = list;

    }

    public FileCommands() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
