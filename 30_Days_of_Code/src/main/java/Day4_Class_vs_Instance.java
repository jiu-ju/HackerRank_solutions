import java.util.Scanner;

public class Day4_Class_vs_Instance {
    private int age; //Person

    public Day4_Class_vs_Instance(int initialAge) {
        // Add some more code to run some checks on initialAge
        if(initialAge < 0){
            age = 0;

            System.out.println("Age is not valid, setting age to 0.");
        }
        age = initialAge;
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if(age < 13){
            System.out.println("You are young.");
        }else if(age >= 13 && age < 18 ){
            System.out.println("You are a teenager.");
        }else
            System.out.println("You are old.");
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day4_Class_vs_Instance p = new Day4_Class_vs_Instance(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
/*
Sample Input

4
-1
10
16
18
Sample Output

Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.
 */
