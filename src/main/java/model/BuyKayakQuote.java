
/**
 * @author valei - vlunderwood
 * CIS175 - Fall 2023
 * Sep 18, 2023
 */
package model;


/**
 * 
 */
public class BuyKayakQuote {


	private double outPrice;
	private double outTotal;
	private int amount;

	

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
	/**
	 * @return the outPrice
	 */
	public double getOutPrice() {
		return outPrice;
	}
	/**
	 * @param outPrice the outPrice to set
	 */
	public void setOutPrice(double outPrice) {
		this.outPrice = outPrice;
	}
	/**
	 * @return the outTotal
	 */
	public double getOutTotal() {
		return outTotal;
	}
	/**
	 * @param outTotal the outTotal to set
	 */
	public void setOutTotal(double outTotal) {
		this.outTotal = outTotal;

	}
	
	
	public BuyKayakQuote(int userBuyNumber) {
		outPrice = userBuyNumber * 230;
		outTotal = (outPrice * 0.06) + outPrice;
		amount = userBuyNumber;
	}

	
}