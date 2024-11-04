package remoteControlCar;
class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled = 0;
    private int victories = 0;

   
    public void drive() {
        distanceTravelled += 10; // Drives 10 units each time
    }

   
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getVictories() {
        return victories;
    }

    
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getVictories(), this.victories); // Sort by victories in descending order
    }

    
    public String toString() {
        return "ProductionRemoteControlCar with " + victories + " victories";
    }
}

