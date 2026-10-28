class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int index=0;
        int[] mischievous = new int[2];
        for(int i =0 ; i< nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i]== nums[j]){
                    mischievous[index]= nums[i];
                    index++;
                    break;
                }
            }
            if(index==2){
                break ;
            }
        }
        return mischievous;
    }
}