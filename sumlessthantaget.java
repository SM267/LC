import java.util.*;

public class sumlessthantaget {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int count=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum1=arr[i]+arr[left]+arr[right];
                if(sum1<sum){
                    System.out.println(arr[i]+","+arr[left]+","+arr[right]);
                    count += right - left;
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SUm:");
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sumlessthantaget o=new sumlessthantaget();
        int cc=o.countTriplets(sum, arr);
        System.out.println(cc);

    }
}
/*
int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int count=0;
        int n= arr.length;
        int i=0;
        while(i<n){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum1=arr[i]+arr[left]+arr[right];
                if(sum1==sum){
                    right--;
                }
                else if(sum1<sum){
                    System.out.println(arr[i]+","+arr[left]+","+arr[right]);
                    count++;
                    left++;
                }
                else{
                    right--;
                }
            }
            i++;
        }
        return count;
    }



    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int count=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum1=arr[i]+arr[left]+arr[right];
                if(sum1==sum){
                    right--;
                }
                else if(sum1<sum){
                    System.out.println(arr[i]+","+arr[left]+","+arr[right]);
                    count++;
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return count;
    }
*/