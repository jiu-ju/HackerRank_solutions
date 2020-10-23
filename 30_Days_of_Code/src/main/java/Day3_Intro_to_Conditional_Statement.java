import java.util.Scanner;

public class Day3_Intro_to_Conditional_Statement {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else{
            // Complete the code

            if(2 <= n && n <= 5)
            {
                ans = "Not Weird";
            }

            if(6 <= n && n <= 20)
            {
                ans = "Weird";
            }

            if(n > 20)
            {
                ans = "Not Weird";
            }

        }
        System.out.println(ans);
    }
}
/*
Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
 */
