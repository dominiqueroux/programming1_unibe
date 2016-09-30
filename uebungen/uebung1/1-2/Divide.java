import java.util.Scanner;

public class Divide {
    public static void main (String[] args) {
        double a, b, unround_result, round_result, rest;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Number a: ");
        a = in.nextInt();

        System.out.println("Enter Number b:");
        b = in.nextInt();
        
        // Calculate as floating point number
        unround_result = Math.pow(a,2)/b;

        // Calculate with modulo and rest
        round_result = Math.round(Math.pow(a,2)/b);
        rest = Math.pow(a,2)%b;

        // print out results
        System.out.println("a^2/b (not rounded) = " +unround_result);
        System.out.println("a^2/b (rounded) = " +round_result +" Rest " +rest);
    }
}
