import java.util.*;

public class _12_FindElementAppearOnce {

    // Method 1 ******************

    // int count = 0;

    // for (int i = 0; i < n; i++) {
    // int num = arr[i];
    // for (int j = 0; j < n; j++) {
    // if (arr[j] == num)
    // count++;
    // }

    // if (count == 1)
    // return num;

    // count=0;
    // }
    // return count;

    // Method 2 ****************************

    // int max=arr[0];
    // for(int i=0;i<n;i++){
    // if(arr[i]>max)
    // max=arr[i];
    // }

    // System.out.println(max);

    // int maxArray[]=new int[max+1];

    // for(int i=0;i<n;i++){
    // maxArray[arr[i]]++;
    // }

    // for(int i=0;i<n;i++){
    // if(maxArray[arr[i]]==1)
    // return arr[i];
    // }

    // return -1;

    public static int getSingleElement(int[] arr) {
        // size of the array:
        int n = arr.length;

        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        // Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        // This line will never execute
        // if the array contains a single element.
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 0, 0, 0, 0, 1, 3, 2, 3, 1, 1, 1, };
        int size = arr.length;

        System.out.println(getSingleElement(arr));

    }

}
