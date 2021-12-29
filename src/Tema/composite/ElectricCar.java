package Tema.composite;

public class ElectricCar implements Car {
    public String brand;
    public String model;


    public ElectricCar(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

    @Override
    public String getCarName() {
        return(
                this.brand + " " + this.model);
    }

    @Override
    public String getCarType() {
        return "Electric";
    }

    @Override
    public void getPresentation() {
        System.out.println(this.brand + " " + this.model + " -> " + this.getCarType());

    }


}

