public class _07_Move_Zeroes_End {

    public static void moveZeroesEnd(int arr[], int n) {

        // int temp[] = new int[n];

        // int j=0;

        // for (int i = 0; i < n; i++)
        // if (arr[i] != 0)
        // temp[j++] = arr[i];

        // for (int i = 0; i < temp.length; i++)
        // arr[i] = temp[i];

        // for (int i = temp.length; i < n; i++)
        // arr[i] = 0;

        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1)
            return;

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }

        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);

    }

    public static void main(String[] args) {

        int arr[] = { 10, 0, 20, 0, 5, 0, 2, 1, 8, 0, 10 };

        moveZeroesEnd(arr, 11);

    }

}
