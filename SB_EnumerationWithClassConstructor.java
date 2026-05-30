enum Laptop{
    MacBook(2000) , Dell(1500) , Hp(1000) , Lenovo(1800);

    private int price;

    Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}


public class SB_EnumerationWithClassConstructor {
    public static void main(String[] args) {    
        Laptop l1 = Laptop.MacBook;
        System.out.println(l1);
        System.out.println(l1.getPrice());

        Laptop l2 = Laptop.Dell;
        System.out.println(l2);
        System.out.println(l2.getPrice());

        Laptop l3 = Laptop.Hp;
        System.out.println(l3);
        System.out.println(l3.getPrice());

        Laptop l4 = Laptop.Lenovo;
        System.out.println(l4);
        System.out.println(l4.getPrice());
    }
}
