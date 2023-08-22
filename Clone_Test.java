
public class Clone_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=10;
		
		String s1=new String("Hi"); // object
		String s2=new String("Hi");
		
		System.out.println("x==y is "+(x==y));
		System.out.println("s1==s2 is "+(s1==s2)); // object နှစ်ခုကို == နဲ့ စစ်ရင် နေရာ ကိုစစ်
		System.out.println("s1==s2 is "+(s1.equals(s2))); // အထဲက content ကိုစစ်
	}

}
