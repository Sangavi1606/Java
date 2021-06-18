class Car {

    String carName = "Default";

    public void Colour() {
        System.out.println("Default");
    }

    public void Door() {
        System.out.println("Four");
    }

    public void Speed() {
        System.out.println("Default");
    }

    public void Stearing() {
        System.out.println("Power Stearing");
    }
}

class Audi extends Car {

    public Audi(String name) {
        this.carName = name;
    }


//    public void name(String name) {
//        this.carName = name;
//        System.out.println(this.carName);
//    }

    @Override
    public void Colour() {
        System.out.println("Red");
    }

    @Override
    public void Speed() {
        System.out.println("400km/hr");
    }

}

class Benz extends Car {

    public Benz(String name) {
        this.carName = name;
    }


//    public void name(String name) {
//        this.carName = name;
//        System.out.println(this.carName);
//    }

    @Override
    public void Colour() {
        System.out.println("Silver");
    }

    @Override
    public void Speed() {
        System.out.println("350km/hr");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        Audi car1 = new Audi("Audi");
        System.out.println(car1.carName);
        //car1.name("Audi");
        car1.Colour();
        car1.Door();
        car1.Stearing();
        car1.Speed();

        System.out.println();

        Benz car2 = new Benz("Benz");
        System.out.println(car2.carName);
        //car2.name("Benz");
        car2.Colour();
        car2.Door();
        car2.Stearing();
        car2.Speed();


    }
}
