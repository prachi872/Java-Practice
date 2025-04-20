public class SwapWithout {
    public static void main(String[] args){
        int a=5,b=10;
        a=a+b;//15
        b=a-b; // 5
        a=a-b;//10
        System.out.println("Swapping: a = " + a + ", b = " + b);
    }
}
