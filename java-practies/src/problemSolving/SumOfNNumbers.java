package problemSolving;

public class SumOfNNumbers {
    public static void main(String[] args) {
        try {
            System.out.println("Test Case 1: Positive Number");
            int result1 = sumOfNNumber(5);
            System.out.println("Input: 5, Output: " + result1 + ", Expected: 15\n");

            System.out.println("Test Case 2: Zero");
            int result2 = sumOfNNumber(0);
            System.out.println("Input: 0, Output: " + result2 + ", Expected: 0\n");

            System.out.println("Test Case 3: One");
            int result3 = sumOfNNumber(1);
            System.out.println("Input: 1, Output: " + result3 + ", Expected: 1\n");

            System.out.println("Test Case 4: Large Number");
            int result4 = sumOfNNumber(1000);
            System.out.println("Input: 1000, Output: " + result4 + ", Expected: 500500\n");

            System.out.println("Test Case 5: Negative Number");
            try {
                int result5 = sumOfNNumber(-5);
                System.out.println("Input: -5, Output: " + result5 + ", Expected: Exception\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Input: -5, Output: Exception, Message: " + e.getMessage() + "\n");
            }

            System.out.println("Test Case 6: Very Large Number");
            try {
                int result6 = sumOfNNumber(Integer.MAX_VALUE / 2);
                System.out.println("Input: " + (Integer.MAX_VALUE / 2) + ", Output: " + result6 + ", Expected: Valid Sum\n");
            } catch (ArithmeticException e) {
                System.out.println("Input: " + (Integer.MAX_VALUE / 2) + ", Output: Overflow, Message: " + e.getMessage() + "\n");
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    // optimized O(1)
    public static int sumOfNNumbers(int n) {
        return n*(n+1)/2;
    }

    // better one O(n)
    public static int sumOfNNumber(int n) {
        int sum=0;
        for (int i=0;i<n;i++)
        {
            sum+=i;
        }
        return sum;
    }

    // brute force O(n^2)
    public static int sumOfNumber(int n) {
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            for (int j=1;j<=i;j++)
            {
                sum++;
            }
        }
        return sum;
    }
}
