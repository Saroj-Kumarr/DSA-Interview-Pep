public class _06_Rotate_by_dPosition {

    // Bruite force

    // static void rotateByOne(int arr[], int n) {
    // int temp = arr[0];
    // for (int i = 1; i < n; i++) {
    // arr[i - 1] = arr[i];
    // }
    // arr[n - 1] = temp;

    // }

    static void reverse(int arr[], int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateBydPosition(int arr[], int n, int d) {

        // for (int i = 0; i < d; i++) {
        // rotateByOne(arr, n);
        // }

        // Better ***************************

        // int temp[]=new int[d];

        // for(int i=0;i<d;i++)
        // temp[i]=arr[i];

        // for(int i=d;i<n;i++)
        // arr[i-d]=arr[i];

        // for(int i=n-d;i<n;i++)
        // arr[i]=temp[i-(n-d)];

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = 8;
        int d = 4;
        rotateBydPosition(arr, n, d);
    }

}
