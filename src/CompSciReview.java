/* David Casarrubias-Mena
 * In this program I prompt the user for 5 numbers and then print out the largest and smallest number entered by the user. 
 */
import java.util.*;
public class CompSciReview {
	
	
	
	public static void main(String [] args){
		CompSciReview cs = new CompSciReview();
		cs.largestAndSmallest();
	}
	public void largestAndSmallest(){
		Scanner input = new Scanner(System.in);
		double number;
		double largest = 0;
		double smallest = 0;
		double times = 5;
		
		for(int i = 0; i < times; i++){
			System.out.println("Enter number: ");
			number = input.nextDouble();
			 if (number > largest){
				largest = number;
			}
			 else if(number < smallest){
				 smallest = number;
			 }
			
			
		}
		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number " + smallest);
		}
		
		
}

	

