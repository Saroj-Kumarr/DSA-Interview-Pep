public class _02_Second_Largest {

    public static int secondLargest(int arr[]) {

        int n = arr.length;

        // bruite force **********************

        // sort the array
        // iterate the loop from last-1
        // store the largest value in any variable
        /*
         * int largest=arr[n-1];
         * for(int i=n-2;i>=0;i--){
         * if(arr[i]!=largest){
         * secondLargest=arr[i];
         * break;
         * }
         * }
         * 
         */

        // Better ****************************

        /*
         * 
         * int largest = arr[0];
         * for (int i = 0; i < n; i++) {
         * if (arr[i] > largest)
         * largest = arr[i];
         * }
         * 
         * int sLargest = -1;
         * for (int i = 0; i < n; i++) {
         * if (arr[i] > sLargest && arr[i] != largest)
         * sLargest = arr[i];
         * }
         * 
         * return sLargest;
         * 
         */

        // Optimal ******************************
        
        int largest = arr[0];
        int sLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] > sLargest && arr[i] != largest)
                sLargest = arr[i];
        }

        return sLargest;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 1, 8, 10 };

        System.out.println(secondLargest(arr));

    }

}
