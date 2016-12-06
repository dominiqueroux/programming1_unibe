/* ************************************************************************** *\
 * *                 Programmierung 1 HS 2016 - Serie 5-1  
 * *                 Bachofner Marc      15-135-916
 * *                 Dominique Roux      16-100-661
 * \* ************************************************************************ */

public class factor {
    public static void main( String[] args ) {
        if (args.length == 0) {
            System.out.println("Please add a number!");
            System.exit(1);
        }
        int n = Integer.parseInt(args[0]);
        System.out.println(factorial(n));
    }

    static long factorial( int n ) {
        long fact_num;

        if ( n == 0 )
            return 1;
        if ( n == 1 )
            return 1;

        fact_num = n * factorial(n-1);

        return fact_num;
    }
}
