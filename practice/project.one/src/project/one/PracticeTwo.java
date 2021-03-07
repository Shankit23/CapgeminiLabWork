package project.one;
import java.util.*;
public class PracticeTwo {
	private String[] sortStrings(String []arr) {
		Arrays.sort(arr);
		if(arr.length/2==0) {
			for(int i=0;i<arr.length/2;i++) {
				arr[i].toUpperCase();
			}
			for(int i=arr.length/2;i<arr.length;i++)
				arr[i].toLowerCase();
		}
		return arr;
	}
public static void main(String[] args){
	System.out.println("Enter the number of string objects");
	Scanner scanner = new Scanner(System.in);
	int length=scanner.nextInt();
	String[] strArray = new String[length];
	for(int i=0;i<length;i++) {
		strArray[i]=scanner.nextLine();}
	scanner.close();
		PracticeTwo obj= new PracticeTwo();
		String A[]=obj.sortStrings(strArray);
		System.out.println("Sorted String is "+Arrays.toString(A));
	
}
}
