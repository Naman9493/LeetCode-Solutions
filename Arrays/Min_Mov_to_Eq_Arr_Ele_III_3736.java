import java.util.Arrays;

public class Min_Mov_to_Eq_Arr_Ele_III_3736 {
      public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int count=0;
        int i=0;
        while(i<n){
            int a=nums[n]-nums[i];
            count+=a;
            i++;
        }
               return count;

               //SECOND AND OPTIMIZE METHOD
                int min=Integer.MAX_VALUE;
        int sum=0;
        for(int x:nums){
            min=Math.min(min,x);
            sum+=x;
        }
        return sum-(min*nums.length);
      }
}
