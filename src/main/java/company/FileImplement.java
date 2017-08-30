package company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Tuhin on 2/14/2017.
 */
public class FileImplement {
    ArrayList<FileCommands> objectArray=new ArrayList<>();
    HashMap<String,ArrayList>  list=new HashMap<>();
    HashMap<String,ArrayList>  installed=new HashMap<>();

    public void installFile(String[] fileArray){


        for(int i=0;i<fileArray.length;i++){

           if(list.containsKey(fileArray[i])){
               System.out.println("Installation of " + fileArray[i] + " needs installing dependencies");
               ArrayList<String> files=list.get(fileArray[i]);
               if(files.size()>0) {
                   for (String fName : files) {
                       //System.out.println(fName);
                       if (fName=="none"){
                           System.out.println("No depenedency required");
                       }
                       else {
                           verify(fName);
                       }
                   }
               }
               installed.put(fileArray[i],null);
           }
           else{
               installed.put(fileArray[i],null);
           }



        }

    }
    public void verify(String name){
        if(installed.containsKey(name)){
            System.out.println(name+ " Is already installed");
        }
        else{
            System.out.println("Installing " + name);

            installed.put(name, null);
        }
    }


   public void init(){
        FileCommands f=new FileCommands();
        f.name="foo";
        f.getList().add("bar");
        f.getList().add("my");
        objectArray.add(f);
        FileCommands f1=new FileCommands();
        f1.name="bar";
        f1.getList().add("c");
        objectArray.add(f1);
        FileCommands f2=new FileCommands();
        f2.name="my";
        f2.getList().add("d");
        objectArray.add(f2);
        FileCommands f3=new FileCommands();
        f3.name="c";
        f3.getList().add("none");
        objectArray.add(f3);
        FileCommands f4=new FileCommands();
        f4.name="d";
        f4.getList().add("none");
        objectArray.add(f4);
        list.put(f.name,f.getList());
        list.put(f1.name,f1.getList());
        list.put(f2.name,f2.getList());
        list.put(f3.name,f3.getList());
        list.put(f4.name,f4.getList());

    }
    public static void main(String[] args) {

        String[] inputArray={"foo","bar","d"};
        FileImplement fileImplement=new FileImplement();
        fileImplement.init();
        fileImplement.installFile(inputArray);

    }
}
