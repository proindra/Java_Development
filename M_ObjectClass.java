class Laptop{
    String model;
    int price;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}


public class M_ObjectClass {
    public static void main(String a[]){
        Laptop obj1 = new Laptop();
        obj1.model = "Dell";
        obj1.price = 50000;

        Laptop obj2 = new Laptop();
        obj2.model = "Dell";
        obj2.price = 50000;

        System.out.println(obj1); 
        // by default .toString() method of Object class is called which returns the class name and hashcode of the object, but we have overridden it to return the model and price of the laptop.
        System.out.println(obj2);

        System.out.println(obj1.equals(obj2));

    }
}
