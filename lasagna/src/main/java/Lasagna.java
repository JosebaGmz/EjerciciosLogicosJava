public class Lasagna {
    
    public static int expectedMinutesInOven(){
        return 40;
    }

    public static int remainingMinutesInOven(int minutos){
        return expectedMinutesInOven() - minutos;
    }

    public static int preparationTimeInMinutes(int capas){
        int tiempo = capas * 2;
        return tiempo;
    }

    public static int totalTimeInMinutes(int capas, int minutos){
        int tiempo = preparationTimeInMinutes(capas) + minutos;
        return tiempo;
    }
}
