function lengthOfLongestSubstring(s: string): number {
    const charMap: {[key: char]: number} = {};
    let res = 0;
    let slide = 0;

    s = s.toLowercase()

    for (const c of s){
        if (c in charMap && charMap[c] >= slide){
            slide = charMap[c]+1;
        }
        let endSlide = s.indexOf(c, start);
        charMap[c] = s.indexOf(c, slide);
        let currentWindow = endSlide-Slide+1;
        res = Math.max(res, currentWindow);
    }

    return res;
};
