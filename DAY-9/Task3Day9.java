package day1;
import java.util.Arrays;
import java.util.Scanner;

public class Task3Day9 {
	    public static void main(String[] args) {
	    	int arr[]= {1,2,3,4,4,4,5,6};
	    	System.out.println(Arrays.toString(arr));
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter the target value:");
	    	int target=s.nextInt();
	    	int left=0;
	    	int right=arr.length;
	    	
	    	while(left<right) {
	    		int mid=(left+right)/2;
	    		if(arr[mid]<target) {
	    			left=mid+1;
	    		}
	    		else {
	    			right=mid;
	    		}
	    	}
	    	
	    	int lowerbound=left;
	    	left=0;
	    	right=arr.length;
	    	
	    while(left<right) {
	    	int mid=(left+right)/2;
    		if(arr[mid]<=target) {
    			left=mid+1;
    		}
    		else {
    			right=mid;;
    		}
    	}
    	int upperbound=left;
    	
	    int count=upperbound-lowerbound;
	    System.out.println("Count="+count);
    
	    } 
	    }
