impl Solution {
    pub fn distinct_difference_array(nums: Vec<i32>) -> Vec<i32> {
        let res = Vec::new();

        for i in 0..nums.len() {
            let prefix = nums[..=i];
            let suffix = nums[i+1..];

            let prefix_count = prefix.iter().collect::<HashSet>();
            let suffic_count = suffix.iter().collect::<HashSet>();

            res.push(prefix_count.len() - suffix_count.len());
        }

        res
    }
}
