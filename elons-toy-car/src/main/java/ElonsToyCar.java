public class ElonsToyCar {

    private int distance = 0;
    private int battery = 100;
    
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + distance+ " meters";
    }

    public String batteryDisplay() {
        String msg = "";
        if(battery > 0){
            msg = "Battery at " + battery+ "%";
        }else{
            msg = "Battery empty";
        }
        return msg;
    }

    public void drive() {
       if(battery > 0){
           distance += 20;
           battery  -= 1;
       }
    }
}
