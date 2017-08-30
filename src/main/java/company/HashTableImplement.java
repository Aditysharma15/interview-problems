package company;

import java.util.Arrays;

/**
 * Created by Tuhin on 4/2/2017.
 */
public class HashTableImplement {


class HashEntry{
    int key;
    int value;
    public HashEntry(int key, int value){
        this.key = key;
        this.value = value;
    }
    int getValue(){
        return this.value;
    }
    int getKey(){
        return this.key;
    }
}



    private static final int TABLE_SIZE = 128;
    private HashEntry[] ht;

    public HashTableImplement(){
        ht = new HashEntry[TABLE_SIZE];
        Arrays.fill(ht, null);
    }

    public int get(int key){
        int hash = key%TABLE_SIZE;
        while(ht[hash] != null && ht[hash].getKey() != key){
            hash = hash%TABLE_SIZE;
        }
        if(ht[hash] == null){
            return -1;
        }
        else{
            return ht[hash].getValue();
        }
    }

    public void put(int key, int value){
        int hash = key%TABLE_SIZE;
        while(ht[hash] != null && ht[hash].getKey() != key){
            hash = hash%TABLE_SIZE;
        }
        ht[hash] = new HashEntry(key, value);
    }

    public static void main(String[] args){
        HashTableImplement sht = new HashTableImplement();
        sht.put(2, 25);
        sht.put(5, 73);
        System.out.println(sht.get(2));
    }
}
