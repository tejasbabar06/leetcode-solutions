class Solution {
    public void sortColors(int[] nums) {
        int[] colour = {0, 0, 0};

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                colour[0]++;
            }
            else if(nums[i] == 1){
                colour[1]++;
            }
            else{
                colour[2]++;
            }
        }
        int index = 0;
        for(int i = 0; i < colour.length; i++){
            for(int j = 0; j < colour[i]; j++){
                nums[index++] = i; 
            }
        }
    }
}