public class NumberCounter {
    public static void main(String args[]) {
        int[] testNumbers = {3, 4, 5, 3, 3};
        int testNumber = 7;

        System.out.printf("The number 3 appears %d times in testNumbers\n", count(3, testNumbers, 0));

        System.out.printf("The sum all positive numbers including and below %d is %d\n", testNumber, sum(testNumber, 0));
    }
    
    /**
     * Returns number of appearances of integer n in array nums
     * @param n
     * @param nums
     * @param i
     * @return
     */
    public static int count(int n, int nums[], int i) {
        if (i == nums.length) return 0;

        return (nums[i] == n ? 1 : 0) + count(n, nums, i + 1);
    }

    public static int sum(int n, int i) {
        if (i == n) return i;

        return i + sum(n, i + 1);
    }
}
