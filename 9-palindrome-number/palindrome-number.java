class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        int digit = 0;
        if(x<0){
            return false;
        }
        while(original != 0){
            digit = original%10;
            reverse = reverse*10 + digit;
            original = original/10;
        }
        return reverse == x;
    }
}