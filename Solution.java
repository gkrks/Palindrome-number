public class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int sum =0;
        while(n!=0){
            int r = n %10;
            sum = (sum*10) + r;
            n = n/10;
        }
        if(sum == x && x>=0){
            return true;
        }
        else{
            return false;
        }
        
    }
}
