package Lab1;
import java.util.*;
public class Exercise1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number=sc.nextInt();
        Sum(number);
	}
     static void Sum(int n) {
    	 int sum=0;
 		while(n>0){
			int x=n%10;
			sum=sum+(x*x*x);
			n=n/10;
		}
 		System.out.println("Sum of the cubes of the digits of your number: "+sum);
     }
}
