package day1;
import java.util.Arrays;
import java.util.Scanner;

public class Task2Day9 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 4, 9};
        Arrays.sort(arr); 
        System.out.println("Sorted array: " + Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        int index = findUpperBound(arr, target);

        if (index < arr.length) {
            System.out.println(" at index " + index);
        } else {
            System.out.println("No upper bound found for ");
        }

        scanner.close();
    }
    public static int findUpperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
