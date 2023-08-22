package interface_example;

import java.util.Arrays;

public class SortInteger {

	public static void main(String[] args) {
		//int [] intArr = new int[5];
		int [] intArr= {23,78,15,34,90,67,89};
		Arrays.sort(intArr);
		for(int a:intArr) {
			System.out.println(a);
		}

	}

}
