class Leap {

    boolean isLeapYear(int year) {
        boolean result = false;
        if(year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0){
            result = true;
        }
        return result;
    }

}
