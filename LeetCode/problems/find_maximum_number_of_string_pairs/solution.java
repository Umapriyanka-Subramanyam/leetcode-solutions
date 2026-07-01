class Solution {
    public String reverse(String str){
        String ans = "";
        for(int i = str.length() - 1; i >= 0; i--){
            ans = ans + str.charAt(i);
        }
        return ans;
    }

    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        int n = words.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                String a = words[i];
                String b = words[j];
                if(!b.equals("0")) {
                    String revb = reverse(b);
                    if(a.equals(revb)) {
                        ans++;
                        words[j] = "0";
                        break;
                    }
                }
            }
        }
        return ans;
    }
}