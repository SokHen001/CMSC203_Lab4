import java.util.Scanner;

/** 
*The purpose of this class is to model a television
*Sokha Heng 09/28/21
*/

public class Television {
	
	//#3 Declare 2 required constant fields
	//declare string type to hold brand name
	private String MANUFACTURER;  
	//declare int type to hold size of the TV screen
	private int SCREEN_SIZE;
			
	//#4 Declare 3 required fields
	//declare boolean type to turn on and off TV
	private boolean powerOn;
	//declare int type to represent which channel
	//TV is Showing
	private int channel;
	//declare int type to represent the TV's volume
	private int volume;
	
	public Television() {
		}
	
	//declare Television method to get information
	public Television(String MANUFACTURER, int SCREEN_SIZE){
		
		this.MANUFACTURER = MANUFACTURER;
		this.SCREEN_SIZE = SCREEN_SIZE;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	/**
	 * return value of volume
	 * @return an int representing the TV's volume
	 */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * return channel number
	 * @return an int representing the TV's channel
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * return TV brand
	 * @return a String corresponding to the TV's brand
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	 * return TV screen size
	 * @return an int representing the TV's size
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	/**
	 * sets TV channel
	 * @param channel the TV channel
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	/**
	 * Turn on TV
	 * @param switch TV
	 */
	public void power() {
		powerOn = !powerOn;
	}
	
	/**
	 * increase volume by 1
	 * @param TV volume
	 */
	void increaseVolume() {
		volume += 1;
	}
	
	/**
	 * decrease volume by 1
	 * @param TV volume
	 */
	void decreaseVolume() {
		volume -= 1;
	}
	
	
	
	
}
