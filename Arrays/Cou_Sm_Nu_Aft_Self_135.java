import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cou_Sm_Nu_Aft_Self_135 {
     public List<Integer> countSmaller(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        
        for(int i=nums.length-1;i>=0;i--){
           int left=0;
           int right=list.size();
           while(left<right){
            int mid=left+(right-left)/2;
            if(list.get(mid)<nums[i]){
                left=mid+1;
            }else{
                right=mid;
            }
           }
           ans.add(left);
           list.add(left,nums[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}
