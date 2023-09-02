public class _03_IsSorted {

    static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        int arr[] = { 3, 5, 8, 1, 0, 2 };

        System.out.println(isSorted(arr));

    }

}
