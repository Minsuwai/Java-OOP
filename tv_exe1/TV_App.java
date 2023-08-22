package tv_exe1;

public class TV_App {

	public static void main(String[] args) {
		
		TV t1 = new TV();
		
		System.out.println("Channel = " + t1.getChannel());
		System.out.println("Volume = " + t1.getVolumeLevel());
		
		t1.turnOn();
		t1.channelDown();
		
		System.out.println("Channel = " + t1.getChannel());
		
		t1.volumelUp();
		System.out.println("Volume = " + t1.getVolumeLevel());
		
		t1.channelUp();
		t1.channelUp();
		System.out.println("Channel = " + t1.getChannel());

	}

}
