# python begins from the top.

print("The for loop:")		
for k in range(1,6):#  k is initiated as a temporary variable for each element in range(1,6) [1,2,3,4,5]
	raw_input("")
	print("\tsay "+str(k)) # The repeated action is tabbed in below the loop declaration 
#end for
raw_input("Press enter to continue...")
print("	The while loop:")


k = 0			# Here we create the variable k before the loop (it belongs to the main method) 
while(k < 5):
	raw_input("")
	print("\toh "+str(k))# Again we have an action repeated
	k+=1
#end while
raw_input("Press enter to continue...")
print("Recursion:")


def recPrint(n):# Here we define the recrsive method
	raw_input("")
	print("\tk? "+str(n))
	if(n>0):
		recPrint(n-1)
	#end if
#end recPrint
recPrint(5)			#And here we use the recursive method.

raw_input("Press enter to continue...")
print("You have now seen the 3 fundemental kinds of loops.")
