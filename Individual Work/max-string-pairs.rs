impl Solution {
    pub fn maximum_number_of_string_pairs(words: Vec<String>) -> i32 {
        let mut wordMap = HashMap::new();
        let mut res = 0;

        for word in words {
            let rev = word.chars().rev().collect();

            if let Some(exist) = wordMap.get_mut(&rev) {
                *exist-=1;
                if *exist == 0 {
                    wordMap.remove(&exist);
                }
                res+=1;
            }else{
                *wordMap.entry(word.to_string()).or_insert(0)+=1;
            }
        }

        res
    }
}
