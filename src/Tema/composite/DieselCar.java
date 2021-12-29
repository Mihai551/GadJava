package Tema.composite;

public class DieselCar implements Car {
    public String brand;
    public String model;


    public DieselCar(String brand, String model) {
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
        return "Diesel";
    }

    @Override
    public void getPresentation() {

    }


}
