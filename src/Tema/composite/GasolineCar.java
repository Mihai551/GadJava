package Tema.composite;

public class GasolineCar implements Car {
    public String brand;
    public String model;



    public GasolineCar(String brand, String model) {
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
        return "Gasoline";
    }

    @Override
    public void getPresentation() {

    }
}

