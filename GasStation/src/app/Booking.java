/**
 * @file     Booking.java
 * @date     25.04.2019
 */
package app;

import java.util.Date;
import java.util.LinkedList;

/**
 * @author GRVN@BTI
 * @version 01 - 2019
 * @project GasStation
 */
public class Booking {
	
	private int bookingReference;
	private enum type {
		PURCHASE, SALE
	}
	private Date date;
	private double sum;
	private LinkedList<Article> articles;
}
