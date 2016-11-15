/* ************************************************************************** *\
                Programmierung 1 HS 2016 - Serie 4-2  
					Bachofner Marc 		15-135-916
					Dominique Roux 		16-100-661
\* ************************************************************************* */


public class CD implements IArticle
{
	private int id;
	private String title;
	private String interpret;
	private int year;
	private int price; // CHF

	/** constructor */
	public CD( int id, String title, String interpret, int year, int price )
	{
		this.id = id;
		this.title = title;
		this.interpret = interpret;
		this.year = year;
		this.price = price;
	}

	public String getDescription()
	{
		return id + " (CD) " + title + ", by " + interpret +
			", " + year + ", " + price + " CHF";
	}

	public int getPrice() {
		return price; 
	}

	public int getId() { 
		return id; 
	}
}
