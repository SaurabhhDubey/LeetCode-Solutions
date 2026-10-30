class Solution {
    public int countDigits(int num) {
        int y = 0;
        int x = num;
        int val;
        while(x!=0){
            val = x%10;
            if(num%val ==0){
                y+=1;
            }
            x=x/10;
        }
        return y;
    }
}