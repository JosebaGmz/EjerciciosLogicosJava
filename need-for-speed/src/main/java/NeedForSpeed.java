class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int distance = 0;
    private int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        boolean drained;
        if(battery < batteryDrain){
            drained = true;
        }else{
            drained =false;
        }
        return drained;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(battery >= batteryDrain){
            distance += speed;
            battery -= batteryDrain;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {

    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDistance = car.getSpeed() * (100/car.getBatteryDrain());
        return maxDistance >=distance;
    }
}
