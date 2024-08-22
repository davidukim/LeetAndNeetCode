class Solution {
    public int lengthOfLastWord(String s) {
        int lastIndex = s.length() - 1;
        int count = 0;



        for (int i = lastIndex; i >= 0; i--){
            if (s.charAt(i) == ' ' && count == 0){ // isSpace and past lastword
                continue;
            } else{
                if (s.charAt(i) == ' ' && count > 0){
                    return count;
                }
                count ++;
            }
        }

        return count;
    }
}