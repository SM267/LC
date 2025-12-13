import java.util.*;

class XorBinary {
    /*public String[] x(int[] arr) {
        int n = arr.length;
        String bin = "";
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            bin = "";
            if (arr[i] == 0) {
                bin = "0";
            } else {
                while (arr[i] > 0) {
                    bin = (arr[i] % 2) + bin;
                    arr[i] = arr[i] / 2;
                }
            }
            a[i] = bin;
        }
        return a;
    }*/
    public int xx(int[] arr, int target) {
        int n = arr.length;
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        /*XorBinary xb = new XorBinary();
        String[] result = xb.x(arr);
        System.out.println(" " + Arrays.toString(result));*/
    }
}
