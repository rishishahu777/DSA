class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = cleaned.length();
        for(int i = 0; i < n/2; i++){
            if(cleaned.charAt(i) != cleaned.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }
}