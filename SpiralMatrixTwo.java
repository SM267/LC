import java.util.*;
public class SpiralMatrixTwo {
    public int[][] sm(int n){
        int arr[][] = new int[n][n];
        int num=1;
        int top=0,left=0,right=arr[0].length-1,bottom=arr.length-1;
        while(top<=bottom && left<=right){
            for (int j = left; j <= right; j++) {
                arr[top][j] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    arr[bottom][j]=num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left]=num++;
                }
                left++;
            }
        }
        return arr;
    }
 public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SpiralMatrixTwo o=new SpiralMatrixTwo();
        
        int[][] result=o.sm(n);
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
