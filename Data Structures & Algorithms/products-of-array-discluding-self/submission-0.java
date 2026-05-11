class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] output = new int[nums.length];
        boolean zeroFound = false;
        for (int item : nums){
        
            if (item == 0 && !zeroFound){
                zeroFound = true;
            } else {
            product *= item;
            }
        }


        for (int i = 0; i < nums.length; i++){
        

            if (nums[i] == 0){
                output[i] =  product;
            } else if (zeroFound){
                output[i] = 0;
            } else {
                output[i] = product / nums[i];
            }

        }

        return output;

    }
}  
