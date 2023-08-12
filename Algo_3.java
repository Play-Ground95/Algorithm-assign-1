public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        // reverse
        int[] rvs = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            rvs[i] = nums[nums.length - 1 - i];
        }

        nums = rvs; //rvs assign to nums[]
        System.out.print("[");
        for (int i : rvs) {
            System.out.print(+i + ", ");
        }
        System.out.println("\b\b]");
    }
}
