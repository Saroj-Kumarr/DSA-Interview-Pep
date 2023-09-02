public class _01_Largest_Element {

    public static int findLargest(int arr[]) {

        // bruite force
        // Array.sort();
        // return arr[n-1];

        // Optimal solution

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        return largest;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 5, 10, 3, 6 };

        System.out.println(findLargest(arr));

    }
}