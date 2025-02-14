import java.util.*;
public class Bit{
    public static void main(String args[]){

        //------------------------------------------check the postion of bit ----------------------------------------------------------

  /*  System.out.println("Check if the number is zero or not using bitwise operator = ");

       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

       int pos = 2;
       int bitwise =1<<pos;

       if((num & bitwise)==0){
         System.out.println("The number is zero");
       }else{
            System.out.println("The number is 1 ");
       } */  

       //------------------------------------a set operator using bitwise operator----------------------------------------
        
     /*  Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

       int pos = 1;
       int bitwise =1<<pos;

       int newNumber = num | bitwise;
         System.out.println(newNumber); */

         //------------------------------------a clear operator using bitwise operator----------------------------------------
         Scanner sc = new Scanner (System.in);
         int num = sc.nextInt();
         
         int pos = 2;
          int bitwise =1<<pos;
          int notbitwise = ~(bitwise);

          int newNumber = num & notbitwise;
           System.out.println(newNumber);
    }
}