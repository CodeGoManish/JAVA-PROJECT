import java.util.*;
public class Loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String  a = sc.next();
        int n = sc.nextInt();

       /*  if(a.equals("ram")){
            System.out.println("Login Password");
        }else{
            if(a.equals("manish"))
                System.out.println("Enter your  password Dear sir");
                String b = sc.next();
                //System.out.println(b);
           
            
            System.out.println("Welcome");
        }
        switch(a){
            case "ram": System.out.println("Welcome");
            break;
            case "manish":System.out.println("Enter password");
            String  b = sc.next();
            System.out.println("Welcome");
            break;
            default:
            System.out.println("Only Members allowed");


        }
        for(int i=0;i<=100;i++){
            System.out.println(a);
        }
       System.out.println("Enter the number :");
         int i = 40;
         do{
            System.out.println(i);
            i= i+1;
         }
         while(i<11);

         >>   In every condiations >>>
         int sum = 1;
         for(int i =1;i<=n;i++){
            sum = n *i;
            System.out.println(sum);
         }
       // System.out.println(sum);
       >>> Inner and outer all do >>>

       int sum = 1;
       for(int i =1;i<=n;i++){
          sum = sum+i;
          System.out.println(sum);
       }*/
       int sum = 1;
       for(int i =1;i<=n;i++){
          
        sum = sum*i;

         System.out.println(sum);

       }
      
        
    }
    
}
