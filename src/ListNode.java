public class ListNode {
    int val;
    ListNode next;

    ListNode(int[] nums, int len) {
        if (len < nums.length-1) {
            val = nums[len];
            len++;
            next = new ListNode(nums, len);
        } else if (len == nums.length - 1) {
            val = nums[len];
            next = null;
        }
    }

    ListNode(int x) {
        val = x;
        next = null;
    }
}
