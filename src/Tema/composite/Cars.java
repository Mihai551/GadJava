package Tema.composite;
import java.util.ArrayList;
import java.util.List;

public class Cars implements Car {
    private List<Car> cars = new ArrayList<Car>();

    public void add(Car car) {
        this.cars.add(car);
    }

    public void remove(Car car) {
        this.cars.remove(car);
    }




    @Override
    public String getCarName() {
        return null;
    }


    @Override
    public String getCarType() {
        return null;
    }

    @Override
    public void getPresentation() {
        for (Car car : cars) {
            System.out.println(car.getCarName() + " -> " + car.getCarType());
        }

    }
}
