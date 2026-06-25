class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        Arrays.fill(freq,0);

        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch : t.toCharArray())
            freq[ch-'a']--;
        
        for(int fr : freq){
            if(fr!=0) return false;
        }
        return true;
    }
}
