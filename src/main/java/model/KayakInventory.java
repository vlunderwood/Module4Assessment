
/**
 * @author valei - vlunderwood
 * CIS175 - Fall 2023
 * Sep 20, 2023
 */
package model;

/**
 * 
 */
public class KayakInventory {

	private String color;
	private int inventory;
	private int amount;
	int blueInventory = 3;
	int redInventory = 10;
	int greenInventory = 8;



	/**
	 * @param userNumber
	 * @param userColor
	 */
	public KayakInventory(int userNumber, int userColor) {
		
		
		if (userColor < 2) {

			inventory = blueInventory;
			if (userNumber < 0) {
				amount = 0;
			} else if (userNumber <= inventory) {
				amount = userNumber;
			}else {
				amount = inventory;
			}
		} else if (userColor < 3) {
			inventory = redInventory;
			if (userNumber < 0) {
				amount = 0;
			} else if (userNumber <= inventory) {
				amount = userNumber;
			} else {
				amount = inventory;
			}
		} else {
			inventory = greenInventory;	
			if (userNumber < 0) {
				amount = 0;
			} else if (userNumber <= inventory) {
				amount = userNumber;
			} else {
				amount = inventory;
			}
		}
		
	}
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
	 * @return the inventory
	 */
	public int getInventory() {
		return inventory;
	}
	/**
	 * @param inventory the inventory to set
	 */
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
