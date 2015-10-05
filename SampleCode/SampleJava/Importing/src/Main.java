import Ex1Pack.ClassToBeImportred;

import Ex1Pack.ClassToBeImportred; // This line imports the class "ClassToBeImported"
public class Main {
	public static void main(String[] args) {
		ClassToBeImportred arbitray_Variable_Name; 		   // Gives the class a variable called MemberVariable  (declaration)
		arbitray_Variable_Name = new ClassToBeImportred(); // Runs the constructor populating the variable. (instantiation)
		arbitray_Variable_Name.PrintMessage();             // Runs the method PrintMessage
	}
}
