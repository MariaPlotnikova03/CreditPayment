public class CreditPaymentService {
    public double calculate(double amountOfTheCredit, double percent, double periodInYears) {

        double i = percent / 12 / 100;
        double x1 = i + 1;
        double periodInMonths = periodInYears * 12;
        double payment = amountOfTheCredit * ((i * Math.pow(x1, periodInMonths)) / (Math.pow(x1, periodInMonths) - 1));
        int paymentRounded = (int)payment;
        return paymentRounded;
    }
}
