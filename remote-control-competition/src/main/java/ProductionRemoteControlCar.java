class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{

    private int distance = 0;
    private int numberVictories;

    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return numberVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar otherCar){
        return Integer.compare(otherCar.getNumberOfVictories(),this.numberVictories);
    }
}
