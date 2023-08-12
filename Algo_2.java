public class Algo_2 {
    public static void main(String[] args) {
        int[] nums = { -5, 2, 7, 10, 58, -7, 8, 23 };
        int small = nums[0];
        int large = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < small) {// small
                small = nums[i];
            }

            if (nums[i] > large) {// large
                large = nums[i];
            }
        }
        System.out.println("small number is " + small);
        System.out.println("large number is " + large);
    }
}
