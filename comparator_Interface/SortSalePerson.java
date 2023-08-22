package comparator_Interface;

import java.util.Arrays;

public class SortSalePerson {

	public static void main(String[] args) {
		
		SalePerson[] s= new SalePerson[3];
		s[0] = new SalePerson("Ko Thura Aung", 34, 2500,1000);
		s[1] = new SalePerson("Ko Hla Myo", 30, 3000,1500);
		s[2] = new SalePerson("Ma Yu Yu", 29, 2300,900);
		
		Arrays.sort(s);
		System.out.println("Sort by Wages:");
		for(SalePerson sale:s) {
			System.out.println(sale.toString());
		}
		
		System.out.println("Sort by Name:");
		Arrays.sort(s, new SortPersonByName());
		for(SalePerson sale:s) {
			System.out.println(sale.toString());
		}
		
		System.out.println("Sort by Age:");
		Arrays.sort(s, new SortPersonByAge());
		for(SalePerson sale:s) {
			System.out.println(sale.toString());
		}

	}

}
