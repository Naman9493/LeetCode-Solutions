package Binary Search;

public class Guess_Num_High_Low_374 extends GuessGame {
    public int guessNumber(int n) {
        int l=1;
        int h=n;
        while(l<=h){
            int mid=l+(h-l+1)/2;
            int ans=guess(mid);
            if(ans==0){
                return mid;
            }
            else if(ans==-1){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}