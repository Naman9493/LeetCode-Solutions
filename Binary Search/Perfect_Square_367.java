package Binary Search;

public class Perfect_Square_367 {
    public boolean isPerfectSquare(int num) {
        long l=1;
        long h=num;
        while(l<=h){
            long mid=l+(h-l+1)/2;
            long seq=mid*mid;
            if(seq==num){
                return true;
            }
            else if(seq>num){
                h=mid-1;

            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}
