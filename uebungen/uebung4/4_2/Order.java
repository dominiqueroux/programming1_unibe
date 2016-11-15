/* ************************************************************************* *\
                Programmierung 1 HS 2016 - Serie 4-2  
					Bachofner Marc 		15-135-916
					Dominique Roux 		16-100-661
\* ************************************************************************* */

import java.util.Date;
import java.util.Scanner;
import java.text.*;
import java.util.*;
//import java.text.NumberFormat;


public class Order {
	//private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	private int Id = 0;
    private static int nextId = 1; 
	private String customerName = " ";
	private String customerAddress = " ";
    private ArrayList<IArticle> articles = new ArrayList<IArticle>();
	
	
	public Order(String customerName, String customerAddress) {
		this.Id = nextId;
		nextId++;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	public Order() {
		this.Id = nextId;
		nextId ++;
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

        articles.add(article);

	}
	
	public int getTotalPrice() {
		int sum = 0;

        for ( IArticle a: this.articles ) {
            sum += a.getPrice();
        }

		return sum;
	}

    
    public Iterable<IArticle> getOrderedArticles() {
        return articles;
    }
	
	public String toString() {

		String output;

		output = "Order ID: "+ this.getId() + ", Costumer: " + this.getCustomerName() + ", " + this.getCustomerAddress()+"\n";

        for ( IArticle a: this.articles ) {
            output += a.toString() + "\n";
        }

		output += "\n Total price: "+ this.getTotalPrice() + " CHF";
		return output;
	}
}
