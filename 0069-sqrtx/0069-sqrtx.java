class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        int ans = 1;
        if(x == 0){
            return 0;
        }
        while(low <= high){

            int mid = low + (high - low) / 2;

            long squ = (long) mid * mid ;

                if(squ > x){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                    ans = mid;
                }
            
        }
        return ans;
    }
}