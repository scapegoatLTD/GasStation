/**
 * @file     Tank.java
 * @date     24.04.2019
 */
package app;

/**
 * @author GRVN@BTI
 * @version 01 - 2019
 * @project GasStation
 */
public class Tank {

	private int capacity; //amount of content in l
	private Content content; //defines the content of a tank

	
	
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	
	
}
