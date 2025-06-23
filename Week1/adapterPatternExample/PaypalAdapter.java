package Week1.adapterPatternExample;

public class PaypalAdapter implements PaymentProcessor {
	private Paypal paypal;
	
	public PaypalAdapter(Paypal paypal) {
		this.paypal = paypal;
	}
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		paypal.sendMoney(amount);
	}

}
