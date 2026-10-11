import java.util.*;
public class 3sumtriplet0 {
    public void ssum(int[] nums,int n){
        int i=0,j=1,k=0;
        while(j<n){
            if(nums[i]+nums[j]==-nums[k]){
                if(k!=i && k!=j){
                    
                }
            }
            i++;
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
