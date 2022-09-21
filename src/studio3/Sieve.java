package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		// n is the size of the array
		int n = scan.nextInt();
		System.out.println("total numbers " + n);
		int input = 0;
		
		int [] array = new int [n];
		
		for (int i = 0; i < array.length; i++){
			
			//input = scan.nextInt();
			array [i] = input;
		
			//System.out.println(array[i]);
			input++;
			
		for(int search = 2; search < array.length; search++) {
			
			if(array[i] % search == 0 && (search != array[i]) || (array[i] == 1)){
				
				array[i]= 0;
								
				
			} 
				
			
		}
		
		if(array[i] != 0) {
			
			System.out.println(array[i]);
			
			
		}
		
		
		
		
			
			
		
			
		
		
		
		}
		

	}

}
