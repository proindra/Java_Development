enum Status{
    Running , Failed , Success, Pending; // all this are class objects of type Status
}



public class S_Enumeration {
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
    }
}
