impl Solution {
    pub fn unequal_triplets(nums: Vec<i32>) -> i32 {
        let countMap = HashMap::new();
        let res = 0;

        for i in nums{
            countMap.entry(i).or_insert(0) += 1;
        }

        let count = countMap.values().cloned().collect();

        let reps: Vec<_> = count.values().cloned().collect();

        for k in 2..nums.len() {
            for j in 1..k {
                for i in ..j{
                    res += reps[i]*reps[j]*reps[k];
                }
            }
        }

        res
    }
}
