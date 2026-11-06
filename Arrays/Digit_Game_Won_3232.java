class Digit_Game_Won_3232 {
    public boolean canAliceWin(int[] nums) {
        int dc=0;
        int sc=0;
        for(int i=0;i<nums.length;i++){
            if( nums[i]<10){
                sc+=nums[i];
            }
            else{
                dc+=nums[i];
            }
        }
        if (sc>dc)return true;
        else if(dc>sc)return true;
        else{
            return false;
        }
    }
}