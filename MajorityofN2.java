import java.util.*;
class Main{
    public int Sorting(int [] arr){
        int count;
        int n=arr.length;
        int result = -1;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                result=arr[i];
                break;
            }
        }
        return result;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Main nn=new Main();
        int d=nn.Sorting(arr);
        if (d != -1)
            System.out.println("Majority element which satisfies n/2: " + d);
        else
            System.out.println("No majority N/2 element found");
    }
}