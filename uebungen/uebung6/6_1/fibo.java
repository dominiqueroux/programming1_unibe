/* ************************************************************************** *\
 * *                 Programmierung 1 HS 2016 - Serie 5-1  
 * *                 Bachofner Marc      15-135-916
 * *                 Dominique Roux      16-100-661
 * \* ************************************************************************ */

public class fibo {
    public static void main( String[] args ) {
        long fib_num;

        long fib_num_old2 = 0;
        long fib_num_old1 = 1;        
        System.out.print("0, ");
        for (int i = 0; i <= 50; i++) {

            fib_num = fib_num_old2 + fib_num_old1;
            System.out.print(fib_num + ", ");

            fib_num_old2 = fib_num_old1;
            fib_num_old1 = fib_num;
            
        }

        System.out.print("\n");
    }
}
