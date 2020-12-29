public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        int period = 12;
        double percent = 9.99;
        double monthlyPayment = service.calculate(amount, period, percent);
        System.out.println (+ (int) (monthlyPayment));
        }
    }

