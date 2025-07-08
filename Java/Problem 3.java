class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap charCount = new HashMap();
        int slide = 0, res = 0;

        s = s.toLowercase();

        for (char c : s.toCharArray()){
            if(charCount.containsKey(c) && (Integer)charCount.get(c) >= beg){
                slide = (Integer)charCount.get(c) + 1;
            }
            int endSlide = s.indexOf(c, slide);
            charCount.put((Object)c, endSlide);
            int currentWindow = endSlide-slide+1; 
            res = currentWindow > res ? currentWindow : res;
        }
        return res;
    }
}
