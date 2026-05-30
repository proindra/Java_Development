// abtract class can have all normal methods also.
abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving WagonR");
    }
}



public class P_AbtrackKeyword {
    public static void main(String a[]){

        // we cannot create object of abstract class but we can create reference of abstract class and assign it to the object of subclass
        Car car = new WagonR(); 
        car.drive();
        car.playMusic();
    }
}
