package inheritanceProtected;

import java.util.Arrays;

public class SortRectangle {

	public static void main(String[] args) {
		
		Rectangle[] SortRec=new Rectangle[3];
		Rectangle r1=new Rectangle(5.5,3.5);
		SortRec[0]=r1;
		
		Rectangle r2=new Rectangle(2.5,2.9);
		SortRec[1]=r2;
		
		Rectangle r3=new Rectangle(3.1,2.9);
		SortRec[2]=r3;
		
		Arrays.sort(SortRec);
		
		for(Rectangle rec:SortRec) {
			System.out.println(rec.toString());
		}
		
//		for(int i=0;i<2;i++)
//		{
//			System.out.println("R"+(i+1)+" info :"+SortRec[i].toString());
//			System.out.println();
//		}
		
	}

}
