impl Solution {
    pub fn search(nums: Vec<i32>, target: i32) -> i32 {
        let (mut low, mut high): (usize, usize) = (0, nums.len() - 1);
        let mut mid: usize = (low + high)/2;

        while low < high && low >= 0 && high < nums.len() {
            if nums[mid] == target {
                return mid.try_into().unwrap();
            } else if nums[mid] < target {
                low = mid + 1;
            } else {
                high = mid;
            }
            mid = (low + high)/2;
        }
        return if nums[mid] == target { mid.try_into().unwrap() } else { -1 };
    }
}