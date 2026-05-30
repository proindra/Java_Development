public class UB_ThrowAndThrows{
    public static void main(String a[]){

        int i = 0;
        int j = 0;

        try
        {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("i dont want to throw zero");
        }
        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("this is default output");
        }
        catch(Exception e) 
        {
            System.out.println("Something went wrong" + e);
        }
        

        System.out.println(j);
        System.out.println("Bye");
    }
}