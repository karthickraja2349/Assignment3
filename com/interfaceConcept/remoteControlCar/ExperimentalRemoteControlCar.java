package remoteControlCar;
class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distanceTravelled = 0;

    
    public void drive() {
        distanceTravelled += 20; // Drives 20 units each time
    }

    
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

   
    public String toString() {
        return "ExperimentalRemoteControlCar";
    }
}
