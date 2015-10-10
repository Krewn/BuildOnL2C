
public class Conditional {

	public static void main(String[] args) {
		if(true){// The enclosed code executes  
			System.out.println("If yes?");
		}// end if
		if(false){// Code enclosed in a if(false){*enclosed code*} does not run.
			System.out.println("If no?");
		}else{
			System.out.println("no? else what?");//This line always executes
		}// end else
		
		boolean t = true; // boolean variables can hold logical values (true and false)
		boolean f = false;
		if(t || f){ // In java the or operation is made as shown.
			System.out.println("T or F -> T");
		}
		if(t && f){
			System.out.println("T and F -> F");
		}else{
			System.out.println("T and F -> F");
		}
		//We can also use the not operation !
		if(!f){
			System.out.println("!F -> T");
		}
		//a few more examples
		if( !(f || f) && t){
			System.out.println("not(F or F) and T -> T");
		}
		if( (t || f) || !(t && t)){
			System.out.println("(T or F) or not(T and T) -> T");
		} 
		// Another brand of conditional is the switch:
		int i=4;
		switch(i){//start ex1
		case(0):
			System.out.println("i is 0");
		break;
		case(1):
			System.out.println("i is 1");
		break;
		case(2):
			System.out.println("i is 2");
		break;
		case(3):
			System.out.println("i is 3");
		break;
		}//end ex1
		
		if(i==0){//start ex2
			System.out.println("i is 0");
		}else if(i == 1){
			System.out.println("i is 1");
		}else if(i == 2){
			System.out.println("i is 2");
		}else if(i == 3){
			System.out.println("i is 3");
		}//end ex2
		// ex 1 and ex 2 are effectivly equililent.

	}// end main
	
	static void pressAnyKeyToContinue(boolean pr) 	// This is just a little piece of helper code
	{	if(pr){System.out.println("Press any key to continue...");}
	 	try{System.in.read();}catch(Exception e){}
	}//end PressAnyKeyToContinue

}//end Conditional