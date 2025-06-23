package Week1.adapterPatternExample;

public class StripeAdapter implements PaymentProcessor {
	private Stripe stripe;
	
	public StripeAdapter(Stripe stripe) {
		this.stripe = stripe;
	}
	
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		stripe.makePayment(amount);
	}

}
