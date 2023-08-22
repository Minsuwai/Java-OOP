/*
 * Page 803
 *  Write a program that creates an ArrayList of pets. An item in the list is either a
Dog or a Cat. For each pet, enter its name and type (‘c’ for cat and ‘d’ for
dog). Stop the input when the string STOP is entered for the name. After the
input is complete, output the name and type for each pet in the list
 */

package animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		
		ArrayList<Pet> animalList = new ArrayList<Pet>();
//		int i=0;
		
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(System.in);
		
		String petName = " ";
		char type;
		
		System.out.println("Enter Pet Name");
		petName = scan.nextLine();
		
		while(!petName.equals("STOP"))
		{
			System.out.println("Enter Pet Type('c' for cat and 'd' for dog) : ");
			type = scan.next().charAt(0); // to get character type
			
			if (type == 'c')
				animalList.add(new Cat(petName));
			
			else if(type == 'd')
				animalList.add(new Dog(petName));
			
			System.out.println("Enter Pet Name");
			petName = scan.nextLine();
			
		}
		
		/*
		 *  Repeat Exercise 4, but this time group the output by printing out the names
of all cats first and then the names of all dogs.
		 */
		
		System.out.println("Cats :");
		
		for(int i=0; i<animalList.size(); i++) {
			
			if (animalList.get(i) instanceof Cat)
				System.out.println(animalList.get(i).getName());
			
		}
		
		for(int j=0; j<animalList.size(); j++) {
			
			if (animalList.get(j) instanceof Dog)
				System.out.println(animalList.get(j).getName());
			
		}

	}

}
