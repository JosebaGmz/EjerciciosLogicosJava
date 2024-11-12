class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int originalNumber = numberToCheck;
        int digitsCount = Integer.toString(numberToCheck).length();
        int sum = 0;

        while (numberToCheck > 0) {
            int digit = numberToCheck % 10;
            sum += Math.pow(digit, digitsCount);
            numberToCheck /= 10;
        }

        return sum == originalNumber;
    }

}
