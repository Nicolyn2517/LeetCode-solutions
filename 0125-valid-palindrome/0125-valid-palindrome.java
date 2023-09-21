class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z\\d]","").toLowerCase();
        String reverse = new StringBuilder(result).reverse().toString();
        return result.equals(reverse);
    }
}