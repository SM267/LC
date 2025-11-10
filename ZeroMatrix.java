import java.util.*;
// BRUTE Force Approach
/*
public void sz(int[][] arr){
        int m=arr[0].length;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    for(int col=0;col<n;col++){
                        if(arr[i][col]!=0)
                        {
                            arr[i][col]=-1;  //for row
                        }
                    }
                    for(int row=0;row<m;row++){
                        if(arr[row][j]!=0)
                        {
                            arr[row][j]=-1;  //for column
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
    }
 */
class ZeroMatrix{
    public void sz(int[][] arr){
        int m=arr[0].length;
        int n=arr.length;
        int[] row=new int[n];
        int[] col=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1|| col[j]==1){
                    arr[i][j]=0;
                }
            }
        }
    }
    public static void main(String arga[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        ZeroMatrix am=new ZeroMatrix();
        am.sz(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}