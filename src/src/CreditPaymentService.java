public class CreditPaymentService {
    public double calculate (int amount, int period, double percent) {
        double monthlyPerсent = percent / 1200;
        double monthlyPayment = amount * monthlyPerсent / (1
                - 1 / Math.pow(1 + monthlyPerсent, period));
        return monthlyPayment;
    }

}
