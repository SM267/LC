class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }

        int rev = 0;
        int g = n;

        while (n > 0) {
            int num = n % 10; 
            rev = (rev * 10) + num;
            n = n / 10;
        }
        if(rev==g){
            return true;
        } else {
            return false;
        }
    }
}
