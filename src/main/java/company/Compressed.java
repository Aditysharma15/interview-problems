package company;

/**
 * Created by Tuhin on 3/25/2017.
 */
public class Compressed {

    public static void funny(String s){
        String r= reverse(s);
        System.out.println(s+" "+r);
        boolean funny=false;
        for(int i=0 ; i<s.length()-1;i++ ){
            System.out.println((int)s.charAt(i+1));

            if(Math.abs((int)s.charAt(i+1)-(int)s.charAt(i))==Math.abs((int)r.charAt(i+1)-(int)r.charAt(i))){
                System.out.println("funny");
                funny=true;
            }
            else{
                System.out.println("Notfunny");
                funny=false;
                break;
            }
        }
        if(funny==true){
            System.out.println("Funny");
        }
        else{
            System.out.println("Not Funny");
        }

    }
    public static String reverse(String r){
        String k = "";
        for(int i =r.length()-1 ; i>=0; i --){
            k= k+(r.charAt(i));
        }
        return k ;
    }
    public static StringBuilder compress(String s1){

        StringBuilder sb= new StringBuilder();
        int j =0;
        int count =1 ;
        for(int i = 0 ; i<s1.length(); i++){
            if(j<s1.length()-1) {

            j=i+1;
            }else{
                    sb.append(s1.charAt(i));

                sb.append(count);
                break;
            }
            if(s1.charAt(i)==s1.charAt(j) && j<s1.length()){
                while(j<s1.length() && s1.charAt(i)==s1.charAt(j)  ) {
                    j++;
                    count++;
                }
            }


                sb.append(s1.charAt(i));
                sb.append(count);

                    i = j - 1;
                    count = 1;



        }
        return sb;

    }

    public static void main(String[] args) {

        System.out.println(compress("ndmdhsua"));
        funny("acxz");

    }

}
