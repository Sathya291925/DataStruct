package day1;
import java.util.Arrays;
import java.util.Scanner;

public class Task1Day8 {
	public static void main(String []args) {
	int a[]= {1,3,5,7,4,8};
	Scanner s=new Scanner(System.in);
	System.out.println(Arrays.toString(a));
	System.out.println("Enter a value to find");
	int find=s.nextInt();
	boolean flag=false;
	for(int i=0;i<a.length;i++) {
		if(find==a[i]) {
			System.out.println(i);
			flag=true;
		    break;
		
		}	
	}   
	if(!flag)
	
	System.out.println("Value not found");
		
	}
}


