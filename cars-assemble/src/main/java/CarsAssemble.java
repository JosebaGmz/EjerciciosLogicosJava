public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double rate = 0;
        double percentage = 0;
        if(speed >= 1 && speed <= 4){
           rate = speed * 221;
        }else if(speed >= 5 && speed <= 8){
            rate = speed * 221;
            percentage = 90 * rate / 100;
            rate = percentage;
        }else if(speed == 9){
            rate = speed * 221;
            percentage = 80 * rate / 100;
            rate = percentage;
        }else{
            rate = speed * 221;
            percentage = 77 * rate / 100;
            rate = percentage;
        }
        return rate;
    }

    public int workingItemsPerMinute(int speed) {
        int rate;
        double percentage;
        if(speed >= 1 && speed <= 4){
            rate = speed * 221 / 60;
        }else if(speed >= 5 && speed <= 8){
            rate = speed * 221 / 60;
            percentage = 90 * rate / 100;
            rate = (int) percentage;
        }else if(speed == 9){
            rate = speed * 221 / 60;
            percentage = 80 * rate / 100;
            rate = (int) percentage;
        }else{
            rate = Math.round((float) (speed * 221) / 60);
            percentage = rate * 77 / 100;
            rate = (int) percentage;
        }
        return rate;
    }
}
