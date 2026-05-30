class IndraException extends Exception{
    public IndraException(String message){
        super(message);
    }
}

public class UC_CustomException{
    public static void main(String a[]){

        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            if(j==0)
                throw new IndraException("i dont want to throw zero");
        }
        catch(IndraException e)
        {
            j = 18/1;
            System.out.println("this is default output" + e);
        }
        catch(Exception e) 
        {
            System.out.println("Something went wrong" + e);
        }
        

        System.out.println(j);
        System.out.println("Bye");
    }
}

// learn Ducking Exception in java for more understanding of exception handling in java.