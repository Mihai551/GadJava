package Tema.composite;

public class Main {

    public static void main ( String [] args) throws InterruptedException {
        Cars cars = new Cars();
        DieselCar car1 = new DieselCar("Ford","Raptor");
        ElectricCar car2 = new ElectricCar("Tesla","Model 3");
        DieselCar car3 = new DieselCar("Mercedes","G Class");
        GasolineCar car4 = new GasolineCar("Mercedes","A Class");
        ElectricCar car5 = new ElectricCar("Dacia","Spring");
        GasolineCar car6 = new GasolineCar("Fiat","Tipo");
        ElectricCar car7 = new ElectricCar("Kia","Ev6");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);



        cars.getPresentation();

        cars.remove(car4);
        cars.remove(car3);

        System.out.println("\nCars after sales\n");

        cars.getPresentation();


    }


}
