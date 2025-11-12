import java.util.*;

public class SpiralMatrix {
    public List<Integer> sm(int[][] arr){
        List<Integer> l=new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        int top=0,left=0,right=arr[0].length-1,bottom=arr.length-1;
        while(top<=bottom && left<=right){
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
        return l;
    }
    /*public void sm(int[][] arr){
        List<Integer> l=new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        int top=0,left=0,right=arr[0].length-1,bottom=arr.length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                l.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                l.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    l.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    l.add(arr[i][left]);
                }
                left++;
            }
        } */
 public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        SpiralMatrix o=new SpiralMatrix();
        o.sm(arr);
    }
}