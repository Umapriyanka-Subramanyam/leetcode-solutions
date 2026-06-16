class Solution {
    public String reverseVowels(String s) {
        char[] words = s.toCharArray();
        int low = 0, high = s.length() - 1;
        while(low < high){
            while(low < high && !isVowel(words[low])){
                low++;
            }
            while(low < high && !isVowel(words[high])){
                high--;
            }
            char temp = words[low];
            words[low] = words[high];
            words[high] = temp;
            low++;
            high--;
        }
        return new String(words);
    }
    private boolean isVowel(char c) {
        switch(c) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                return true;
            default:
                return false;
        }
    }
}