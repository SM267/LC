import java.util.*;

class PositiveNegative {
    public void rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int pc = 0;
        int nc = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[pc]=nums[i];
                pc++;
            }
            else{
                neg[nc]=nums[i];
                nc++;
            }
        }
        System.out.println("Positive Numbers:");
            for(int j=0;j<pc;j++){
                System.out.print(pos[j]+" ");
            }
            System.out.println();
            System.out.println("Negative Numbers:");
            for(int k=0;k<nc;k++){
                System.out.print(neg[k]+" ");
            }
        int i=0,j=0,k=0;
        int[] a=new int[n];
        while(k<pc && j<nc){
            a[i]=pos[k];
            i++;
            k++;
            a[i]=neg[j];
            i++;
            j++;
        }
        while(k<pc){
            a[i]=pos[k];
            i++;
            k++;
        }
        while(j<nc){
            a[i]=neg[j];
            i++;
            j++;
        }
        System.out.println();
        System.out.println("Rearranged Array:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PositiveNegative sol = new PositiveNegative();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers (positive and negative):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sol.rearrangeArray(nums);

    }
}
        /* System.out.println("Positive Numbers:");
            for(int j=0;j<pc;j++){
                System.out.print(pos[j]+" ");
            }
            System.out.println();
            System.out.println("Negative Numbers:");
            for(int k=0;k<nc;k++){
                System.out.print(neg[k]+" ");
            }
        Separate positive and negative numbers 
            if (num > 0)
                pos[posCount++] = num;
            else
                neg[negCount++] = num;
        }
        int[] result = new int[n];
        int i = 0, p = 0, ng = 0;

        while (p < posCount && ng < negCount) {
            result[i++] = pos[p++];
            result[i++] = neg[ng++];
        }

        while (p < posCount) {
            result[i++] = pos[p++];
        }

        while (ng < negCount) {
            result[i++] = neg[ng++];
        }*/

        //return result;
   // }
    /*class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pi=0,ni=1;
        int[] res=new int[n];
        for(int num:nums){
            if(num>0){
                res[pi]=num;
                pi+=2;
            }
            else{
                res[ni]=num;
                ni+=2;
            }
        }
        return res;
    }
    } */