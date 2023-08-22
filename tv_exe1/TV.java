package tv_exe1;

public class TV {

	// Data
	private int channel;
	
	private int volumeLevel;
	
	private boolean on;

	// 0-argument constructor
	public TV()
	{
		this.on = false;   // default value
		this.channel = 1;
		this.volumeLevel = 1;
	}
	
	// method
	public void turnOn()
	{
		this.on = true;
	}
	
	public void turnOff()
	{
		this.on = false;
	}
	
	public void setChannel(int channel)
	{
		if (this.on && channel > 0 && channel <= 120)
		{
				this.channel = channel;
		}
	}
	
	public void setVolumeLevel(int volumeLevel)
	{
		if (this.on && volumeLevel > 0 && volumeLevel <=7)
		{
				this.volumeLevel = volumeLevel;
		}
	}
	
	public void channelUp()
	{
		if (this.on && this.channel < 120)
		{
			this.channel++;
		}
	}
	
	public void channelDown()
	{
		if (this.on && this.channel > 1)
		{
			this.channel--;
		}
	}
	
	public void volumelUp()
	{
		if (this.on && this.volumeLevel<7)
		{
			this.volumeLevel++;
		}
	}
	
	public void volumeDown()
	{
		if (this.volumeLevel>1)
		{
			this.volumeLevel--;
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

//	public void setVolumeLevel(int volumeLevel) {
//		this.volumeLevel = volumeLevel;
//	}

	public int getChannel() {
		return channel;
	}
}
