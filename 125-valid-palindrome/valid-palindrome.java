class Solution {
    public boolean isPalindrome(String s) {
        String newString= "";
        for (int i= 0; i<s.length() ; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newString = newString+ s.charAt(i);
            }
        }
        newString= newString.toLowerCase();
        int last = newString.length() -1 ;
        for (int i =0; i<last; i++){
            if(newString.charAt(i)!= newString.charAt(last)){
                return false;
            }
            last -= 1;
        }
        return true;
    }
}