package company;

/**
 * Created by Tuhin on 3/10/2017.
 */
public class Pattern {



    public void flowerPattern(){
        for(int i =0 ; i <3;i++){
            for (int j=0;j<5;j++){
                switch(i) {
                    case 0:
                    case 2:
                        if (j == 2) {
                            System.out.print((char) 79);
                        } else {
                            System.out.print((char) 46);
                        }

                    break;
                    case 1:
                        if ((j == 0) || (j == 4)) {
                            System.out.print((char) 79);
                        } else if (j == 2) {
                            System.out.print((char) 111);
                        } else {
                            System.out.print((char) 46);
                        }
                    break;

                }

            }

                System.out.println();

        }

    }

    public void printGreeting(int r,int c)
    {

        if(r<1||c>20){
            throw new IllegalArgumentException();
        }

        int resCol=c*5;
        int resRow=r*3;


                for(int i =0 ; i <resRow;i++){
                    for (int j=0;j<resCol;j++){

                        switch(i%3) {

                            case 0:
                            case 2:
                                if ((j%5) == 2) {
                                    System.out.print((char) 79);
                                } else {
                                    System.out.print((char) 46);
                                }

                                break;
                            case 1:
                                if ((j%5 == 0) || (j%5 == 4)) {
                                    System.out.print((char) 79);
                                } else if (j%5 == 2) {
                                    System.out.print((char) 111);
                                } else {
                                    System.out.print((char) 46);
                                }
                                break;


                        }


                    }

                    System.out.println();

                }




    }
    public static void main(String[] args) {
    Pattern pattern = new Pattern();
    pattern.printGreeting(2,5);
    }
}
