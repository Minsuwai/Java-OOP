package exe9_6;

public class StopWatchApp {
	
	public static void main(String[] args) {
		
		StopWatch st = new StopWatch();
		
		st.start();
		long sum=0;
		for(long i=1; i<100000000; i++) {
			sum+=i;
		}
		
		System.out.println("Sum = "+ sum);
		
		st.stop();
		
		System.out.println("Elapse Time = " + st.getElapsedTime() + "milliseconds");
	}
}
