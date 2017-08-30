package company;

/**
 * Created by Tuhin on 2/16/2017.
 */



        import java.util.*;
        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.stream.Collectors;

// The Friendship class
//
// Feel free to modify it however you want to implement the 3-4 methods and make them work.
//

public class Friendship {


    // constructor
    Friends friendsObject= new Friends();
    HashMap<String,HashMap<String,Boolean>> friendMap = new HashMap<>();

    public Friendship() {

        //HashMap<Friends,Boolean> friendMap =null;
    }

    // This is for you to implement
    //
    // This method takes 2 String parameters and
    // makes them "friend" of each other.
    //
    // Note: The order of names does not matter
    // Note: Don't forget to write tests to have good test coverage for this method
    public void makeFriend(String name1, String name2) {

        boolean valExistName1 ,valExistName2;
        if (name1==null){
            System.out.println("No first friend to add to");
            return;
        }
        if (name2==null){
            System.out.println("No second friend to add to");
            return;
        }
        if((name1=="")||(name2=="")){
            System.out.println("Empty friends");
        }
        //valExistName1=MapContainsFriendAsKey(name1,name2);
        //valExistName2=MapContainsFriendAsKey(name2,name1);
        HashMap<String,Boolean> innerMap= new HashMap<>();
        if (MapContainsFriendAsKey(name1)) {
            System.out.println("is already present name1 = " + name1);
            if (MapContainsFriendAsKey(name1, name2)) {
                System.out.println("this friend already exist ");

            } else {
                //innerMap.put(name2, true);
                innerMap=friendMap.get(name1);
                innerMap.put(name2,true);
                friendMap.put(name1, innerMap);
            }
        }
         else if (MapContainsFriendAsKey(name2)) {
                System.out.println("is already present name2 = " + name2);
                if (MapContainsFriendAsKey(name2, name1)) {
                    System.out.println("this friend already exist ");
                } else {

                    innerMap=friendMap.get(name2);
                    innerMap.put(name1,true);
                    friendMap.put(name2, innerMap);
                }
            }
        else{

                innerMap.put(name2, true);
                friendMap.put(name1, innerMap);

        }
        }



        public Boolean MapContainsFriendAsKey(String name1,String name2) {

        if (friendMap.containsKey(name1)) {
                
            System.out.println("friendMap.get(name1) = " + friendMap.get(name1));
            System.out.println("friendMap.get(name1).containsKey(name2) = " + friendMap.get(name1).containsKey(name2));
            System.out.println("friendMap.get(name1).get(name2) = " + friendMap.get(name1).get(name2));

            if (friendMap.get(name1).containsKey(name2)==true)
            {
                System.out.println("this friend already exist as key " + name1 +" " + name2);
                return true;
            }
        }
           /* if (friendMap.containsKey(name2)) {
                if (friendMap.get(name2) == name1) ;
                {
                    System.out.println("this friend already exist as key " + name2);
                    return true;
                }
            }*/
        return false;
        }

    public Boolean MapContainsFriendAsKey(String name1) {

        if (friendMap.containsKey(name1)) {

                return true;

        }

        return false;
    }


    void print(HashMap<String,HashMap<String,Boolean>> friendMap){

        for (Map.Entry<String,HashMap<String,Boolean>> entry: friendMap.entrySet()){

            System.out.println("This person " + entry.getKey());
                for(String key:entry.getValue().keySet()) {

                    System.out.println("has this friend = " + key);
                }
        }


    }

    ArrayList<String> returnArrayList(HashMap<String,Boolean> friendMap){
        ArrayList<String> list=new ArrayList<>();

            for(String key:friendMap.keySet()) {

                System.out.println("entry.getval() = " + key);
                list.add(key);
            }

        return list;

    }

    ArrayList<String> arrayListInner(HashMap<String,HashMap<String,Boolean>> friendMap,String name1){
        ArrayList<String> list=new ArrayList<>();
        for (Map.Entry<String,HashMap<String,Boolean>> entry: friendMap.entrySet()){

            System.out.println("This has " + entry.getKey());
            for(String key:entry.getValue().keySet()) {

                System.out.println("These friends = " + key);
                if(key==name1){
                    list.add(entry.getKey());
                }
            }
        }
        return list;

    }

    // This is for you to implement
    //
    // This method takes 2 String parameters and
    // makes them no longer friends of each other.
    //
    // Note: The order of names does not matter
    // Note: Don't forget to write tests to have good test coverage for this method
    public void unmakeFriend(String name1, String name2) {
        if (friendMap !=null){
            if (MapContainsFriendAsKey(name1,name2)) {
                friendMap.get(name1).remove(name2);
            }
            else if(MapContainsFriendAsKey(name2,name1)){
                friendMap.get(name2).remove(name1);
            }



            else{
                System.out.println(name1+" is not friend of "+ name2 + "already");
            }
        }
        else{
            System.out.println("No friend exist");
        }

    }

    // This is for you to implement
    //
    // This method takes a single argument (name) and
    // returns all the immediate "friends" of that name
    //
    // For example, A & B are friends, B & C are friends and C & D are friends.
    // getDirectFriends(B) would return A and C
    // getDirectFriends(D) would return C
    //
    // Note: It should not return duplicate names
    // Note: Don't forget to write tests to have good test coverage for this method
    public ArrayList<String> getDirectFriends(String name) {
        ArrayList<String> directFriends=new ArrayList<String>();
        if(MapContainsFriendAsKey(name)){
            HashMap<String,Boolean> innerMap=new HashMap<String, Boolean>();
            innerMap=friendMap.get(name);
            directFriends=returnArrayList(innerMap);

        }
        if(arrayListInner(friendMap,name)!=null){
            directFriends.addAll(arrayListInner(friendMap,name));
        }
        //directFriends.add(arrayListInner(friendMap,name));



        return directFriends;
    }
void printArrayList(ArrayList<String> list){
        for(String name:list){
            System.out.println("Direct name = " + name);
        }
}


    // This is for you to implement (Seniors and above)
    //
    // This method takes a single argument (name) and
    // returns all the indirect "friends" of that name
    //
    // For example, A & B are friends, B & C are friends and C & D are friends.
    // getInirectFriends(A) would return C and D
    //
    // Note: It should not return duplicate names
    // Note: Don't forget to write tests to have good test coverage for this method
    public List<String> getIndirectFriends(String name) {
        ArrayList<String> directFriendList= new ArrayList<>();
        ArrayList<String> inDirectFriendList= new ArrayList<>();
        directFriendList=getDirectFriends(name);
        for(String directfriend:directFriendList){
         inDirectFriendList.addAll(getDirectFriends(directfriend));
        }

        return inDirectFriendList;
    }

    public static void main(String[] args) {
        Friendship friendship= new Friendship();

        friendship.makeFriend("alex","buny");
        friendship.makeFriend("alexo","muny");
        friendship.makeFriend("alex","bunyop");

       // friendship.print(friendship.friendMap);
        //friendship.unmakeFriend("alexo","muny");

        friendship.print(friendship.friendMap);

        friendship.printArrayList(friendship.getDirectFriends("alexo"));
    }

}


 