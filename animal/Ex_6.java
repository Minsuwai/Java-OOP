package animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		
		ArrayList<Pet> animalList = new ArrayList<Pet>();
//		int i=0;
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		
		String petName = " ";
		String color="";
		char type;
		double weight;
		
		System.out.println("Enter Pet Name");
		petName = scan1.nextLine();
		
		while(!petName.equals("STOP"))
		{
			System.out.println("Enter Pet Type('c' for cat and 'd' for dog) : ");
			type = scan2.next().charAt(0); // to get character type
			
			if (type == 'c') {
				System.out.println("Enter color coat");
				color = scan2.next();
				animalList.add(new Cat(petName,color));
			}
				
			
			else if(type == 'd') {
				System.out.println("Enter weight");
				weight = scan2.nextDouble();
				animalList.add(new Dog(petName,weight));
			}
				
			
			System.out.println("Enter Pet Name");
			petName = scan1.nextLine();
			
		}
		
		/*
		 *  Repeat Exercise 4, but this time group the output by printing out the names
of all cats first and then the names of all dogs.
		 */
		
		System.out.println("Cats :");
		
		for(int i=0; i<animalList.size(); i++) {
			
			if (animalList.get(i) instanceof Cat)
				System.out.println(animalList.get(i).toString());
				
		}
		
		for(int j=0; j<animalList.size(); j++) {
			
			if (animalList.get(j) instanceof Dog)
				System.out.println(animalList.get(j).toString());
			
		}

	}

}
