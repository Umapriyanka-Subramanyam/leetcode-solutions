class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> ch=new HashSet<>();
        for(int i=0; i<sentence.length(); i++){
         ch.add(sentence.charAt(i));
        }
        for(char i='a'; i<='z'; i++){
            if(!ch.contains(i)) return false;
        }
        return true;
    }
}