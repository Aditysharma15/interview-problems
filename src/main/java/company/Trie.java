package company;

/**
 * Created by Tuhin on 4/1/2017.
 */
public class Trie {

    private TrieNode root;

    public Trie(String[] list){
        root= new TrieNode();
        for(String word:list){
            root.addWord(word);
        }

    }

    public boolean contains(String prefix){
        TrieNode lastNode= root;

        for(int i =0;i<prefix.length() ; i++)
        {
          lastNode=lastNode.getChild(prefix.charAt(i));

          if(lastNode==null){
              return false;
          }
        }
        return lastNode.terminates;
    }


}
