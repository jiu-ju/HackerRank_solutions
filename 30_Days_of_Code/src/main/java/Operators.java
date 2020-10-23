import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        double tip = meal_cost * (tip_percent / 100.0);
        int tax_percent = in.nextInt();
        double tax = meal_cost * (tax_percent / 100.0);
        double totalCost = meal_cost + tip + tax;
        int totalRoundedCost = (int) Math.round(totalCost);

        in.close();

        System.out.println(totalRoundedCost);
    }
}

/*
Sample Input

12.00
20
8

Sample Output

15
 */
