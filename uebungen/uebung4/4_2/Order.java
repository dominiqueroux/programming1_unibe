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
	private String customerName = " ";
	private String customerAddress = " ";
	private IArticle article1, article2, article3, article4, article5;
	
    private int articleCounter = 1;
	
	public Order(String customerName, String customerAddress) {
		this.Id = Id;
		Id++;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	public Order() {
		this.Id = Id;
		Id ++;
		this.customerName = "DEFAULT";
		this.customerAddress = "DEFAULT";
	}

	public void setCustomerName(String name) {
		this.customerName = name;
	}
	
	public void setCustomerAddress(String adress) {
		this.customerAddress = adress;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public String getCustomerAddress() {
		return this.customerAddress;
	}
	
	public int getId() {
		return this.Id;
	}
	
	public void add(IArticle article) {

        switch (articleCounter) {
            case 1:
                article1 = article;
                break;
            case 2:
                article2 = article;
                break;
            case 3:
                article3 = article;
                break;
            case 4:
                article4 = article;
                break;
            case 5:
                article5 = article;
                break;
            default:
                break;
        }

        articleCounter++;
	}
	
	public int getTotalPrice() {
		int sum = 0;

        if (articleCounter > 5)
            sum += this.article5.getPrice();
        if (articleCounter > 4)
            sum += this.article4.getPrice();
        if (articleCounter > 3)
            sum += this.article3.getPrice();
        if (articleCounter > 2)
            sum += this.article2.getPrice();
        if (articleCounter > 1)
            sum += this.article1.getPrice();
		return sum;
	}

    
    public Iterable<IArticle> getOrderedArticles() {
        return (Iterable<IArticle>) article4;
    }
	
	public String toString() {

		String output;

		output = "Order ID: "+ this.getId() + ", Costumer: " + this.getCustomerName() + ", " + this.getCustomerAddress()+"\n";

        if (articleCounter > 1)
            output += article1.toString() + "\n";
        if (articleCounter > 2)
            output += article2.toString() + "\n";
        if (articleCounter > 3)
            output += article3.toString() + "\n";
        if (articleCounter > 4)
            output += article4.toString() + "\n";
        if (articleCounter > 5)
            output += article5.toString() + "\n";

		output += "\n Total price: "+ this.getTotalPrice() + " CHF";
		return output;
	}
}
