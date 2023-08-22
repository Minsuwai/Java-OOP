package animal;

public class Animal_App {

	public static void main(String[] args) {
		
		
		
		Pet myDog = new Dog();
		myDog.setName("browny");
		
		Pet myCat = new Cat();
		myCat.setName("kitty");
		
		System.out.println(myDog.getName()+" says:");
		System.out.println(myDog.speak());
		System.out.println(((Dog)myDog).fetch()); // type cast
		
		System.out.println(myCat.getName()+" says:");
		System.out.println(myCat.speak());
		//System.out.println(myCat.fetch());

	}

}
