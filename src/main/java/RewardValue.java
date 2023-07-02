public class RewardValue {

    double cashValue;
    int milesValue;
    final static double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    public int convertCashToMiles(double cashValue) {
        milesValue = (int) (cashValue / CONVERSION_RATE);
        return milesValue;
    }

    public double convertMilesToCash(int milesValue) {
        cashValue = milesValue * CONVERSION_RATE;
        return cashValue;
    }


    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

}
