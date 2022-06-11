class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = 1;
        int[] answer = new int[2];
        while (true) {
            if (nums[start] + nums[end] == target) {
                answer[0] = start;
                answer[1] = end;
                break;
            }
            end++;
            if (end >= nums.length) {
                start++;
                end = start + 1;
            }
        }
        return answer;
    }
}