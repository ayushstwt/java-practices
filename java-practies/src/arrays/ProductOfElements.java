package arrays;

import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value of "+i+" Element: ");
            arr[i]=scanner.nextInt();
        }
        long product=1;
        for (int i = 0; i < arr.length; i++) {
            product*=arr[i];
        }
        System.out.println(product);
    }
}
