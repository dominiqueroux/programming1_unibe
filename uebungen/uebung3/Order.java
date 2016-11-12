/* ************************************************************************* *\
                Programmierung 1 HS 2016 - Serie 3-2  
					Bachofer Marc 		15-135-916
					Dominique Roux 		16-100-661
\* ************************************************************************* */

import java.util.Date;
import java.util.Scanner;
import java.text.*;
//import java.text.NumberFormat;


public class Order {
	//private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	private static int Id = 0;
	private String costumerName = " ";
	private String costumerAdress = " ";
	private Book book1, book2, book3, book4, book5;
	
    private int bookCounter = 1;
	
	public Order(String costumerName, String costumerAdress) {
		this.Id = Id;
		Id++;
		this.costumerName = costumerName;
		this.costumerAdress = costumerAdress;
	}
	
	public Order() {
		this.Id = Id;
		Id ++;
		this.costumerName = "DEFAULT";
		this.costumerAdress = "DEFAULT";
	}

	public void setCustomerName(String name) {
		this.costumerName = name;
	}
	
	public void setCustomerAddress(String adress) {
		this.costumerAdress = adress;
	}
	
	public String getCostumerName() {
		return this.costumerName;
	}
	
	public String getCostumerAdress() {
		return this.costumerAdress;
	}
	
	public int getId() {
		return this.Id;
	}
	
	public void addBook(Book book) {

        switch (bookCounter) {
            case 1:
                book1 = book;
                break;
            case 2:
                book2 = book;
                break;
            case 3:
                book3 = book;
                break;
            case 4:
                book4 = book;
                break;
            case 5:
                book5 = book;
                break;
            default:
                break;
        }

        bookCounter++;
	}
	
	public int getTotalPrice() {
		int sum = 0;

        if (bookCounter > 5)
            sum += this.book5.getPrice();
        if (bookCounter > 4)
            sum += this.book4.getPrice();
        if (bookCounter > 3)
            sum += this.book3.getPrice();
        if (bookCounter > 2)
            sum += this.book2.getPrice();
        if (bookCounter > 1)
            sum += this.book1.getPrice();
		return sum;
	}
	
	public String toString() {

		String output;

		output = "Order ID: "+ this.getId() + ", Costumer: " + this.getCostumerName() + ", " + this.getCostumerAdress()+"\n";

        if (bookCounter > 1)
            output += book1.toString() + "\n";
        if (bookCounter > 2)
            output += book2.toString() + "\n";
        if (bookCounter > 3)
            output += book3.toString() + "\n";
        if (bookCounter > 4)
            output += book4.toString() + "\n";
        if (bookCounter > 5)
            output += book5.toString() + "\n";

		output += "\n Total price: "+ this.getTotalPrice() + " CHF";
		return output;
	}
}
