import java.util.*;

public class Reverse{
    public static void main(String args[]){
        System.out.println("Reverse of a charcater name \n"+"Enter your name type here:=");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);

        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back =sb.length()-1-i;
          
           char  frontback = sb.charAt(i);
           char backfront = sb.charAt(sb.length()-1-i);

           sb.setCharAt(front,backfront);
           sb.setCharAt(back,frontback);

          


        }
        System.out.println(sb);

    }
}