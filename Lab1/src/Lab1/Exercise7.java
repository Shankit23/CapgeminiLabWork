package Lab1;
import java.util.*;
public class Exercise7 {
	static boolean checkNumber(int n){
		boolean res=false;
		int a,c;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=n%10;
			if(c<=a) {
				res=true;
			}
			else {
				res=false;
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		System.out.print("Result: "+checkNumber(x));

	}

}
