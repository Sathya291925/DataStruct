package day1;
import java.util.Scanner;

public class MinMax {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a=s.nextInt();
		System.out.println("enter" +a+ "elements");
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=s.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<a;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		if(arr[i]<min) {
			min=arr[i];
		}
	}
		System.out.println("maximum:" +max);
		System.out.println("minimum:" +min);
	}
	
	

}
