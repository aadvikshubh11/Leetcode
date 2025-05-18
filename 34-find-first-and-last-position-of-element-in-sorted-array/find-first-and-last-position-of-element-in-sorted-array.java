class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};
        if (nums.length == 0) {
            return ans;
        }
        ans[0] = firstOccurrence(nums, target);
        ans[1] = secondOccurrence(nums, target);
        return ans;
    }

    public int firstOccurrence(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1; // search on left side
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public int secondOccurrence(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (nums[mid] == target) {
                ans = mid;
                st = mid + 1; // search on right side
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
}
