class Solution {
    public boolean isPalindrome(int x) {
        int rev=0 , digit;
        if(x<0) return false;
        int original = x ;
           while(x>0){ digit = x%10;
             x = x/10;
             rev = rev*10+digit;
           }
            return original == rev;
    }
}