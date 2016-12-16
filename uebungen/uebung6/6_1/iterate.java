/* ************************************************************************** *\
 * *                 Programmierung 1 HS 2016 - Serie 6-1  
 * *                 Bachofner Marc      15-135-916
 * *                 Dominique Roux      16-100-661
 * \* ************************************************************************ */

public class iterate {
    public static void main( String[] args ) {
        iterative(0);
    }

    static void iterative( int i ) {
        if ( i == 33 )
            System.exit(0);

        System.out.println(i);


        iterative(i + 3);
    }
}
