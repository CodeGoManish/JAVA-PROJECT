import java.util.*;

public class Excersie{
    /* public static void averageNum(int a ,int b, int c){
        int Average =(a+b+c)/3;
        System.out.println(Average);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       
         averageNum(a,b,c);


    } */

    public static void printAllOddNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
       
        printAllOddNumbers(n);


    }
   
}
