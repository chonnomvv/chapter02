package com.javaex.ex05;

public class Tv {

	private boolean power;
	private int channel;
	private int volume;
	public Tv() {}
	
	public Tv(int channel, int volume, boolean power) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}
	
	public void power(boolean on) {
//		this.power = on;
		if (on == true) {
			this.power = true;
		} else {
			this.power = false;
		}
	}

	public void channel(int channel) {
		if (channel < 255 && channel > 1) {
			this.channel = channel;
		}
	}

	public void channel(boolean up) {
		if (channel < 255 && channel > 1) {
			if (up == true) {
				channel++;
			} else {
				channel += 0;
			}
		}
	}

	public void volume(int volume) {
		if (volume < 100 && volume > 0) {
			this.volume = volume;
		}
	}
	
	public void volume(boolean up) {
		if (volume < 100 && volume > 0) {
			if (up == true) {
				volume++;
			} else {
				volume --;
			}
			
		}
	}

	public boolean isPower() {
		return power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public void status() {

		System.out.println(channel + ", " + volume + ", " + power);

	}

}
