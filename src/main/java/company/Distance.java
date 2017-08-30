package company;

import javax.security.sasl.SaslServer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tuhin on 2/2/2017.
 */
public class Distance {



    ArrayList<String> FileOpen(String filename) {
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
            coord.add(sCurrentLine);


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

void nearestCoffee(double xPos,double yPos,ArrayList<String> coords){

        if (coords == null){
            System.out.println("Array is null");
            return;
        }
        System.out.println("Coords size is " + coords.size());

    try {
        // bufferedReader = new BufferedReader(new FileReader(filename));
        //String sCurrentLine;
        //Double mindistanceFromCurrentPos= Double.MAX_VALUE;
        ArrayList<Double> distance=new ArrayList<>();
        Map<Double,Point> location = new HashMap<>();

        //Double first, second, third;
        int k =0;

        if ((coords.size()!=0) && (coords.get(k)!=null))
        {
          while (k!=coords.size()) {
              // System.out.println(sCurrentLine);
              String[] ValueArray = coords.get(k).split(",");
              System.out.println("Value array value " + ValueArray.toString() + "  Length " + ValueArray.length);
              if (ValueArray.length==0){
                  System.out.println("No comma separated value in Array ");
                  break;
              }
              if (ValueArray.length!=3) {

                  System.out.println("Insufficient or extra arguments provided");
                  break;
              }

              Point coordinates = new Point();

              coordinates.setName(ValueArray[0]);
          /*    if (Double.valueOf(ValueArray[1])==){

              }*/
              coordinates.setX(Double.valueOf(ValueArray[1])) ;
              coordinates.setY(Double.valueOf(ValueArray[2]));

              double dist = Math.sqrt(Math.pow(yPos - coordinates.getY(), 2) + Math.pow(xPos - coordinates.getX(), 2));
              distance.add(dist);
              location.put(dist, coordinates);
              System.out.println("++++++++++++" + k++ + "+++++++++++++++ \n");
         /*   for (Map.Entry entry : location.entrySet()) {

                System.out.println("??????????"+entry.getKey() + ", " + entry.getValue().toString());
            }*/
          }

        }
        else{

            System.out.println("The distance value is null or list is empty \n");
        }
        Collections.sort(distance);
        System.out.println("3 lowest are: "+ distance.size());

       /* for (Map.Entry entry : location.entrySet()) {
            //System.out.println(entry.getKey() + ", " + entry.getValue().toString());
        }*/
        if (distance.size()<3){
            for(int i=0;i<distance.size();i++){
                System.out.print("i am lowest %d "+ distance.get(i) + "\n");
                location.get(distance.get(i)).printPoint();
            }
        }
        else {
            for (int i = 0; i < 3; i++) {

                System.out.print("i am lowest %d " + distance.get(i) + "\n");
                //System.out.print("i am lowest location %d "+ location.get(distance.get(i)) + "\n");
                location.get(distance.get(i)).printPoint();
            }
        }
        //System.out.print("i am lowest %d "+ mindistanceFromCurrentPos);
    }
    catch(ArrayIndexOutOfBoundsException e){


        e.printStackTrace();
    }


}




    public static void main(String args[]){

         String filename;
         double xPos;
         double yPos;
        try {
            if (args.length != 3) {

                System.out.println("Insufficient or extra arguments provided");
            }
        }
        catch(IllegalArgumentException a){
            a.printStackTrace();
        }


            xPos= Double.parseDouble( args[0]);
            yPos= Double.parseDouble( args[1]);
            filename=args[2];


        Distance DistanceObject= new Distance();

        ArrayList<String> coord=DistanceObject.FileOpen(filename);
        DistanceObject.nearestCoffee(xPos,yPos,coord);
}
}