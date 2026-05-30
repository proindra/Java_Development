public class U_Exceptions{
    public static void main(String a[]){

        int i = 0;
        int j = 0;

        try
        {
            j = 18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong" + e);
        }
        finally
        {
            System.out.println("This will always execute");
        }
        

        System.out.println(j);
        System.out.println("Bye");
    }
}