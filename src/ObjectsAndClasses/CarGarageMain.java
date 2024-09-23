package ObjectsAndClasses;
import java.util.ArrayList;
public class CarGarageMain {

    public static void main(String[] args) {

        Car car1 = new Car("red", 2, 234);
        Car car2 = new Car("blue",4, 456);

        Garage housegarage = new Garage("housegarage");

        housegarage.addCar(car1);
        housegarage.addCar(car2);


        System.out.println(housegarage.calculatePriceForAllCars());


        ArrayList<Car> carsInGarage = housegarage.getCars();
        for (Car car : carsInGarage) {
            System.out.println(car.getColor());

            System.out.println(housegarage.cars.get(0));
        }

    }
}
