class Solution {
    public int minElement(int[] nums) {
        int x ;
        int[] minimum = new int[nums.length];
        for(int i =0; i<nums.length ; i++){
            x = nums[i];
            int temp=0;
            while(x!=0){
                temp += x%10;
                x = x/10;
            }
          minimum[i]= temp;
        }
        int min = minimum[0];
        for(int i =1 ; i<minimum.length; i++){
            if(minimum[i]<min){
                min = minimum[i];
            }
        }
        return min;
    }
}