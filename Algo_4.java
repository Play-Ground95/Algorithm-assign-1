public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };

        int first = 0;
        int last = nums.length - 1;

        while (first < last) {
            int tempory = nums[first];
            nums[first] = nums[last];
            nums[last] = tempory;
            first++;
            last--;
        }
        
        for (int i : nums) {
            System.out.print(i+" \b, ");
        }

    }
}
