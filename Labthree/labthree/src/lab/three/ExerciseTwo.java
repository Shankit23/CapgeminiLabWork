//Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .
package lab.three;
import java.util.*;
public class ExerciseTwo {
	public String getImage(String s) {
		StringBuffer stb= new StringBuffer(s);
		stb.append('|');
	    StringBuffer sbr= new StringBuffer(s);
	    sbr.reverse();
	    stb.append(sbr);
	    return stb.toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExerciseTwo object = new ExerciseTwo();
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		String string=scanner.next();
		scanner.close();
		String str=object.getImage(string);
		System.out.println("Mirror Image is "+str);

	}

}
