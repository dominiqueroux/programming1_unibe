/* ************************************************************************** *\
 * *                 Programmierung 1 HS 2016 - Serie 5-1  
 * *                 Bachofner Marc      15-135-916
 * *                 Dominique Roux      16-100-661
 * \* ************************************************************************ */

public class fibonacci {
    public static void main( String[] args ) {

        for (int i = 0; i <= 50; i++) {
            System.out.print(fib(i) + ", ");
        }
        System.out.print("\n");
    }

    static long fib( int i ) {
        long fib_num;

        if ( i == 0 )
            return 0;
        if ( i == 1 )
            return 1;

        fib_num = fib(i-1) + fib(i-2);

        return fib_num;
    }
}
