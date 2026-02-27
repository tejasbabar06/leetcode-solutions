class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while(low<=high){
            int mid = low + (high - low)/2;
            long mid1 = (long)mid * mid;
            if(mid1 == num){
                return true;
            }
            else{
                if(mid1 > num){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return false;
    }
}