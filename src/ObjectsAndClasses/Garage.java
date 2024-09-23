package ObjectsAndClasses;
import java.util.ArrayList;
public class Garage {

    private String garageName;
   public ArrayList<Car> cars;

   public Garage(String garageName){
       this.garageName = garageName;
       this.cars = new ArrayList<Car>();
   }

   public String getGarageName(){
       return garageName;
   }

   public ArrayList<Car> getCars(){
       return new ArrayList<>(cars);
   }



   public void addCar(Car car){
       cars.add(car);
   }

    public double calculatePriceForAllCars() {
        double totalPrice = 0;
        for (Car car : cars) {
            totalPrice += car.getPrice();
        }
        return totalPrice;


    }
}
