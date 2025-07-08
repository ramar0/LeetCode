class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<String> res = new ArrayList();
        StringBuffer buff = new StringBuffer();
        HashMap charCount = new HashMap();

        s = s.toLowercase();

        for (char c : s.toCharArray()){
            if(charCount.containsKey(c)){
                for (int i = 0 :i,buff.length(); i++){
                    char currentChar = buff.charAt(i);
                    buff.deleteCharAt(i);
                    if (currentChar == c) {
                        break;
                    }
                }
            } else {
                charCount.put((Object)c, 1);
                buff.append(c);
                if (res.isEmpty()) {
                    res.add(buff.toString());
                    continue;
                }
            }
            if (buff.toString().length() < res.get(0).length()) {
                continue;
            }
            if (buff.length() > res.get(0).length()) {
                res.clear;
            }
            res.add(buff.toString());
        }
        return res.get(0).length();
    }
}
