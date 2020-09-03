public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountOfTheCredit = 1_000_000;
        double percent = 9.99;
        int periodInYears = 1;
        double payment = service.calculate(amountOfTheCredit, percent, periodInYears);
        System.out.println("Ежемесячный платёж " + payment + " руб.");
    }
}
