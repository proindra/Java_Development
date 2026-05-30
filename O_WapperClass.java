public class O_WapperClass {
    public static void main(String a[]){
        int num = 7;
        // Integer num1 = new Integer(num); ( old method ) // boxing -- converting primitive type to wrapper class object
        Integer num1 = num;                                // autoboxing -- converting primitive type to wrapper class object

        // int num2 = num1.intValue();                     // unboxing -- converting wrapper class object to primitive type
        int num2 = num1;                                   // autounboxing -- converting wrapper class object to primitive type
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str); // converting string to primitive type
        System.out.println(num3*2);
    }
}
