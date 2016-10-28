/* ************************************************************************* *\
                Programmierung 1 HS 2016 - Serie 3-2  
					Bachofer Marc 		15-135-916
					Dominique Roux 		16-100-661
\* ************************************************************************* */

import java.util.Date;
import java.util.Scanner;
import java.text.*;
import java.text.NumberFormat;


public class Order {
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	private static int Id = 0;
	private String costumerName = " ";
	private String costumerAdress = " ";
	private Book book1 = new Book("DEFAULT");
	private Book book2 = new Book("DEFAULT");
	private Book book3 = new Book("DEFAULT");
	private Book book4 = new Book("DEFAULT");
	private Book book5 = new Book("DEFAULT");
	
	
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
		if(this.book1.getTitle() == "DEFAULT") {
			this.book1.setTitle(book.getTitle());
			this.book1.setAuthor(book.getAuthor());
			this.book1.setId(book.getId());
			this.book1.setDateOfPublication(book.getDateOfPublication());
			this.book1.setPrice(book.getPrice());
		} else if(this.book2.getTitle() == "DEFAULT") {
			this.book2.setTitle(book.getTitle());
			this.book2.setAuthor(book.getAuthor());
			this.book2.setId(book.getId());
			this.book2.setDateOfPublication(book.getDateOfPublication());
			this.book2.setPrice(book.getPrice());
		} else if(this.book3.getTitle() == "DEFAULT") {
			this.book3.setTitle(book.getTitle());
			this.book3.setAuthor(book.getAuthor());
			this.book3.setId(book.getId());
			this.book3.setDateOfPublication(book.getDateOfPublication());
			this.book3.setPrice(book.getPrice());
		} else if(this.book4.getTitle() == "DEFAULT") {
			this.book4.setTitle(book.getTitle());
			this.book4.setAuthor(book.getAuthor());
			this.book4.setId(book.getId());
			this.book4.setDateOfPublication(book.getDateOfPublication());
			this.book4.setPrice(book.getPrice());
		} else if(this.book5.getTitle() == "DEFAULT") {
			this.book5.setTitle(book.getTitle());
			this.book5.setAuthor(book.getAuthor());
			this.book5.setId(book.getId());
			this.book5.setDateOfPublication(book.getDateOfPublication());
			this.book5.setPrice(book.getPrice());
		}
	}
	
	public int getTotalPrice() {
		int sum = 0;
		if(this.book1.getTitle() == "DEFAULT") {
			sum += 0;
		} else {
			sum += this.book1.getPrice();
		}
		if(this.book2.getTitle() == "DEFAULT") {
			sum += 0;
		} else {
			sum += this.book2.getPrice();
		}
		if(this.book3.getTitle() == "DEFAULT") {
			sum += 0;
		} else {
			sum += this.book3.getPrice();
		}
		if(this.book4.getTitle() == "DEFAULT") {
			sum += 0;
		} else {
			sum += this.book4.getPrice();
		}
		if(this.book5.getTitle() == "DEFAULT") {
			sum += 0;
		} else {
			sum += this.book5.getPrice();
		}
		return sum;
	}
	
	public String toString() {
		String output = "";
		output = "Order ID: "+ this.getId() + ", Costumer: " + this.getCostumerName() + ", " + this.getCostumerAdress()+"\n";
		if(this.book1.getTitle() != "DEFAULT") {
			output += ""+ this.book1.getId() + ", " + this.book1.getTitle() + ", " + this.book1.getAuthor() + ", " + this.book1.dateToString(this.book1.getDateOfPublication())+", " + fmt.format(this.book1.getPrice());
		}
		if(this.book2.getTitle() != "DEFAULT") {
			output += "\n"+ this.book2.getId() + ", " + this.book2.getTitle() + ", " + this.book2.getAuthor() + ", " + this.book2.dateToString(this.book2.getDateOfPublication())+", " + fmt.format(this.book2.getPrice());
		}
		if(this.book3.getTitle() != "DEFAULT") {
			output += "\n"+ this.book3.getId() + ", " + this.book3.getTitle() + ", " + this.book3.getAuthor() + ", " + this.book3.dateToString(this.book3.getDateOfPublication())+", " + fmt.format(this.book3.getPrice());
		}
		if(this.book4.getTitle() != "DEFAULT") {
			output += "\n"+ this.book4.getId() + ", " + this.book4.getTitle() + ", " + this.book4.getAuthor() + ", " + this.book4.dateToString(this.book4.getDateOfPublication())+", " + fmt.format(this.book4.getPrice());
		}
		if(this.book5.getTitle() != "DEFAULT") {
			output += "\n"+ this.book5.getId() + ", " + this.book5.getTitle() + ", " + this.book5.getAuthor() + ", " + this.book5.dateToString(this.book5.getDateOfPublication())+", " + fmt.format(this.book5.getPrice());
		}
		output += "\n Total price: "+ fmt.format(this.getTotalPrice());
		return output;
	}
}