import java.util.*;

class ShortestUnsorted {
    public int us(int [] nums){
        int n=nums.length;
        int []num=nums.clone();
        Arrays.sort(num);
        int i=0;
        int j=n-1;
        int count;
        if (i > j) {
            return 0;
        }
        while( i<n && nums[i]==num[i]){
            i++;
        }
        while(j>=0 && nums[j]==num[j]){
            j--;
        }
        count=j-i+1;
        return count;
    }
    //[2,6,4,8,10,9,15]
    //[2,4,6,8,9,10,15]
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ShortestUnsorted ss=new ShortestUnsorted();
        int nn=ss.us(arr);
        System.out.println(nn);
    }
}
