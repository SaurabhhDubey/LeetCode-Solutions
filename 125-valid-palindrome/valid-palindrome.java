class Solution {
    public boolean isPalindrome(String s) {
        int left = 0 ;
        String newString = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        int right = newString.length()-1;
     

        boolean isPalindrom = true;
        while(left<right){
            if(newString.charAt(left)!=newString.charAt(right)){
                isPalindrom = false;
                break;
            }
            left++;
            right--;
        }
        return isPalindrom;
    }
}