/* ************************************************************************* *\
                Programmierung 1 HS 2016 - Serie 3-2  
					Bachofer Marc 		15-135-916
					Dominique Roux 		16-100-661
\* ************************************************************************* */

import java.util.Date;
import java.util.Scanner;
import java.text.*;

public class Book
{
	private int id;
	private String title;
	private String author;
	private Date dateOfPublication;
	private int price = 0;

	public static final String DATE_FORMAT = "dd.MM.yyyy";
	
	//--- constructors ---

	// TODO: Insert your code here!
	public Book(int id, String title, String author, Date dateOfPublication, int price)
	{
		this.id = id;
		this.title = title;
		this.author = author;
		this.dateOfPublication = dateOfPublication;
		if(price < 0) {
			this.price = 0;
		}
		else {
			this.price = price;
		}
	}
	
	public Book(String title) {
		this.title = title;
	}


	/** Returns the age of the book in days since publication */
	public int age()
	{
		// TODO: Insert your code here!
		long ageFromPublication = this.dateOfPublication.getTime();
		long ageInDays = ((ageFromPublication) / (1000*60*60*24));
		return (int) ageInDays; //this is to avoid compiler errors, replace it!
	}

	/** Returns a String representation of the book */
	public String toString()
	{
		// TODO: Insert your code here!
		String bookInfo = this.getId() + ", " + this.getTitle() + ", " + this.getAuthor() + ", " + this.getDateOfPublication() + ", " + this.getPrice() + " CHF";
		return bookInfo; //this is to avoid compiler errors, replace it!
	}

	/** Reads all book data from user input */
	public void input() 
	{
		Scanner scn = new Scanner( System.in );
		System.out.print( "Please enter id: " );
		int newId = scn.nextInt();
		this.setId(newId);
		scn.nextLine();
		System.out.print("Please enter Title: ");
		String newTitle = scn.nextLine();
		this.setTitle(newTitle);
		System.out.print("Please enter Author: ");
		String newAuthor = scn.nextLine();
		this.setAuthor(newAuthor);
		System.out.print("Please enter date of publication (dd.MM.yyyy): ");
		String newDateOfPublication = scn.nextLine();
		this.setDateOfPublication(this.stringToDate(newDateOfPublication));
		
	}

	//--- Get-/Set-methods ---

	// TODO: Insert your code here!
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setTitle (String title)
	{
		this.title = title;
	}
	
	public void setAuthor (String author)
	{
		this.author = author;
	}
	
	public void setDateOfPublication(Date date) 
	{
		this.dateOfPublication = date;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public Date getDateOfPublication() 
	{
		return this.dateOfPublication;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int i) {
		if(i < 0) {
			this.price = 0;
		}
		else {
			this.price = i;
		}
	}
	
	//--- helper methods -- DO NOT CHANGE ------------------------------------
	/** Converts the Date object d into a String object */
	public static String dateToString( Date d )
	{
		SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
		return fmt.format( d );
	}

	/** Converts the String object s into a Date object */
	public static Date stringToDate( String s ) 
	{
		Date r = null;
		try {
			SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
			r = fmt.parse( s );
		} catch ( ParseException e ){
			System.err.println( e );
			System.exit(1);
		}
		return r;
	}
}
