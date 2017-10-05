package Parttenofabc;
import java.util.Scanner;
//import : we use import keyword to access the packages.
//java.util.scanner : util is readymade package under the main package Java,so we import a pacakge 
//when we need to use some classes belonging to that pacakge in current program
public class Partten {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	public static void main(String[] args) {
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		// TODO Auto-generated method stub
		int j;
		 Scanner sc=new Scanner(System.in);
		//to scan values which we initialize
		 System.out.print("Enter N:\n");
		//system : system is a class in java language.lang package
		//out : out is the static member of system class.It's type PrintStream
		//println: which is used to print the output.
	    //Inside the brackets is value which to be printed	
		 int n=sc.nextInt();
			//scans next token of the input as int
			 for(int i=1;i<=n;i++)
			{
				for (j=1;j<=(n+1)-i;j++)
					System.out.print(" ");
				for(j=1;j<=2*i-1;j++)
					if(j<=i)
						 System.out.print((char)(char)(j+54)+" ");//for printing values parallely
				//looking into ASCII code and convert them into given alphabets
			else
				System.out.print((char)(char)(2*i-j+54)+" ");//
				System.out.println();
				//system : system is a class in java language.lang package
				//out : out is the static member of system class.It's type PrintStream
				//println: which is used to print the output.

							}
			 for(int i=n-1;i>=1;i--)
				{
			for (j=1;j<=(n+1)-i;j++)
			   System.out.print(" ");
			for(j=1;j<=2*i-1;j++)//here it will take the value and jumps into the next line		
			   if(j<=i)
			      System.out.print((char)(char)(j+54)+" ");
						else
					
							System.out.print((char)(char)(2*i-j+54)+" ");
						System.out.println();
						//system : system is a class in java language.lang package
						//out : out is the static member of system class.It's type PrintStream
						//println: which is used to print the output.

				}
				
	}

}
