package day1;
import java.util.Arrays;
import java.util.Scanner;


public class MainPro9 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = {5, 2, 8, 6,6, 3,3};
	        Arrays.sort(arr);  
	        System.out.println("Sorted array: " + Arrays.toString(arr));
	        System.out.print("Enter a number to find its rank: ");
	        int key = sc.nextInt();
	        int low = 0, high = arr.length;
	        int lowerBound = 0;
	        while (low < high) {
	            int mid = (low + high) / 2;
	            if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid;
	            }
	        }
	        lowerBound = low;
	        low = 0;
	        high = arr.length;
	        int upperBound = 0;
	        while (low < high) {
	            int mid = (low + high) / 2;
	            if (arr[mid] <= key) {
	                low = mid + 1;
	            } else {
	                high = mid;
	            }
	        }
	        upperBound = low;
	        System.out.println("Lower Bound index: " + lowerBound);
	        System.out.println("Upper Bound index: " + upperBound);
	        System.out.println("Rank of " + key + " is: " + upperBound);
	    }
}
