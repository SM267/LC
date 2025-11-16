import java.util.*;
class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer>mm=new HashMap<>();
        for(int i=0;i<n;i++){
             mm.put(nums[i], mm.getOrDefault(nums[i], 0) + 1);
            if(mm.get(nums[i])==n/3+1){
                result.add(nums[i]);
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
        MajorityElementII me=new MajorityElementII();
        List<Integer> res=me.majorityElement(arr);
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}