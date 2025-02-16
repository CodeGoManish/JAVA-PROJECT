public class rec{

    //----------------------------------------------------------Decrease-----------------------------------------------------------------

   /* public static void printNum(int n){
     if(n==0){
        return;
     }
        System.out.println(n);
            printNum(n-1);
        
       
    }
    public static void main(String args[]){
        System.out.println("Number Print");
        int n = 5;
        printNum(n);
    } */

    //----------------------------------------------------------------------Increase-----------------------------------------------------------

    /*public static void printNum(int n ){
        if(n==7){
            return;
        }
         System.out.println(n);
         printNum(n+1);
    }
    public static void main(String args[]){
        int n = 1;
        printNum(n);

    }
     */

     //--------------------------------------------------------------------------Factorial------------------------------------------------------

    /* public static int factNum(int n ){
        if(n==1||n==0){
            return 1;
        }

        int fact =factNum(n-1);
        int newf= n*fact;
         return newf;
         
    }
    public static void main(String args[]){
        int n = 5;
      int var = factNum(n);
        System.out.println(var);

    } */

    //-------------------------------------------------------------Power of any number ---------------------------------------------------

/*    public static int powNum(int x , int n ){
        if(n==0){
            return 1;
        }
        if(x==0 && n > 0){
            return 0;
            
        }

        int pow =powNum(x, n-1);
        int newf= x * pow;
         return newf;
         
      }
    public static void main(String args[]){
        int x = 2 , n=5;
        
      int var = powNum(x , n);
        System.out.println(var);

    }
     */

     //----------------------------------------------------------febnocii--------------------------------------------------------------
/*
     public static void fibonacci(int a, int b, int n ){
        if(n==0){
            return ;
        }
        
        int c=a+b;
        System.out.println(c);
        fibonacci(b, c, n-1 );
       
       
         
      }
    public static void main(String args[]){
        int a = 0 , b=1;
         System.out.println(a);
         System.out.println(b);
        
         int n =7;
        
     fibonacci(a , b ,n-2);
        
    } */

    //----------------------------------------------------------permutation--------------------------------------------------------------

 /*  public static void permutation(String str , String v){
         if(str.length()==0){
            System.out.println(v);
            return;
         }
     for (int i=0;i<str.length();i++){
           char newP =str.charAt(i);
              String newStr= str.substring(0, i)+str.substring(i+1);
                permutation(newStr, v+newP);
     }
   }
    public  static void main(String args[]){
        String str = "abc";


        permutation(str, "");
       

    } */

    //----------------------------------------------------------m*n--------------------------------------------------------------
/*
   
  public static int tableA(int n ,int m){
    if(n==m){
        return 2;
    }
    if(n<m){
        return 1;
    }

      int vartical = tableA(n-m,m);
        int horizontal = tableA(n-1,m);
        return vartical+horizontal;
  }
   public  static void main(String args[]){
      int m = 2, n  = 4;


        System.out.println(tableA(n,m));

   }
     */
    //----------------------------------------------------------JOin--------------------------------------------------------------

    
   public static int joinN(int n){

    if(n<=1){
        return 1;
    }
    int way = joinN(n-1);

    int way2 = (n-1)*joinN(n-2);
    return way+way2; 
   }



   public static void main(String args[]){
    int n=4;

    System.out.println(joinN(n));

   }
}