    import java.util.*;
    public class RotateArray{
        public void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        public void reverse(int[] arr,int l,int r){
            while(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
        public void rotarr(int[] arr,int n){
            reverse(arr,0,n-1);
            reverse(arr,1,n-1);
            for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            RotateArray array1 = new RotateArray();
            array1.rotarr(arr, n);
        }
    }
    /*
    Brute FOrce Approach by replacing elements
    public void rotarr(int[] arr,int n){
            int i=n-1;
            int last=arr[n-1];
            while(i>0){
                arr[i]=arr[i-1];
                i--;
            }
            arr[0]=last;
            for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
            }
        }
    */
   /*
   public void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        public void rotarr(int[] arr,int n){
            int right=n-1;
            while(right>0){
                swap(arr,right,right-1);
                right--;
            }
            for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
            }
        }
     */