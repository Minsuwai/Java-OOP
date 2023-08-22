package exe9_8;

public class FanApp {

	public static void main(String[] args) {
		
		Fan fan_1= new Fan();
		
		fan_1.setSpeed(3);
		fan_1.setRadius(10);
		fan_1.setColor("yellow");
		
		fan_1.setOn(true);
		
		Fan fan_2 = new Fan();
		
		fan_2.setSpeed(2);
		fan_2.setRadius(5);
		fan_2.setColor("blue");
		
		fan_2.setOn(false);
		
		
		
		System.out.println(fan_1.toString());
		
		System.out.println(fan_2.toString());

	}

}
