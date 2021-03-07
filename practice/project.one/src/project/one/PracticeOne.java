package project.one;
import java.util.*;
public class PracticeOne {
	private int getSecondSmallest(int []arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		return arr[1];
	}

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the length for an array");
	int length=scanner.nextInt();
	int array[]=new int[length];
    System.out.println("enter the array elements");
    for(int i=0;i<length;i++){
    	array[i]=scanner.nextInt();
    }
    scanner.close();
    PracticeOne one = new PracticeOne();
    System.out.println("Second Smallest in the array is "+one.getSecondSmallest(array));
	}

}
