package AprilBatch_day4;

public class palindromeCheckArray {
	public static boolean isPalindrome(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};

        System.out.println(isPalindrome(arr));
    }

}
