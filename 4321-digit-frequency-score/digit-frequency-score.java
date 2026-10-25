class Solution {
    public int digitFrequencyScore(int n) {
       int digits = 0 ;
       while(n>0){
        digits += n%10;
        n = n/10;
       } 
       return digits;
    }
}