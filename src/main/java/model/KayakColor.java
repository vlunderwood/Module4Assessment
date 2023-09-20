
/**
 * @author valei - vlunderwood
 * CIS175 - Fall 2023
 * Sep 20, 2023
 */
package model;

/**
 * 
 */
public class KayakColor {
	private String color;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param userNumber
	 * @param userColor
	 */
	public KayakColor(int userNumber, int userColor) {
		
		if (userColor < 2) {
			color = "Blue";
			
		} else if (userColor < 3) {
			color = "Red";
			
		} else {
			color = "Green";
				
		}
		
	}

}
