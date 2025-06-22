import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FinancialForecaster forecaster = new FinancialForecaster();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current value: ");
        double currentValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (as decimal, e.g. 0.05 for 5%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // Recursive solution
        double futureValueRecursive = forecaster.calculateFutureValue(currentValue, growthRate, years);
        System.out.printf("Future Value (Recursive): %.2f%n", futureValueRecursive);

        // Optimized recursive solution
        double futureValueOptimized = forecaster.calculateFutureValueOptimized(currentValue, growthRate, years);
        System.out.printf("Future Value (Optimized): %.2f%n", futureValueOptimized);

        scanner.close();
    }
}