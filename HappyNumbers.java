import java.util.*;

class HappyNumberSolution {
    HashSet<Integer> set = new HashSet<>();

    public boolean HappyNumber(int n) {
        if (n == 1) return true;
        if (set.contains(n)) return false;

        set.add(n);

        int num = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            num += digit * digit;
            temp /= 10;
        }

        return HappyNumber(num);
    }
}

public class HappyNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        HappyNumberSolution s = new HappyNumberSolution();
        System.out.println(s.HappyNumber(n1));
        sc.close();
    }
}
