public class Looping{//First all the object files of the project are compiled,
	public static void main(String[] args) {// next execution starts from the top of main.
		
		
		System.out.println("The for loop:");		
		for(int k = 0; k <= 5 ; k++){	 	//  Variable initiated is k; condition, k<5 ; action increase k by 1
			pressAnyKeyToContinue(false);
			System.out.println("\tsay "+k); // The repeated action is encapsulated by {Curly Brackets} 
		}//end for
		
		pressAnyKeyToContinue(true);
		System.out.println("	The while loop:");
		
		
		int k = 0;						 	// Here we create the variable k before the loop (it belongs to the main method) 
		while(k < 5){
			pressAnyKeyToContinue(false);
			System.out.println("	oh "+k);// Again we have an action repeated
			k++;
		}//end while
		
		pressAnyKeyToContinue(true);
		System.out.println("Recursion:");
		
		
		recPrint(5);						// For recursive solutions we must define a method outside of main.
		
		pressAnyKeyToContinue(true);
		System.out.println("You have now seen the 3 fundemental kinds of loops.");
	}//end main
	
	static void recPrint(int n){			// n represents a variable passed to the method recPrint ... (5)
		pressAnyKeyToContinue(false);
		System.out.println("	k? "+n);
		if(n>0){
			recPrint(n-1);
		}//end if
	}//end recPrint
	
	 static void pressAnyKeyToContinue(boolean pr) 	// This is just a little piece of helper code
	 {												//Notice the {} and indentation. This syntax 
		 	if(pr){System.out.println("Press any key to continue...");}
	        try										//Try the code in the {} block
	        {
	            System.in.read();
	        }  
	        catch(Exception e)
	        {} 										//Handle the exception (Here we do nothing if an error occurs)
	 }//end PressAnyKeyToContinue
}// end Looping
