import java.util.HashMap;
import java.util.Map;

public class _13_Longest_Subarray_with_Given_Sum {

    static int longestSubarraywithSum(int a[], int n, int k) {

        // method 1 : Generate all subArray and find out the sum and then compare with
        // the given sum and then find out the lenght between i and j and then return
        // it.

        // int len = 0;

        // for(int i=0;i<n;i++){
        // for(int j=i;j<n;j++){
        // int sum=0;
        // for(int k=i;k<=j;k++){
        // sum=sum+arr[k];
        // }
        // if(sum==sumk)
        // len= Math.max(len,j-i+1);

        // }
        // }

        // method 2 : just remove the 3rd array (k) because no need to add whole array
        // again and again for the single element.

        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for (int j = i; j < n; j++) {

        //         sum = sum + arr[j];

        //         if (sum == sumk)
        //             len = Math.max(len, j - i + 1);

        //     }
        // }


        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;



    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 10, 5, 3, 6, 18, 12, 11, 4, 7, 2, 3, 4, 2 };
        int k = 11;
        int size = 15;

        System.out.println(longestSubarraywithSum(arr, size, k));

    }

}