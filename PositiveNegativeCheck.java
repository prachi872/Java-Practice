import java.util.Scanner;
public class PositiveNegativeCheck {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter A number");
        float num = sc.nextFloat();
        if(num>0){
            System.out.print("Number is Positive");
        } else if (num<0) {
            System.out.print("Number is negative");
        }
        else {
            System.out.print("Number is 0");
        }
    }
}
