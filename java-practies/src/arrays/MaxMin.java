package arrays;

public class MaxMin {
    public static void main(String[] args) {
        // Test case 1: Positive integers
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println("Test Case 1:");
        System.out.println("Array: {10, 20, 30, 40, 50}");
        System.out.println("Max Element: " + maxElement(arr1)); // Expected: 50
        System.out.println("Min Element: " + minElement(arr1)); // Expected: 10
        System.out.println();

        // Test case 2: Negative integers
        int[] arr2 = {-10, -20, -30, -40, -5};
        System.out.println("Test Case 2:");
        System.out.println("Array: {-10, -20, -30, -40, -5}");
        System.out.println("Max Element: " + maxElement(arr2)); // Expected: -5
        System.out.println("Min Element: " + minElement(arr2)); // Expected: -40
        System.out.println();

        // Test case 3: Mixed positive and negative integers
        int[] arr3 = {-10, 0, 20, -5, 15};
        System.out.println("Test Case 3:");
        System.out.println("Array: {-10, 0, 20, -5, 15}");
        System.out.println("Max Element: " + maxElement(arr3)); // Expected: 20
        System.out.println("Min Element: " + minElement(arr3)); // Expected: -10
        System.out.println();

        // Test case 4: Single element
        int[] arr4 = {42};
        System.out.println("Test Case 4:");
        System.out.println("Array: {42}");
        System.out.println("Max Element: " + maxElement(arr4)); // Expected: 42
        System.out.println("Min Element: " + minElement(arr4)); // Expected: 42
        System.out.println();

        // Test case 5: All elements are the same
        int[] arr5 = {7, 7, 7, 7, 7};
        System.out.println("Test Case 5:");
        System.out.println("Array: {7, 7, 7, 7, 7}");
        System.out.println("Max Element: " + maxElement(arr5)); // Expected: 7
        System.out.println("Min Element: " + minElement(arr5)); // Expected: 7
    }
    // O(n)
    public static int maxElement(int arr[])
    {
        int largest=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (largest<arr[i])
            {
                largest=arr[i];
            }
        }
        return largest;
    }

    public static int minElement(int arr[])
    {
        int smallest=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (smallest>arr[i])
            {
                smallest=arr[i];
            }
        }
        return smallest;
    }
}
