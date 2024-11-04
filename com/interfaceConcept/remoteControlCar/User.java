package remoteControlCar;
import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {
        ProductionRemoteControlCar car1 = new ProductionRemoteControlCar();
        car1.setVictories(5);

        ProductionRemoteControlCar car2 = new ProductionRemoteControlCar();
        car2.setVictories(3);

        ExperimentalRemoteControlCar expCar = new ExperimentalRemoteControlCar();

        TestTrack.race(car1);
        TestTrack.race(expCar);

        System.out.println("Car 1 distance: " + car1.getDistanceTravelled()); 
        System.out.println("Experimental car distance: " + expCar.getDistanceTravelled()); 

        List<ProductionRemoteControlCar> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);

        List<ProductionRemoteControlCar> rankedCars = TestTrack.getRankedCars(cars);
        System.out.println("Ranked Cars: " + rankedCars); 
    }
}


