import java.util.*;
class Main{
    public int Sorting(int [] arr){
        int count;
        int n=arr.length;
        int result = -1;
        int max=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                result=arr[i];
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
            System.out.println("Majority element: " + d);
        else
            System.out.println("No majority N/2 element found");
    }
}