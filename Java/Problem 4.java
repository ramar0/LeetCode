class Solution {
    public boolean isMatch(String s, String p) {
        if (0 == p.length()){
            return 0 == s.length();
        }
    
        int i_s = 0;
        int i_p = 0;
        Boolean res = false;

        while (i_p < p.length()){
        
            res = (i_s < length(s) && (p.charAt(i_p) == s.charAt(i_s) or p.charAt(i_p) == '.'));

            if (!res){
                return res;
            }

            if (i_p+1 < p.length() && p.charAt(i_p+1) == '*'){
                if (i_s+1 < s.length() && s.charAt(i_s+1) != p.charAt(i_p)){
                    i_p += 2;
                }else{
                    i_s++;
                }
            }else{
                i_p++;
                i_s++;
            }
        }
        return i_s == s.length();
    }
}
