package firstJavaProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class firstJavaClass {

	public static int husbandAge, wifeAge;
	public static String husbandName, wifeName;;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is the age and name of husband and wife?"); //how to print out to the screen
		husbandAge = Integer.parseInt(read.readLine()); //read husband age and name
		husbandName = read.readLine();
		wifeAge = Integer.parseInt(read.readLine());//read wife age and name
		wifeName = read.readLine();
		System.out.println("all input values are "+husbandAge+" "+husbandName+" "+wifeAge+" "+wifeName);//print hus and wife age and name
				
		int totalage = totalAge(husbandAge,wifeAge);//from method1 calculate total of both ages
		System.out.println("sum of ages "+totalage);
		System.out.println("another sum of age "+totalAge(husbandAge,wifeAge));
		
		multiplyBothAges(husbandAge,wifeAge); // from method2 if the class was a static void (there is no return)
		
		firstJavaClass obj = new firstJavaClass();//from method 3 to call the method which does not have static
		obj .multiplyAgeAgain(husbandAge, wifeAge);
		
		secondJavaClass obj2 = new secondJavaClass(); //from the second class make an object and call the method
		System.out.println("add the characters from the two names "+obj2.addNumberOfCharacters(husbandName, wifeName));
		
		ArrayList<String> names = new ArrayList<String>();//create new array object
		names.add(husbandName);//put in husband and wifes names in to the array
		names.add(wifeName);

		//read out from the array
		Iterator<String> itr = names.iterator(); 
		while (itr.hasNext()) {//while there is something to read (not empty) from the array
			System.out.println("print from the array "+itr.next());//print out from the array
		}
		
	}//end main method
	
	//method1
	public static int totalAge(int a, int b) {	//no void so therefore returns a value back from the class
		 return a+b;		
	}
	
	//method2
	public static void multiplyBothAges(int a, int b) {//has void so must do all actions, but this is use of more memory
		System.out.println("multiplication of ages "+ a * b);
	}
	
	//method3
	public void multiplyAgeAgain(int a, int b) { //method which is not static
		System.out.println("multiply again the ages "+ a * b);
	}
	
} // end class
