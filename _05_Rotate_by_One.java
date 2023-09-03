
public class _05_Rotate_by_One {

    static void rotateByOne(int arr[], int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 5, 6, 8, 9, 15 };

        rotateByOne(arr, 6);

    }
}