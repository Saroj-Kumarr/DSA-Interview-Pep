public class _11_MaximumConsecutiveOnes {

    static int findMaximumConsecutiveOnes(int arr[], int n) {
        int maxi = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                maxi = Math.max(maxi, count);
            } else {
                count = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, };
        int size = arr.length;

        System.out.println(findMaximumConsecutiveOnes(arr, size));

    }

}
