package Week1.DataStructures;

public class FinancialForecast {
	
	// Recursive method to calculate future value
    public static double futureValue(double currentValue, double growthRate, int years) {
        // Base case: if no years left, return current value
        if (years == 0) {
            return currentValue;
        }

        // Recursive step: calculate for next year
        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double initialAmount = 1000;
        double growthRate = 0.10;  // 10%
        int years = 5;

        double predictedValue = futureValue(initialAmount, growthRate, years);
        System.out.println("Predicted value after " + years + " years: ₹" + predictedValue);

		
	}

}
