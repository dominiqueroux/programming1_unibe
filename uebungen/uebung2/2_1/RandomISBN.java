/* ************************************************************************* *\
*                Programmierung 1 HS 2016 - Serie 2-1
                 Dominique Roux			16-100-661
                 Marc Bachofner			15-135-916
\* ************************************************************************* */

import java.text.DecimalFormat;
import java.util.Random;

public class RandomISBN
{

	public static void main( String args[] )
	{
		// TODO: Insert your code here!
		System.out.println("1st : " + makeISBN());
		System.out.println("2nd : " + makeISBN());
		System.out.println("3rd : " + makeISBN());
	}

	/** generates and returns a random ISBN in the format L1L2-B1B2B3-V1V2-C */
	public static String makeISBN()
	{
		// Do NOT change the declaration of the following variables!
		String laendercode;
		String bandnr;
		String verlagsnr;
		String checksum;

		// TODO: Insert your code here!
		/*
			How to make sure every number will be a string with two digits
			DecimalFormat formatter = new DecimalFormat("00");  
			String s = formatter.format(1); // ----> 01  
			String s1 = formatter.format(11); // ---> 11
			String s2 = formatter.format(39); // ---> 39
		*/
		DecimalFormat formatterTwoDigits = new DecimalFormat("00");
		DecimalFormat formatterThreeDigits = new DecimalFormat("000");
		
		int laendercodeInt = (int) (Math.random() * 100);
		int bandnrInt = (int) (Math.random() * 900) + 100;
		int verlagsnrInt = (int) (Math.random() * 100);
		laendercode = formatterTwoDigits.format(laendercodeInt);
		bandnr = formatterThreeDigits.format(bandnrInt);
		verlagsnr = formatterTwoDigits.format(verlagsnrInt);
		
		// C = L1#2 + L2 + B1#2 + B2 + B3#2 + V1 + V2#2 mod 10
		
		int laendercode01 = hashOp(Integer.parseInt(laendercode.substring(0)));
		int laendercode02 = Integer.parseInt(laendercode.substring(1));
		int bandnr01 = hashOp(Integer.parseInt(bandnr.substring(0)));
		int bandnr02 = Integer.parseInt(bandnr.substring(1));
		int bandnr03 = hashOp(Integer.parseInt(bandnr.substring(2)));
		int verlagsnr01 = Integer.parseInt(verlagsnr.substring(0));
		int verlagsnr02 = hashOp(Integer.parseInt(verlagsnr.substring(1)));
		int checksumInt = ((laendercode01 + laendercode02 + bandnr01 + bandnr02 + bandnr03 + verlagsnr01 + verlagsnr02) % 10);
		checksum = Integer.toString(checksumInt);
		
		// Do not change the following line
		return laendercode + "-" + bandnr + "-" + verlagsnr + "-" + checksum;
	}

	/** multiplies i with 2 and subtracts 9 if result is >= 10 */
	public static int hashOp( int i )
	{
		// Do NOT change this method!
		int doubled = 2 * i;
		if ( doubled >= 10 ) {
			doubled = doubled - 9;
		}
		return doubled;
	}
}
