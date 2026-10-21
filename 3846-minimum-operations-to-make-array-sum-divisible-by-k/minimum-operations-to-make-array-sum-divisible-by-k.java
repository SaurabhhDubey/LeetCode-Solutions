class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        int reminder = sum % k;
        return reminder ;
    }
}