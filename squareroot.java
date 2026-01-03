import java.util.*;
class squareroot{
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        squareroot sr = new squareroot();
        int result = sr.mySqrt(num);
        System.out.println("The square root of " + num + " is: " + result);
        sc.close();
    }
}