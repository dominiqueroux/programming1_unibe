/*
			Programming 1 HS16 Exercise 2_2
			Dominique Roux			16-100-661
			Marc Bachofner			15-135-916

*/

public class BookTest
{
	public static void main(String[] args)
	{
		Book HarryPotter4 = new Book(394, "Harry Potter and the Goblet of Fire", "J. K. Rowling", "07.08.2000");
		System.out.println("Infos of the book: \n" + HarryPotter4 + "\n");
		System.out.println("Days since publication: " + HarryPotter4.age()+ " days \n");
		System.out.println("Days as String: " + HarryPotter4.dateToString(HarryPotter4.getDateOfPublication()) + " \t Date as Date: " + HarryPotter4.stringToDate(HarryPotter4.dateToString(HarryPotter4.getDateOfPublication())));
		HarryPotter4.input();
		System.out.println("Infos of the book: \n" + HarryPotter4 + "\n");
		System.out.println("Days since publication: " + HarryPotter4.age() + " days");
	}
}
