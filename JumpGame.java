public class JumpGame {

    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;  // We can't reach this point
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};  // Try changing this
        boolean result = canJump(nums);
        System.out.println("Can reach the end: " + result);
    }
}
