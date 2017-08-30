package company;

import java.util.Comparator;

/**
 * Created by Tuhin on 2/20/2017.
 */
public class NameVal {
    String firstName;
    String Lastname;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }




    public static Comparator<NameVal> lastnameComparator =new Comparator<NameVal>() {
        @Override
        public int compare(NameVal o1, NameVal o2) {
            NameVal p=(NameVal) o1;
            NameVal q=(NameVal) o1;
            return p.getLastname().compareToIgnoreCase(q.getLastname());

        }
    };


}
