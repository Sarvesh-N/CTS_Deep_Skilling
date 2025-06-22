import java.util.HashMap;

public class FinancialForecaster {

    // Basic Recursive Method
    public double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized Recursive with Memoization
    private HashMap<Integer, Double> memo = new HashMap<>();

    public double calculateFutureValueOptimized(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double previous = calculateFutureValueOptimized(currentValue, growthRate, years - 1);
        double result = previous * (1 + growthRate);
        memo.put(years, result);
        return result;
    }
}