package day1;
import java.util.Arrays;
import java.util.Scanner;

public class Task1Day7 {
	
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num=s.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=s.nextInt();
			
		}
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	

}
