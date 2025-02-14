public class  builder{
    public static void main(String args[]){
        System.out.println("String Builder");
        StringBuilder sb = new StringBuilder("Tony");
       System.out.println(sb);
       // character index 
       System.out.println(sb.charAt(0));
       //replace character
       sb.setCharAt(0, 'S');
       System.out.println(sb);
    }
}