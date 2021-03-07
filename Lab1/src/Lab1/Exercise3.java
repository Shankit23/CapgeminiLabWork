package Lab1;
import java.util.*;
public class Exercise3 {
	static int a=1,b=0,c;
	static void nonRecursion(int n) {
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
	}
	static void recursion(int n) {
		if(n>=0)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c);
			recursion (n-1);
		}
	}
	public static void main(String ar[]) {
		System.out.println("1 for Non-Recursion");
		System.out.println("2 for Recursion");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Selection=");
		int sel= s.nextInt();
		System.out.print("Enter Sizes: ");
		int size=s.nextInt();
		if(sel==1) {
			nonRecursion(size);
		}
		else if(sel==2) {
			recursion(size-2);
		}
	}

}
