public class challenge {
    public static void main(String[] args) {

        int[] numbers = { 5, 66, 10, 82, 45, 23 };
        System.out.println(getMaxNum(numbers));

    }

    public static int getMaxNum(int[] nums) {
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }

        return maxValue;
    }
}
