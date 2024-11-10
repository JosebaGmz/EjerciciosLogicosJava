
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean dayWithoutBirds = false;
        for(int i = 0; i <= birdsPerDay.length -1; i++){
            if(birdsPerDay[i] == 0){
                dayWithoutBirds = true;
            }
        }
        return dayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdsDay = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for(int i = 0; i < limit; i++){
             birdsDay += birdsPerDay[i];
        }
        return birdsDay;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int i = 0; i <= birdsPerDay.length - 1; i++){
            if(birdsPerDay[i] >= 5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
