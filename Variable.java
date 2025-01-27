public class Variable{
    public static void main(String args[]){
        int a = 10;
        float b = 1;
        double c =1.2;
        byte d = 12;
        char e = 'm';
        String f ="Manish";
        //Using concatenation
        System.out.println("int: "+ a + ",float:" + b +" ,double:"+c+",byte:"+d+",char:"+e+",String"+f);
       
        // Using formatted strings
        System.out.printf("int: %d, float: %.1f, double: %.1f, byte: %d, char: %c, String: %s%n", a, b, c, d, e, f);
    }
}



