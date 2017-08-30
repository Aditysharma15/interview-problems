package company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Tuhin on 2/5/2017.
 */
public class WordDist {


    public WordDist() {
    }
    void findCharDistance(String line,String word){
        if ((line == null) || (word == null)|| line.length()<word.length()){
            System.out.println("not valid input");
        }

        int firstWordIndex=line.indexOf(word,0);
        int nextOccurenceIndex;
        if (firstWordIndex== -1){
            System.out.println(word + "Word is not present in given line " + line);
            return;
        }
        else {
             nextOccurenceIndex = line.indexOf(word, firstWordIndex + word.length());
        }
        if (nextOccurenceIndex== -1){
            System.out.println(word + "Word is present only once in line " + line);
            return;
        }
        else {
            System.out.println("Distance between the wrds is " + (nextOccurenceIndex-firstWordIndex));
        }



    }


    void findWordDistance(String line,String word){
        if ((line == null) || (word == null)|| line.length()<word.length()){
            System.out.println("not valid input");
        }

        int firstWordIndex=line.indexOf(word,0);
        int nextOccurenceIndex;

        if (firstWordIndex== -1){
            System.out.println(word + "Word is not present in given line " + line);
            return;
        }
        else {
            nextOccurenceIndex = line.indexOf(word, firstWordIndex + word.length());
        }
        if (nextOccurenceIndex== -1){
            System.out.println(word + "Word is present only once in line " + line);
            return;
        }
        else {
            System.out.println("Distance between the wrds is " + (nextOccurenceIndex-(firstWordIndex + word.length())));
        }

        String substringBtwTwoOccurences=line.substring(firstWordIndex + word.length()+1,nextOccurenceIndex);
        System.out.println("Substring is  " + substringBtwTwoOccurences);
        if (substringBtwTwoOccurences.length() ==0){
           System.out.println("There is no word between two words");
        }
        else {
            String ArrayOfWordsInBetween[] = substringBtwTwoOccurences.split(" ");

            System.out.println("Number of words is " + ArrayOfWordsInBetween.length);
            for(String str:ArrayOfWordsInBetween){
                System.out.println("Number of words is " + str);
            }
        }
    }

    ArrayList<String> FileOpen(String filename,String word) {
        BufferedReader bufferedReader= null;
        FileReader fileReader= null;
        ArrayList<String> coord=new ArrayList<>();
        try {

            fileReader=new FileReader(filename);
            bufferedReader= new BufferedReader(fileReader);

            // bufferedReader = new BufferedReader(new FileReader(filename));
            String sCurrentLine;

            while ((sCurrentLine=bufferedReader.readLine())!=null){

                // System.out.println(sCurrentLine);
                // Point[] coordinates = new Point();
                findWordDistanceFile(sCurrentLine,word);


            }

        }
        catch(IOException e){

            e.printStackTrace();
        }
        finally{
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }

            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
        return coord;
    }

    private void findWordDistanceFile(String sCurrentLine, String word) {

        int firstIndex= sCurrentLine.indexOf(word,0);

        if (firstIndex!=-1) {
                   // firstIndex+word.length();
            for (int i = 0; i < sCurrentLine.length(); i++) {

            }
        }
    }

    public static void main(String args[]){
           WordDist dist= new WordDist();
           dist.findWordDistance(" ram is my ram and he is really ram good", "ram");

    }
}
