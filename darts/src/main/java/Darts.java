class Darts {
    int score(double xOfDart, double yOfDart) {
        double distance = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
        int value;
        if(distance > 10){
            value = 0;
        }else if(distance > 5){
            value = 1;
        }else if(distance > 1){
            value = 5;
        }else{
            value = 10;
        }
        return value;
    }
}
