// see this comment of enumimplementation of enum class in java.

enum Status{
    Running , Failed , Success, Pending; // all this are class objects of type Status
}



public class SA_EnumerationWithSwitch {
    public static void main(String a[]) 
    {
        Status s1 = Status.Running;
        System.out.println(s1);
        System.out.println(s1.ordinal());

        Status s2 = Status.Failed;
        System.out.println(s2);
        System.out.println(s2.ordinal());

        Status s3 = Status.Success;
        System.out.println(s3);
        System.out.println(s3.ordinal());

        Status s4 = Status.Pending;
        System.out.println(s4);
        System.out.println(s4.ordinal());

        switch(s1)
        {
            case Running:
                System.out.println("in running");
                break;
            case Failed:
                System.out.println("in failed");
                break;
            case Success:
                System.out.println("in success");
                break;
            case Pending:
                System.out.println("in pending");
                break;
        }
        // see this implementation of enum class in java

        System.out.println(s1.getClass().getSuperclass().getName());
    }
}
