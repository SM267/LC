import java.util.*;
public class SingleNumberFinding {
    public int snf(int[] arr)
    {
        int result=0;
        for(int num:arr){
            result^=num;
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        SingleNumberFinding s=new SingleNumberFinding();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(s.snf(arr));
    }
}
