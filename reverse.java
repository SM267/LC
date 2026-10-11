import java.util.Scanner;
class reverse{
    public static void rvr(int[] arr,int n){
        int[] a=new int[n];
        for(int i=n;i>0;i--){
            a[n-i]=arr[i-1];
        }
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("]");
    }
   //Fraud Method
    /*public void rvr(int[] arr,int n){
        for(int i=n-1;i>=0;i--){
            if(i==n-1) System.out.print("[");
            String s=",";
            if(i==0) s="";
            System.out.print(arr[i]+s);
            if(i==0) System.out.print("]");
        }
    }*/
   // 2 pointer 
    /*public void rvr(int[] arr,int n){
        int left=0,right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        int i=0;
        System.out.print("[");
        while(i<n){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println("]");
    }*/

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rvr(arr,n);
    }
}