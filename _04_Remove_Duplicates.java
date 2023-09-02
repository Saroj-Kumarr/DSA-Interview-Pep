public class _04_Remove_Duplicates {

    static void removeDuplicates(int arr[]) {
        // Bruite force
        /*
         * Put all the elements in set
         * and again put all the elements in the array from set
         * 
         */

         // Optimal
         
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                arr[j + 1] = arr[i];
                j++;
            }

        }

        System.out.println(j);
    }

    public static void main(String args[]) {

        int arr[] = { 0, 1, 1, 2, 2, 2, 4, 5, 5, 5, 6, 6 };

        removeDuplicates(arr);
    }

}
