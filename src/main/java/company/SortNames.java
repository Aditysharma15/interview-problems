package company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tuhin on 2/20/2017.
 */
public class SortNames {
    public ArrayList<NameVal> sortNames(String[] names){
        List<NameVal> list= new ArrayList<>();
        //int i=0;
        for(String name:names){
            String[] fullname= name.split(" ");
            NameVal nameVal=new NameVal();
            nameVal.setFirstName(fullname[0]);
            nameVal.setLastname(fullname[1]);
            list.add(nameVal);

        }
        /*for (int k=0;k<list.length-1;k++){
            for (int j = k+1;j<list.length;j++){
                list[i].compareToIgnoreCase(list[j]);
            }
*/
         //Collections.sort(list, NameVal.lastnameComparator);
        //Arrays.sort(list);
        return new ArrayList<>();
        }
    }

