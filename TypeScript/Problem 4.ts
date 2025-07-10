function isMatch(s: string, p: string): boolean {
    if (0 == p.length()){
        return 0 == s.length();
    }
    
    let i_s = 0;
    let i_p = 0;
    let res = false;

    while (i_s < s.length() && i_p < p.length()){
        
        res = (i_s < length(s) && (p.charAt(i_p) == s.charAt(i_s) or p.charAt(i_p) == '.'));

        if (!res){
            break;
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
    return res;
};
