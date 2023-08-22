package animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		
		ArrayList<Pet> animalList = new ArrayList<Pet>();
//		int i=0;
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		ArrayList<Cat> catList = new ArrayList<Cat>();
		
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
		
		
		
		
		// Display Cat List
		System.out.println("Cats :");
		
		for(int i=0; i<animalList.size(); i++) {
			
			if (animalList.get(i) instanceof Cat)
				System.out.println(animalList.get(i).toString());
				
		}
		
		// Display Dog List
		System.out.println("Dogs :");
		
		for(int j=0; j<animalList.size(); j++) {
			
			if (animalList.get(j) instanceof Dog)
				System.out.println(animalList.get(j).toString());
			
		}
		
		// create separate List
		for(int i=0; i<animalList.size(); i++) {
			
			if(animalList.get(i) instanceof Dog)
				dogList.add((Dog)animalList.get(i)); // (Dog) is typecasting
			else
				catList.add((Cat)animalList.get(i));
		}
		
/*		// EX-12 - Find avg max and min weight 
		double totalWeight = 0.0, avgWeight = 0.0;
		double maxWeight = dogList.get(0).getWeight();
		double minWeight = dogList.get(0).getWeight();
		
		for(int i=1; i<dogList.size(); i++) {
			
			totalWeight+= dogList.get(i).getWeight();
			
			if(dogList.get(i).getWeight()>maxWeight)
				maxWeight = dogList.get(i).getWeight();
			
			else if(dogList.get(i).getWeight()<minWeight)
				minWeight = dogList.get(i).getWeight();
		}
		
		System.out.println("Average weight for dog :" + totalWeight/dogList.size());
		System.out.println("Maximum weight for dog :" + maxWeight);
		System.out.println("Minmum weight for dog :" + minWeight);

	 */
	//---------------------------------------------------------------------
	
	// Ex-13 
		/*
		 * 	ADD 
			request data (add)
			
			Remove
			request Name (Name)
			
			Quit
			Exit the program
		 */
		
		System.out.println("1. Add Cat");
		System.out.println("2. Add Dog");
		System.out.println("3. Remove Cat");
		System.out.println("4. Remove Dog");
		System.out.println("0. Quit");
	
	}

}

