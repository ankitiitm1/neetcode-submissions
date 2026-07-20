class Solution {
    public boolean isPalindrome(String s) {

        String cleanedString=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length=cleanedString.length();
        int start=0;
        int end=length-1;
        while(start<end){
            if(cleanedString.charAt(start)!=cleanedString.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }

        return true;
        
    }
}
