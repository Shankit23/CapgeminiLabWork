package lab.two;
import java.util.*;
public class ExerciseTwo {
     static void sortStrings() {
    	 Scanner scanner= new Scanner(System.in);
    	 System.out.print("Enter Number of Strings: ");
    	 int size = scanner.nextInt();
    	 String[] arr= new String[size];
    	 for(int i=0;i<size;i++) {
    		 System.out.print("Enter "+(i+1)+"Strings:  ");
    		 arr[i]=scanner.next();
    	 }
    	 sortArray(arr);
    	 scanner.close();
     }
     static void sortArray(String[] arr) {
    	 String t;
    	 for(int i=0;i<(arr.length-1);i++) {
    		 for(int j=i+1;j<arr.length;j++) {
    			 if(arr[i].compareTo(arr[j])>0) {
    				 t=arr[i];
    				 arr[i]=arr[j];
    				 arr[j]=t;
    			 }
    		 }
    	 }
    	 convertCase(arr);
     }
     static void convertCase(String[] arr) {
    	 int size=arr.length;
    	 String[] result = new String[size];
    	 if(size%2==0) {
    		 for(int i=0;i<size/2;i++) {
    			 result[i]=arr[i].toUpperCase();
    		 }
    		 for(int j=(size/2);j<size;j++) {
    			 result[j]=arr[j].toLowerCase();
    		 }
    	 }
    	 else {
    		 for(int i=0;i<((size/2)+1);i++) {
    			 result[i]=arr[i].toUpperCase();
    		 }
    		 for(int j=((size/2)+1);j<size;j++) {
    			 result[j]=arr[j].toLowerCase();
    		 }
    	 }
    	 showResult(result);
     }
     static void showResult(String[] arr) {
    	 for(int i=0;i<arr.length;i++) {
    		 System.out.print(arr[i]+"");
    	 }
     }
     public static void main(String [] args) {
    	 sortStrings();
     }
	    
}

