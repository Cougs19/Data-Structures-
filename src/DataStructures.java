
import java.util.*;

public class DataStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Data Structures!");
		
		// Arrays
		int [] Numbers = new int [5]; //array with fixed size
		
		//get user input
		Scanner in = new Scanner(System.in);
		
		//System.out.println("Enter a number:");
		
		//loop through the size of the array numbers
		for(int i = 0; i < Numbers.length;i++) {
			System.out.println("Enter a number: "); 
			Numbers[i] = in.nextInt();
		}
		
		//output the result
		for (int i = 0; i < Numbers.length; i++) {
			System.out.println(Numbers[i]+" ");
		}
		
		in.close();
	}

}
