package company;

import java.util.HashMap;


/**
 * Created by Tuhin on 4/1/2017.
 */
public class TrieNode {

    HashMap<Character, TrieNode> children;
    boolean terminates=false;
    char character;

    public boolean isTerminates() {
        return terminates;
    }

    public void setTerminates(boolean terminates) {
        this.terminates = terminates;
    }

    public TrieNode(){

       children=new HashMap<Character,TrieNode>();
    }

    public TrieNode(char character){
        this();
        this.character=character;
    }

    public TrieNode getChild(char c){
           return children.get(c);
    }

    public char getChar(){
        return character;
    }

    public void addWord(String word){
        if(word=="" || word ==null){
            return;
        }
        char first=word.charAt(0);
        TrieNode child=getChild(first);
        if(child==null){
            child=new TrieNode(first);
            children.put(first,child);
        }

        if(word.length()>1){
            addWord(word.substring(1));
        }
        else{
            child.setTerminates(true);
        }
    }

}
