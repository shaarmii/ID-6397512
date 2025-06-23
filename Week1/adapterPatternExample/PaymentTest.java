package Week1.adapterPatternExample;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paypal paypal = new Paypal();
		PaymentProcessor p = new PaypalAdapter(paypal);
		p.processPayment(2000);
		
		Stripe stripe = new Stripe();
		PaymentProcessor s = new StripeAdapter(stripe);
		s.processPayment(2500);

	}

}
