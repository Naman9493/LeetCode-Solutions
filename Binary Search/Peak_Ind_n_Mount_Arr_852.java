package Binary Search;

public class Peak_Ind_n_Mount_Arr_852 {
    public int peakIndexInMountainArray(int[] arr) {
         int l=0;
        int h=arr.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }
            
            else{
                ans=mid;
                h=mid-1;
            }
        }
            return ans;
    }
}
