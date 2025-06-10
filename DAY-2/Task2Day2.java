package day1;
import java.util.Scanner;
import java.util.Arrays;

public class Task2Day2 extends Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        
        int gr=array[0];
        int sl=array.length-1;
        while(gr<sl) {
        	int temp=array[sl];
        	array[sl]=array[0];
        	array[0]=temp;
        	gr++;
        	sl--;

    }
        System.out.println(Arrays.toString(array));
}
   
}
