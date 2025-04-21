import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter three numbers (space separated): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }
}

