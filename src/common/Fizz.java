package common;

public class Fizz {
	
	public static void main(String[] args){
	
		//Multiplos de 3 Fizz , 5 Buzz y ambos FizzBuzz
		
		for(int i = 0; i <= 1000; i++) {
			
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz");
			
			else if(i % 3 == 0)
				System.out.println("Fizz");
			
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i + " ");
		}
	}
}
