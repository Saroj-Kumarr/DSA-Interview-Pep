public class _10_Missing_Element {


    // method 1 : run the loop from 1 to N and then compare with the every element in the given array, if it is not present then return it.

    // 



    static int findMissingNum(int arr[], int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        int x = ((n * (n + 1)) / 2);
        System.out.println(x + " " + sum);
        return (x - sum);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 6, 7, 8 };

        System.out.println(findMissingNum(arr, 7));

    }

}
