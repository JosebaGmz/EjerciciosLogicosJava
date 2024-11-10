public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean condition = daysSkipped >= 5;

        return condition ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        boolean condition = productsSold >= 20;

        return condition ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        int value = bonusMultiplier(productsSold);

        return value * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salaryMultiplier = salaryMultiplier(daysSkipped);

        double bonusSold = bonusForProductsSold(productsSold);

        double finalSalary = (1000 * salaryMultiplier) + bonusSold;

        boolean condition = finalSalary > 2000;

        return condition ? 2000 : finalSalary;
    } 
}
