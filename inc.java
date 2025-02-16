import java.util.*;

public class inc {

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
           
            System.out.print( " THE ORDER =:" + arr[i] );
          

        }
        System.out.println(" Thanks ");
    }
    public static void main(String[] args) {
        System.out.println("Welcome user : \n" + "Enter the number of elements in the array :");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Close the scanner to avoid resource leak
        sc.close();

        // Print the entire array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
             System.out.println("ARRAY = " + arr[i]);
        }
       for (int i =0;i<arr.length-1;i++){
         for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int tem = arr[j];
                arr[j]=arr[j+1];
                arr[j+1] =tem;
            }
         }

       }
       printArray(arr);

    }
}